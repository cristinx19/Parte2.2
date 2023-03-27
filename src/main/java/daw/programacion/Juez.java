package daw.programacion;

/**
 * Class Juez
 */
public class Juez {

  //
  // Fields
  //

  private int id;
  private String nombre;
  private int anyosServicio;
  
  //
  // Constructors
  //
  public Juez () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of anyosServicio
   * @param newVar the new value of anyosServicio
   */
  public void setAnyosServicio (int newVar) {
    anyosServicio = newVar;
  }

  /**
   * Get the value of anyosServicio
   * @return the value of anyosServicio
   */
  public int getAnyosServicio () {
    return anyosServicio;
  }

  //
  // Other methods
  //

}
