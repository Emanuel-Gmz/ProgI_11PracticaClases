package peluqueriaanimal.model;

public class Mascotas {
  private int id;
  private int idMascota;
  private String nombreMascota;
  private String especie;
  private String raza;

  private int edad;
  private String nombreDuenio;

  private static int idMascotaIncremento;

  public Mascotas(){
    idMascotaIncremento++;
    this.id=idMascotaIncremento;
  }


}
