public class PIRAMIDE {

    static void Ejercicio10() {
        System.out.print("Ingrese un número: ");
        int numeroNiveles =0;
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
