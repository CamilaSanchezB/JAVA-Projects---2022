package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Banda;
import modelo.Juego;
import javax.swing.UIManager;
import java.awt.Font;

public class Ventana1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel_Sur;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JPanel panelCentro;
	private JScrollPane scrollPane_1;
	private JPanel panelMedio;
	private JScrollPane scrollPane_2;
	private JList<Banda> list1;
	private JList<Banda> list2;
	private JPanel PanelEnfrentamiento;
	private JPanel PanelCreacion;
	private JLabel lblNombre;
	private JTextField textFieldNombre;
	private JLabel lblNewLabel;
	private JTextField textFieldCantidadIntegrantes;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JLabel lblNewLabel_2;
	private JPanel panel_9;
	private JTextField textFieldAniosJuntos;
	private JPanel panel_10;
	private JPanel panel_12;
	private JTextField textFieldTopGlobal;
	private JTextField textFieldPremios;
	private JLabel lblNewLabel_3;
	private JPanel panel_22;
	private JPanel panel_23;
	private JButton Agregar;
	private JButton Eliminar;
	private JRadioButton rdbtnCantidadIntegrantes;
	private JRadioButton rdbtnAniosJuntos;
	private JRadioButton rdbtnTopGlobal;
	private JRadioButton rdbtnPremios;
	private JButton Enfrentar;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Juego juego = new Juego();
	private DefaultListModel<Banda> modeloLista = new DefaultListModel<Banda>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 100, 615, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panelCentro = new JPanel();
		panelCentro.setBackground(Color.MAGENTA);
		contentPane.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new GridLayout(1, 0, 0, 0));
		
		scrollPane_1 = new JScrollPane();
		panelCentro.add(scrollPane_1);
		
		list1 = new JList<Banda>();
		scrollPane_1.setViewportView(list1);
		
		panelMedio = new JPanel();
		panelCentro.add(panelMedio);
		panelMedio.setLayout(new GridLayout(2, 0, 0, 0));
		
		PanelCreacion = new JPanel();
		panelMedio.add(PanelCreacion);
		PanelCreacion.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_2 = new JPanel();
		PanelCreacion.add(panel_2);
		
		lblNombre = new JLabel("Nombre: \r\n");
		panel_2.add(lblNombre);
		
		panel_4 = new JPanel();
		PanelCreacion.add(panel_4);
		
		textFieldNombre = new JTextField();
		panel_4.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		panel_3 = new JPanel();
		PanelCreacion.add(panel_3);
		
		lblNewLabel = new JLabel("Anios Juntos: ");
		panel_3.add(lblNewLabel);
		
		panel_5 = new JPanel();
		panel_5.setBackground(UIManager.getColor("Button.background"));
		PanelCreacion.add(panel_5);
		
		textFieldAniosJuntos = new JTextField();
		panel_5.add(textFieldAniosJuntos);
		textFieldAniosJuntos.setColumns(10);
		
		panel_6 = new JPanel();
		PanelCreacion.add(panel_6);
		
		panel = new JPanel();
		panel_6.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblNewLabel_1 = new JLabel("Top Global: ");
		panel.add(lblNewLabel_1);
		
		panel_7 = new JPanel();
		PanelCreacion.add(panel_7);
		
		textFieldTopGlobal = new JTextField();
		textFieldTopGlobal.setColumns(10);
		panel_7.add(textFieldTopGlobal);
		
		panel_8 = new JPanel();
		PanelCreacion.add(panel_8);
		
		lblNewLabel_2 = new JLabel("Premios:");
		panel_8.add(lblNewLabel_2);
		
		panel_9 = new JPanel();
		PanelCreacion.add(panel_9);
		
		textFieldPremios = new JTextField();
		textFieldPremios.setColumns(10);
		panel_9.add(textFieldPremios);
		
		panel_10 = new JPanel();
		PanelCreacion.add(panel_10);
		
		lblNewLabel_3 = new JLabel("Cantidad Integrantes:");
		panel_10.add(lblNewLabel_3);
		
		panel_12 = new JPanel();
		PanelCreacion.add(panel_12);
		
		textFieldCantidadIntegrantes = new JTextField();
		textFieldCantidadIntegrantes.setColumns(10);
		panel_12.add(textFieldCantidadIntegrantes);
		
		panel_22 = new JPanel();
		PanelCreacion.add(panel_22);
		
		Agregar = new JButton("Agregar");
		Agregar.setForeground(new Color(255, 255, 255));
		Agregar.setBackground(new Color(50, 205, 50));
		Agregar.addActionListener(this);
		panel_22.add(Agregar);
		
		panel_23 = new JPanel();
		panel_23.setBackground(UIManager.getColor("Button.background"));
		PanelCreacion.add(panel_23);
		
		Eliminar = new JButton("Eliminar");
		Eliminar.setForeground(new Color(255, 255, 255));
		Eliminar.setBackground(new Color(255, 0, 0));
		Eliminar.addActionListener(this);
		panel_23.add(Eliminar);
		
		PanelEnfrentamiento = new JPanel();
		panelMedio.add(PanelEnfrentamiento);
		PanelEnfrentamiento.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdbtnAniosJuntos = new JRadioButton("Anios Juntos");
		rdbtnAniosJuntos.setSelected(true);
		buttonGroup.add(rdbtnAniosJuntos);
		PanelEnfrentamiento.add(rdbtnAniosJuntos);
		
		rdbtnTopGlobal = new JRadioButton("Top Global");
		buttonGroup.add(rdbtnTopGlobal);
		PanelEnfrentamiento.add(rdbtnTopGlobal);
		
		rdbtnPremios = new JRadioButton("Premios");
		buttonGroup.add(rdbtnPremios);
		PanelEnfrentamiento.add(rdbtnPremios);
		
		rdbtnCantidadIntegrantes = new JRadioButton("Cantidad Integrantes");
		buttonGroup.add(rdbtnCantidadIntegrantes);
		PanelEnfrentamiento.add(rdbtnCantidadIntegrantes);
		
		Enfrentar = new JButton("Enfrentar");
		Enfrentar.setBackground(new Color(0, 0, 255));
		Enfrentar.setForeground(new Color(255, 255, 255));
		Enfrentar.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 18));
		Enfrentar.addActionListener((ActionListener) this);
		PanelEnfrentamiento.add(Enfrentar);
		
		scrollPane_2 = new JScrollPane();
		panelCentro.add(scrollPane_2);
		
		list2 = new JList<Banda>();
		scrollPane_2.setViewportView(list2);
		
		panel_Sur = new JPanel();
		panel_Sur.setPreferredSize(new Dimension(10, 80));
		panel_Sur.setBackground(Color.BLACK);
		contentPane.add(panel_Sur, BorderLayout.SOUTH);
		panel_Sur.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel_Sur.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		this.list1.setModel(modeloLista);
		this.list2.setModel(modeloLista);
		
		this.Inicializar();
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Agregar) {
			do_Agregar_actionPerformed(e);
		}
		if (e.getSource() == Eliminar) {
			do_Eliminar_actionPerformed(e);
		}
		if (e.getSource() == Enfrentar) {
			do_Enfrentar_actionPerformed(e);
		}
	}
	protected void do_Agregar_actionPerformed(ActionEvent e) {
		String nombre=this.textFieldNombre.getText();
		int aniosJuntos= Integer.parseInt(this.textFieldAniosJuntos.getText());
		int topGlobal= Integer.parseInt(this.textFieldTopGlobal.getText());
		int premios= Integer.parseInt(this.textFieldPremios.getText());
		int cantidadIntegrantes= Integer.parseInt(this.textFieldCantidadIntegrantes.getText());
		
		Banda banda= new Banda(nombre,aniosJuntos, topGlobal, premios,cantidadIntegrantes);
		
		this.juego.agregarBanda(banda);
		this.textArea.append("Se agrego a: "+banda.getNombre()+"\n");
		this.actualizarListas();
		
	}
	private void actualizarListas() {
		this.modeloLista.clear();
		Iterator<Banda> iterator=this.juego.getBanda();
		while(iterator.hasNext())
			this.modeloLista.addElement(iterator.next());
	}
	
	protected void do_Eliminar_actionPerformed(ActionEvent e) {
		Banda banda=this.list1.getSelectedValue();
		if(banda!=null) {
			this.juego.eliminarBanda(banda);
			this.actualizarListas();
			this.textArea.append("Se elimino: "+banda.getNombre()+"\n");
		}
		
	}
	protected void do_Enfrentar_actionPerformed(ActionEvent e) {
		Banda banda=this.list1.getSelectedValue();
		Banda banda2=this.list2.getSelectedValue();
		if(banda!=null && banda2!=null) {
		String atributo="";
		if(this.rdbtnAniosJuntos.isSelected())
			atributo="AniosJuntos";
		else if(this.rdbtnTopGlobal.isSelected())
			atributo="TopGlobal";
		else if(this.rdbtnPremios.isSelected())
			atributo="Premios";
		else if(this.rdbtnCantidadIntegrantes.isSelected())
			atributo="CantidadIntegrantes";
		
		Banda ganador= this.juego.enfrentar(banda, banda2, atributo);
		String cartel="Se enfrentaron "+banda.getNombre() + " vs "+banda2.getNombre() + " a traves de " + atributo;
		if(ganador==null) {
			cartel = cartel + " ---EMPATE---"+"\n";
		}
		else 
			cartel = cartel + " ---EL GANADOR ES---: " + ganador.getNombre()+ "\n";
		this.textArea.append(cartel);	
		}
	}
	
	private void Inicializar() {
		this.juego.agregarBanda(new Banda("One Direction",5,74,121,5));
		this.juego.agregarBanda(new Banda("The Beatles",10,105,48,4));
		this.juego.agregarBanda(new Banda("Patricio Rey y sus Redonditos de Ricota",24,200,10,5));
		this.juego.agregarBanda(new Banda("Fifth Harmony",6,200,22,4));
		this.juego.agregarBanda(new Banda("The Rolling Stones",60,169,10,3));
		this.actualizarListas();
	}
}
