package peluqueriaanimal.model;

public class Servicios {
  private int idServicio;
  private int tiposervice;
  private String descrip;
  private int tiempo;
  private double precio;
  private static int idServicioIncremento;

  public Servicios(){
    idServicioIncremento++;
    this.idServicio=idServicioIncremento;
  }

  //GETT
  public int getIdServicio(){return this.idServicio;}
  public int getTiposervice(){return this.tiposervice;}
  public String getIDescrip(){return this.descrip;}
  public int getTiempo(){return this.tiempo;}
  public double getPrecio(){return this.precio;}


  //SETT
  public void setIdServicio(int id){this.idServicio=idServicio;}
  public void setTiposervice(int tiposervice){this.tiposervice=tiposervice;}
  public void setDescrip(String descrip){this.descrip=descrip;}
  public void setTiempo(int tiempo){this.tiempo=tiempo;}
  public void setPrecio(double precio){this.precio=precio;}
}
