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
    public void comer(Alimentos comida) {
        // TODO Auto-generated method stub
        System.out.println("El gato esta comiendo " + comida.getNombre());
        
    }

    @Override
    public void hacerRuido() {
        // TODO Auto-generated method stub
        System.out.println("El gato hace miau");
    }

    public Carne convertirEnConsumo() {
        // TODO Auto-generated method stub
        return new Carne("Gato", 1000, 56, 30);
    }
}
