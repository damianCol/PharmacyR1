package Logic;

import java.util.Date;

/**
 *
 * @author VM
 */
public class DatesCustomer {
    private long id;        /** cliente id */
    private String name; /**Nombre del cliente **/
    private String lastName; /**Apellido del cliente **/
    private int gender; /**Genero del cliente **/
    private String photo; /**Ruta donde se encuentra la fotografia **/
    private Date dateBirth; /**Fecha de nacimiento del cliente **/
    
    /**
     * Constructor por defecto
     */
    public DatesCustomer() {
        this.id = 0;
        this.name = " ";
        this.lastName = " ";
        this.gender = ' ';
        this.photo = " ";
        this.dateBirth = new Date();
    }

    /**
     * Constructor with parameters
     * @param id cliente identification
     * @param nombre Nombre del cliente 
     * @param apellido Apellido del cliente
     * @param gender Genero del cliente
     * @param foto Ruta donde se encuentra la fotografia
     * @param fechaNacimiento Fecha de nacimiento del cliente
     */
    public DatesCustomer(long id, String name, String lastName, char gender, String photo, Date dateBirth) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.photo = photo;
        this.dateBirth = dateBirth;
    }

    /**
     * Get cliente id
     * @return cliente id
     */
    public long getId() {
        return id;
    }

    /**
     * Set cliente id
     * @param id cliente id
     */
    public void setId(long id) {
        this.id = id;
    }
    
    /**
     * set dates from cliente
     * @return Nombre del cliente
     */
    public String getName() {
        return name;
    }
    /**
     * Cambia los nombres del cliente
     * @param nombre Nombre del cliente 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * obtiene los apellidos del cliente
     * @return apellido del cliente
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Cambia los apellidos del cliente
     * @param lastName Apellido del cliente
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * obtiene el genere del cliente
     * @return genero del cliente
     */
    public int getGender() {
        return gender;
    }
    /**
     * Cambia el genero del cliente
     * @param genere Genero del cliente
     */
    public void setGender(int gender) {
        this.gender = gender;
    }
    /**
     * obtiene la foto del cliente
     * @return foto del cliente
     */
    public String getPhoto() {
        return photo;
    }
    /**
     * Cambia la foto del cliente
     * @param foto Ruta donde se encuentra la fotografia
      */
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    /**
     * obtiene la fecha del nacimiento del cliente
     * @return fecha del nacimiento del cliente
     */
    public Date getDateBirth() {
        return dateBirth;
    }
    /**
     * Cambia la fecha de nacimiento del cliente
     * @param dateBirth Fecha de nacimiento del cliente
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
}