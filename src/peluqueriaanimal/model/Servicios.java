package peluqueriaanimal.model;

public class Servicios {
  private int idServicio;
  private TipoService tipoService;
  private String descrip;
  private int tiempo;
  private double precio;
  private static int idServicioIncremento;



  public Servicios(TipoService tipoService, String descrip, int tiempo, double precio) {
    idServicioIncremento++;
    this.idServicio=idServicioIncremento;
    this.tipoService=tipoService;
    this.descrip=descrip;
    this.tiempo=tiempo;
    this.precio=precio;
  }

  public String toString() {
    return "       Servicio:   " +
        "\n Id: " + idServicio +
        "\n TipoServicio: " + tipoService +
        "\n Descripcion: " + descrip +
        "\n Tiempo Estimado: " + tiempo + " minutos." +
        "\n Precio: $" + precio +
        "\n =============================";
  }

  public void mostrarDatos() {
    System.out.println(this);
  }

  //Funcion para calcular el precio con IVA
  public static double calcularPrecioConIVA(double precio) {
    final double IVA = 0.21;
    return precio + (precio * IVA);
  }

  public boolean esServicioLargo() {
    return this.tiempo>60;
  }

  //GETTERS
  public int getIdServicio(){return this.idServicio;}
  public TipoService getTiposervice(){return this.tipoService;}
  public String getIDescrip(){return this.descrip;}
  public int getTiempo(){return this.tiempo;}
  public double getPrecio(){return this.precio;}


  //SETTERS
  public void setIdServicio(int id){this.idServicio=idServicio;}
  public void setTiposervice(TipoService tiposervice){this.tipoService= tipoService;}
  public void setDescrip(String descrip){this.descrip=descrip;}
  public void setTiempo(int tiempo){this.tiempo=tiempo;}
  public void setPrecio(double precio){this.precio=precio;}
}
