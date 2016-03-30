package Logic;

import java.util.Date;

/**
 *
 * @author VM
 */
public class Product {
    private long id;        /** Employee id */
    private String name; /**Nombre del empleado **/
    //private String apellido; /**Apellido del empleado **/
    private String kind_of_product; /**Genero del empleado **/
    private String photo; /**Ruta donde se encuentra la fotografia **/
    private int price; /**Salario base del empleado **/
    //private Date fechaNacimiento; /**Fecha de nacimiento del empleado **/
    private Date date_of_admission; /**Fecha de ingreso empleado **/
    private final long MILS_DIAS = (1000*60*60*24);
    private String type;
    
    
    /**
     * Constructor por defecto
     */
    public Product() {
        this.id = 0;
        this.name = "";
//        this.apellido = " ";
        this.kind_of_product = "";
        this.photo = " ";
        this.price = 0;
//        this.fechaNacimiento = new Date();
        this.date_of_admission = new Date();
    }

    /**
     * Constructor with parameters
     * @param id Employee identification
     * @param nombre Nombre del empleado 
     * @param apellido Apellido del empleado
     * @param genero Genero del empleado
     * @param foto Ruta donde se encuentra la fotografia
     * @param salario Salario base del empleado 
     * @param fechaNacimiento Fecha de nacimiento del empleado
     * @param fechaIngreso Fecha de ingreso empleado
     */
    public Product(long id, String name, String apellido, String genero, String foto, int salario, Date fechaNacimiento, Date fechaIngreso) {
        this.id = id;
        this.name = name;
//        this.apellido = apellido;
        this.kind_of_product = genero;
        this.photo = foto;
        this.price = salario;
//        this.fechaNacimiento = fechaNacimiento;
        this.date_of_admission = fechaIngreso;
       
    }

    public String getType() {
        return type;
    }

    public void setType(String type1) {
        this.type = type1;
    }

  
  
    /**
     * Get Employee id
     * @return Employee id
     */
    public long getId() {
        return id;
    }

    /**
     * Set Employee id
     * @param id Employee id
     */
    public void setId(long id) {
        this.id = id;
    }
    
    /**
     * obtiene los datos del empleado
     * @return Nombre del empleado
     */
    public String getName() {
        return name;
    }
    /**
     * Cambia los nombres del empleado
     * @param name Nombre del empleado 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * obtiene los apellidos del empleado
     * @return apellido del empleado
     */
//    public String getApellido() {
//        return apellido;
//    }
//    /**
//     * Cambia los apellidos del empleado
//     * @param apellido Apellido del empleado
//     */
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }
    /**
     * obtiene el kind_of_product del empleado
     * @return kind_of_product del empleado
     */
    public String getKind_of_product() {
        return kind_of_product;
    }
    /**
     * Cambia el kind_of_product del empleado
     * @param kind_of_product Genero del empleado
     */
    public void setKind_of_product(String kind_of_product) {
        this.kind_of_product = kind_of_product;
    }
    /**
     * obtiene la photo del empleado
     * @return photo del empleado
     */
    public String getPhoto() {
        return photo;
    }
    /**
     * Cambia la photo del empleado
     * @param photo Ruta donde se encuentra la fotografia
      */
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    /**
     * obtiene el price del empleado
     * @return price del empleado
     */
    public int getPrice() {
        return price;
    }
    /**
     * Cambia el price del empleado
     * @param price Salario base del empleado 
     */
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * obtiene la fecha del nacimiento del empleado
     * @return fecha del nacimiento del empleado
     */
//    public Date getFechaNacimiento() {
//        return fechaNacimiento;
//    }
//    /**
//     * Cambia la fecha de nacimiento del empleado
//     * @param fechaNacimiento Fecha de nacimiento del empleado
//     */
//    public void setFechaNacimiento(Date fechaNacimiento) {
//        this.fechaNacimiento = fechaNacimiento;
//    }
    /**
     * obtiene la fecha de ingreso del empleado
     * @return fecha del empleado
     */
    public Date getDate_of_admission() {
        return date_of_admission;
    }
    /**
     * Cambia la fecha de ingreso del empleado
     * @param date_of_admission  Fecha de ingreso empleado
     */
    public void setDate_of_admission(Date date_of_admission) {
        this.date_of_admission = date_of_admission;
    }
    /**
     * Años de antiguedad
     * @return Años de antigueda
     */
    public long getAntiguedad(){
      Date fechaActual=new Date();
      long antiguedad = (fechaActual.getTime()-this.getDate_of_admission().getTime());
      return antiguedad/MILS_DIAS;
    }
    
    /**
     * Edad del empleado
     * @return edad 
     */
//    public long getEdadEmpleado(){
//      Date fechaActual=new Date();
//      long edad= (fechaActual.getTime()-this.getFechaNacimiento().getTime());
//      return edad/MILS_DIAS; 
//    }
    
    /**
     * Calcula las prestaciones del price base
     * @return prestaciones 
     */
    public float getPrestaciones(){
        float prestaciones=(this.getAntiguedad()/365)*(this.getPrice()/12);
        return prestaciones;
    }
    
}