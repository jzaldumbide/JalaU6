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
 //métodos setters y getters


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    private String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
