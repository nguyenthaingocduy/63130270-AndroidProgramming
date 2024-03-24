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
	}

}
