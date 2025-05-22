import peluqueriaanimal.model.*;

public class PeluqueriaCaninaApp {
  public static void main(String[] args) {

    Mascotas mascotas1= new Mascotas("Logan",Especie.PERRO,"Caniche",7,"Emanuel");
    Servicios servicios1 = new Servicios(TipoService.BANIO, "Llego por un Baño completo",60, 13000.00);
    Turnos turnos1 = new Turnos( "22/05/2025","18:00",EstadoTurno.REALIZADO);

    mascotas1.mostrarDatos();
    servicios1.mostrarDatos();
    turnos1.mostrarDatos();


    Mascotas mascotas2 = new Mascotas("Aaron", Especie.GATO,"Siames",4,"Matias");
    Servicios servicios2 = new Servicios(TipoService.LIMPIEZA_OIDOS, "Pidio turno para una limpieza de oidos",30, 8000.00);
    Turnos turnos2 = new Turnos("21-05-2025", "18:30",EstadoTurno.PROGRAMADO);

    System.out.println("\n");
    mascotas2.mostrarDatos();
    servicios2.mostrarDatos();
    turnos2.mostrarDatos();



  }
}