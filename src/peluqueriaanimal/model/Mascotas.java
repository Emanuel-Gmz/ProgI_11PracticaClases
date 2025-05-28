package peluqueriaanimal.model;

public class Mascotas {
  private int idMascota;
  private String nombreMascota;
  private Especie especie;
  private String raza;
  private int edad;
  private String nombreDuenio;
  private static int idMascotaIncremento;

  public Mascotas(String nombreMascota,Especie especie,String raza,int edad,String nombreDuenio){
    idMascotaIncremento++;
    this.idMascota=idMascotaIncremento;
    this.nombreMascota=nombreMascota;
    this.especie= especie;
    this.raza=raza;
    this.edad=edad;
    this.nombreDuenio=nombreDuenio;
  }
  public String toString() {
    return "        Mascota:   " +
        "\n Id= " + idMascota +
        "\n Nombre: " +nombreMascota +
        "\n Especie: " + especie +
        "\n Raza: " + raza +
        "\n Edad: " + edad +
        "\n Propietario: " + nombreDuenio +
        "\n =============================";
  }
  public void mostrarDatos() {
    System.out.println(this);
  }

  //GETT
  public int getIdMascota(){return this.idMascota;}
  public String getNombreMascota(){return this.nombreMascota;}
  public Especie getEspecie(){return this.especie;}
  public String getRaza(){return this.raza;}
  public int getEdad(){return this.edad;}
  public String getNombreDuenio(){return this.nombreDuenio;}

  //SETT
  public void setIdMascota(int idMascota){this.idMascota=idMascota;}
  public void setNombreMascota(String idMascota){this.nombreMascota=nombreMascota;}
  public void setEspecie(Especie especie){this.especie=especie;}
  public void setRaza(){this.raza=raza;}
  public void setEdad(){this.edad=edad;}
  public void setNombreDuenio(){this.nombreDuenio=nombreDuenio;}
}
