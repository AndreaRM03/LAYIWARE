package BackEnd;
public class Asegurado {
  // Atributos
  private int idAsegurado;
  private int idSucursal;
  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private String rfc;
  private String curp;
  private String telefono;

  // Constructores
  public Asegurado() {

  }

  public Asegurado(int idSucursal, String nombre, String apellidoPaterno, String apellidoMaterno, String rfc,
      String curp, String telefono) {
    this.idSucursal = idSucursal;
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.rfc = rfc;
    this.curp = curp;
    this.telefono = telefono;
  }

  // Getters y Setters
  public int getIdAsegurado() {
    return idAsegurado;
  }

  public void setIdAsegurado(int idAsegurado) {
    this.idAsegurado = idAsegurado;
  }

  public int getIdSucursal() {
    return idSucursal;
  }

  public void setIdSucursal(int idSucursal) {
    this.idSucursal = idSucursal;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public String getRFC() {
    return rfc;
  }

  public void setRFC(String rfc) {
    this.rfc = rfc;
  }

  public String getCURP() {
    return curp;
  }

  public void setCURP(String curp) {
    this.curp = curp;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String toString() {
    return "Asegurado: " + "Nombre: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno + " " + "RFC: " + rfc
        + " " + "CURP: " + curp + " " + "Telefono: " + telefono;
  }

  
}