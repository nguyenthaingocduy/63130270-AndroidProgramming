package ntu63130270.Cau1_AppBMI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class AppBMI_GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel khungNoiDung;
	private JTextField chiSoChieuCao;
	private JTextField chiSoCanNang;
	private JTextField chiSoBMI;
	//-----------------------------------------------------------------
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppBMI_GUI frame = new AppBMI_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//-------------------------------------------------------------------
	
	//-------------------------------------------------------------------
	public AppBMI_GUI() {_
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 603);
		khungNoiDung = new JPanel();
		khungNoiDung.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(khungNoiDung);
		khungNoiDung.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(0, 0, 401, 102);
		khungNoiDung.add(panel);
		panel.setLayout(null);
		
		JLabel lbNewLabel = new JLabel("Chỉ số khối cơ thể bmi");
		lbNewLabel.setForeground(new Color(0, 0, 0));
		lbNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lbNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 34));
		lbNewLabel.setBounds(41, 17, 322, 45);
		panel.add(lbNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 182, 193));
		panel_1.setBounds(0, 103, 401, 213);
		khungNoiDung.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbNewLabel_1 = new JLabel("Cân nặng (kg):");
		lbNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lbNewLabel_1.setBounds(39, 70, 89, 16);
		panel_1.add(lbNewLabel_1);
		
		
		JLabel lbNewLabel_2 = new JLabel("Chiều cao (m):");
		lbNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lbNewLabel_2.setBounds(39, 31, 78, 16);
		panel_1.add(lbNewLabel_2);
		
		JLabel lbNewLabel_3 = new JLabel("BMI =");
		lbNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lbNewLabel_3.setBounds(19, 92, 139, 50);
		panel_1.add(lbNewLabel_3);
		
		chiSoChieuCao = new JTextField();
		chiSoChieuCao.setBounds(219, 26, 130, 26);
		panel_1.add(chiSoChieuCao);
		chiSoChieuCao.setColumns(10);
		
		chiSoCanNang = new JTextField();
		chiSoCanNang.setBounds(219, 65, 130, 26);
		panel_1.add(chiSoCanNang);
		chiSoCanNang.setColumns(10);
		
		chiSoBMI = new JTextField();
		chiSoBMI.setBounds(219, 98, 130, 44);
		panel_1.add(chiSoBMI);
		chiSoBMI.setColumns(10);
		
		JLabel status = new JLabel("");
		status.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		status.setHorizontalAlignment(SwingConstants.CENTER);
		status.setBounds(204, 143, 145, 26);
		panel_1.add(status);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double iCanNang = Double.parseDouble(chiSoCanNang.getText());
				double iChieuCao = Double.parseDouble(chiSoChieuCao.getText());
				double iBMI = iCanNang / (iChieuCao * iChieuCao);
				
				String cal_BMI = String.format("%.2f", iBMI);
				chiSoBMI.setText(cal_BMI);
				if (iBMI <= 18.5) {
					chiSoBMI.setOpaque(true);
					chiSoBMI.setBackground(Color.blue);
					status.setForeground(Color.blue);
					status.setText("Suy dinh dưỡng");
				}else if(iBMI <= 24.9) {
					chiSoBMI.setOpaque(true);
					chiSoBMI.setBackground(Color.yellow);
					status.setForeground(Color.yellow);
					status.setText("Thừa cân");
				}else if(iBMI >= 30) {
					chiSoBMI.setOpaque(true);
					chiSoBMI.setBackground(Color.red);
					status.setForeground(Color.red);
					status.setText("Béo phì");
				}
			}
				
				
		
	}

}
