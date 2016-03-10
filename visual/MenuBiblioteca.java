package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Window.Type;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class MenuBiblioteca {

	private JFrame frmBibliotecaUneVersion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuBiblioteca window = new MenuBiblioteca();
					window.frmBibliotecaUneVersion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuBiblioteca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBibliotecaUneVersion = new JFrame();
		frmBibliotecaUneVersion.setType(Type.POPUP);
		frmBibliotecaUneVersion.setTitle("BIBLIOTECA UNE");
		frmBibliotecaUneVersion.setBounds(100, 100, 800, 600);
		frmBibliotecaUneVersion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmBibliotecaUneVersion.setJMenuBar(menuBar);
		
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
		frmBibliotecaUneVersion.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Pr\u00E9stamo");
		btnNewButton.setBounds(0, 0, 95, 60);
		frmBibliotecaUneVersion.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Libros");
		btnNewButton_1.setBounds(101, 0, 95, 60);
		frmBibliotecaUneVersion.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Lector");
		btnNewButton_2.setBounds(202, 0, 95, 60);
		frmBibliotecaUneVersion.getContentPane().add(btnNewButton_2);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(301, 0, 95, 60);
		frmBibliotecaUneVersion.getContentPane().add(btnSalir);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
