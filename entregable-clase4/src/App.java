public class App {
    public static void main(String[] args) throws Exception {
        /*
            Ejercicio de Herencia e Interfaces:
            Clases:
 
                Ser vivo (NO ser humano)
                Persona
                Gato
                Perro
                Conejo
                Tortuga
                Carne (comida)
                Vegetal (comida)
 
            Una persona puede comer tanto carne como vegetales como otros animales.
            Comparten todos algunos atributos en común.
            Se pueden crear clases como Animal o Mamifero.
            Crear dos interfaces que tengan que ver con los metodos compartidos (polimorfismo)
        */
        
        // Crear una persona
        Persona humano = new Persona(22, "Masculino","Vegetariano");
        humano.caminar();
        Tortuga tortuga = new Tortuga(100, "Femenino", "Herbíbora", 4, "Agua");
        tortuga.caminar();
        System.out.println("La tortuga es " + tortuga.getNutricion());
        Carne tortugaAsada = tortuga.convertirEnConsumo();
        tortuga = null;
        humano.comer(tortugaAsada);
        
    }
}
