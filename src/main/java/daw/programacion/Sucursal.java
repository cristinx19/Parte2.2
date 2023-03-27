package daw.programacion;
import java.util.*;


/**
 * Class Sucursal
 */
public class Sucursal extends Entidad {

  //
  // Fields
  //

  private int numEmpleados;
  
  //
  // Constructors
  //
  public Sucursal () { };
  
  //
  // Methods
  //

  public Sucursal(int numEmpleados) {
    this.numEmpleados = numEmpleados;
  }


  //
  // Accessor methods
  //

  /**
   * Set the value of numEmpleados
   * @param newVar the new value of numEmpleados
   */
  public void setNumEmpleados (int newVar) {
    numEmpleados = newVar;
  }

  /**
   * Get the value of numEmpleados
   * @return the value of numEmpleados
   */
  public int getNumEmpleados () {
    return numEmpleados;
  }

}
