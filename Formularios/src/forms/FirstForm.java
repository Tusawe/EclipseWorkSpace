package forms;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FirstForm extends JFrame {

	private JLabel lbl_nombre, lbl_comentario;
	private JTextField txt_nombre;
	private JButton btn_aceptar;
	private JPanel contentPane;
	
	//Constructor
	public FirstForm() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // forma de cerrar ventana
		setBounds(100, 100, 452, 300); // tamaño ventana
		this.setResizable(false); // no se puede cambiar tamaño de ventana
		this.setTitle("Segunda chorrada"); // titulo de la ventana.
		this.CrearObjetosFormulario(); // creamos todo
		this.InsertarObjetosFormulario();
		
	}
	
	// Crea todo los objetos del formulario
	private void CrearObjetosFormulario() {
		
		lbl_nombre = new JLabel("Nombre:");
		lbl_comentario = new JLabel("");
		txt_nombre = new JTextField();
		btn_aceptar = new JButton("Enviar");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	}
	
	// Posicionar los objetos en coordenada.
	private void InsertarObjetosFormulario() {
		
		lbl_nombre.setBounds(92, 67, 66, 15);
		txt_nombre.setBounds(196, 65, 153, 19);
		lbl_comentario.setBounds(92, 201, 101, 15);
		btn_aceptar.setBounds(167, 120, 114, 25);
		this.getContentPane().add(lbl_nombre);
		this.getContentPane().add(txt_nombre);
		this.getContentPane().add(lbl_comentario);
		this.getContentPane().add(btn_aceptar);
		
	}
	private void AddEventosAObjetos() {}

}
