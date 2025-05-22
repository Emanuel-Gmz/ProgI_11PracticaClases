package peluqueriaanimal.model;

public class Mascotas {
  private int idMascota;
  private String nombreMascota;
  private String especie;
  private String raza;

  private int edad;
  private String nombreDuenio;

  private static int idMascotaIncremento;

  public Mascotas(){
    idMascotaIncremento++;
    this.idMascota=idMascotaIncremento;
  }

  //GETT
  public int getIdMascota(){return this.idMascota;}
  public String getNombreMascota(){return this.nombreMascota;}
  public String getEspecie(){return this.especie;}
  public String getRaza(){return this.raza;}
  public int getEdad(){return this.edad;}
  public String getNombreDuenio(){return this.nombreDuenio;}

  //SETT
  public void setIdMascota(int idMascota){this.idMascota=idMascota;}
  public void setNombreMascota(String idMascota){this.nombreMascota=nombreMascota;}
  public void setEspecie(String especie){this.especie=especie;}
  public void setRaza(){this.raza=raza;}
  public void setEdad(){this.edad=edad;}
  public void setNombreDuenio(){this.nombreDuenio=nombreDuenio;}
}
