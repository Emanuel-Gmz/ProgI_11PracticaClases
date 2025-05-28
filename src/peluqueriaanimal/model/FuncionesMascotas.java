package peluqueriaanimal.model;

import java.util.Scanner;
import java.util.logging.Logger;

public class FuncionesMascotas {
  //Funcion para cargar las mascotas
  public static Mascotas[] cargarMascotas() {
    Mascotas[] mascotas = new Mascotas[5];
    mascotas[0] = new Mascotas("Logan", Especie.PERRO, "Caniche", 7, "Emanuel Gomez");
    mascotas[1] = new Mascotas("Aaron", Especie.PERRO, "Salchica", 5, "Emanuel Gomez");
    mascotas[2] = new Mascotas("Luna", Especie.PERRO, "Calle", 8, "Matias Gomez");
    mascotas[3] = new Mascotas("Pelusa", Especie.CONEJO, "Persa", 3, "Delfina Rojas");
    mascotas[4] = new Mascotas("Lola", Especie.GATO, "Siames", 2, "Benjamin Rojas");
    return mascotas;
  }

  //Funcion para cargar los Servicios
  public static Servicios[] cargarServicios() {
    Servicios[] servicios = new Servicios[3];
    servicios[0] = new Servicios(TipoService.LIMPIEZA_OIDOS, "Limpieza total de ambos oidos", 30, 5000.00);
    servicios[1] = new Servicios(TipoService.BANIO, "Banio completo", 80, 10000.0);
    servicios[2] = new Servicios(TipoService.CORTE_PELO, "Corte de pelo estilizado", 50, 8000.0);
    return servicios;
  }

  //Funcion para cargar los turnos
  public static Turnos[] cargarTurnos(Mascotas[] mascotas, Servicios[] servicios) {
    Turnos[] turnos = new Turnos[10];
    turnos[0] = new Turnos("28-05-2025", 9, 0, EstadoTurno.PROGRAMADO, mascotas[0], servicios[0]);
    turnos[1] = new Turnos("28-05-2025", 10, 0, EstadoTurno.PROGRAMADO, mascotas[1], servicios[1]);
    turnos[2] = new Turnos("28-05-2025", 11, 30, EstadoTurno.REALIZADO, mascotas[2], servicios[2]);
    turnos[3] = new Turnos("28-05-2025", 12, 0, EstadoTurno.CANCELADO, mascotas[3], servicios[0]);
    turnos[4] = new Turnos("28-05-2025", 13, 0, EstadoTurno.PROGRAMADO, mascotas[4], servicios[1]);
    turnos[5] = new Turnos("28-05-2025", 14, 30, EstadoTurno.PROGRAMADO, mascotas[0], servicios[2]);
    turnos[6] = new Turnos("28-05-2025", 15, 0, EstadoTurno.REALIZADO, mascotas[1], servicios[0]);
    turnos[7] = new Turnos("28-05-2025", 16, 0, EstadoTurno.PROGRAMADO, mascotas[2], servicios[1]);
    turnos[8] = new Turnos("28-05-2025", 17, 30, EstadoTurno.REALIZADO, mascotas[3], servicios[2]);
    turnos[9] = new Turnos("28-05-2025", 18, 0, EstadoTurno.PROGRAMADO, mascotas[4], servicios[0]);
    return turnos;
  }

  //Funcion para contar las especies de la mascotas
  public static int contarPorEspecie(Mascotas[] mascotas, Especie especie) {
    //Creo una variable para acumular las especies
    int contadorEspecies = 0;
    //uso un for-each para recorrer el Array de mascotas
    for (Mascotas buscarEspecie : mascotas) {
      // creo una variable y obtiene una especie la cual compara con todos los elementos del array
      // para incrementar el contador
      if (buscarEspecie.getEspecie() == especie) contadorEspecies++;
    }
    //la variable mascotasEspecies obtiene la especie y compara por cada elemento
    // del array si hay coincidencia aumenta el contador
    return contadorEspecies;
  }

  //Funcion para buscar una mascota por el nombre
  public static Mascotas buscarMascotaPorNombre(Mascotas[] mascotas, String nombre) {
    for (Mascotas mascotaBuscada : mascotas) {
      //creo una variable en el bucle for la cual obtiene el nombre de la mascota y busca una coincidencia
      //con el nombre que ingreso el usuario
      if (mascotaBuscada.getNombreMascota().equalsIgnoreCase(nombre)) {
        //si encuentra coincidencia devuelve la mascota
        return mascotaBuscada;
      }
    }
    //si no encuentra coincidencias devuelve null
    return null;
  }

  //funcion para mostrar los servicios largos
  public static void mostrarServiciosLargos(Servicios[] servicios) {
    for (Servicios ServiciosLargos : servicios) {
      //utilizo un for para recorrer el array de servicios y encontrar un servicio largo
      if (ServiciosLargos.esServicioLargo()) {
        System.out.println("Servicio largo:" + ServiciosLargos.getTiposervice() + " tiempo minimo 1 hora.");
      }
    }
  }

  //creo una funcion para simular un menu
  public static void mostrarMenu(Mascotas[] mascotas, Servicios[] servicios, Turnos[] turnos, Logger LOGGER) {
    Scanner sc = new Scanner(System.in);
    int opcion;

    do {
      String textblock = """
          "Bienvenido a la perruqueria
          1.Ver todos los turnos
          2.Buscar mascota por nombre 
          3.Ver cantidad de mascotas por especie
          4.Ver Resultado de los turnos del Dia
          5.Ver Tipos de Servicios
          6.Salir
          Seleccione una opción:""";
      LOGGER.info(textblock);
      opcion = sc.nextInt();
      sc.nextLine();

      switch (opcion) {
        case 1 -> {
          for (int i = 0; i < turnos.length; i++) {
            turnos[i].mostrarDatos();
          }
          Turnos.maxTurnos(turnos);
        }
        case 2 -> {
          LOGGER.info("Ingrese el nombre de la mascota que desea buscar");
          String nombre = sc.nextLine();
          Mascotas mascotaBuscada = FuncionesMascotas.buscarMascotaPorNombre(mascotas, nombre);
          if (mascotaBuscada != null) mascotaBuscada.mostrarDatos();
          else LOGGER.info("Mascota no encontrada.");
        }
        case 3 -> {
          LOGGER.info("\nCantidad de Perros: " + FuncionesMascotas.contarPorEspecie(mascotas, Especie.PERRO) +
              "\nCantidad de Gatos: " + FuncionesMascotas.contarPorEspecie(mascotas, Especie.GATO) +
              "\nCantidad de Conejos: " + FuncionesMascotas.contarPorEspecie(mascotas, Especie.CONEJO));
        }
        case 4 -> {
          int programados = 0;
          int cancelados = 0;
          int realizados = 0;
          for (Turnos estadosTurnos : turnos) {
            switch (estadosTurnos.getEstadoturno()) {
              case PROGRAMADO -> programados++;
              case CANCELADO -> cancelados++;
              case REALIZADO -> realizados++;
            }
          }
          LOGGER.info("Turnos del Día: " + "\nTurnos Programados: " + programados +
              "\nTurnos Cancelados: " + cancelados + "\nTurnos Realizados: " + realizados);
        }
        case 5 -> {
          for (int i = 0; i < servicios.length; i++) {
            servicios[i].mostrarDatos();
          }
          mostrarServiciosLargos(servicios);
        }
        default -> {
          LOGGER.info("Gracias, vuelva pronto");
        }
      }
    } while (opcion != 6);
  }

}
