package peluqueriaanimalista;

import peluqueriaanimal.model.*;

import java.util.logging.Logger;

public class PeluqueriaCaninaApp {
  public static final Logger LOGGER =
      Logger.getLogger(PeluqueriaCaninaApp.class.getName());

  public static void main(String[] args) {
    //Creo los Arrays y le doy los valores con funciones en otra clase
    Mascotas[] mascotas = FuncionesMascotas.cargarMascotas();
    Servicios[] servicios = FuncionesMascotas.cargarServicios();
    Turnos[] turnos = FuncionesMascotas.cargarTurnos(mascotas, servicios);


    FuncionesMascotas.mostrarMenu(mascotas,servicios,turnos,LOGGER);
  }
}

