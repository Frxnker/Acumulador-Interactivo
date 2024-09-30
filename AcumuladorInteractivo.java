public class AcumuladorInteractivo {
    public static void main(String[] args) {

        int suma = 0;
        int i = 0;
        int a = 0;

        while (a >= 0) {
            System.out.println("Introduce número entero: ");
            a = Integer.parseInt(System.console().readLine());

                if (a < 0) {
                    break;
                }
            suma += a;
            i++;
        }

        System.out.println("La suma total es: " + suma);

        if (i > 0) {
            System.out.println("La media es: " + (suma / i));
        } else {
            System.out.println("No se ha introducido ningún número entero.");
        }
    }
}