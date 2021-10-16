public class Persona implements ISerVivo  {

    private int edad;
    private String genero;
    private String nutricion;
    private int cantidadPatas = 2;


    public Persona(int edad, String genero, String nutricion) {
        this.edad = edad;
        this.genero = genero;
        this.nutricion = nutricion;
    }
    
    public void caminar(){
        System.out.println("La persona esta caminando");
    }
    
    @Override
    public void respirar() {
        // TODO Auto-generated method stub
        System.out.println("La persona esta respirando");
        
    }

    @Override
    public void hacerRuido() {
        // TODO Auto-generated method stub
        System.out.println("La persona hace habla");
    }

    @Override
    public void comer(Alimentos comida) {
        // TODO Auto-generated method stub
        System.out.println("El humano esta comiendo " + comida.getNombre());
    }

    @Override
    public Carne convertirEnConsumo() {
        // TODO Auto-generated method stub
        return null;
    }

}
