import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //1- Métodos: Cálculo IVA:
        double general = 0.21;
        double reducido = 0.1;
        double superReducido = 0.04;
        double extento = 0;
        //chaqueta
        System.out.println(calcularPrecioFinal(40, general));
        //bono-metro
        System.out.println(calcularPrecioFinal(12, reducido));
        //huevos
        System.out.println(calcularPrecioFinal(3.2, superReducido));
        //dentista
        System.out.println(calcularPrecioFinal(56, extento));


        //2- Ejercicio validación setter, y ArrayLists:
        ArrayList<ClienteDiscoteca> clientes = new ArrayList<>();
        clientes.add(new ClienteDiscoteca("Juan Pérez", 25, "Calle Falsa 123", 123456789));
        clientes.add(new ClienteDiscoteca("María López", 30, "Avenida Siempreviva 742", 987654321));
        clientes.add(new ClienteDiscoteca("Carlos García", 22, "Plaza Mayor 10", 555555555));
        // new ClienteDiscoteca("Ana Fernández", 28, "Calle Luna 20", 444444444);
        // new ClienteDiscoteca("Pedro Martínez", 24, "Calle Sol 5", 333333333);
        // new ClienteDiscoteca("Lucía Sánchez", 27, "Calle Estrella 15", 222222222);
        // new ClienteDiscoteca("Marta Gómez", 29, "Calle Mar 8", 111111111);
        // new ClienteDiscoteca("Javier Ruiz", 23, "Calle Tierra 13", 999999999);
        // new ClienteDiscoteca("Sofía Ramírez", 26, "Calle Viento 25", 888888888);
        // new ClienteDiscoteca("Diego Torres", 31, "Calle Agua 17", 777777777);
 
        Scanner teclado = new Scanner(System.in);
        añadirCliente(clientes, teclado);
        // 3- Trabajo con cadenas de caracteres:
        System.out.println("Introduce una frase.");
        String capitalizing = teclado.nextLine();
        String[] arrayofWords = capitalizing.split(" ");
        String finalSentence = "";
        for (String word : arrayofWords){
            finalSentence += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }
        System.out.println(finalSentence);

        teclado.close();
    }
    public static float calcularPrecioFinal(double precio, double iva){
       return (float) (precio + (precio*iva));
    }
    public static void añadirCliente(ArrayList<ClienteDiscoteca> clientes, Scanner teclado){
        String respuesta = "";
        ArrayList<ClienteDiscoteca> aceptados = new ArrayList<>();
        ArrayList<ClienteDiscoteca> rechazados = new ArrayList<>();
        while (!respuesta.equals("salir")){
            System.out.println("¿Qué quieres hacer? Insertar cliente / Salir");
            respuesta = teclado.nextLine().toLowerCase();
            switch (respuesta) {
                case "insertar":
                case "insertar cliente":
                    System.out.println("Introduce el nombre del cliente");
                    String nombre = teclado.nextLine();
                    System.out.println("Introduce la edad");
                    int edad = Integer.parseInt(teclado.nextLine());
                    System.out.println("Introduce la dirección");
                    String direccion = teclado.nextLine();
                    System.out.println("Introduce el número de teléfono");
                    int nTelefono = Integer.parseInt(teclado.nextLine());
                    ClienteDiscoteca cliente = new ClienteDiscoteca(nombre, edad, direccion, nTelefono);
                    if (cliente.getEdad()>=18) {
                        aceptados.add(cliente);
                    } else{
                        rechazados.add(cliente);
                    }
                    break;
                case "salir":
                    break;
                default:
                System.out.println("Comando no válido");
                    break;
            }
        }
        System.out.println("CLIENTES ACEPTADOS");
        for (ClienteDiscoteca cliente : aceptados){
            System.out.println(cliente.toString());
        }
        System.out.println("CLIENTES RECHAZADOS");
        for (ClienteDiscoteca cliente : rechazados){
            System.out.println(cliente.toString());
        }
    };
}
