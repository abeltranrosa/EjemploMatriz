package ejemplomatriz;

import javax.swing.JOptionPane;

public class MetodosMatriz {

    //cogemos espacio en memoria
    int[][] notas = new int[3][4];
    float[] MediaNotas = new float[3];

    //cargamos la matriz

    public void cargarMatriz() {
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas.length; c++) {
                notas[f][c] = pedirNota();
            }
        }
    }

    //creamos metodo amosar matriz donde f son las filas y c son las columnas
    public void amosarMatriz() {
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[f].length; c++) {
                System.out.print(notas[f][c] + "  ");
            }

            //cargo el salto de pagina para darle esteticamente la forma de matriz
            System.out.println("\n");
        }

    }

    public void calcularMediaNotas() {
        float acumulador;
        for (int f = 0; f < notas.length; f++) {
            acumulador = 0;
            for (int c = 0; c < notas[f].length; c++) {
                
                //MediaNotas[f]= 
                        acumulador = acumulador + notas[f][c];
            }
            MediaNotas[f] = acumulador / notas[f].length;

        }
    }

    public int pedirNota() {
        int resultado;
        do {
            resultado = Integer.parseInt(JOptionPane.showInputDialog("nota :"));
        } while (resultado < 1 || resultado > 10);
        return resultado;

    }
}
