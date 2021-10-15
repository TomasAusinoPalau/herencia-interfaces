public abstract class Animal implements ISerVivo, IComida {

    private int edad;
    private String genero;
    private String nutricion;
    private int cantidadPatas;

    public Animal(int edad, String genero, String nutricion, int cantidadPatas) {
        this.edad = edad;
        this.genero = genero;
        this.nutricion = nutricion;
        this.cantidadPatas = cantidadPatas;
    }

    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getCantidadPatas() {
        return cantidadPatas;
    }
    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }
    public String getNutricion() {
        return nutricion;
    }
    public void setNutricion(String nutricion) {
        this.nutricion = nutricion;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
}
