public class Gato extends Animal {
    public Gato(int edad, String genero, String nutricion, int cantidadPatas) {
        super(edad, genero, nutricion, cantidadPatas);


    }
    
    public void caminar(){
        // TODO Auto-generated method stub
        System.out.println("El gato esta caminando");
    }
    
    @Override
    public void respirar() {
        // TODO Auto-generated method stub
        System.out.println("El gato esta respirando");
        
    }
    @Override
    public void comer() {
        // TODO Auto-generated method stub
        System.out.println("El gato esta comiendo");
        
    }

    @Override
    public void hacerRuido() {
        // TODO Auto-generated method stub
        System.out.println("El gato hace miau");
    }
}
