package BackEnd;
public class Sucursal {
  // Atributos
  private int idSucursal;
  private String nombreSucursal;
  private String calle;
  private int numero;
  private int codigoPostal;
  private String colonia;
  private String ciudad;
  private String estado;
  private String pais;
  private String telefono;

  // Contrucutores
  public Sucursal() {

  }

  public Sucursal(String nombreSucursal, String calle, int numero, int codigoPostal, String colonia, String ciudad,
      String estado, String pais, String telefono) {
    this.nombreSucursal = nombreSucursal;
    this.calle = calle;
    this.numero = numero;
    this.codigoPostal = codigoPostal;
    this.colonia = colonia;
    this.ciudad = ciudad;
    this.estado = estado;
    this.pais = pais;
    this.telefono = telefono;
  }

  // Getters y Setters

  public int getIdSucursal() {
    return idSucursal;
  }

  public void setIdSucursal(int idSucursal) {
    this.idSucursal = idSucursal;
  }

  public String getNombreSucursal() {
    return nombreSucursal;
  }

  public void setNombreSucursal(String nombreSucursal) {
    this.nombreSucursal = nombreSucursal;
  }

  public String getCalle() {
    return calle;
  }

  public void setCalle(String calle) {
    this.calle = calle;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(int codigoPostal) {
    this.codigoPostal = codigoPostal;
  }

  public String getColonia() {
    return colonia;
  }

  public void setColonia(String colonia) {
    this.colonia = colonia;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  // Metodos
  public String toString() {
    return "Sucursal: " + nombreSucursal + ", " + calle + ", " + numero + ", " + codigoPostal + ", " + colonia + ", "
        + ciudad + ", " + estado + ", " + pais + ", " + telefono;
  }

}
