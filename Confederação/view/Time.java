package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controle.ControleTime;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Time extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tSigla;
	private JTextField tDescricao;
	private ControleTime controleTime = new ControleTime();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Time frame = new Time();
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
	public Time() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Time");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 414, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sigla:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 66, 39, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Descrição:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 99, 58, 31);
		contentPane.add(lblNewLabel_2);
		
		tSigla = new JTextField();
		tSigla.setBounds(73, 71, 77, 20);
		contentPane.add(tSigla);
		tSigla.setColumns(10);
		
		tDescricao = new JTextField();
		tDescricao.setBounds(73, 104, 144, 20);
		contentPane.add(tDescricao);
		tDescricao.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar Time");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleTime.incluirTime(tSigla.getText(), tDescricao.getText());
				
				JOptionPane.showMessageDialog(null, "Time Cadastrado com sucesso");
				
				tSigla.setEnabled(false);
				tDescricao.setEnabled(false);
			}
		});
		btnNewButton.setBounds(143, 145, 144, 23);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 194, 414, 2);
		contentPane.add(separator);
		
		JLabel lblCadastroDeJogador = new JLabel("Cadastro de Jogador");
		lblCadastroDeJogador.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeJogador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCadastroDeJogador.setBounds(10, 194, 414, 31);
		contentPane.add(lblCadastroDeJogador);
		
		JLabel tNumero = new JLabel("Numero:");
		tNumero.setFont(new Font("Tahoma", Font.BOLD, 11));
		tNumero.setBounds(10, 237, 58, 31);
		contentPane.add(tNumero);
		
		JLabel tNome = new JLabel("Nome:");
		tNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		tNome.setBounds(10, 267, 58, 31);
		contentPane.add(tNome);
		
		JLabel tPosicao = new JLabel("Posição");
		tPosicao.setFont(new Font("Tahoma", Font.BOLD, 11));
		tPosicao.setBounds(10, 297, 58, 31);
		contentPane.add(tPosicao);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(73, 242, 77, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(73, 272, 77, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(73, 302, 77, 20);
		contentPane.add(textField_2);
		
		JButton btnCadastraJogador = new JButton("Cadastra Jogador");
		btnCadastraJogador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleTime.incluirJogador(Integer.parseInt(tNumero.getText()), tNome.getText(), tPosicao.getText());
			
				JOptionPane.showMessageDialog(null, "Jogador Cadstrado com sucesso");
				tNumero.setText("");
				tNome.setText("");
				tPosicao.setText("");
		
			}
		});
		btnCadastraJogador.setBounds(143, 331, 144, 23);
		contentPane.add(btnCadastraJogador);
	}
}

