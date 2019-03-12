package forms;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class SecondForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtF_nombre;

	/**
	 * Create the frame.
	 */
	public SecondForm() {
		setBackground(Color.WHITE);
		setTitle("Primera chorrada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_nombre = new JLabel("Nombre:");
		lbl_nombre.setBounds(92, 67, 66, 15);
		contentPane.add(lbl_nombre);
		
		txtF_nombre = new JTextField();
		txtF_nombre.setBounds(196, 65, 153, 19);
		contentPane.add(txtF_nombre);
		txtF_nombre.setColumns(10);
		
		JLabel lbl_comentario = new JLabel("");
		lbl_comentario.setBounds(92, 201, 101, 15);
		contentPane.add(lbl_comentario);
		
		JButton btn_aceptar = new JButton("Aceptar");
		btn_aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Todo lo que meta aqui es cuando pulse el boton :)
				
				String aux = txtF_nombre.getText();
				
				lbl_comentario.setText(aux);
				
			}
		});
		btn_aceptar.setBounds(167, 120, 114, 25);
		contentPane.add(btn_aceptar);
		
		
	}
}
