import java.util.Scanner;

public class PIRAMIDE {
private static Scanner Leer = new Scanner(System.in);
    static void Ejercicio10() {
        System.out.print("Ingrese un número: ");
        int numeroNiveles = Leer.nextInt();
        int numeroPosiciones = numeroNiveles * 2 -1;
        int posInicial = numeroNiveles;
        int posFinal = numeroNiveles;

        for (int i = 0; i < numeroNiveles; i++) {
            int contador = 1;
            String resultado = "";

            for (int j=0; j <= numeroPosiciones; j++) {
                if ((j < posInicial) || (j > posFinal)) {
                    resultado += " ";
                } else {
                    if (j < numeroNiveles) {
                        resultado += contador;
                        contador++;
                    } else {
                        resultado += contador;
                        contador--;
                    }
                }
            }
            System.out.println(resultado);
            posFinal++;
            posInicial--;
        }
    }
}
