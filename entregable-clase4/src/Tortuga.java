public class Tortuga extends Animal { 
    
    public String habitat;
    
    public Tortuga(int edad, String genero, String nutricion, int cantidadPatas, String habitat) {
        super(edad, genero, nutricion, cantidadPatas);
        this.habitat = habitat;

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
    public void comer(Alimentos comida) {
        // TODO Auto-generated method stub
        System.out.println("La tortuga esta comiendo " + comida.getNombre());
        
    }

    @Override
    public void hacerRuido() {
        // TODO Auto-generated method stub
        System.out.println("La tortuga hace grrr");
    }

    public Carne convertirEnConsumo() {
        // TODO Auto-generated method stub
        return new Carne("Tortuga", 1000, 56, 30);
    }
    
    
}

