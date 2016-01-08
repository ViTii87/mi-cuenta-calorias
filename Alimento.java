
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

    /**
     * Metodo para calcular las estadisticas de un alimento.
     */
    public void muestraDatos(){
        float calorias = (proteinas * 4) + (carbohidratos * 4) + (grasas * 9);

        System.out.println("Nombre:\t\t\t\t\t" + nombre);
        System.out.println("Proteinas por cada 100 gramos: \t\t" + proteinas);
        System.out.println("Carbohidratos por cada 100 gramos: \t" + carbohidratos);
        System.out.println("Grasas por cada 100 gramos: \t\t" + grasas);
        System.out.println("Calorias:\t\t\t\t" + calorias);
        if(proteinas == carbohidratos && carbohidratos == grasas){
            System.out.println("Componente/s mayoritario/s: \t\t Proteinas, Carbohidratos, Grasas");
        }
        else{
            if(proteinas == carbohidratos){
                 System.out.println("Componente/s mayoritario/s: \t\t Proteinas, Carbohidratos");
            }
            else{
                if(proteinas == grasas){
                    System.out.println("Componente/s mayoritario/s: \t\t Proteinas, Grasas");
                }
                else{
                    if(carbohidratos == grasas){
                        System.out.println("Componente/s mayoritario/s: \t\t Carbohidratos, Grasas");
                    }
                    else{
                        if(proteinas > carbohidratos){
                            System.out.println("Componente/s mayoritario/s: \t\t Proteinas");
                        }
                        else{
                            if(proteinas > grasas){
                                System.out.println("Componente/s mayoritario/s: \t\t Proteinas");
                            }
                            else{
                                if(proteinas < carbohidratos){
                                    System.out.println("Componente/s mayoritario/s: \t\t Carbohidratos");
                                }
                                else{
                                    if(carbohidratos < grasas){
                                        System.out.println("Componente/s mayoritario/s: \t\t Grasas");
                                    }
                                }
                            }
                        }
                    }
                }
                
            }
        }
        
    }
}
