package daw.programacion;

/**
 * Class Entidad
 */
public class Entidad {

  //
  // Fields
  //

  private int id;
  private String domicilioCentral;
  
  //
  // Constructors
  //
  public Entidad () { };
  
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
   * Set the value of domicilioCentral
   * @param newVar the new value of domicilioCentral
   */
  public void setDomicilioCentral (String newVar) {
    domicilioCentral = newVar;
  }

  /**
   * Get the value of domicilioCentral
   * @return the value of domicilioCentral
   */
  public String getDomicilioCentral () {
    return domicilioCentral;
  }

  //
  // Other methods
  //

}
