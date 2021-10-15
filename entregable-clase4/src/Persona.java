public class Persona implements ISerVivo  {

    private int edad;
    private String genero;
    private String nutricion;
    private String cantidadPatas;


    public Persona(int edad, String genero, String nutricion, int cantidadPatas) {
        this.edad = edad;
        this.genero = genero;
        this.nutricion = nutricion;
        this.cantidadPatas = cantidadPatas;
    }
    
    public void caminar(){
        System.out.println("La tortuga esta caminando");
    }
    
    @Override
    public void respirar() {
        // TODO Auto-generated method stub
        System.out.println("La tortuga esta respirando");
        
    }
    @Override
    public void comer() {
        // TODO Auto-generated method stub
        System.out.println("La tortuga esta comiendo");
        
    }

    @Override
    public void hacerRuido() {
        // TODO Auto-generated method stub
        System.out.println("La tortuga hace grrr");
    }
}
