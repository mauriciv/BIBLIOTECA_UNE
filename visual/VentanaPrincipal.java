package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaPrincipal frame = new VentanaPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public VentanaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        setTitle("BIBLIOTECA UNE");
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnProceso = new JMenu("Proceso");
        menuBar.add(mnProceso);
        
        JMenuItem mntmRegistrarPrstamos = new JMenuItem("Registrar Pr\u00E9stamos");
        mnProceso.add(mntmRegistrarPrstamos);
        
        JMenu mnTabla = new JMenu("Tablas");
        menuBar.add(mnTabla);
        
        JMenuItem mntmLibros = new JMenuItem("Libros");
        mnTabla.add(mntmLibros);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Lector");
        mnTabla.add(mntmNewMenuItem);
        
        JMenuItem mntmEditorial = new JMenuItem("Editorial");
        mnTabla.add(mntmEditorial);
        
        JMenu mnNewMenu = new JMenu("Informes");
        menuBar.add(mnNewMenu);
        
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listado de Libros");
        mnNewMenu.add(mntmNewMenuItem_1);
        
        JMenuItem mntmListadoDeLector = new JMenuItem("Listado de Lector");
        mnNewMenu.add(mntmListadoDeLector);
        
        JMenuItem mntmListado = new JMenuItem("Listado de Editorial");
        mnNewMenu.add(mntmListado);
        
        JMenuItem mntmInformes = new JMenuItem("Informes de Pr\u00E9stamos");
        mnNewMenu.add(mntmInformes);
        
        JMenuItem mntmInformesDeDeudas = new JMenuItem("Informes de Deudas");
        mnNewMenu.add(mntmInformesDeDeudas);
        
        JMenu mnUtilidades = new JMenu("Utilidades");
        menuBar.add(mnUtilidades);
        
        JMenuItem mntmInicializ = new JMenuItem("Inicializaci\u00F3n de Datos");
        mnUtilidades.add(mntmInicializ);
        
        JMenuItem mntmConfiguraciones = new JMenuItem("Configuraciones");
        mnUtilidades.add(mntmConfiguraciones);
        getContentPane().setLayout(null);
        
        JButton btnNewButton = new JButton("Pr\u00E9stamo");
        btnNewButton.setBounds(0, 0, 95, 60);
        getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Libros");
        btnNewButton_1.setBounds(101, 0, 95, 60);
        getContentPane().add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Lector");
        btnNewButton_2.setBounds(202, 0, 95, 60);
        getContentPane().add(btnNewButton_2);
        
        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(301, 0, 95, 60);
        getContentPane().add(btnSalir);

    }

}
