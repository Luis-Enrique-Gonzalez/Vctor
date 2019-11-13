/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilladinámicavector;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class PillaDinámicaVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        int Opcion, a;
        pilaVector objpila = new pilaVector();
        do {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. ingresar\n"+ "2. quitar\n"+ "3. cima\n"+ "4. vacia\n"+ "5. lmpiar\n"+ "6. exit\n"+"7. mostrar \n"));

            switch (Opcion) {
                case 1:
                    a = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrasa el numero a agragar"));
                    objpila.insertar(a);
                    break;
                case 2:
                    objpila.quitar();
                    break;
                case 3:
                    objpila.cimaPila();
                    break;
                case 4:
                    objpila.pilaVacia();
                    break;
                case 5:
                    objpila.limpiarPila();
                    break;
                case 6:
                    System.exit(0);
                    break;
                    case 7:
                    objpila.mostrarPila();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA \n", "ERROR OPCION", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (true);
    }

}
