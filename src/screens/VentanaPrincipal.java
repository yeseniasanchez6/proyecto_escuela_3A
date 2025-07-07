package screens;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

    private JMenuBar menuBar; //Barra menu
    private JMenu menuAlumnos; //menu Alumno
    private JMenuItem menuInsertarAlumnos; //Elemento Insertar

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

        //Agregando menu
        menuAlumnos.add(menuInsertarAlumnos);
        menuBar.add(menuAlumnos);
        
        this.setJMenuBar(menuBar); //menuBar Es la unica barra del JFrame

        pack(); //Empaquetar los componentes del JFrame

    }
    
}
