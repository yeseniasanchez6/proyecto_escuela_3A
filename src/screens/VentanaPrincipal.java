package screens;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

    private JMenuBar menuBar; //Barra menu
    private JMenu menuAlumnos; //menu Alumno
    private JMenuItem menuInsertarAlumnos; //Elemento Insertar
    private JMenuItem menuVerAlumnos;
    private JMenuItem menuEliminarAlumnos;

    public VentanaPrincipal(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicomponents();
    }

    private void inicomponents(){
        //Barra de menu
        menuBar = new JMenuBar();

        //menu Alumno
        menuAlumnos = new JMenu();
        menuAlumnos.setText("Alumnos");

        //Menu insertar
        menuInsertarAlumnos = new JMenuItem();
        menuInsertarAlumnos.setText("Insertar...");

        //Menu ver alumnos
        menuVerAlumnos = new JMenuItem("Ver todos los alumnos...");

        //menu eliminar alumnos
        menuEliminarAlumnos = new JMenuItem("Dar de baja alumno...");

        //Agregando menu
        menuAlumnos.add(menuVerAlumnos);
        menuAlumnos.add(menuInsertarAlumnos);
        menuAlumnos.add(menuEliminarAlumnos);
        menuBar.add(menuAlumnos);

        this.setJMenuBar(menuBar); //menuBar Es la unica barra del JFrame

        pack(); //Empaquetar los componentes del JFrame

    }
    
}
