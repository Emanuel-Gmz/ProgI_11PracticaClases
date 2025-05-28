package peluqueriaanimal.model;


public class Turnos {
  private int idTurno;
  private String fechaturno;
  private int horaturno;
  private int minutosTurno;
  private EstadoTurno estadoTurno;
  private Mascotas mascota;
  private Servicios servicios;
  private static int idTurnosIncremento;
  public static final int MAX_TURNOS_DIARIOS = 10;

  public Turnos(String fechaturno,int horaturno,int minutosTurno,EstadoTurno estadoTurno, Mascotas mascotas, Servicios servicios){
    idTurnosIncremento++;
    this.idTurno=idTurnosIncremento;
    this.fechaturno=fechaturno;
    this.horaturno=horaturno;
    this.minutosTurno = minutosTurno;
    this.estadoTurno=estadoTurno;
    this.mascota = mascotas;
    this.servicios = servicios;
  }

  public String toString(){
    return "     Turno:    " +
        "\n Id: " + idTurno +
        "\n Fecha: " + fechaturno +
        "\n Estado: " + estadoTurno +
        "\n Hora: "+ String.format("%02d:%02d",horaturno,minutosTurno) +
        "\n Mascota: " + mascota.getNombreMascota() + " Especie: " + mascota.getEspecie() + " Duenio: " + mascota.getNombreDuenio() +
        "\n Servicio: " + servicios.getTiposervice() + " " + servicios.getIDescrip() + " Precio: " + Servicios.calcularPrecioConIVA(servicios.getPrecio()) +
        "\n =============================";
  }

  public void mostrarDatos() {
    System.out.println(this);
  }

  public boolean esTurnoActivo() {
    return estadoTurno == EstadoTurno.PROGRAMADO;
  }

  public static void maxTurnos(Turnos[] turnos) {
    if (turnos.length >= MAX_TURNOS_DIARIOS) {
      System.out.println("Se alcanzo el numero maximo de turnos. No se pueden agregar más turnos hoy.");
    }
    }

  //GET
  public int getIdTurno(){return this.idTurno;}
  public String getFechaturno(){return this.fechaturno;}
  public int getHoraturno(){return this.horaturno;}
  public int getMinutosTurno(){return this.minutosTurno;}
  public EstadoTurno getEstadoturno(){return this.estadoTurno;}

  //SETT
  public void setIdTurno(int idTurno){this.idTurno=idTurno;}
  public void setFechaturno(String fechaturno){this.fechaturno=fechaturno;}
  public void setHoraturno(int horaturno){this.horaturno=horaturno;}
  public void setMinutosTurno(int minutosTurno){this.minutosTurno=minutosTurno;}
  public void setEstadoTurno(EstadoTurno estadoTurno){this.estadoTurno=estadoTurno;}



}
