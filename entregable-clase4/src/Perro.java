public class Perro extends Animal {

    public Perro(int edad, String genero, String nutricion, int cantidadPatas) {
        super(edad, genero, nutricion, cantidadPatas);


    }
    
    public void caminar(){
        // TODO Auto-generated method stub
        System.out.println("El perro esta caminando");
    }
    
    @Override
    public void respirar() {
        // TODO Auto-generated method stub
        System.out.println("El perro esta respirando");
        
    }
    @Override
    public void comer(Alimentos comida) {
        // TODO Auto-generated method stub
        System.out.println("El perro esta comiendo " + comida.getNombre());
        
    }

    @Override
    public void hacerRuido() {
        // TODO Auto-generated method stub
        System.out.println("El perro hace woff woff");
    }

    public Carne convertirEnConsumo() {
        // TODO Auto-generated method stub
        return new Carne("Perro", 1000, 56, 30);
    }
}
