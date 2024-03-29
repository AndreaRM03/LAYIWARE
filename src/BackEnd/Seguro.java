package BackEnd;

public class Seguro {
  // Atributos
  private int idSeguro;
  private int idAsegurado;
  private double cantidadAsegurada;
  private String folio;
  private String vigencia;
  private String fechaRecepcion;
  private String telefono;
  private String tipoSeguro;

  // Constructores
  public Seguro() {

  }

  public Seguro(int idAsegurado, double cantidadAsegurada, String folio, String vigencia, String fechaRecepcion,
      String telefono, String tipoSeguro) {
    this.idAsegurado = idAsegurado;
    this.cantidadAsegurada = cantidadAsegurada;
    this.folio = folio;
    this.vigencia = vigencia;
    this.fechaRecepcion = fechaRecepcion;
    this.telefono = telefono;
    this.tipoSeguro = tipoSeguro;
  }

  // Getters y Setters
  public int getIdSeguro() {
    return idSeguro;
  }

  public void setIdSeguro(int idSeguro) {
    this.idSeguro = idSeguro;
  }

  public int getIdAsegurado() {
    return idAsegurado;
  }

  public void setIdAsegurado(int idAsegurado) {
    this.idAsegurado = idAsegurado;
  }

  public double getCantidadAsegurada() {
    return cantidadAsegurada;
  }

  public void setCantidadAsegurada(double cantidadAsegurada) {
    this.cantidadAsegurada = cantidadAsegurada;
  }

  public String getFolio() {
    return folio;
  }

  public void setFolio(String folio) {
    this.folio = folio;
  }

  public String getVigencia() {
    return vigencia;
  }

  public void setVigencia(String vigencia) {
    this.vigencia = vigencia;
  }

  public String getFechaRecepcion() {
    return fechaRecepcion;
  }

  public void setFechaRecepcion(String fechaRecepcion) {
    this.fechaRecepcion = fechaRecepcion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getTipoSeguro() {
    return tipoSeguro;
  }

  public void setTipoSeguro(String tipoSeguro) {
    this.tipoSeguro = tipoSeguro;
  }

  public String toString() {
    return "Seguro: " + "Id Seguro: " + idSeguro + " " + "Id Asegurado: " + idAsegurado + " " + "Cantidad Asegurada: "
        + cantidadAsegurada + " " + "Folio: " + folio + " " + "Vigencia: " + vigencia + " " + "Fecha Recepcion: "
        + fechaRecepcion + " " + "Telefono: " + telefono + " " + "Tipo Seguro: " + tipoSeguro;
  }

}