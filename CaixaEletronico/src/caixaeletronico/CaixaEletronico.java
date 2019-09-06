package caixaeletronico;

public class CaixaEletronico {

    public static void main(String[] args) {
        int valor = 10;
        int[] notas = new int[]{2, 5, 10, 20, 50, 100};

        int qNotas = notas.length - 1;
        for (int i = qNotas; i >= 0; i--) {
            if (valor >= notas[i]) {
                int notaAtual = valor / notas[i];
                int resto = valor % notas[i];
                System.out.println(valor / notas[i]
                        + " x " + notas[i]);
                if (resto > 0) {
                    for (int j = i - 1; j >= 0; j--) {
                        if (notas[j] <= resto) {
                            notaAtual = resto / notas[j];
                            System.out.println(notaAtual + " x " + notas[j]);
                        }

                    }
                }
                System.out.println("-------------");

            }

        }

    }

}
