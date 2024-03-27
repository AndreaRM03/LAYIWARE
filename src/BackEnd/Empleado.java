package BackEnd;

public class Empleado {

  // Atributos
  private int idEmpleado;
  private int idSucursal;
  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private String email;
  private String contrasena;
  private double salario;
  private boolean activo;
  private String telefono;

  // Constructores
  public Empleado() {

  }

  public Empleado(int idSucursal, String nombre, String apellidoPaterno, String apellidoMaterno, String email, String contrasena,
      double salario, boolean activo, String telefono) {
    this.idSucursal = idSucursal;
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.email = email;
    this.contrasena = contrasena;
    this.salario = salario;
    this.activo = activo;
    this.telefono = telefono;

  }

  // Getters y Setters
  public int getIdEmpleado() {
    return idEmpleado;
  }

  public void setIdEmpleado(int idEmpleado) {
    this.idEmpleado = idEmpleado;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String toString(){
    return "Empleado: " + nombre + ", " + apellidoPaterno + ", " + apellidoMaterno + ", " + email + ", " + salario + ", " + activo + ", " + telefono;
  }
}