//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        String mensaje;

        Molde galleta1=new Molde();
        Molde galleta2=new Molde("aluminio",11.2f,10.2f,"cuadrado","brillante");
        Molde galleta3=new Molde("silicona",9.2f,8.2f,"triángulo","rojo");

        galleta1.imprimir();
        galleta2.imprimir();
        galleta3.imprimir();

    }
}