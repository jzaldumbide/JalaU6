public class Molde {
    //atributos
    String material;
    float ancho;
    float alto;
    String forma;
    String color;
//constructores
    public Molde() {
    }

    public Molde(String material, float ancho, float alto, String forma, String color) {
        this.material = material;
        this.ancho = ancho;
        this.alto = alto;
        this.forma = forma;
        this.color = color;

    }

    //métodos

    void imprimir() {
        System.out.println("---------");
        System.out.println("Material: " + material);
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Forma: " + forma);
        System.out.println("Color: " + color);
        System.out.println("---------");

    }
}
