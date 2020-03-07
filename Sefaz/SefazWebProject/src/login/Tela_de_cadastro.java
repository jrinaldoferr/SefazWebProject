package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.management.monitor.StringMonitor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Tela_de_cadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2843056639438256402L;
	private JPanel contentPane;
	private JTextField tfCPF;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfSenha;
	private JTextField tfTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_de_cadastro frame = new Tela_de_cadastro();
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
	public Tela_de_cadastro() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		setResizable(false);
		
		JComboBox comboBox = new JComboBox();
		getContentPane().add(comboBox, BorderLayout.CENTER);
		
		JComboBox comboBox_1 = new JComboBox();
		getContentPane().add(comboBox_1, BorderLayout.NORTH);
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Arial", Font.BOLD, 16));
		lblCpf.setHorizontalAlignment(SwingConstants.LEFT);
		lblCpf.setBounds(23, 37, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblUsuario = new JLabel("Nome");
		lblUsuario.setFont(new Font("Arial", Font.BOLD, 16));
		lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsuario.setBounds(23, 81, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.BOLD, 16));
		lblSenha.setBounds(23, 159, 67, 14);
		contentPane.add(lblSenha);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(100, 36, 160, 20);
		contentPane.add(tfCPF);
		tfCPF.setColumns(10);
		
		tfNome = new JTextField();
		tfNome.setBounds(100, 80, 160, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(100, 118, 160, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfSenha = new JTextField();
		tfSenha.setBounds(100, 158, 160, 20);
		contentPane.add(tfSenha);
		tfSenha.setColumns(10);
		
		tfTelefone = new JTextField();
		tfTelefone.setBounds(100, 198, 160, 20);
		contentPane.add(tfTelefone);
		tfTelefone.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 16));
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setBounds(23, 116, 67, 20);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Arial", Font.BOLD, 16));
		lblTelefone.setBounds(23, 199, 67, 14);
		contentPane.add(lblTelefone);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "A\u00E7\u00F5es:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 287, 506, 75);
		contentPane.add(panel);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(tfCPF.getText().equals("") || tfNome.getText().equals("") || tfEmail.getText().equals("") || 
						tfSenha.getText().equals("") || tfTelefone.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Usuario/senha em branco!");
				}
				else
				{
				
				try {
					
					Connection con = Conexao.faz_Conexao();
					String sql = "insert into usuario ( CPF, Nome, email, senha, telefone, tipo) values (?, ?, ?, ?, ?, ?,) ";
					
					PreparedStatement stmt = con.prepareStatement(sql);
					
					stmt.setString(1, tfCPF.getText());
					stmt.setString(2, tfNome.getText());
					stmt.setString(3, tfEmail.getText());
					stmt.setString(4, tfSenha.getText());
					stmt.setInt(5, tfTelefone.getText());
					stmt.setString(6, tftipo.);
					
					stmt.execute();
					
					stmt.close();
					con.close();
					JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
					
					tfCPF.setText("");
					tfNome.setText("");
					tfEmail.setText("");
					tfSenha.setText("");
					tfTelefone.setText("");
					tfTipo.
					
					
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
								
			}
		});
		btnSalvar.setBackground(Color.BLUE);
		btnSalvar.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnSalvar);
		
		JComboBox BoxFone = new JComboBox();
		BoxFone.setToolTipText("");
		BoxFone.setBounds(378, 198, 138, 33);
		contentPane.add(BoxFone);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTipo.setFont(new Font("Arial", Font.BOLD, 16));
		lblTipo.setBounds(289, 198, 67, 20);
		contentPane.add(lblTipo);
	}
}
