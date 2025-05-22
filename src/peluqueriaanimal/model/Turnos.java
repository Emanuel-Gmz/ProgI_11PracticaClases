package peluqueriaanimal.model;

public class Turnos {
  private int idTurno;
  private String fechaturno;
  private int horaturno;
  private String estadoturno;

  private static int idTurnosIncremento;

  public Turnos(){
    idTurnosIncremento++;
    this.idTurno=idTurnosIncremento;
  }



}
