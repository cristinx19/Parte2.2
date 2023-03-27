package daw.programacion;
import java.util.*;


/**
 * Class Banda
 */
public class Banda {

  //
  // Fields
  //

  private int id;
  private int numMiembros;
  private String nombre;
  
  //
  // Constructors
  //
  public Banda () { };
  
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
   * Set the value of numMiembros
   * @param newVar the new value of numMiembros
   */
  public void setNumMiembros (int newVar) {
    numMiembros = newVar;
  }

  /**
   * Get the value of numMiembros
   * @return the value of numMiembros
   */
  public int getNumMiembros () {
    return numMiembros;
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

  //
  // Other methods
  //

}
