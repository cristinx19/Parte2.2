package daw.programacion;

import java.time.LocalDate;

/**
 * Class Contrato
 */
public class Contrato {

  //
  // Fields
  //

  private Sucursal sucursalContrata;
  private Vigilante vigilanteContratado;
  private LocalDate fechaContratacion;
  private boolean conArma;
  private double sueldo;
  
  //
  // Constructors
  //
  public Contrato () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of sucursalContrata
   * @param newVar the new value of sucursalContrata
   */
  public void setSucursalContrata (Sucursal newVar) {
    sucursalContrata = newVar;
  }

  /**
   * Get the value of sucursalContrata
   * @return the value of sucursalContrata
   */
  public Sucursal getSucursalContrata () {
    return sucursalContrata;
  }

  /**
   * Set the value of vigilanteContratado
   * @param newVar the new value of vigilanteContratado
   */
  public void setVigilanteContratado (Vigilante newVar) {
    vigilanteContratado = newVar;
  }

  /**
   * Get the value of vigilanteContratado
   * @return the value of vigilanteContratado
   */
  public Vigilante getVigilanteContratado () {
    return vigilanteContratado;
  }

  /**
   * Set the value of fechaContratacion
   * @param newVar the new value of fechaContratacion
   */
  public void setFechaContratacion (LocalDate newVar) {
    fechaContratacion = newVar;
  }

  /**
   * Get the value of fechaContratacion
   * @return the value of fechaContratacion
   */
  public LocalDate getFechaContratacion () {
    return fechaContratacion;
  }

  /**
   * Set the value of conArma
   * @param newVar the new value of conArma
   */
  public void setConArma (boolean newVar) {
    conArma = newVar;
  }

  /**
   * Get the value of conArma
   * @return the value of conArma
   */
  public boolean getConArma () {
    return conArma;
  }

  /**
   * Set the value of sueldo
   * @param newVar the new value of sueldo
   */
  public void setSueldo (double newVar) {
    sueldo = newVar;
  }

  /**
   * Get the value of sueldo
   * @return the value of sueldo
   */
  public double getSueldo () {
    return sueldo;
  }

  //
  // Other methods
  //

}
