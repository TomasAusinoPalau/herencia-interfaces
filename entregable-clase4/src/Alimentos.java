public class Alimentos implements IComida{
    private String nombre;
    private int calorias;
    private int proteinas;
    private int grasas;

    public Alimentos(String nombre, int calorias, int proteinas, int grasas) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.grasas = grasas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCalorias() {
        return calorias;
    }
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    public int getGrasas() {
        return grasas;
    }
    public void setGrasas(int grasas) {
        this.grasas = grasas;
    }
    public int getProteinas() {
        return proteinas;
    }
    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
    

    @Override
    public Carne convertirEnConsumo() {
        // TODO Auto-generated method stub
        return null;
    }
}