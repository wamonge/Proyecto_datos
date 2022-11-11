/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_i_datos;

import javax.swing.JOptionPane;

/**
 *
 * @author Rivas
 */
public class Proyecto_I_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int menu = 1;
        Procesos_internos pacientes = new Procesos_internos();
        int opcion = 0;
        while (menu == 1){
            opcion = 0;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al sistema de la clinica\n¿A cuál sección desea dirigirse?\n1) Medicamentos\n2) Pacientes\n3) Salir"));
                if (opcion == 1) {
                    int menu2 = 1;
                    while (menu2 == 1){
                        int opcion2 = 0;
                        opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido a la sección de medicamentos\n¿Qué desea llevar a cabo en esta sección?\n1) Añadir medicamentos\n2) Consultar medicamentos\n3) Imprimir la lista de medicamentos\n4) Volver a menú principal"));
                        if (opcion2 == 1) {
                            pacientes.agregarMedicamentos();
                            menu2 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea continuar en la sección de consulta y gestión de medicamentos?\nSi (1)\nNo(0)"));
                        }
                        if (opcion2 == 2) {
                            pacientes.consultarMedicamentos();
                            menu2 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea continuar en la sección de consulta y gestión de medicamentos?\nSi (1)\nNo(0)"));
                        }
                        if (opcion2 == 3) {
                            pacientes.imprimirMedicamentos();
                            menu2 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea continuar en la sección de consulta y gestión de medicamentos?\nSi (1)\nNo(0)"));
                        }
                        if (opcion2 == 3) {
                            menu2=0;
                        }
                    }
                }
                if (opcion == 2) {
                    int menu2 = 1;
                    while (menu2 == 1){
                        menu2 = 1;
                    while (menu2 == 1){
                        int opcion2 = 0;
                        opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido a la sección de pacientes\n¿Qué desea llevar a cabo en esta sección?\n1) Agregar pacientes\n2) Consultar pacientes\n3) Pacientes sin medicamentos\n4) Volver a menú principal"));
                        if (opcion2 == 1) {
                            pacientes.agregarPacientes();
                            menu2 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea continuar en la sección de consulta y gestión de pacientes?\nSi (1)\nNo(0)"));
                        }
                        if (opcion2 == 2) {
                            pacientes.consultarPacientes();
                            menu2 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea continuar en la sección de consulta y gestión de pacientes?\nSi (1)\nNo(0)"));
                        }
                        if (opcion2 == 3) {
                            pacientes.sinMedicamentos();
                            menu2 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea continuar en la sección de consulta y gestión de pacientes?\nSi (1)\nNo(0)"));
                        }
                        if (opcion2 == 4) {
                            menu2=0;
                        }
                    }
                

                    }
                }
                
                if (opcion == 3) {
                    menu = 0;
                }
        }
    }
    
}
