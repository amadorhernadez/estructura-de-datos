package unidad2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame
{
	
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnAgregarp, btnAgregaru, btnEliminarp, btnEliminaru, btnAdelante, btnAtras;
	//private ListaDoble ld = new ListaDoble();
	private JTextField txid, txnombre, txartista, txgen, txalbum;
	private JLabel lblid, lblNombre, lblArtista;
	
	public Ventana() 
	{
		super("Lista Doble");
		setSize(630, 490);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "Vista", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		scrollPane.setBounds(10, 145, 594, 176);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnAgregarp = new JButton("Agregar Primero");
		btnAgregarp.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(!(txid.getText().isEmpty() && txnombre.getText().isEmpty() && txartista.getText().isEmpty() && txgen.getText().isEmpty() && txalbum.getText().isEmpty())) {
					Musica m = new Musica();
					m.setId(Integer.parseInt(txid.getText()));
					m.setNombre(txnombre.getText());
					m.setArtista(txartista.getText());
					m.setGenero(txgen.getText());
					m.setAlbum(txalbum.getText());
					//ld.agregarp(m);
					txid.setText("");
					txnombre.setText("");
					txartista.setText("");
					txgen.setText("");
					txalbum.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(Ventana.this, "Tiene que llenar todos los campos", null, JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAgregarp.setBounds(71, 87, 136, 35);
		getContentPane().add(btnAgregarp);
		
		btnAgregaru = new JButton("Agregar Ultimo");
		btnAgregaru.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(!(txid.getText().isEmpty() && txnombre.getText().isEmpty() && txartista.getText().isEmpty() && txgen.getText().isEmpty() && txalbum.getText().isEmpty())) {
					Musica m = new Musica();
					m.setId(Integer.parseInt(txid.getText()));
					m.setNombre(txnombre.getText());
					m.setArtista(txartista.getText());
					m.setGenero(txgen.getText());
					m.setAlbum(txalbum.getText());
				//	ld.agregaru(m);
					txid.setText("");
					txnombre.setText("");
					txartista.setText("");
					txgen.setText("");
					txalbum.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(Ventana.this, "Tiene que llenar todos los campos", null, JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAgregaru.setBounds(400, 87, 136, 35);
		getContentPane().add(btnAgregaru);
		
		btnEliminarp = new JButton("Eliminar Primero");
		btnEliminarp.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) {
			//	ld.elimianrp();
				
			}
		});
		btnEliminarp.setBounds(59, 346, 148, 35);
		getContentPane().add(btnEliminarp);
		
		btnEliminaru = new JButton("Eliminar Ultimo");
		btnEliminaru.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
			//	ld.elimianru();
			}
		});
		btnEliminaru.setBounds(400, 346, 148, 35);
		getContentPane().add(btnEliminaru);
		
		btnAdelante = new JButton("Recorrer Adelante");
		btnAdelante.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
			//	textArea.append(textArea.getText().isEmpty() ? ld.adelante().toString() : "\n"+ld.adelante().toString());
			}
		});
		btnAdelante.setBounds(59, 408, 148, 35);
		getContentPane().add(btnAdelante);
		
		btnAtras = new JButton("Recorrer Atras");
		btnAtras.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//textArea.append(textArea.getText().isEmpty() ? ld.atras().toString() : "\n"+ld.atras().toString());
			}
		});
		btnAtras.setBounds(400, 408, 148, 35);
		getContentPane().add(btnAtras);
		
		lblid  = new JLabel("Id");
		lblid.setBounds(10, 23, 29, 14);
		getContentPane().add(lblid);
		
		txid = new JTextField();
		txid.setBounds(32, 20, 86, 20);
		getContentPane().add(txid);
		txid.setColumns(10);
		
		lblArtista = new JLabel("Artista");
		lblArtista.setBounds(281, 23, 46, 14);
		getContentPane().add(lblArtista);
		
		txartista = new JTextField();
		txartista.setBounds(337, 20, 86, 20);
		getContentPane().add(txartista);
		txartista.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(128, 23, 46, 14);
		getContentPane().add(lblNombre);
		
		txnombre = new JTextField();
		txnombre.setBounds(183, 20, 86, 20);
		getContentPane().add(txnombre);
		txnombre.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(433, 23, 46, 14);
		getContentPane().add(lblGenero);
		
		txgen = new JTextField();
		txgen.setBounds(489, 20, 86, 20);
		getContentPane().add(txgen);
		txgen.setColumns(10);
		
		JLabel lblAlbum = new JLabel("Album");
		lblAlbum.setBounds(213, 57, 46, 14);
		getContentPane().add(lblAlbum);
		
		txalbum = new JTextField();
		txalbum.setBounds(269, 54, 86, 20);
		getContentPane().add(txalbum);
		txalbum.setColumns(10);
		
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new Ventana();
	}
}