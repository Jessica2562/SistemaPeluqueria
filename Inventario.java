package SistemaPeluqueria;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inventario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnMostrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventario frame = new Inventario();
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
	public Inventario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(32,83,112));
		
		table = new JTable();
		table.setBounds(58, 34, 286, 175);
		contentPane.add(table);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MostrarInventario iv = new MostrarInventario();
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("id");
				model.addColumn("codigo");
				model.addColumn("nombre");
				model.addColumn("precio");
				model=iv.model();
				table.setModel(model);
			}
		});
		btnMostrar.setBounds(310, 227, 89, 23);
		btnMostrar.setForeground(Color.BLACK);
		btnMostrar.setFont(new Font("cooper black", Font.ROMAN_BASELINE, 10));
		contentPane.add(btnMostrar);
	}
}
