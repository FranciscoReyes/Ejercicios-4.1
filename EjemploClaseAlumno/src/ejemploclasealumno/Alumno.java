package ejemploclasealumno;

import java.util.Calendar;

class Alumno {
    String nombre;
    String apellidos;
    int añoDeNacimiento;
    int númeroPersonal;
    String grupo;
    String turnoHorario = "Mañana";

    void cambiaGrupo(String nuevoGrupo) {
        grupo = nuevoGrupo;
    }

    void asignaValores(String nom, String ape, int añoNac, int num, String gru, String turno) {
        //Asignación de valores a los atributos de la clase
        nombre = nom;
        apellidos = ape;
        añoDeNacimiento = añoNac;
        númeroPersonal = num;
        grupo = gru;
        turnoHorario = turno;
        //Mostrar mensaje informativo
        System.out.println("Valores asignados correctamente");
    }

    void muestraGrupo() {
       System.out.println("El alumno: " + nombre + " " + apellidos);
       System.out.println("Pertenece al grupo: " + grupo);
    }

    String dameGrupo() {
        return grupo;
    }

    boolean esMayorEdad() {
       int añoActual = 2015;

       if (añoActual - añoDeNacimiento >= 18)
           return true;
       else
           return false;
    }
    
    int dameEdad() {
        Calendar año = Calendar.getInstance();
        int añoActual2 = año.get(Calendar.YEAR) ;
        int edad = añoActual2 - añoDeNacimiento;
        return edad;
        
    }
    
    void dameNombre(boolean ordenApellidos) {
        if (ordenApellidos == true) {
            System.out.println(apellidos + ", " + nombre); 
        } else {
            System.out.println(nombre + " " + apellidos);
        }
    }

}
