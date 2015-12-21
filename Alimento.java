
/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    //Atributo que nos permite guardar el nombre del alimento
    private String nombre;
    // Atributo que nos permite guardar la cantidad de proteinas del alimiento
    private float proteinas;
    // Atributo que nos permite guardar la cantidad de carbohidratos del alimiento
    private float carbohidratos;
    // Atributo que nos permite guardar la cantidad de grasas del alimiento
    private float grasas;
    // Atributo que nos permite guardar la cantidad de calorias del alimiento (esta pendiente)
    private float calorias;
    // Atributo qu enos guarda el componente mayoritario del alimento (esta pendiente)
    private String componenteMayoritario;
    
    /**
     * Constructor que nos permite crear un alimento que tiene por parametros el nombre
     * las proteinas, los carbohidratos y grasas.
     */
    public Alimento(String nombre, float proteinas, float carbohidratos, float grasas){
        this.nombre = nombre;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
    }
 
}
