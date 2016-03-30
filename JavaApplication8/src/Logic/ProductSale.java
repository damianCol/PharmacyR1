package Logic;

import java.util.Date;

/**
 *
 * @author Daniel Higuera
 */
public class ProductSale {
    private long idSell;        /** custumer id */
    private String nameSell; /**nombre del cliente**/
    private long id;        /** product id */
    private String name; /**Nombre del product **/
    private String kind_of_product; /**tipo de producto **/
    private String photo; /**Ruta donde se encuentra la fotografia **/
    private int price; /**precio del producto **/
    private Date date_of_admission; /**Fecha de ingreso del producto **/
    private final long MILS_DIAS = (1000*60*60*24);
    private String type;
    
    
    /**
     * Constructor por defecto
     */
    public ProductSale() {
        this.idSell = 0;
        this.nameSell = "";
        this.id = 0;
        this.name = "";
        this.kind_of_product = "";
        this.photo = " ";
        this.price = 0;
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
    public ProductSale(Long idSale, String nameSale, long id, String name, String apellido, String genero, String foto, int salario, Date fechaNacimiento, Date fechaIngreso) {
        this.idSell = idSale;
        this.nameSell = nameSale;
        this.id = id;
        this.name = name;
        this.kind_of_product = genero;
        this.photo = foto;
        this.price = salario;
        this.date_of_admission = fechaIngreso;
       
    }

    public String getType() {
        return type;
    }

    public void setType(String type1) {
        this.type = type1;
    }

  
  
    /**
     * Get producto id
     * @return producto id
     */
    public long getId() {
        return id;
    }

    /**
     * Set producto id
     * @param id producto id
     */
    public void setId(long id) {
        this.id = id;
    }
    
    /**
     * obtiene los datos del producto
     * @return Nombre del producto
     */
    public String getName() {
        return name;
    }
    /**
     * Cambia los nombres del producto
     * @param name Nombre del producto 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * obtiene el kind_of_product del producto
     * @return kind_of_product del producto
     */
    public String getKind_of_product() {
        return kind_of_product;
    }
    /**
     * Cambia el kind_of_product del producto
     * @param kind_of_product Genero del producto
     */
    public void setKind_of_product(String kind_of_product) {
        this.kind_of_product = kind_of_product;
    }
    /**
     * obtiene la photo del producto
     * @return photo del producto
     */
    public String getPhoto() {
        return photo;
    }
    /**
     * Cambia la photo del producto
     * @param photo Ruta donde se encuentra la fotografia
      */
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    /**
     * obtiene el price del producto
     * @return price del producto
     */
    public int getPrice() {
        return price;
    }
    /**
     * Cambia el price del producto
     * @param price  
     */
    public void setPrice(int price) {
        this.price = price;
    }
 
    /**
     * obtiene la fecha de ingreso del producto
     * @return fecha del producto
     */
    public Date getDate_of_admission() {
        return date_of_admission;
    }
    /**
     * Cambia la fecha de ingreso del producto　 
     * @param date_of_admission  Fecha de ingreso producto
     */
    public void setDate_of_admission(Date date_of_admission) {
        this.date_of_admission = date_of_admission;
    }
//    /**
//     * Años de antiguedad
//     * @return Años de antigueda
//     */
//    public long getAntiguedad(){
//      Date fechaActual=new Date();
//      long antiguedad = (fechaActual.getTime()-this.getDate_of_admission().getTime());
//      return antiguedad/MILS_DIAS;
//    }
    
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
//    public float getPrestaciones(){
//        float prestaciones=(this.getAntiguedad()/365)*(this.getPrice()/12);
//        return prestaciones;
//    }

    public long getIdSell() {
        return idSell;
    }

    public void setIdSell(long idSell) {
        this.idSell = idSell;
    }

    public String getNameSell() {
        return nameSell;
    }

    public void setNameSell(String nameSell) {
        this.nameSell = nameSell;
    }
    
}