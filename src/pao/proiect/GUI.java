package pao.proiect;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.DropMode;
import java.awt.Component;
import java.awt.Color;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JTextField textNumeAddClient;
	private JTextField textCnpAddClient;
	private JPanel adaugareClient; 
	private JPanel adaugareAutovehicul;
	private JPanel adaugareMotocicleta;
	private JPanel adaugareMasina;
	private JPanel adaugareAutobuz;
	private JPanel adaugareCamion;
	private JPanel stergereAutovehicul;
	private JPanel stergereClient;
	private JPanel modificareAutovehicul;
	private JPanel modificareClient;
	private JPanel afisareAutovehicule;
	private JPanel afisareClienti;
	private JPanel afisareVanzari;
	private JPanel inregistrareVanzare;
	private JPanel afisareAutovehiculeVandute;
	private JPanel afisareAutovehiculeClient;

	
	
	private JTextField textMarcaMotocicleta;
	private JTextField textAnFabricatieMotocicleta;
	private JTextField textLitrajMotocicleta;
	private JTextField textPretMotocicleta;
	private JTextField textAniGarantieMotocicleta;
	private JTextField textMarcaMasina;
	private JTextField textAnFabricatieMasina;
	private JTextField textLitrajMasina;
	private JTextField textPretMasina;
	private JTextField textCaroserieMasina;
	private JTextField textMarcaAutobuz;
	private JTextField textAnFabricatieAutobuz;
	private JTextField textLitrajAutobuz;
	private JTextField textPretAutobuz;
	private JTextField textCapacitatePersoaneAutobuz;
	private JTextField textMarcaCamion;
	private JTextField textAnFabricatieCamion;
	private JTextField textLitrajCamion;
	private JTextField textPretCamion;
	private JTextField textIncarcaturaMaximaCamion;
	private JTextField textIdStergereAutovehicul;
	private JTextField textStergereClient;
	private JTextField textModificareMarca;
	private JTextField textModificareAnFabricatie;
	private JTextField textModificareLitraj;
	private JTextField textModificarePret;
	private JTextField textModificareCampUnic;
	private JTextField textModificareTip;
	private JTextField textSelectIdAutovehicul;
	private JTextField textModificareNume;
	private JTextField textModificareCnp;
	private JTextField textSelectIdClient;
	private JTextField textIdClient;
	private JTextField textIdAutovehicul;
	private JTextArea textAreaStocAutovehicule;
	private JTextArea textAreaClienti;
	private JTextArea textAreaVanzari;
	private JTextArea textAreaAutovehiculeVandute;
	private JTextField textNumeAfisareAutovehiculeClient;
	private JTextField textCnpAfisareAutovehiculeClient;
	private JTextField textIdAfisareAutovehiculeClient;
	private JTextArea textAreaAutovehiculeClient;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
		
	}
	
	
	/**
	 * Create the frame.
	 */
	public GUI() {
		
		Database DB = new Database();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 239, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 10, 766, 543);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel menu = new JPanel();
		menu.setBackground(new Color(255, 239, 213));
		layeredPane.add(menu, "name_520741057659800");
		menu.setLayout(null);
		
		JLabel lblTitlu = new JLabel("Dealer Auto");
		lblTitlu.setForeground(new Color(0, 191, 255));
		lblTitlu.setBounds(273, 0, 222, 107);
		lblTitlu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitlu.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		menu.add(lblTitlu);
		
		JButton btnAdaugareAutovehicul = new JButton("Adaugare autovehicul");
		btnAdaugareAutovehicul.setForeground(new Color(60, 179, 113));
		btnAdaugareAutovehicul.setFocusable(false);
		btnAdaugareAutovehicul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(adaugareAutovehicul);
			}
		});
		btnAdaugareAutovehicul.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAdaugareAutovehicul.setBounds(30, 126, 222, 52);
		menu.add(btnAdaugareAutovehicul);
		
		JButton btnAdaugareClient = new JButton("Adaugare client");
		btnAdaugareClient.setForeground(new Color(205, 133, 63));
		btnAdaugareClient.setFocusable(false);
		btnAdaugareClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(adaugareClient);
			}
		});
		btnAdaugareClient.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAdaugareClient.setBounds(273, 126, 222, 52);
		menu.add(btnAdaugareClient);
		
		JButton btnStergereAutovehicul = new JButton("Stergere autovehicul");
		btnStergereAutovehicul.setForeground(new Color(60, 179, 113));
		btnStergereAutovehicul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(stergereAutovehicul);
			}
		});
		btnStergereAutovehicul.setFocusable(false);
		btnStergereAutovehicul.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnStergereAutovehicul.setFocusable(false);
		btnStergereAutovehicul.setBounds(30, 204, 223, 53);
		menu.add(btnStergereAutovehicul);
		
		JButton btnModificareAutovehicul = new JButton("Modificare autovehicul");
		btnModificareAutovehicul.setForeground(new Color(60, 179, 113));
		btnModificareAutovehicul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(modificareAutovehicul);
			}
		});
		btnModificareAutovehicul.setFocusable(false);
		btnModificareAutovehicul.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnModificareAutovehicul.setFocusable(false);
		btnModificareAutovehicul.setBounds(30, 282, 223, 54);
		menu.add(btnModificareAutovehicul);
		
		JButton btnAfisareAutovehicule = new JButton("Afisare autovehicule");
		btnAfisareAutovehicule.setForeground(new Color(60, 179, 113));
		btnAfisareAutovehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<String> records = DB.afisareStocAutovehicule();
				
				for(String s:records) {
					textAreaStocAutovehicule.append(s);
				}
				
				Audit.scrieActiune("Afisare autovehicule", Thread.currentThread().getName());
				switchPanels(afisareAutovehicule);
			}
		});
		btnAfisareAutovehicule.setFocusable(false);
		btnAfisareAutovehicule.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAfisareAutovehicule.setFocusable(false);
		btnAfisareAutovehicule.setBounds(30, 360, 222, 52);
		menu.add(btnAfisareAutovehicule);
		
		JButton btnStergereClient = new JButton("Stergere client");
		btnStergereClient.setForeground(new Color(205, 133, 63));
		btnStergereClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(stergereClient);
			}
		});
		btnStergereClient.setFocusable(false);
		btnStergereClient.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnStergereClient.setFocusable(false);
		btnStergereClient.setBounds(273, 204, 221, 53);
		menu.add(btnStergereClient);
		
		JButton btnModificareClient = new JButton("Modificare client");
		btnModificareClient.setForeground(new Color(205, 133, 63));
		btnModificareClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(modificareClient);
			}
		});
		btnModificareClient.setFocusable(false);
		btnModificareClient.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnModificareClient.setFocusable(false);
		btnModificareClient.setBounds(274, 282, 221, 54);
		menu.add(btnModificareClient);
		
		JButton btnAfisareClienti = new JButton("Afisare clienti");
		btnAfisareClienti.setForeground(new Color(205, 133, 63));
		btnAfisareClienti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<String> records = DB.afisareClienti();
				
				for(String s:records) {
					textAreaClienti.append(s);
				}
				
				Audit.scrieActiune("Afisare clienti", Thread.currentThread().getName());
				switchPanels(afisareClienti);
			}
		});
		btnAfisareClienti.setFocusable(false);
		btnAfisareClienti.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAfisareClienti.setFocusable(false);
		btnAfisareClienti.setBounds(273, 360, 221, 52);
		menu.add(btnAfisareClienti);
		
		JButton btnInregistrareVanzare = new JButton("Inregistrare vanzare");
		btnInregistrareVanzare.setForeground(new Color(147, 112, 219));
		btnInregistrareVanzare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(inregistrareVanzare);
			}
		});
		btnInregistrareVanzare.setFocusable(false);
		btnInregistrareVanzare.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInregistrareVanzare.setFocusable(false);
		btnInregistrareVanzare.setBounds(513, 126, 222, 52);
		menu.add(btnInregistrareVanzare);
		
		JButton btnAfisareVanzari = new JButton("Afisare vanzari");
		btnAfisareVanzari.setForeground(new Color(147, 112, 219));
		btnAfisareVanzari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<String> records = DB.afisareVanzari();
				
				for(String s:records) {
					textAreaVanzari.append(s);
				}
				
				Audit.scrieActiune("Afisare vanzari", Thread.currentThread().getName());
				switchPanels(afisareVanzari);
			}
		});
		btnAfisareVanzari.setFocusable(false);
		btnAfisareVanzari.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAfisareVanzari.setFocusable(false);
		btnAfisareVanzari.setBounds(513, 204, 222, 53);
		menu.add(btnAfisareVanzari);
		
		JButton btnAfisareAutovehiculeVandute = new JButton("Afisare autovehicule vandute");
		btnAfisareAutovehiculeVandute.setForeground(new Color(238, 130, 238));
		btnAfisareAutovehiculeVandute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> records = DB.afisareAutovehiculeVandute();
				
				for(String s:records) {
					textAreaAutovehiculeVandute.append(s);
				}
				
				Audit.scrieActiune("Afisare autovehicule vandute", Thread.currentThread().getName());
				switchPanels(afisareAutovehiculeVandute);
			}
		});
		btnAfisareAutovehiculeVandute.setFont(new Font("Rokkitt", Font.PLAIN, 15));
		btnAfisareAutovehiculeVandute.setFocusable(false);
		btnAfisareAutovehiculeVandute.setBounds(513, 282, 222, 53);
		menu.add(btnAfisareAutovehiculeVandute);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Rokkitt", Font.PLAIN, 20));
		btnExit.setFocusable(false);
		btnExit.setBounds(237, 469, 295, 52);
		menu.add(btnExit);
		
		JButton btnAfisareAutovehiculeClient = new JButton("Afisare autovehicule client");
		btnAfisareAutovehiculeClient.setForeground(new Color(238, 130, 238));
		btnAfisareAutovehiculeClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(afisareAutovehiculeClient);
			}
		});
		btnAfisareAutovehiculeClient.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		btnAfisareAutovehiculeClient.setFocusable(false);
		btnAfisareAutovehiculeClient.setBounds(513, 360, 222, 53);
		menu.add(btnAfisareAutovehiculeClient);
		
		adaugareAutovehicul = new JPanel();
		adaugareAutovehicul.setBackground(new Color(255, 239, 213));
		layeredPane.add(adaugareAutovehicul, "name_520762555640900");
		adaugareAutovehicul.setLayout(null);
		
		JLabel lblAdaugareAutovehicul = new JLabel("Adaugare autovehicul");
		lblAdaugareAutovehicul.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdaugareAutovehicul.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblAdaugareAutovehicul.setBounds(218, 0, 345, 66);
		adaugareAutovehicul.add(lblAdaugareAutovehicul);
		
		JButton btnAdaugareMotocicleta = new JButton("Adaugare motocicleta");
		btnAdaugareMotocicleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(adaugareMotocicleta);
			}
		});
		btnAdaugareMotocicleta.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAdaugareMotocicleta.setFocusable(false);
		btnAdaugareMotocicleta.setBounds(143, 168, 222, 52);
		adaugareAutovehicul.add(btnAdaugareMotocicleta);
		
		JButton btnAdaugareMasina = new JButton("Adaugare masina");
		btnAdaugareMasina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(adaugareMasina);
			}
		});
		btnAdaugareMasina.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAdaugareMasina.setFocusable(false);
		btnAdaugareMasina.setBounds(143, 253, 222, 52);
		adaugareAutovehicul.add(btnAdaugareMasina);
		
		JButton btnAdaugareAutobuz = new JButton("Adaugare autobuz");
		btnAdaugareAutobuz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(adaugareAutobuz);
			}
		});
		btnAdaugareAutobuz.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAdaugareAutobuz.setFocusable(false);
		btnAdaugareAutobuz.setBounds(399, 168, 222, 52);
		adaugareAutovehicul.add(btnAdaugareAutobuz);
		
		JButton btnAdaugareCamion = new JButton("Adaugare camion");
		btnAdaugareCamion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(adaugareCamion);
			}
		});
		btnAdaugareCamion.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAdaugareCamion.setFocusable(false);
		btnAdaugareCamion.setBounds(399, 253, 222, 52);
		adaugareAutovehicul.add(btnAdaugareCamion);
		
		JButton btnInapoiAddAuto = new JButton("Inapoi");
		btnInapoiAddAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(menu);
			}
		});
		btnInapoiAddAuto.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiAddAuto.setFocusable(false);
		btnInapoiAddAuto.setBounds(24, 483, 235, 37);
		adaugareAutovehicul.add(btnInapoiAddAuto);
		
		adaugareClient = new JPanel();
		adaugareClient.setBackground(new Color(255, 239, 213));
		layeredPane.add(adaugareClient, "name_524844679874900");
		adaugareClient.setLayout(null);
		
		JLabel lblAdaugareClient = new JLabel("Adaugare client");
		lblAdaugareClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdaugareClient.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblAdaugareClient.setBounds(265, 0, 251, 66);
		adaugareClient.add(lblAdaugareClient);
		
		textNumeAddClient = new JTextField();
		textNumeAddClient.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textNumeAddClient.setBounds(281, 173, 305, 37);
		adaugareClient.add(textNumeAddClient);
		textNumeAddClient.setColumns(10);
		
		textCnpAddClient = new JTextField();
		textCnpAddClient.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textCnpAddClient.setColumns(10);
		textCnpAddClient.setBounds(281, 243, 305, 37);
		adaugareClient.add(textCnpAddClient);
		
		JLabel lblNume = new JLabel("Nume");
		lblNume.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblNume.setBounds(175, 177, 72, 25);
		adaugareClient.add(lblNume);
		
		JLabel lblCnp = new JLabel("CNP");
		lblCnp.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblCnp.setBounds(175, 247, 72, 25);
		adaugareClient.add(lblCnp);
		
		JButton btnAddClient = new JButton("ADAUGARE");
		btnAddClient.setFocusable(false);
		btnAddClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nume = textNumeAddClient.getText();
				String cnp = textCnpAddClient.getText();
				
				
				if(nume.isEmpty() || cnp.isEmpty()) {
					System.out.println("Camp gol!!!");
					
				}
				else {
					
					Client f = new Client(nume, cnp);
					
					DB.adaugareClient(String.valueOf(f.getId()), f.getNume(), f.getCnp());
				
					textNumeAddClient.setText("");
					textCnpAddClient.setText("");
					
					Audit.scrieActiune("Adaugare client", Thread.currentThread().getName());
				}
				
				
			}
		});
		btnAddClient.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAddClient.setBounds(507, 478, 235, 37);
		adaugareClient.add(btnAddClient);
		
		JButton btnInapoiAddClient = new JButton("Inapoi");
		btnInapoiAddClient.setFocusable(false);
		btnInapoiAddClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNumeAddClient.setText("");
				textCnpAddClient.setText("");
				switchPanels(menu);
				
			}
		});
		btnInapoiAddClient.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiAddClient.setBounds(27, 478, 235, 37);
		adaugareClient.add(btnInapoiAddClient);
		
		adaugareMotocicleta = new JPanel();
		adaugareMotocicleta.setBackground(new Color(255, 239, 213));
		layeredPane.add(adaugareMotocicleta, "name_549945114802700");
		adaugareMotocicleta.setLayout(null);
		
		JLabel lblAdaugareMotocicleta = new JLabel("Adaugare motocicleta");
		lblAdaugareMotocicleta.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdaugareMotocicleta.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblAdaugareMotocicleta.setBounds(220, 0, 345, 66);
		adaugareMotocicleta.add(lblAdaugareMotocicleta);
		
		textMarcaMotocicleta = new JTextField();
		textMarcaMotocicleta.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textMarcaMotocicleta.setColumns(10);
		textMarcaMotocicleta.setBounds(300, 103, 305, 37);
		adaugareMotocicleta.add(textMarcaMotocicleta);
		
		textAnFabricatieMotocicleta = new JTextField();
		textAnFabricatieMotocicleta.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textAnFabricatieMotocicleta.setColumns(10);
		textAnFabricatieMotocicleta.setBounds(300, 161, 305, 37);
		adaugareMotocicleta.add(textAnFabricatieMotocicleta);
		
		textLitrajMotocicleta = new JTextField();
		textLitrajMotocicleta.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textLitrajMotocicleta.setColumns(10);
		textLitrajMotocicleta.setBounds(300, 220, 305, 37);
		adaugareMotocicleta.add(textLitrajMotocicleta);
		
		textPretMotocicleta = new JTextField();
		textPretMotocicleta.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textPretMotocicleta.setColumns(10);
		textPretMotocicleta.setBounds(300, 280, 305, 37);
		adaugareMotocicleta.add(textPretMotocicleta);
		
		textAniGarantieMotocicleta = new JTextField();
		textAniGarantieMotocicleta.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textAniGarantieMotocicleta.setColumns(10);
		textAniGarantieMotocicleta.setBounds(300, 338, 305, 37);
		adaugareMotocicleta.add(textAniGarantieMotocicleta);
		
		JLabel lblMarcaMotocicleta = new JLabel("Marca");
		lblMarcaMotocicleta.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblMarcaMotocicleta.setBounds(185, 107, 72, 25);
		adaugareMotocicleta.add(lblMarcaMotocicleta);
		
		JLabel lblAnFabricatieMotocicleta = new JLabel("An fabricatie");
		lblAnFabricatieMotocicleta.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblAnFabricatieMotocicleta.setBounds(138, 165, 130, 25);
		adaugareMotocicleta.add(lblAnFabricatieMotocicleta);
		
		JLabel lblLitrajMotocicleta = new JLabel("Litraj");
		lblLitrajMotocicleta.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblLitrajMotocicleta.setBounds(185, 224, 72, 25);
		adaugareMotocicleta.add(lblLitrajMotocicleta);
		
		JLabel lblPretMotocicleta = new JLabel("Pret");
		lblPretMotocicleta.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblPretMotocicleta.setBounds(185, 284, 72, 25);
		adaugareMotocicleta.add(lblPretMotocicleta);
		
		JLabel lblAniGarantieMotocicleta = new JLabel("Ani garantie");
		lblAniGarantieMotocicleta.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblAniGarantieMotocicleta.setBounds(138, 342, 119, 25);
		adaugareMotocicleta.add(lblAniGarantieMotocicleta);
		
		JButton btnInapoiAdaugareMotocicleta = new JButton("Inapoi");
		btnInapoiAdaugareMotocicleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textMarcaMotocicleta.setText("");
				textAnFabricatieMotocicleta.setText("");
				textLitrajMotocicleta.setText("");
				textPretMotocicleta.setText("");
				textAniGarantieMotocicleta.setText("");
				switchPanels(adaugareAutovehicul);
			}
		});
		btnInapoiAdaugareMotocicleta.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiAdaugareMotocicleta.setFocusable(false);
		btnInapoiAdaugareMotocicleta.setBounds(22, 484, 235, 37);
		adaugareMotocicleta.add(btnInapoiAdaugareMotocicleta);
		
		JButton btnAddMotocicleta = new JButton("ADAUGARE");
		btnAddMotocicleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String marca = textMarcaMotocicleta.getText();
				String anFabricatie = textAnFabricatieMotocicleta.getText();
				String litraj = textLitrajMotocicleta.getText();
				String pret = textPretMotocicleta.getText();
				String aniGarantie = textAniGarantieMotocicleta.getText();
				
				
				
				if(marca.isEmpty() || anFabricatie.isEmpty() || litraj.isEmpty() || pret.isEmpty() || aniGarantie.isEmpty()) {
					System.out.println("Camp gol!!!");
					
				}
				else {
					
					Motocicleta a = new Motocicleta(marca, Integer.parseInt(anFabricatie), Double.parseDouble(litraj), Double.parseDouble(pret), Integer.parseInt(aniGarantie));
					
					DB.adaugareAutovehicul(a.getTip(), String.valueOf(a.getId()), a.getMarca(), String.valueOf(a.getAnFabricatie()), String.valueOf(a.getLitraj()), String.valueOf(a.getPretRedus()), String.valueOf(a.getAniGarantie()));
				
					textMarcaMotocicleta.setText("");
					textAnFabricatieMotocicleta.setText("");
					textLitrajMotocicleta.setText("");
					textPretMotocicleta.setText("");
					textAniGarantieMotocicleta.setText("");
					
					Audit.scrieActiune("Adaugare autovehicul", Thread.currentThread().getName());
				}
			}
		});
		btnAddMotocicleta.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAddMotocicleta.setFocusable(false);
		btnAddMotocicleta.setBounds(508, 484, 235, 37);
		adaugareMotocicleta.add(btnAddMotocicleta);
		
		adaugareMasina = new JPanel();
		adaugareMasina.setBackground(new Color(255, 239, 213));
		adaugareMasina.setLayout(null);
		layeredPane.add(adaugareMasina, "name_550776165928700");
		
		JLabel lblAdaugareMasina = new JLabel("Adaugare masina");
		lblAdaugareMasina.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdaugareMasina.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblAdaugareMasina.setBounds(220, 0, 345, 66);
		adaugareMasina.add(lblAdaugareMasina);
		
		textMarcaMasina = new JTextField();
		textMarcaMasina.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textMarcaMasina.setColumns(10);
		textMarcaMasina.setBounds(300, 103, 305, 37);
		adaugareMasina.add(textMarcaMasina);
		
		textAnFabricatieMasina = new JTextField();
		textAnFabricatieMasina.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textAnFabricatieMasina.setColumns(10);
		textAnFabricatieMasina.setBounds(300, 161, 305, 37);
		adaugareMasina.add(textAnFabricatieMasina);
		
		textLitrajMasina = new JTextField();
		textLitrajMasina.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textLitrajMasina.setColumns(10);
		textLitrajMasina.setBounds(300, 220, 305, 37);
		adaugareMasina.add(textLitrajMasina);
		
		textPretMasina = new JTextField();
		textPretMasina.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textPretMasina.setColumns(10);
		textPretMasina.setBounds(300, 280, 305, 37);
		adaugareMasina.add(textPretMasina);
		
		textCaroserieMasina = new JTextField();
		textCaroserieMasina.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textCaroserieMasina.setColumns(10);
		textCaroserieMasina.setBounds(300, 338, 305, 37);
		adaugareMasina.add(textCaroserieMasina);
		
		JLabel lblMarcaMasina = new JLabel("Marca");
		lblMarcaMasina.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblMarcaMasina.setBounds(185, 107, 72, 25);
		adaugareMasina.add(lblMarcaMasina);
		
		JLabel lblAnFabricatieMasina = new JLabel("An fabricatie");
		lblAnFabricatieMasina.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblAnFabricatieMasina.setBounds(138, 165, 130, 25);
		adaugareMasina.add(lblAnFabricatieMasina);
		
		JLabel lblLitrajMasina = new JLabel("Litraj");
		lblLitrajMasina.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblLitrajMasina.setBounds(185, 224, 72, 25);
		adaugareMasina.add(lblLitrajMasina);
		
		JLabel lblPretMasina = new JLabel("Pret");
		lblPretMasina.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblPretMasina.setBounds(185, 284, 72, 25);
		adaugareMasina.add(lblPretMasina);
		
		JLabel lblCaroserieMasina = new JLabel("Caroserie");
		lblCaroserieMasina.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblCaroserieMasina.setBounds(159, 342, 98, 25);
		adaugareMasina.add(lblCaroserieMasina);
		
		JButton btnInapoiAdaugareMasina = new JButton("Inapoi");
		btnInapoiAdaugareMasina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textMarcaMasina.setText("");
				textAnFabricatieMasina.setText("");
				textLitrajMasina.setText("");
				textPretMasina.setText("");
				textCaroserieMasina.setText("");
				switchPanels(adaugareAutovehicul);
			}
		});
		btnInapoiAdaugareMasina.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiAdaugareMasina.setFocusable(false);
		btnInapoiAdaugareMasina.setBounds(22, 484, 235, 37);
		adaugareMasina.add(btnInapoiAdaugareMasina);
		
		JButton btnAddMasina = new JButton("ADAUGARE");
		btnAddMasina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String marca = textMarcaMasina.getText();
				String anFabricatie = textAnFabricatieMasina.getText();
				String litraj = textLitrajMasina.getText();
				String pret = textPretMasina.getText();
				String caroserie = textCaroserieMasina.getText();
				
				
				
				if(marca.isEmpty() || anFabricatie.isEmpty() || litraj.isEmpty() || pret.isEmpty() || caroserie.isEmpty()) {
					System.out.println("Camp gol!!!");
					
				}
				else {
					
					Masina b = new Masina(marca, Integer.parseInt(anFabricatie), Double.parseDouble(litraj), Double.parseDouble(pret), caroserie);
					
					DB.adaugareAutovehicul(b.getTip(), String.valueOf(b.getId()), b.getMarca(), String.valueOf(b.getAnFabricatie()), String.valueOf(b.getLitraj()), String.valueOf(b.getPretRedus()), b.getCaroserie());
				
					textMarcaMasina.setText("");
					textAnFabricatieMasina.setText("");
					textLitrajMasina.setText("");
					textPretMasina.setText("");
					textCaroserieMasina.setText("");
					
					Audit.scrieActiune("Adaugare autovehicul", Thread.currentThread().getName());
				}

			}
		});
		btnAddMasina.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAddMasina.setFocusable(false);
		btnAddMasina.setBounds(508, 484, 235, 37);
		adaugareMasina.add(btnAddMasina);
		
		adaugareAutobuz = new JPanel();
		adaugareAutobuz.setBackground(new Color(255, 239, 213));
		adaugareAutobuz.setLayout(null);
		layeredPane.add(adaugareAutobuz, "name_551110351384200");
		
		JLabel lblAdaugareAutobuz = new JLabel("Adaugare autobuz");
		lblAdaugareAutobuz.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdaugareAutobuz.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblAdaugareAutobuz.setBounds(220, 0, 345, 66);
		adaugareAutobuz.add(lblAdaugareAutobuz);
		
		textMarcaAutobuz = new JTextField();
		textMarcaAutobuz.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textMarcaAutobuz.setColumns(10);
		textMarcaAutobuz.setBounds(300, 103, 305, 37);
		adaugareAutobuz.add(textMarcaAutobuz);
		
		textAnFabricatieAutobuz = new JTextField();
		textAnFabricatieAutobuz.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textAnFabricatieAutobuz.setColumns(10);
		textAnFabricatieAutobuz.setBounds(300, 161, 305, 37);
		adaugareAutobuz.add(textAnFabricatieAutobuz);
		
		textLitrajAutobuz = new JTextField();
		textLitrajAutobuz.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textLitrajAutobuz.setColumns(10);
		textLitrajAutobuz.setBounds(300, 220, 305, 37);
		adaugareAutobuz.add(textLitrajAutobuz);
		
		textPretAutobuz = new JTextField();
		textPretAutobuz.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textPretAutobuz.setColumns(10);
		textPretAutobuz.setBounds(300, 280, 305, 37);
		adaugareAutobuz.add(textPretAutobuz);
		
		textCapacitatePersoaneAutobuz = new JTextField();
		textCapacitatePersoaneAutobuz.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textCapacitatePersoaneAutobuz.setColumns(10);
		textCapacitatePersoaneAutobuz.setBounds(300, 338, 305, 37);
		adaugareAutobuz.add(textCapacitatePersoaneAutobuz);
		
		JLabel lblMarcaAutobuz = new JLabel("Marca");
		lblMarcaAutobuz.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblMarcaAutobuz.setBounds(185, 107, 72, 25);
		adaugareAutobuz.add(lblMarcaAutobuz);
		
		JLabel lblAnFabricatieAutobuz = new JLabel("An fabricatie");
		lblAnFabricatieAutobuz.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblAnFabricatieAutobuz.setBounds(138, 165, 130, 25);
		adaugareAutobuz.add(lblAnFabricatieAutobuz);
		
		JLabel lblLitrajAutobuz = new JLabel("Litraj");
		lblLitrajAutobuz.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblLitrajAutobuz.setBounds(185, 224, 72, 25);
		adaugareAutobuz.add(lblLitrajAutobuz);
		
		JLabel lblPretAutobuz = new JLabel("Pret");
		lblPretAutobuz.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblPretAutobuz.setBounds(185, 284, 72, 25);
		adaugareAutobuz.add(lblPretAutobuz);
		
		JLabel lblCapacitatePersoaneAutobuz = new JLabel("Capacitate persoane");
		lblCapacitatePersoaneAutobuz.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblCapacitatePersoaneAutobuz.setBounds(71, 342, 197, 25);
		adaugareAutobuz.add(lblCapacitatePersoaneAutobuz);
		
		JButton btnInapoiAdaugareAutobuz = new JButton("Inapoi");
		btnInapoiAdaugareAutobuz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textMarcaAutobuz.setText("");
				textAnFabricatieAutobuz.setText("");
				textLitrajAutobuz.setText("");
				textPretAutobuz.setText("");
				textCapacitatePersoaneAutobuz.setText("");
				switchPanels(adaugareAutovehicul);
			}
		});
		btnInapoiAdaugareAutobuz.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiAdaugareAutobuz.setFocusable(false);
		btnInapoiAdaugareAutobuz.setBounds(22, 484, 235, 37);
		adaugareAutobuz.add(btnInapoiAdaugareAutobuz);
		
		JButton btnAddAutobuz = new JButton("ADAUGARE");
		btnAddAutobuz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String marca = textMarcaAutobuz.getText();
				String anFabricatie = textAnFabricatieAutobuz.getText();
				String litraj = textLitrajAutobuz.getText();
				String pret = textPretAutobuz.getText();
				String capacitatePersoane = textCapacitatePersoaneAutobuz.getText();
				
				
				
				if(marca.isEmpty() || anFabricatie.isEmpty() || litraj.isEmpty() || pret.isEmpty() || capacitatePersoane.isEmpty()) {
					System.out.println("Camp gol!!!");
					
				}
				else {
					
					Autobuz c = new Autobuz(marca, Integer.parseInt(anFabricatie), Double.parseDouble(litraj), Double.parseDouble(pret), Integer.parseInt(capacitatePersoane));
					
					DB.adaugareAutovehicul(c.getTip(), String.valueOf(c.getId()), c.getMarca(), String.valueOf(c.getAnFabricatie()), String.valueOf(c.getLitraj()), String.valueOf(c.getPretRedus()), String.valueOf(c.getCapacitatePersoane()));
				
					textMarcaAutobuz.setText("");
					textAnFabricatieAutobuz.setText("");
					textLitrajAutobuz.setText("");
					textPretAutobuz.setText("");
					textCapacitatePersoaneAutobuz.setText("");
					
					Audit.scrieActiune("Adaugare autovehicul", Thread.currentThread().getName());
				}
				
			}
		});
		btnAddAutobuz.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAddAutobuz.setFocusable(false);
		btnAddAutobuz.setBounds(508, 484, 235, 37);
		adaugareAutobuz.add(btnAddAutobuz);
		
		adaugareCamion = new JPanel();
		adaugareCamion.setBackground(new Color(255, 239, 213));
		adaugareCamion.setLayout(null);
		layeredPane.add(adaugareCamion, "name_551383515652200");
		
		JLabel lblAdaugareCamion = new JLabel("Adaugare camion");
		lblAdaugareCamion.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdaugareCamion.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblAdaugareCamion.setBounds(220, 0, 345, 66);
		adaugareCamion.add(lblAdaugareCamion);
		
		textMarcaCamion = new JTextField();
		textMarcaCamion.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textMarcaCamion.setColumns(10);
		textMarcaCamion.setBounds(300, 103, 305, 37);
		adaugareCamion.add(textMarcaCamion);
		
		textAnFabricatieCamion = new JTextField();
		textAnFabricatieCamion.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textAnFabricatieCamion.setColumns(10);
		textAnFabricatieCamion.setBounds(300, 161, 305, 37);
		adaugareCamion.add(textAnFabricatieCamion);
		
		textLitrajCamion = new JTextField();
		textLitrajCamion.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textLitrajCamion.setColumns(10);
		textLitrajCamion.setBounds(300, 220, 305, 37);
		adaugareCamion.add(textLitrajCamion);
		
		textPretCamion = new JTextField();
		textPretCamion.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textPretCamion.setColumns(10);
		textPretCamion.setBounds(300, 280, 305, 37);
		adaugareCamion.add(textPretCamion);
		
		textIncarcaturaMaximaCamion = new JTextField();
		textIncarcaturaMaximaCamion.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textIncarcaturaMaximaCamion.setColumns(10);
		textIncarcaturaMaximaCamion.setBounds(300, 338, 305, 37);
		adaugareCamion.add(textIncarcaturaMaximaCamion);
		
		JLabel lblMarcaCamion = new JLabel("Marca");
		lblMarcaCamion.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblMarcaCamion.setBounds(185, 107, 72, 25);
		adaugareCamion.add(lblMarcaCamion);
		
		JLabel lblAnFabricatieCamion = new JLabel("An fabricatie");
		lblAnFabricatieCamion.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblAnFabricatieCamion.setBounds(138, 165, 130, 25);
		adaugareCamion.add(lblAnFabricatieCamion);
		
		JLabel lblLitrajCamion = new JLabel("Litraj");
		lblLitrajCamion.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblLitrajCamion.setBounds(185, 224, 72, 25);
		adaugareCamion.add(lblLitrajCamion);
		
		JLabel lblPretCamion = new JLabel("Pret");
		lblPretCamion.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblPretCamion.setBounds(185, 284, 72, 25);
		adaugareCamion.add(lblPretCamion);
		
		JLabel lblIncarcaturaMaximaCamion = new JLabel("Incarcatura maxima");
		lblIncarcaturaMaximaCamion.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblIncarcaturaMaximaCamion.setBounds(71, 342, 197, 25);
		adaugareCamion.add(lblIncarcaturaMaximaCamion);
		
		JButton btnInapoiAdaugareCamion = new JButton("Inapoi");
		btnInapoiAdaugareCamion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textMarcaCamion.setText("");
				textAnFabricatieCamion.setText("");
				textLitrajCamion.setText("");
				textPretCamion.setText("");
				textIncarcaturaMaximaCamion.setText("");
				switchPanels(adaugareAutovehicul);
			}
		});
		btnInapoiAdaugareCamion.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiAdaugareCamion.setFocusable(false);
		btnInapoiAdaugareCamion.setBounds(22, 484, 235, 37);
		adaugareCamion.add(btnInapoiAdaugareCamion);
		
		JButton btnAddCamion = new JButton("ADAUGARE");
		btnAddCamion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String marca = textMarcaCamion.getText();
				String anFabricatie = textAnFabricatieCamion.getText();
				String litraj = textLitrajCamion.getText();
				String pret = textPretCamion.getText();
				String incarcaturaMaxima = textIncarcaturaMaximaCamion.getText();
				
				
				
				if(marca.isEmpty() || anFabricatie.isEmpty() || litraj.isEmpty() || pret.isEmpty() || incarcaturaMaxima.isEmpty()) {
					System.out.println("Camp gol!!!");
					
				}
				else {
					
					Camion d = new Camion(marca, Integer.parseInt(anFabricatie), Double.parseDouble(litraj), Double.parseDouble(pret), Double.parseDouble(incarcaturaMaxima));
					
					DB.adaugareAutovehicul(d.getTip(), String.valueOf(d.getId()), d.getMarca(), String.valueOf(d.getAnFabricatie()), String.valueOf(d.getLitraj()), String.valueOf(d.getPretRedus()), String.valueOf(d.getMaxLoad()));
				
					textMarcaCamion.setText("");
					textAnFabricatieCamion.setText("");
					textLitrajCamion.setText("");
					textPretCamion.setText("");
					textIncarcaturaMaximaCamion.setText("");
					
					Audit.scrieActiune("Adaugare autovehicul", Thread.currentThread().getName());
				}
				
			}
		});
		btnAddCamion.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnAddCamion.setFocusable(false);
		btnAddCamion.setBounds(508, 484, 235, 37);
		adaugareCamion.add(btnAddCamion);
		
		stergereAutovehicul = new JPanel();
		stergereAutovehicul.setBackground(new Color(255, 239, 213));
		layeredPane.add(stergereAutovehicul, "name_553066615596700");
		stergereAutovehicul.setLayout(null);
		
		JLabel lblStergereAutovehicul = new JLabel("Stergere autovehicul");
		lblStergereAutovehicul.setHorizontalAlignment(SwingConstants.CENTER);
		lblStergereAutovehicul.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblStergereAutovehicul.setBounds(220, 0, 345, 66);
		stergereAutovehicul.add(lblStergereAutovehicul);
		
		textIdStergereAutovehicul = new JTextField();
		textIdStergereAutovehicul.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textIdStergereAutovehicul.setColumns(10);
		textIdStergereAutovehicul.setBounds(280, 142, 305, 37);
		stergereAutovehicul.add(textIdStergereAutovehicul);
		
		JLabel lblIdStergereAutovehicul = new JLabel("ID");
		lblIdStergereAutovehicul.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblIdStergereAutovehicul.setBounds(207, 146, 41, 25);
		stergereAutovehicul.add(lblIdStergereAutovehicul);
		
		JButton btnInapoiStergereAutovehicul = new JButton("Inapoi");
		btnInapoiStergereAutovehicul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textIdStergereAutovehicul.setText("");
				switchPanels(menu);
			}
		});
		btnInapoiStergereAutovehicul.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiStergereAutovehicul.setFocusable(false);
		btnInapoiStergereAutovehicul.setBounds(23, 485, 235, 37);
		stergereAutovehicul.add(btnInapoiStergereAutovehicul);
		
		JButton btnDeleteAutovehicul = new JButton("STERGERE");
		btnDeleteAutovehicul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idAutovehicul = textIdStergereAutovehicul.getText();
				
				if(idAutovehicul.isEmpty()) {
					System.out.println("Camp gol!!!");
					
				}
				else {
					
					DB.stergereAutovehicul(idAutovehicul);
					
					textIdStergereAutovehicul.setText("");
					
					Audit.scrieActiune("Stergere autovehicul", Thread.currentThread().getName());
				}
				
			}
		});
		btnDeleteAutovehicul.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnDeleteAutovehicul.setFocusable(false);
		btnDeleteAutovehicul.setBounds(507, 485, 235, 37);
		stergereAutovehicul.add(btnDeleteAutovehicul);
		
		stergereClient = new JPanel();
		stergereClient.setBackground(new Color(255, 239, 213));
		stergereClient.setLayout(null);
		layeredPane.add(stergereClient, "name_553837204001400");
		
		JLabel lblStergereClient = new JLabel("Stergere client");
		lblStergereClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblStergereClient.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblStergereClient.setBounds(220, 0, 345, 66);
		stergereClient.add(lblStergereClient);
		
		textStergereClient = new JTextField();
		textStergereClient.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textStergereClient.setColumns(10);
		textStergereClient.setBounds(280, 142, 305, 37);
		stergereClient.add(textStergereClient);
		
		JLabel lblIdStergereClient = new JLabel("ID");
		lblIdStergereClient.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblIdStergereClient.setBounds(207, 146, 41, 25);
		stergereClient.add(lblIdStergereClient);
		
		JButton btnInapoiStergereClient = new JButton("Inapoi");
		btnInapoiStergereClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textStergereClient.setText("");
				switchPanels(menu);
			}
		});
		btnInapoiStergereClient.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiStergereClient.setFocusable(false);
		btnInapoiStergereClient.setBounds(23, 485, 235, 37);
		stergereClient.add(btnInapoiStergereClient);
		
		JButton btnDeleteClient = new JButton("STERGERE");
		btnDeleteClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idClient = textStergereClient.getText();
				
				if(idClient.isEmpty()) {
					System.out.println("Camp gol!!!");
					
				}
				else {
					
					DB.stergereClient(idClient);
					
					textStergereClient.setText("");
					
					Audit.scrieActiune("Stergere client", Thread.currentThread().getName());
					
				}
			}
		});
		btnDeleteClient.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnDeleteClient.setFocusable(false);
		btnDeleteClient.setBounds(507, 485, 235, 37);
		stergereClient.add(btnDeleteClient);
		
		modificareAutovehicul = new JPanel();
		modificareAutovehicul.setBackground(new Color(255, 239, 213));
		modificareAutovehicul.setLayout(null);
		layeredPane.add(modificareAutovehicul, "name_554509166705000");
		
		JLabel lblModificareAutovehicul = new JLabel("Modificare autovehicul");
		lblModificareAutovehicul.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificareAutovehicul.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblModificareAutovehicul.setBounds(220, 0, 345, 66);
		modificareAutovehicul.add(lblModificareAutovehicul);
		
		textModificareMarca = new JTextField();
		textModificareMarca.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textModificareMarca.setColumns(10);
		textModificareMarca.setBounds(300, 183, 305, 37);
		modificareAutovehicul.add(textModificareMarca);
		
		textModificareAnFabricatie = new JTextField();
		textModificareAnFabricatie.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textModificareAnFabricatie.setColumns(10);
		textModificareAnFabricatie.setBounds(300, 230, 305, 37);
		modificareAutovehicul.add(textModificareAnFabricatie);
		
		textModificareLitraj = new JTextField();
		textModificareLitraj.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textModificareLitraj.setColumns(10);
		textModificareLitraj.setBounds(300, 277, 305, 37);
		modificareAutovehicul.add(textModificareLitraj);
		
		textModificarePret = new JTextField();
		textModificarePret.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textModificarePret.setColumns(10);
		textModificarePret.setBounds(300, 324, 305, 37);
		modificareAutovehicul.add(textModificarePret);
		
		textModificareCampUnic = new JTextField();
		textModificareCampUnic.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textModificareCampUnic.setColumns(10);
		textModificareCampUnic.setBounds(300, 371, 305, 37);
		modificareAutovehicul.add(textModificareCampUnic);
		
		JLabel lblMarcaModificare = new JLabel("Marca");
		lblMarcaModificare.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblMarcaModificare.setBounds(185, 187, 72, 25);
		modificareAutovehicul.add(lblMarcaModificare);
		
		JLabel lblAnFabricatieModificare = new JLabel("An fabricatie");
		lblAnFabricatieModificare.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblAnFabricatieModificare.setBounds(139, 234, 130, 25);
		modificareAutovehicul.add(lblAnFabricatieModificare);
		
		JLabel lblLitrajModificare = new JLabel("Litraj");
		lblLitrajModificare.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblLitrajModificare.setBounds(185, 281, 72, 25);
		modificareAutovehicul.add(lblLitrajModificare);
		
		JLabel lblPretModificare = new JLabel("Pret");
		lblPretModificare.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblPretModificare.setBounds(185, 328, 72, 25);
		modificareAutovehicul.add(lblPretModificare);
		
		JLabel lblCampUnic = new JLabel("Camp unic");
		lblCampUnic.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblCampUnic.setBounds(153, 375, 116, 25);
		modificareAutovehicul.add(lblCampUnic);
		
		JButton btnInapoiModificareAutovehicul = new JButton("Inapoi");
		btnInapoiModificareAutovehicul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSelectIdAutovehicul.setText("");
				textModificareTip.setText("");
				textModificareMarca.setText("");
				textModificareAnFabricatie.setText("");
				textModificareLitraj.setText("");
				textModificarePret.setText("");
				textModificareCampUnic.setText("");
				switchPanels(menu);
			}
		});
		btnInapoiModificareAutovehicul.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiModificareAutovehicul.setFocusable(false);
		btnInapoiModificareAutovehicul.setBounds(22, 484, 235, 37);
		modificareAutovehicul.add(btnInapoiModificareAutovehicul);
		
		JButton btnModifyAutovehicul = new JButton("MODIFICARE");
		btnModifyAutovehicul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idAutovehicul = textSelectIdAutovehicul.getText();
				String marca = textModificareMarca.getText();
				String anFabricatie = textModificareAnFabricatie.getText();
				String litraj = textModificareLitraj.getText();
				String pret = textModificarePret.getText();
				String campUnic = textModificareCampUnic.getText();
				
				
				
				if(marca.isEmpty() || anFabricatie.isEmpty() || litraj.isEmpty() || pret.isEmpty() || campUnic.isEmpty() || idAutovehicul.isEmpty()) {
					System.out.println("Camp gol!!!");
					
				}
				else {
					
					DB.setAutovehicul(idAutovehicul, marca, anFabricatie, litraj, pret, campUnic);
				
					textSelectIdAutovehicul.setText("");
					textModificareTip.setText("");
					textModificareMarca.setText("");
					textModificareAnFabricatie.setText("");
					textModificareLitraj.setText("");
					textModificarePret.setText("");
					textModificareCampUnic.setText("");
					
					Audit.scrieActiune("Modificare autovehicul", Thread.currentThread().getName());
				}
				
			}
		});
		btnModifyAutovehicul.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnModifyAutovehicul.setFocusable(false);
		btnModifyAutovehicul.setBounds(508, 484, 235, 37);
		modificareAutovehicul.add(btnModifyAutovehicul);
		
		textModificareTip = new JTextField();
		textModificareTip.setEditable(false);
		textModificareTip.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textModificareTip.setColumns(10);
		textModificareTip.setBounds(300, 136, 305, 37);
		modificareAutovehicul.add(textModificareTip);
		
		JLabel lblTipModificare = new JLabel("Tip");
		lblTipModificare.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblTipModificare.setBounds(185, 140, 72, 25);
		modificareAutovehicul.add(lblTipModificare);
		
		textSelectIdAutovehicul = new JTextField();
		textSelectIdAutovehicul.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textSelectIdAutovehicul.setColumns(10);
		textSelectIdAutovehicul.setBounds(139, 76, 305, 37);
		modificareAutovehicul.add(textSelectIdAutovehicul);
		
		JLabel lblIdModificareAutovehicul = new JLabel("ID");
		lblIdModificareAutovehicul.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblIdModificareAutovehicul.setBounds(70, 80, 54, 25);
		modificareAutovehicul.add(lblIdModificareAutovehicul);
		
		JButton btnSelectAutovehicul = new JButton("SELECTEAZA");
		btnSelectAutovehicul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textModificareTip.setText("");
				textModificareMarca.setText("");
				textModificareAnFabricatie.setText("");
				textModificareLitraj.setText("");
				textModificarePret.setText("");
				textModificareCampUnic.setText("");
				
				String idAutovehicul = textSelectIdAutovehicul.getText();
				
				if(idAutovehicul.isEmpty()) {
					System.out.println("Camp gol!!!");
					
				}
				else {
					
					ArrayList<String> info = DB.getAutovehicul(idAutovehicul);
					
					
					if(info.size()>0) {
						textModificareTip.setText(info.get(0));
						textModificareMarca.setText(info.get(1));
						textModificareAnFabricatie.setText(info.get(2));
						textModificareLitraj.setText(info.get(3));
						textModificarePret.setText(info.get(4));
						textModificareCampUnic.setText(info.get(5));
					}
					
				}
				
				

				
			}
		});
		btnSelectAutovehicul.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnSelectAutovehicul.setFocusable(false);
		btnSelectAutovehicul.setBounds(508, 76, 235, 37);
		modificareAutovehicul.add(btnSelectAutovehicul);
		
		JLabel lblInfoAutovehicul2 = new JLabel("motocicleta - ani garantie; masina - caroserie;");
		lblInfoAutovehicul2.setForeground(new Color(65, 105, 225));
		lblInfoAutovehicul2.setFont(new Font("Rokkitt Medium", Font.PLAIN, 18));
		lblInfoAutovehicul2.setBounds(232, 418, 466, 25);
		modificareAutovehicul.add(lblInfoAutovehicul2);
		
		JLabel lblInfoAutovehicul3 = new JLabel("autobuz - capacitate persoane; camion - incarcatura maxima(t)");
		lblInfoAutovehicul3.setForeground(new Color(65, 105, 225));
		lblInfoAutovehicul3.setFont(new Font("Rokkitt Medium", Font.PLAIN, 18));
		lblInfoAutovehicul3.setBounds(232, 449, 476, 25);
		modificareAutovehicul.add(lblInfoAutovehicul3);
		
		JLabel lblInfoAutovehicul = new JLabel("Camp unic:");
		lblInfoAutovehicul.setForeground(new Color(65, 105, 225));
		lblInfoAutovehicul.setFont(new Font("Rokkitt Medium", Font.PLAIN, 18));
		lblInfoAutovehicul.setBounds(107, 434, 94, 25);
		modificareAutovehicul.add(lblInfoAutovehicul);
		
		modificareClient = new JPanel();
		modificareClient.setBackground(new Color(255, 239, 213));
		modificareClient.setLayout(null);
		layeredPane.add(modificareClient, "name_555576344800499");
		
		JLabel lblModificareClient = new JLabel("Modificare client");
		lblModificareClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificareClient.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblModificareClient.setBounds(220, 0, 345, 66);
		modificareClient.add(lblModificareClient);
		
		textModificareNume = new JTextField();
		textModificareNume.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textModificareNume.setColumns(10);
		textModificareNume.setBounds(300, 231, 305, 37);
		modificareClient.add(textModificareNume);
		
		textModificareCnp = new JTextField();
		textModificareCnp.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textModificareCnp.setColumns(10);
		textModificareCnp.setBounds(300, 278, 305, 37);
		modificareClient.add(textModificareCnp);
		
		JLabel lblNumeModificare = new JLabel("Nume");
		lblNumeModificare.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblNumeModificare.setBounds(185, 235, 72, 25);
		modificareClient.add(lblNumeModificare);
		
		JLabel lblCnpModificare = new JLabel("CNP");
		lblCnpModificare.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblCnpModificare.setBounds(197, 282, 72, 25);
		modificareClient.add(lblCnpModificare);
		
		JButton btnInapoiModificareClient = new JButton("Inapoi");
		btnInapoiModificareClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSelectIdClient.setText("");
				textModificareNume.setText("");
				textModificareCnp.setText("");
				switchPanels(menu);
			}
		});
		btnInapoiModificareClient.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiModificareClient.setFocusable(false);
		btnInapoiModificareClient.setBounds(22, 484, 235, 37);
		modificareClient.add(btnInapoiModificareClient);
		
		JButton btnModifyClient = new JButton("MODIFICARE");
		btnModifyClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idClient = textSelectIdClient.getText();
				String nume = textModificareNume.getText();
				String cnp = textModificareCnp.getText();

				
				
				
				if(nume.isEmpty() || cnp.isEmpty() || idClient.isEmpty()) {
					System.out.println("Camp gol!!!");
					
				}
				else {
					
					DB.setClient(idClient, nume, cnp);
				
					textSelectIdClient.setText("");
					textModificareNume.setText("");
					textModificareCnp.setText("");
					
					Audit.scrieActiune("Modificare client", Thread.currentThread().getName());
				}
				
				
			}
		});
		btnModifyClient.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnModifyClient.setFocusable(false);
		btnModifyClient.setBounds(508, 484, 235, 37);
		modificareClient.add(btnModifyClient);
		
		textSelectIdClient = new JTextField();
		textSelectIdClient.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textSelectIdClient.setColumns(10);
		textSelectIdClient.setBounds(139, 113, 305, 37);
		modificareClient.add(textSelectIdClient);
		
		JLabel lblIdModificareClient = new JLabel("ID");
		lblIdModificareClient.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblIdModificareClient.setBounds(69, 117, 54, 25);
		modificareClient.add(lblIdModificareClient);
		
		JButton btnSelectClient = new JButton("SELECTEAZA");
		btnSelectClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textModificareNume.setText("");
				textModificareCnp.setText("");
				
				String idClient = textSelectIdClient.getText();
				
				if(idClient.isEmpty()) {
					System.out.println("Camp gol!!!");
					
				}
				else {
					
					ArrayList<String> info = DB.getClient(idClient);
					
					
					if(info.size()>0) {
						textModificareNume.setText(info.get(0));
						textModificareCnp.setText(info.get(1));

					}
					
				}
			}
		});
		btnSelectClient.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnSelectClient.setFocusable(false);
		btnSelectClient.setBounds(508, 112, 235, 37);
		modificareClient.add(btnSelectClient);
		
		afisareAutovehicule = new JPanel();
		afisareAutovehicule.setBackground(new Color(255, 239, 213));
		layeredPane.add(afisareAutovehicule, "name_556393204446700");
		afisareAutovehicule.setLayout(null);
		
		JLabel lblAfisareAutovehicule = new JLabel("Stoc autovehicule");
		lblAfisareAutovehicule.setHorizontalAlignment(SwingConstants.CENTER);
		lblAfisareAutovehicule.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblAfisareAutovehicule.setBounds(219, 0, 345, 66);
		afisareAutovehicule.add(lblAfisareAutovehicule);
		
		textAreaStocAutovehicule = new JTextArea ( 16, 58 );
		textAreaStocAutovehicule.setLineWrap(true);
		textAreaStocAutovehicule.setEditable(false);
		
		JButton btnInapoiAfisareAutovehicule = new JButton("Inapoi");
		btnInapoiAfisareAutovehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaStocAutovehicule.setText("");
				switchPanels(menu);
			}
		});
		btnInapoiAfisareAutovehicule.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiAfisareAutovehicule.setFocusable(false);
		btnInapoiAfisareAutovehicule.setBounds(22, 485, 235, 37);
		afisareAutovehicule.add(btnInapoiAfisareAutovehicule);
		
		JScrollPane scrollPaneStocAutovehicule = new JScrollPane(textAreaStocAutovehicule);
		scrollPaneStocAutovehicule.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneStocAutovehicule.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneStocAutovehicule.setBounds(22, 71, 719, 391);
		afisareAutovehicule.add(scrollPaneStocAutovehicule);
		
		afisareClienti = new JPanel();
		afisareClienti.setBackground(new Color(255, 239, 213));
		afisareClienti.setLayout(null);
		layeredPane.add(afisareClienti, "name_558884668121400");
		
		JLabel lblAfisareClienti = new JLabel("Clienti");
		lblAfisareClienti.setHorizontalAlignment(SwingConstants.CENTER);
		lblAfisareClienti.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblAfisareClienti.setBounds(219, 0, 345, 66);
		afisareClienti.add(lblAfisareClienti);
		
		textAreaClienti = new JTextArea ( 16, 58 );
		textAreaClienti.setLineWrap(true);
		textAreaStocAutovehicule.setEditable(false);
		
		JButton btnInapoiAfisareClienti = new JButton("Inapoi");
		btnInapoiAfisareClienti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaClienti.setText("");
				switchPanels(menu);
			}
		});
		btnInapoiAfisareClienti.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiAfisareClienti.setFocusable(false);
		btnInapoiAfisareClienti.setBounds(22, 485, 235, 37);
		afisareClienti.add(btnInapoiAfisareClienti);
		
		JScrollPane scrollPaneClienti = new JScrollPane(textAreaClienti);
		scrollPaneClienti.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneClienti.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneClienti.setBounds(22, 71, 719, 391);
		afisareClienti.add(scrollPaneClienti);
		
		afisareVanzari = new JPanel();
		afisareVanzari.setBackground(new Color(255, 239, 213));
		afisareVanzari.setLayout(null);
		layeredPane.add(afisareVanzari, "name_559223297889000");
		
		JLabel lblAfisareVanzari = new JLabel("Istoric vanzari");
		lblAfisareVanzari.setHorizontalAlignment(SwingConstants.CENTER);
		lblAfisareVanzari.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblAfisareVanzari.setBounds(219, 0, 345, 66);
		afisareVanzari.add(lblAfisareVanzari);
		
		textAreaVanzari = new JTextArea ( 16, 58 );
		textAreaVanzari.setEditable(false);
		
		JButton btnInapoiAfisareVanzari = new JButton("Inapoi");
		btnInapoiAfisareVanzari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaVanzari.setText("");
				switchPanels(menu);
			}
		});
		btnInapoiAfisareVanzari.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiAfisareVanzari.setFocusable(false);
		btnInapoiAfisareVanzari.setBounds(22, 485, 235, 37);
		afisareVanzari.add(btnInapoiAfisareVanzari);
		
		JScrollPane scrollPaneVanzari = new JScrollPane(textAreaVanzari);
		scrollPaneVanzari.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneVanzari.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneVanzari.setBounds(22, 71, 719, 391);
		afisareVanzari.add(scrollPaneVanzari);
		
		inregistrareVanzare = new JPanel();
		inregistrareVanzare.setBackground(new Color(255, 239, 213));
		inregistrareVanzare.setLayout(null);
		layeredPane.add(inregistrareVanzare, "name_559679973574899");
		
		JLabel lblInregistrareVanzare = new JLabel("Inregistrare vanzare");
		lblInregistrareVanzare.setHorizontalAlignment(SwingConstants.CENTER);
		lblInregistrareVanzare.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblInregistrareVanzare.setBounds(233, 0, 318, 66);
		inregistrareVanzare.add(lblInregistrareVanzare);
		
		textIdClient = new JTextField();
		textIdClient.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textIdClient.setColumns(10);
		textIdClient.setBounds(281, 173, 305, 37);
		inregistrareVanzare.add(textIdClient);
		
		textIdAutovehicul = new JTextField();
		textIdAutovehicul.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textIdAutovehicul.setColumns(10);
		textIdAutovehicul.setBounds(281, 243, 305, 37);
		inregistrareVanzare.add(textIdAutovehicul);
		
		JLabel lblIdClient = new JLabel("ID Client");
		lblIdClient.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblIdClient.setBounds(151, 177, 96, 25);
		inregistrareVanzare.add(lblIdClient);
		
		JLabel lblIdAutovehicul = new JLabel("ID Autovehicul");
		lblIdAutovehicul.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblIdAutovehicul.setBounds(109, 247, 153, 25);
		inregistrareVanzare.add(lblIdAutovehicul);
		
		JButton btnRegisterVanzare = new JButton("INREGISTRARE");
		btnRegisterVanzare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idClient = textIdClient.getText();
				String idAutovehicul = textIdAutovehicul.getText();
				
				if(idClient.isEmpty() || idAutovehicul.isEmpty()) {
					System.out.println("Camp gol!!!");
					
				}
				else {
					
					DB.inregistrareVanzare(idClient, idAutovehicul);
					
					textIdClient.setText("");
					textIdAutovehicul.setText("");
					
					Audit.scrieActiune("Inregistrare vanzare", Thread.currentThread().getName());
				}
				
			}
		});
		btnRegisterVanzare.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnRegisterVanzare.setFocusable(false);
		btnRegisterVanzare.setBounds(507, 478, 235, 37);
		inregistrareVanzare.add(btnRegisterVanzare);
		
		JButton btnInapoiInregistrareVanzare = new JButton("Inapoi");
		btnInapoiInregistrareVanzare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textIdClient.setText("");
				textIdAutovehicul.setText("");
				switchPanels(menu);
			}
		});
		btnInapoiInregistrareVanzare.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiInregistrareVanzare.setFocusable(false);
		btnInapoiInregistrareVanzare.setBounds(27, 478, 235, 37);
		inregistrareVanzare.add(btnInapoiInregistrareVanzare);
		
		afisareAutovehiculeVandute = new JPanel();
		afisareAutovehiculeVandute.setBackground(new Color(255, 239, 213));
		afisareAutovehiculeVandute.setLayout(null);
		layeredPane.add(afisareAutovehiculeVandute, "name_311340996673100");
		
		JLabel lblAfisareAutovehiculeVandute = new JLabel("Autovehicule vandute");
		lblAfisareAutovehiculeVandute.setHorizontalAlignment(SwingConstants.CENTER);
		lblAfisareAutovehiculeVandute.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblAfisareAutovehiculeVandute.setBounds(219, 0, 345, 66);
		afisareAutovehiculeVandute.add(lblAfisareAutovehiculeVandute);
		
		textAreaAutovehiculeVandute = new JTextArea ( 16, 58 );
		textAreaAutovehiculeVandute.setLineWrap(true);
		textAreaAutovehiculeVandute.setEditable(false);
		
		JButton btnInapoiAfisareAutovehiculeVandute = new JButton("Inapoi");
		btnInapoiAfisareAutovehiculeVandute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaAutovehiculeVandute.setText("");
				switchPanels(menu);
			}
		});
		btnInapoiAfisareAutovehiculeVandute.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiAfisareAutovehiculeVandute.setFocusable(false);
		btnInapoiAfisareAutovehiculeVandute.setBounds(22, 485, 235, 37);
		afisareAutovehiculeVandute.add(btnInapoiAfisareAutovehiculeVandute);
		
		JScrollPane scrollPaneAutovehiculeVandute = new JScrollPane(textAreaAutovehiculeVandute);
		scrollPaneAutovehiculeVandute.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneAutovehiculeVandute.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneAutovehiculeVandute.setBounds(22, 71, 719, 391);
		afisareAutovehiculeVandute.add(scrollPaneAutovehiculeVandute);
		
		afisareAutovehiculeClient = new JPanel();
		afisareAutovehiculeClient.setLayout(null);
		afisareAutovehiculeClient.setBackground(new Color(255, 239, 213));
		layeredPane.add(afisareAutovehiculeClient, "name_315594601779000");
		
		JLabel lblAfisareAutovehiculeClient = new JLabel("Afisare autovehicule ale clientului");
		lblAfisareAutovehiculeClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblAfisareAutovehiculeClient.setFont(new Font("Rokkitt Black", Font.PLAIN, 34));
		lblAfisareAutovehiculeClient.setBounds(123, 0, 510, 66);
		afisareAutovehiculeClient.add(lblAfisareAutovehiculeClient);
		
		textNumeAfisareAutovehiculeClient = new JTextField();
		textNumeAfisareAutovehiculeClient.setEditable(false);
		textNumeAfisareAutovehiculeClient.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textNumeAfisareAutovehiculeClient.setColumns(10);
		textNumeAfisareAutovehiculeClient.setBounds(127, 127, 305, 37);
		afisareAutovehiculeClient.add(textNumeAfisareAutovehiculeClient);
		
		textCnpAfisareAutovehiculeClient = new JTextField();
		textCnpAfisareAutovehiculeClient.setEditable(false);
		textCnpAfisareAutovehiculeClient.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textCnpAfisareAutovehiculeClient.setColumns(10);
		textCnpAfisareAutovehiculeClient.setBounds(127, 174, 305, 37);
		afisareAutovehiculeClient.add(textCnpAfisareAutovehiculeClient);
		
		JLabel lblNumeAfisareAutovehiculeClient = new JLabel("Nume");
		lblNumeAfisareAutovehiculeClient.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblNumeAfisareAutovehiculeClient.setBounds(45, 131, 72, 25);
		afisareAutovehiculeClient.add(lblNumeAfisareAutovehiculeClient);
		
		JLabel lblCnpAfisareAutovehiculeClient = new JLabel("CNP");
		lblCnpAfisareAutovehiculeClient.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblCnpAfisareAutovehiculeClient.setBounds(45, 178, 72, 25);
		afisareAutovehiculeClient.add(lblCnpAfisareAutovehiculeClient);
		
		JButton btnInapoiAfisareAutovehiculeClient = new JButton("Inapoi");
		btnInapoiAfisareAutovehiculeClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textIdAfisareAutovehiculeClient.setText("");
				textNumeAfisareAutovehiculeClient.setText("");
				textCnpAfisareAutovehiculeClient.setText("");
				textAreaAutovehiculeClient.setText("");
				switchPanels(menu);
			}
		});
		btnInapoiAfisareAutovehiculeClient.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnInapoiAfisareAutovehiculeClient.setFocusable(false);
		btnInapoiAfisareAutovehiculeClient.setBounds(22, 484, 235, 37);
		afisareAutovehiculeClient.add(btnInapoiAfisareAutovehiculeClient);
		
		textIdAfisareAutovehiculeClient = new JTextField();
		textIdAfisareAutovehiculeClient.setFont(new Font("Rokkitt", Font.PLAIN, 16));
		textIdAfisareAutovehiculeClient.setColumns(10);
		textIdAfisareAutovehiculeClient.setBounds(127, 80, 305, 37);
		afisareAutovehiculeClient.add(textIdAfisareAutovehiculeClient);
		
		JLabel lblIdAfisareAutovehiculeClient = new JLabel("ID");
		lblIdAfisareAutovehiculeClient.setFont(new Font("Rokkitt Medium", Font.PLAIN, 22));
		lblIdAfisareAutovehiculeClient.setBounds(57, 84, 54, 25);
		afisareAutovehiculeClient.add(lblIdAfisareAutovehiculeClient);
		
		JButton btnSelectClientAutovehicule = new JButton("SELECTEAZA");
		btnSelectClientAutovehicule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textAreaAutovehiculeClient.setText("");
				textNumeAfisareAutovehiculeClient.setText("");
				textCnpAfisareAutovehiculeClient.setText("");
				String idClient = textIdAfisareAutovehiculeClient.getText();
				
				if(idClient.isEmpty()) {
					System.out.println("Camp gol!!!");
					
				}
				else {
					
					ArrayList<String> info = DB.getAutovehiculeClient(idClient);
					
					
					if(info.size()>0) {
						textNumeAfisareAutovehiculeClient.setText(info.get(0));
						textCnpAfisareAutovehiculeClient.setText(info.get(1));
						
						if(info.size()>2) {
							for(int i = 2; i<info.size();i++) {
								textAreaAutovehiculeClient.append(info.get(i));
							}
						}
						else {
							textAreaAutovehiculeClient.append("Clientul nu a cumparat niciun autovehicul!");
						}

					}
					
				}
			}
		});
		btnSelectClientAutovehicule.setFont(new Font("Rokkitt", Font.PLAIN, 18));
		btnSelectClientAutovehicule.setFocusable(false);
		btnSelectClientAutovehicule.setBounds(496, 79, 235, 37);
		afisareAutovehiculeClient.add(btnSelectClientAutovehicule);
		
		textAreaAutovehiculeClient = new JTextArea ( 14, 58 );
		textAreaAutovehiculeClient.setLineWrap(true);
		textAreaAutovehiculeClient.setEditable(false);
		
		JScrollPane scrollPaneAutovehiculeClient = new JScrollPane(textAreaAutovehiculeClient);
		scrollPaneAutovehiculeClient.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneAutovehiculeClient.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneAutovehiculeClient.setBounds(22, 232, 719, 233);
		afisareAutovehiculeClient.add(scrollPaneAutovehiculeClient);
		
		
	}
}
