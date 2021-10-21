public class Conejo extends Animal {
    public Conejo(int edad, String genero, String nutricion, int cantidadPatas) {
        super(edad, genero, nutricion, cantidadPatas);


    }
    
    public void caminar(){
        // TODO Auto-generated method stub
        System.out.println("El conejo esta caminando");
    }
    
    @Override
    public void respirar() {
        // TODO Auto-generated method stub
        System.out.println("El conejo esta respirando");
        
    }
    @Override
    public void comer(Alimentos comida) {
        // TODO Auto-generated method stub
        System.out.println("El conejo esta comiendo " + comida.getNombre());
        
    }

    @Override
    public void hacerRuido() {
        // TODO Auto-generated method stub
        System.out.println("El conejo no hace ruido");
    }

    public Carne convertirEnConsumo() {
        // TODO Auto-generated method stub
        return new Carne("Conejo", 1000, 56, 30);
    }
}
