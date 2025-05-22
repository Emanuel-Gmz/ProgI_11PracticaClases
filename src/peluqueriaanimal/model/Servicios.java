package peluqueriaanimal.model;

public class Servicios {
  private int id;
  private int idServicio;
  private int tiposervice;
  private String descrip;
  private int tiempo;
  private double precio;
  private static int idServicioIncremento;

  public Servicios(){
    idServicioIncremento++;
    this.id=idServicioIncremento;
  }

}
