package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import modelo.Arquero;
import modelo.Caballero;
import modelo.Guerrero;
import modelo.Juego;
import modelo.Mago;
import modelo.Personaje;
import modelo.Posicion;

public class Ventana extends JFrame implements ActionListener, ListSelectionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelCentro;
	private JPanel panelSur;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JScrollPane panelCL1;
	private JPanel panelCCen;
	private JScrollPane panelCL2;
	private JPanel panelCDer;
	private JList<Personaje> listIzq;
	private JList<Personaje> listDer;
	private JPanel panelCCAb;
	private JPanel panelCCAr;
	private JSeparator separator;
	private JPanel panelDesplazamientoForm;
	private JPanel panelDesplazamientoBtns;
	private JButton btnDesplazamientoTp;
	private JButton btnDesplazamientoMover;
	private JPanel panelAtaque;
	private JPanel paneAtlInfo;
	private JPanel panelAtBoton;
	private JButton btnAtaque;
	private JTextField txtDesplazamiento;
	private JTextField txtVs;
	private JTextField textFieldAtaqueP1;
	private JTextField textFieldAtaqueP2;
	private JButton btnCurar;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panelCDerAr1;
	private JPanel panel_6;
	private JLabel lblPjNombre;
	private JPanel panel_7;
	private JTextField textFieldPjNombre;
	private JPanel panel_8;
	private JLabel lblX;
	private JPanel panel_9;
	private JTextField textFieldPjX;
	private JPanel panel_10;
	private JLabel lblY;
	private JPanel panel_11;
	private JTextField textFieldPjY;
	private JPanel panel_12;
	private JLabel lblNewLabel;
	private JPanel panel_13;
	private JComboBox<String> comboBox;
	private JPanel panel_14;
	private JPanel panelCDerAb;
	private JPanel panel_4;
	private JButton btnAgregar;
	private JPanel panel_5;
	private JButton btnEliminar;
	private JTextField txtPersonajes;
	private JPanel panel_15;
	private JLabel lblDesplazamientoX;
	private JPanel panel_16;
	private JTextField textFieldDX;
	private JPanel panel_17;
	private JLabel lblDesplazamientoY;
	private JPanel panel_18;
	private JTextField textFieldDY;
	private Juego juego = new Juego();
	private DefaultListModel<Personaje> modeloLista=new DefaultListModel<Personaje>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		this.panelCentro = new JPanel();
		this.contentPane.add(this.panelCentro, BorderLayout.CENTER);
		this.panelCentro.setLayout(new GridLayout(0, 4, 0, 0));
		
		this.panelCL1 = new JScrollPane();
		this.panelCentro.add(this.panelCL1);
		
		this.listIzq = new JList<Personaje>();
		this.listIzq.setFont(new Font("Verdana", Font.PLAIN, 12));
		this.listIzq.setModel(modeloLista);
		this.panelCL1.setViewportView(this.listIzq);
		
		this.panelCCen = new JPanel();
		this.panelCentro.add(this.panelCCen);
		this.panelCCen.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.panelCCAr = new JPanel();
		this.panelCCen.add(this.panelCCAr);
		this.panelCCAr.setLayout(new BorderLayout(0, 0));
		
		this.separator = new JSeparator();
		this.separator.setBackground(Color.BLACK);
		this.panelCCAr.add(this.separator, BorderLayout.SOUTH);
		
		this.panelAtaque = new JPanel();
		this.panelCCAr.add(this.panelAtaque, BorderLayout.CENTER);
		this.panelAtaque.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.paneAtlInfo = new JPanel();
		this.paneAtlInfo.setMaximumSize(new Dimension(120, 0));
		this.panelAtaque.add(this.paneAtlInfo);
		GridBagLayout gbl_paneAtlInfo = new GridBagLayout();
		gbl_paneAtlInfo.columnWidths = new int[]{230, 0};
		gbl_paneAtlInfo.rowHeights = new int[]{0, 30, 30, 30, 0};
		gbl_paneAtlInfo.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_paneAtlInfo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		this.paneAtlInfo.setLayout(gbl_paneAtlInfo);
		
		this.textFieldAtaqueP1 = new JTextField();
		this.textFieldAtaqueP1.setHorizontalAlignment(SwingConstants.CENTER);
		this.textFieldAtaqueP1.setFont(new Font("Verdana", Font.PLAIN, 14));
		this.textFieldAtaqueP1.setEditable(false);
		this.textFieldAtaqueP1.setOpaque(false);
		GridBagConstraints gbc_textFieldAtaqueP1 = new GridBagConstraints();
		gbc_textFieldAtaqueP1.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldAtaqueP1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAtaqueP1.gridx = 0;
		gbc_textFieldAtaqueP1.gridy = 1;
		this.paneAtlInfo.add(this.textFieldAtaqueP1, gbc_textFieldAtaqueP1);
		this.textFieldAtaqueP1.setColumns(10);
		
		this.txtVs = new JTextField();
		this.txtVs.setBorder(null);
		this.txtVs.setOpaque(false);
		this.txtVs.setForeground(new Color(204, 0, 0));
		this.txtVs.setEditable(false);
		this.txtVs.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		this.txtVs.setHorizontalAlignment(SwingConstants.CENTER);
		this.txtVs.setText(" VS");
		GridBagConstraints gbc_txtVs = new GridBagConstraints();
		gbc_txtVs.insets = new Insets(0, 0, 5, 0);
		gbc_txtVs.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtVs.gridx = 0;
		gbc_txtVs.gridy = 2;
		this.paneAtlInfo.add(this.txtVs, gbc_txtVs);
		this.txtVs.setColumns(10);
		
		this.textFieldAtaqueP2 = new JTextField();
		this.textFieldAtaqueP2.setHorizontalAlignment(SwingConstants.CENTER);
		this.textFieldAtaqueP2.setOpaque(false);
		this.textFieldAtaqueP2.setFont(new Font("Verdana", Font.PLAIN, 14));
		this.textFieldAtaqueP2.setEditable(false);
		this.textFieldAtaqueP2.setColumns(10);
		GridBagConstraints gbc_textFieldAtaqueP2 = new GridBagConstraints();
		gbc_textFieldAtaqueP2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAtaqueP2.gridx = 0;
		gbc_textFieldAtaqueP2.gridy = 3;
		this.paneAtlInfo.add(this.textFieldAtaqueP2, gbc_textFieldAtaqueP2);
		
		this.panelAtBoton = new JPanel();
		this.panelAtaque.add(this.panelAtBoton);
		this.panelAtBoton.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panel = new JPanel();
		this.panelAtBoton.add(this.panel);
		
		this.btnAtaque = new JButton("Atacar");
		this.btnAtaque.setEnabled(false);
		this.btnAtaque.addActionListener(this);
		this.panel.add(this.btnAtaque);
		this.btnAtaque.setPreferredSize(new Dimension(120, 40));
		
		this.panel_1 = new JPanel();
		this.panelAtBoton.add(this.panel_1);
		
		this.btnCurar = new JButton("Curar");
		this.btnCurar.setEnabled(false);
		this.btnCurar.addActionListener(this);
		this.panel_1.add(this.btnCurar);
		this.btnCurar.setPreferredSize(new Dimension(120, 40));
		
		this.panelCCAb = new JPanel();
		this.panelCCen.add(this.panelCCAb);
		this.panelCCAb.setLayout(new BorderLayout(0, 0));
		
		this.panelDesplazamientoForm = new JPanel();
		this.panelCCAb.add(this.panelDesplazamientoForm, BorderLayout.CENTER);
		this.panelDesplazamientoForm.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_15 = new JPanel();
		this.panelDesplazamientoForm.add(this.panel_15);
		
		this.lblDesplazamientoX = new JLabel("X:");
		this.panel_15.add(this.lblDesplazamientoX);
		
		this.panel_16 = new JPanel();
		this.panelDesplazamientoForm.add(this.panel_16);
		
		this.textFieldDX = new JTextField();
		this.textFieldDX.setColumns(10);
		this.panel_16.add(this.textFieldDX);
		
		this.panel_17 = new JPanel();
		this.panelDesplazamientoForm.add(this.panel_17);
		
		this.lblDesplazamientoY = new JLabel("Y:");
		this.panel_17.add(this.lblDesplazamientoY);
		
		this.panel_18 = new JPanel();
		this.panelDesplazamientoForm.add(this.panel_18);
		
		this.textFieldDY = new JTextField();
		this.textFieldDY.setText("");
		this.textFieldDY.setColumns(10);
		this.panel_18.add(this.textFieldDY);
		
		this.panelDesplazamientoBtns = new JPanel();
		this.panelDesplazamientoBtns.setLocation(new Point(0, 30));
		this.panelDesplazamientoBtns.setPreferredSize(new Dimension(10, 80));
		this.panelCCAb.add(this.panelDesplazamientoBtns, BorderLayout.SOUTH);
		this.panelDesplazamientoBtns.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_2 = new JPanel();
		this.panelDesplazamientoBtns.add(this.panel_2);
		
		this.btnDesplazamientoTp = new JButton("Teletransportar");
		this.btnDesplazamientoTp.setMargin(new Insets(2, 6, 2, 6));
		this.btnDesplazamientoTp.setEnabled(false);
		this.btnDesplazamientoTp.addActionListener(this);
		this.panel_2.add(this.btnDesplazamientoTp);
		
		this.panel_3 = new JPanel();
		this.panelDesplazamientoBtns.add(this.panel_3);
		
		this.btnDesplazamientoMover = new JButton("Mover");
		this.btnDesplazamientoMover.setEnabled(false);
		this.btnDesplazamientoMover.setMargin(new Insets(2, 32, 2, 32));
		this.btnDesplazamientoMover.addActionListener(this);
		this.panel_3.add(this.btnDesplazamientoMover);
		
		this.txtDesplazamiento = new JTextField();
		this.txtDesplazamiento.setBorder(null);
		this.txtDesplazamiento.setHorizontalAlignment(SwingConstants.CENTER);
		this.txtDesplazamiento.setText("Desplazamiento");
		this.txtDesplazamiento.setOpaque(false);
		this.txtDesplazamiento.setFont(new Font("Verdana", Font.PLAIN, 16));
		this.txtDesplazamiento.setEditable(false);
		this.txtDesplazamiento.setPreferredSize(new Dimension(7, 70));
		this.panelCCAb.add(this.txtDesplazamiento, BorderLayout.NORTH);
		this.txtDesplazamiento.setColumns(10);
		
		this.panelCL2 = new JScrollPane();
		this.panelCentro.add(this.panelCL2);
		
		this.listDer = new JList<Personaje>();
		this.listDer.setFont(new Font("Verdana", Font.PLAIN, 12));
		this.panelCL2.setViewportView(this.listDer);
		this.listDer.setModel(modeloLista);
		
		this.panelCDer = new JPanel();
		this.panelCentro.add(this.panelCDer);
		this.panelCDer.setLayout(new BorderLayout(0, 0));
		
		this.panelCDerAr1 = new JPanel();
		this.panelCDerAr1.setPreferredSize(new Dimension(10, 150));
		this.panelCDer.add(this.panelCDerAr1, BorderLayout.CENTER);
		this.panelCDerAr1.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_6 = new JPanel();
		this.panelCDerAr1.add(this.panel_6);
		
		this.lblPjNombre = new JLabel("Nombre:");
		this.panel_6.add(this.lblPjNombre);
		
		this.panel_7 = new JPanel();
		this.panelCDerAr1.add(this.panel_7);
		
		this.textFieldPjNombre = new JTextField();
		this.textFieldPjNombre.setColumns(10);
		this.panel_7.add(this.textFieldPjNombre);
		
		this.panel_8 = new JPanel();
		this.panelCDerAr1.add(this.panel_8);
		
		this.lblX = new JLabel("X:");
		this.panel_8.add(this.lblX);
		
		this.panel_9 = new JPanel();
		this.panelCDerAr1.add(this.panel_9);
		
		this.textFieldPjX = new JTextField();
		this.textFieldPjX.setColumns(10);
		this.panel_9.add(this.textFieldPjX);
		
		this.panel_10 = new JPanel();
		this.panelCDerAr1.add(this.panel_10);
		
		this.lblY = new JLabel("Y:");
		this.panel_10.add(this.lblY);
		
		this.panel_11 = new JPanel();
		this.panelCDerAr1.add(this.panel_11);
		
		this.textFieldPjY = new JTextField();
		this.textFieldPjY.setColumns(10);
		this.panel_11.add(this.textFieldPjY);
		
		this.panel_12 = new JPanel();
		this.panelCDerAr1.add(this.panel_12);
		
		this.lblNewLabel = new JLabel("Clase:");
		this.lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		this.panel_12.add(this.lblNewLabel);
		
		this.panel_13 = new JPanel();
		this.panelCDerAr1.add(this.panel_13);
		
		this.comboBox = new JComboBox<String>();
		this.panel_13.add(this.comboBox);
		this.comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Arquero", "Caballero", "Guerrero", "Mago"}));
		
		
		this.panel_14 = new JPanel();
		this.panel_14.setPreferredSize(new Dimension(10, 70));
		this.panelCDer.add(this.panel_14, BorderLayout.NORTH);
		this.panel_14.setLayout(new BorderLayout(0, 0));
		
		this.txtPersonajes = new JTextField();
		this.txtPersonajes.setText("Personajes");
		this.txtPersonajes.setPreferredSize(new Dimension(7, 70));
		this.txtPersonajes.setOpaque(false);
		this.txtPersonajes.setHorizontalAlignment(SwingConstants.CENTER);
		this.txtPersonajes.setFont(new Font("Verdana", Font.PLAIN, 16));
		this.txtPersonajes.setEditable(false);
		this.txtPersonajes.setColumns(10);
		this.txtPersonajes.setBorder(null);
		this.panel_14.add(this.txtPersonajes, BorderLayout.CENTER);
		
		this.panelCDerAb = new JPanel();
		this.panelCDerAb.setPreferredSize(new Dimension(10, 400));
		this.panelCDer.add(this.panelCDerAb, BorderLayout.SOUTH);
		this.panelCDerAb.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_4 = new JPanel();
		this.panelCDerAb.add(this.panel_4);
		
		this.btnAgregar = new JButton("Agregar");
		this.btnAgregar.addActionListener(this);
		this.btnAgregar.setPreferredSize(new Dimension(85, 23));
		this.panel_4.add(this.btnAgregar);
		
		this.panel_5 = new JPanel();
		this.panelCDerAb.add(this.panel_5);
		
		this.btnEliminar = new JButton("Eliminar");
		this.btnEliminar.setEnabled(false);
		this.btnEliminar.addActionListener(this);
		this.panel_5.add(this.btnEliminar);
        
		
		this.panelSur = new JPanel();
		this.panelSur.setPreferredSize(new Dimension(10, 100));
		this.contentPane.add(this.panelSur, BorderLayout.SOUTH);
		this.panelSur.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane = new JScrollPane();
		this.panelSur.add(this.scrollPane, BorderLayout.CENTER);
		
		this.textArea = new JTextArea();
		this.textArea.setEditable(false);
		this.scrollPane.setViewportView(this.textArea);
		
		this.listIzq.addListSelectionListener(this);
		this.listDer.addListSelectionListener(this);
		
		this.inicializar();
	}

	private void inicializar() {
		this.juego.agregarPersonaje(new Arquero("Dua Lipa", new Posicion(2,8)));
		this.juego.agregarPersonaje(new Caballero("Harry Styles", new Posicion(2,4)));
		this.juego.agregarPersonaje(new Guerrero("Taylor Swift", new Posicion(6,3)));
		this.juego.agregarPersonaje(new Mago("Ed Sheeran", new Posicion(3,5)));
		this.actualizaListas();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == this.btnAgregar) {
			do_btnAgregar_actionPerformed(e);
		}
		if (e.getSource() == this.btnDesplazamientoMover) {
			do_btnDesplazamientoMover_actionPerformed(e);
		}
		if (e.getSource() == this.btnDesplazamientoTp) {
			do_btnDesplazamientoTp_actionPerformed(e);
		}
		if (e.getSource() == this.btnCurar) {
			do_btnCurar_actionPerformed(e);
		}
		if (e.getSource() == this.btnAtaque) {
			do_btnAtaque_actionPerformed(e);
		}
		if (e.getSource() == comboBox) {
			comboBox.getSelectedIndex();
		}
	}
	protected void do_btnAtaque_actionPerformed(ActionEvent e) {
		String msj = this.juego.atacar(this.listIzq.getSelectedValue(), this.listDer.getSelectedValue());
		this.textArea.append(msj);
		this.limpiarListas();
		this.actualizaListas();
	}
	protected void do_btnCurar_actionPerformed(ActionEvent e) {
		String msj="";
		if(this.listDer.getSelectedValue() != null) {
			msj=this.juego.curar((Mago) this.listIzq.getSelectedValue(), this.listDer.getSelectedValue());
		}else {
			msj=this.juego.curar((Mago) this.listIzq.getSelectedValue());
		}
		this.textArea.append(msj);
		this.limpiarListas();
		this.actualizaListas();
	}
	protected void do_btnDesplazamientoTp_actionPerformed(ActionEvent e) {
		Posicion pos = new Posicion(Integer.parseInt(this.textFieldDX.getText()), Integer.parseInt(this.textFieldDY.getText()));
		String msj=this.juego.teletransportar((Mago) this.listIzq.getSelectedValue(), pos);
		this.textArea.append(msj);
		this.limpiarListas();
	}
	protected void do_btnDesplazamientoMover_actionPerformed(ActionEvent e) {
		this.textArea.append(this.juego.mover(this.listIzq.getSelectedValue(), Integer.parseInt(this.textFieldDX.getText()), Integer.parseInt(this.textFieldDY.getText())));
		this.limpiarListas();
		this.actualizaListas();
	}
	private void limpiarListas() {
		// TODO Auto-generated method stub
		this.listIzq.clearSelection();
		this.listDer.clearSelection();
		this.btnCurar.setEnabled(false);
		this.btnDesplazamientoTp.setEnabled(false);
	}

	protected void do_btnAgregar_actionPerformed(ActionEvent e) {
		this.limpiarListas();
		String nombre=this.textFieldPjNombre.getText();
		int x= Integer.parseInt(this.textFieldPjX.getText());
		int y=Integer.parseInt(this.textFieldPjY.getText());
		switch(comboBox.getSelectedIndex()) {
		case 0:
			juego.agregarPersonaje(new Arquero(nombre, new Posicion(x, y)));
		break;
		case 1:
			juego.agregarPersonaje(new Caballero(nombre, new Posicion(x, y)));
		break;
		case 2:
			juego.agregarPersonaje(new Guerrero(nombre, new Posicion(x, y)));
		break;
		case 3:
			juego.agregarPersonaje(new Mago(nombre, new Posicion(x, y)));
		break;
		}
		this.textArea.append("Se agrego a "+ nombre + "\n");
		this.actualizaListas();
	}
	private void actualizaListas() {
		this.modeloLista.clear();
		Iterator<Personaje>it=this.juego.getPersonajes();
		while(it.hasNext()) {
			this.modeloLista.addElement(it.next());
		}
	}
	
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		this.textArea.append("Se elimino a " + this.listIzq.getSelectedValue().getNombre() + "\n");
		this.juego.eliminarPersonaje(this.listIzq.getSelectedValue());
		this.limpiarListas();
		this.actualizaListas();
		
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if(this.listIzq.getSelectedValue()!=null && this.listDer.getSelectedValue()!=null) {
			this.btnAtaque.setEnabled(true);
		}else {
			this.btnAtaque.setEnabled(false);
		}
		if(this.listIzq.getSelectedValue()!=null) {
			this.textFieldAtaqueP1.setText(this.listIzq.getSelectedValue().getNombre());
			this.btnDesplazamientoMover.setEnabled(true);	
			this.btnEliminar.setEnabled(true);
			if(this.listIzq.getSelectedValue().getClass().getSimpleName().equalsIgnoreCase("Mago")) {
				this.btnCurar.setEnabled(true);
				this.btnDesplazamientoTp.setEnabled(true);
			}else {
				this.btnCurar.setEnabled(false);
				this.btnDesplazamientoTp.setEnabled(false);
			}
		}else {
			this.textFieldAtaqueP1.setText("");
			this.btnDesplazamientoMover.setEnabled(false);
			this.btnEliminar.setEnabled(false);
		}
		
		if (this.listDer.getSelectedValue()!=null) {
			this.textFieldAtaqueP2.setText(this.listDer.getSelectedValue().getNombre());
		}else {
			this.textFieldAtaqueP2.setText("");
		}
				
	}

	
	
}
