package imc;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Imc extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JLabel lblResultado;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imc frame = new Imc();
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
	public Imc() {
		setResizable(false);
		setTitle("IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 352);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// botão sobre
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "IMC ver 1.0\nAutor: José de Assis", "Sobre",
						JOptionPane.DEFAULT_OPTION);
			}
		});
		btnSobre.setBounds(0, 0, 89, 23);
		contentPane.add(btnSobre);

		JLabel lblNewLabel = new JLabel("Peso");
		lblNewLabel.setBounds(25, 62, 48, 14);
		contentPane.add(lblNewLabel);

		txtPeso = new JTextField();
		txtPeso.setBounds(76, 59, 96, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setBounds(25, 105, 48, 14);
		contentPane.add(lblNewLabel_1);

		txtAltura = new JTextField();
		txtAltura.setBounds(76, 102, 96, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setToolTipText("Calcular IMC");
		btnCalcular.setIcon(new ImageIcon(Imc.class.getResource("/icones/imc.png")));
		btnCalcular.setBounds(25, 160, 64, 64);
		contentPane.add(btnCalcular);

		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setIcon(new ImageIcon(Imc.class.getResource("/icones/borracha.png")));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setBounds(108, 160, 64, 64);
		contentPane.add(btnLimpar);

		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblResultado.setBounds(57, 245, 115, 48);
		contentPane.add(lblResultado);

		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(Imc.class.getResource("/icones/imc0.png")));
		lblStatus.setBounds(207, 11, 150, 300);
		contentPane.add(lblStatus);
	}// fim do construtor

	// método para calcular o IMC
	void calcular() {
		DecimalFormat formatador = new DecimalFormat("#0.00");
		double peso, altura, imc;
		// entrada
		peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
		altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
		// processamento
		imc = peso / (altura * altura);
		// saída
		lblResultado.setText("" + formatador.format(imc));
		// status
		if (imc < 17) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc1.png")));
		} else if (imc < 18.5) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc2.png")));
		} else if (imc < 25) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc3.png")));
		} else if (imc < 30) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc4.png")));
		} else if (imc < 35) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc5.png")));
		} else if (imc < 40) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc6.png")));
		} else {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc7.png")));
		}
	}

	// método para limpar os campos e definir imagem default
	void limpar() {
		lblResultado.setText(null);
		txtPeso.setText(null);
		txtAltura.setText(null);
		lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/imc0.png")));
	}

}
