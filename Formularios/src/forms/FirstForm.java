package forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FirstForm extends JFrame implements ActionListener{

	private JLabel lbl_nombre, lbl_comentario;
	private JTextField txt_nombre;
	private JButton btn_aceptar, btn_cerrar;
	private JPanel contentPane;
	
	//Constructor
	public FirstForm() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // forma de cerrar ventana
		setBounds(100, 100, 452, 300); // tamaño ventana
		this.setResizable(false); // no se puede cambiar tamaño de ventana
		this.setTitle("Segunda chorrada"); // titulo de la ventana.
		this.CrearObjetosFormulario(); // creamos todo
		this.InsertarObjetosFormulario(); // Insertamos los objetos
		this.PosicionarObejtosFormulario(); // Los posicionamos
		this.AddEventoBoton();
		
	}
	
	// Crea todo los objetos del formulario
	private void CrearObjetosFormulario() {
		
		lbl_nombre = new JLabel("Nombre:");
		lbl_comentario = new JLabel("");
		txt_nombre = new JTextField();
		btn_aceptar = new JButton("Enviar");
		btn_cerrar = new JButton("Cerrar");
		
		contentPane = new JPanel();		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	}
	
	// Insertar los objetos en el formulario.
	private void InsertarObjetosFormulario() {
		
		this.getContentPane().add(lbl_nombre);
		this.getContentPane().add(txt_nombre);
		this.getContentPane().add(lbl_comentario);
		this.getContentPane().add(btn_aceptar);
		this.getContentPane().add(btn_cerrar);
		
	}
	
	// Posicionar los objetos en coordenada.
	private void PosicionarObejtosFormulario() {
		
		lbl_nombre.setBounds(92, 67, 66, 15);
		txt_nombre.setBounds(196, 65, 153, 19);
		lbl_comentario.setBounds(92, 220, 200, 15);
		btn_aceptar.setBounds(162, 120, 114, 25);
		btn_cerrar.setBounds(162, 180, 114, 25);
		
	}
	
	// Añadir eventos a los botones.
	private void AddEventoBoton() {
		
		btn_aceptar.addActionListener(this);
		btn_cerrar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn_aceptar) {
			
			lbl_comentario.setText("NOMBRE: " + txt_nombre.getText());
			
		} else if(e.getSource() == btn_cerrar) {
			
			this.dispose();
			
		}
		
	}

}
