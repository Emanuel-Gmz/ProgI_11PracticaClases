package peluqueriaanimal.model;


public class Turnos {
  private int idTurno;
  private String fechaturno;
  private String horaturno;
  private EstadoTurno estadoTurno;
  private static int idTurnosIncremento;

  public Turnos(String fechaturno,String horaturno,EstadoTurno estadoTurno){
    idTurnosIncremento++;
    this.idTurno=idTurnosIncremento;
    this.fechaturno=fechaturno;
    this.horaturno=horaturno;
    this.estadoTurno=estadoTurno;
  }

  public String toString(){
    return "         Turno:   " +
        "\n Id: " + idTurno +
        "\n Fecha: " + fechaturno +
        "\n Estado: " + estadoTurno +
        "\n Hora: "+ horaturno +
        "\n =============================";
  }

  public void mostrarDatos() {
    System.out.println(this);
  }


  //GET
  public int getIdTurno(int idTurno){return this.idTurno;}
  public String getFechaturno(String fechaturno){return this.fechaturno;}
  public String getHoraturno(String horaturno){return this.horaturno;}
  public EstadoTurno getEstadoturno(String idTurno){return this.estadoTurno;}

  //SETT
  public void setIdTurno(int idTurno){this.idTurno=idTurno;}
  public void setFechaturno(String fechaturno){this.fechaturno=fechaturno;}
  public void setHoraturno(String horaturno){this.horaturno=horaturno;}
  public void setEstadoTurno(EstadoTurno estadoTurno){this.estadoTurno=estadoTurno;}



}
