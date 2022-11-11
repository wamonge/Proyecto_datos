/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_i_datos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rivas
 */
public class Procesos_internos {
    ArrayList<String> nombres_pacientes = new ArrayList<String> ();
    ArrayList<ArrayList<String>> pacientes_medicamentos = new ArrayList<ArrayList<String>> ();
    ArrayList<String> medicamentos = new ArrayList<String> ();
    
    public void agregarPacientes (){
        String nombre = "";
        int opcion = 0;
        int comprobar = 0;
        String medicamento = "";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del paciente que desea agregar");
        for (int i = 0; i < nombres_pacientes.size(); i++) {//Este loop es para comprobar que no haya dos pacientes con el mismo nombre.
          if (nombre.equals(nombres_pacientes.get(i))) {
                        comprobar = 1;
                    }
                }
                if (comprobar == 0) {
                    nombres_pacientes.add(nombre);
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea agregar medicamentos al paciente nuevo?\n(1)Si\n(0)No"));
        if (opcion == 0){
            ArrayList<String> subLista = new ArrayList<String>();//Funciona para agregar los medicamentos al paciente
            subLista.add("Vacio");
            pacientes_medicamentos.add(subLista);
        }
        if (opcion == 1){
            int control = 1;
            int prueba = 0;
            ArrayList<String> repeticion = new ArrayList<String> (); //Para que no se repita un mismo medicamento en un paciente.
            ArrayList<String> subLista = new ArrayList<String>();//Funciona para agregar los medicamentos al paciente. Cada sublista corresponde a un paciente y sus medicamentos
            while (control == 1){
                repeticion.add(medicamento);
                int comprobar2 = 0;
                medicamento = JOptionPane.showInputDialog(null, "Ingrese el nombre del medicamento: ");
                for (int i = 0; i < repeticion.size(); i++) {
                    if (medicamento.equals(repeticion.get(i))) {
                        comprobar2 = 1;
                    }
                }
                if (comprobar2 == 0) {
                    subLista.add(medicamento);
                }
                if (comprobar2 != 0) {
                    JOptionPane.showMessageDialog(null, "El paciente ya tiene este medicamento");
                }
                        for (int i = 0; i < medicamentos.size(); i++) {
                            if (medicamento.equals(medicamentos.get(i))) {prueba=prueba+1;}}
                        if (prueba == 0) {medicamentos.add(medicamento);}//Para no repetir medicamentos en la lista general de medicamentos
                control = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea agregar más medicamentos al paciente nuevo?\n(1)Si\n(0)No"));
                int validacion = 0;//Validar información
                while (validacion == 0){ 
                    if (control != 0 && control != 1){
                    validacion = 0;
                    JOptionPane.showMessageDialog(null, "Solo puede ingresar 0 para no y 1 para si");
                    control = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea agregar más medicamentos al paciente nuevo?\n(1)Si\n(0)No"));
                }
                    if (control == 0 || control == 1){
                        validacion = 1;
                    }
                }
            }
            pacientes_medicamentos.add(subLista);//Aqui se agrega a la lista grande de medicamentos.
        }
                }
                if (comprobar != 0) {
                    JOptionPane.showMessageDialog(null, "Ya existe un paciente con este nombre");
                }
        

    }
    public void consultarPacientes (){
        String nombre = "";
        int comprobar = 0;
        String meds = "";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del paciente que desea consultar");
        for (int i = 0; i < nombres_pacientes.size(); i++) {
                     if (nombres_pacientes.get(i).equals(nombre)) {
                     JOptionPane.showMessageDialog(null, "Nombre del paciente: " + nombres_pacientes.get(i) + "\nMedicamentos: " + pacientes_medicamentos.get(i).toString());
                     comprobar = 1;
                     i=nombres_pacientes.size()+1;
                     }
        }
        if (comprobar == 0) {
            JOptionPane.showMessageDialog(null, "El paciente no existe.");
        }
    }
    public void sinMedicamentos(){
        String med = "";
        for (int i = 0; i < pacientes_medicamentos.size(); i++) {
            for (String x : pacientes_medicamentos.get(i)) {
                med = x;
                 if (med.equals("Vacio")) {
                    JOptionPane.showMessageDialog(null, "El paciente " + nombres_pacientes.get(i)+" no tiene medicamentos.");
                    }
            }//Se busca si hay un "vacio" en algún paciente. Esto indica que no hay medicamentos para este paciente.
        }
    
    }
    public void agregarMedicamentos (){
        String nombre_medicamento = "";
        String meds = "";
        int comprobar = 0;
        nombre_medicamento = JOptionPane.showInputDialog(null,"Ingrese el nombre del medicamento que desea agregar");
        for (int i = 0; i < medicamentos.size(); i++) {
            if (nombre_medicamento.equals(medicamentos.get(i))) {
                comprobar = 1;
            }
            else{comprobar=0;}
        }
        if (comprobar == 0) {
            medicamentos.add(nombre_medicamento);
        }
        if (comprobar == 1) {
            JOptionPane.showMessageDialog(null, "El medicamento ya existe en la lista.");
        }
        for (int i = 0; i < medicamentos.size(); i++) {
            if (i==medicamentos.size()-1) {
                meds = meds + medicamentos.get(i);
            }
            else{
                meds = meds + medicamentos.get(i) + ", ";
            }
            
        }
        JOptionPane.showMessageDialog(null, "Lista de medicamentos en la base de datos: " + meds);
    }
    public void imprimirMedicamentos(){
        String meds = "";
        for (int i = 0; i < medicamentos.size(); i++) {
            if (i==medicamentos.size()-1) {
                meds = meds + medicamentos.get(i);
            }
            else{
                meds = meds + medicamentos.get(i) + ", ";
            }
            
        }
        JOptionPane.showMessageDialog(null, "Lista de medicamentos en la base de datos: " + meds);
        
    }
    public void consultarMedicamentos (){
        String nombre_mediacamento = "";
        int contador = 0;
        int control = 0;
        String med = "";
        nombre_mediacamento = JOptionPane.showInputDialog(null,"Ingrese el nombre del medicamento que desea consultar");
        for (int i = 0; i < medicamentos.size(); i++) {
            if (medicamentos.get(i).equals(nombre_mediacamento)) {
                control = 1;
            }
            else {}
        }
        if (control == 0) {
            JOptionPane.showMessageDialog(null, "El medicamento no existe.");
        }
        else {
        for (int i = 0; i < pacientes_medicamentos.size(); i++) {
            for (String x : pacientes_medicamentos.get(i)) {
                med = x;
                 if (med.equals(nombre_mediacamento)) {
                    contador = contador+1;
                    }
            }
        }
        if (contador!=0) {
            JOptionPane.showMessageDialog(null, "El medicamento "+nombre_mediacamento+" es usado por " + contador +" pacientes.");
        }
        if (contador==0) {
            JOptionPane.showMessageDialog(null, "El medicamento "+nombre_mediacamento+" no es utilizado por ningún paciente. Se eliminará de la lista de medicamentos.");
            medicamentos.remove(nombre_mediacamento);
        }
    }}
}
