package daw.programacion;
import java.time.LocalDate;
import java.util.*;


/**
 * Class PersonaAtracaSucursal
 */
public class PersonaAtracaSucursal {

  //
  // Fields
  //

  private Persona atracador;
  private Sucursal sucursalAtracada;
  private LocalDate fechaAtraco;
  
  //
  // Constructors
  //
  public PersonaAtracaSucursal () { };

  public PersonaAtracaSucursal(Persona atracador, Sucursal sucursalAtracada, LocalDate fechaAtraco) {
    this.atracador = atracador;
    this.sucursalAtracada = sucursalAtracada;
    this.fechaAtraco = fechaAtraco;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of atracador
   * @param newVar the new value of atracador
   */
  public void setAtracador (Persona newVar) {
    atracador = newVar;
  }

  /**
   * Get the value of atracador
   * @return the value of atracador
   */
  public Persona getAtracador () {
    return atracador;
  }

  /**
   * Set the value of sucursalAtracada
   * @param newVar the new value of sucursalAtracada
   */
  public void setSucursalAtracada (Sucursal newVar) {
    sucursalAtracada = newVar;
  }

  /**
   * Get the value of sucursalAtracada
   * @return the value of sucursalAtracada
   */
  public Sucursal getSucursalAtracada () {
    return sucursalAtracada;
  }

  /**
   * Set the value of fechaAtraco
   * @param newVar the new value of fechaAtraco
   */
  public void setFechaAtraco (LocalDate newVar) {
    fechaAtraco = newVar;
  }

  /**
   * Get the value of fechaAtraco
   * @return the value of fechaAtraco
   */
  public LocalDate getFechaAtraco () {
    return fechaAtraco;
  }

  //
  // Other methods
  //

}
