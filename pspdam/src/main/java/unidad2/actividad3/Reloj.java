package unidad2.actividad3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Reloj extends JFrame implements Runnable{
	
	private static final long serialVersionUID = 1L;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	private JLabel hora;
	
	public Reloj() {
	    super("Reloj");

	    hora = new JLabel();

	    hora.setBorder(BorderFactory.createCompoundBorder(
	        BorderFactory.createEmptyBorder(70, 70, 70, 70),
	        hora.getBorder()
	    ));
	    hora.setFont(hora.getFont().deriveFont(30f));
	    hora.setHorizontalAlignment(JLabel.CENTER);

	    getContentPane().add(hora);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    pack();
	    setLocationRelativeTo(null);
	}
	
	private void iniciar() {
		// TODO Auto-generated method stub
		setVisible(true);
		new Thread(this, "segundero").start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Runnable actualizarHora = new Runnable() {
			public void run() {
			hora.setText(formatter.format(LocalDateTime.now()));
			}
			};
			while (true) {
			SwingUtilities.invokeLater(actualizarHora);
			try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {}
			}
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
			new Reloj().iniciar();
			}
			});
	}
	
}
