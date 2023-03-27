package daw.programacion;

/**
 * Class Juicio
 */
public class Juicio {

  //
  // Fields
  //

  private Juez juez;
  private Persona persona;
  private boolean condenado;
  private int diasCarcel;
  private String lugarJuicio;
  
  //
  // Constructors
  //
  public Juicio () { };

  public Juicio(Juez juez, Persona persona, boolean condenado, int diasCarcel, String lugarJuicio) {
    this.juez = juez;
    this.persona = persona;
    this.condenado = condenado;
    this.diasCarcel = diasCarcel;
    this.lugarJuicio = lugarJuicio;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of juez
   * @param newVar the new value of juez
   */
  public void setJuez (Juez newVar) {
    juez = newVar;
  }

  /**
   * Get the value of juez
   * @return the value of juez
   */
  public Juez getJuez () {
    return juez;
  }

  /**
   * Set the value of persona
   * @param newVar the new value of persona
   */
  public void setPersona (Persona newVar) {
    persona = newVar;
  }

  /**
   * Get the value of persona
   * @return the value of persona
   */
  public Persona getPersona () {
    return persona;
  }

  /**
   * Set the value of condenado
   * @param newVar the new value of condenado
   */
  public void setCondenado (boolean newVar) {
    condenado = newVar;
  }

  /**
   * Get the value of condenado
   * @return the value of condenado
   */
  public boolean getCondenado () {
    return condenado;
  }

  /**
   * Set the value of diasCarcel
   * @param newVar the new value of diasCarcel
   */
  public void setDiasCarcel (int newVar) {
    diasCarcel = newVar;
  }

  /**
   * Get the value of diasCarcel
   * @return the value of diasCarcel
   */
  public int getDiasCarcel () {
    return diasCarcel;
  }

  /**
   * Set the value of lugarJuicio
   * @param newVar the new value of lugarJuicio
   */
  public void setLugarJuicio (String newVar) {
    lugarJuicio = newVar;
  }

  /**
   * Get the value of lugarJuicio
   * @return the value of lugarJuicio
   */
  public String getLugarJuicio () {
    return lugarJuicio;
  }

  //
  // Other methods
  //

}
