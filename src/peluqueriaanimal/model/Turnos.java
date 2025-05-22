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

  //GET
  public int getIdTurno(int idTurno){return this.idTurno;}
  public String getFechaturno(String fechaturno){return this.fechaturno;}
  public int getHoraturno(int horaturno){return this.horaturno;}
  public String getEstadoturno(String idTurno){return this.estadoturno;}





}
