import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class DarbsArFailu {
	
	static String failaNosaukums = "pasutijumu_vesture.txt";
	
	public static void saglabatPasutijumu(String pasutijums) {
		try (FileWriter fw = new FileWriter(failaNosaukums, true);
			 PrintWriter pw = new PrintWriter(fw)) {
			
			pw.println(pasutijums);
			pw.println("----------------------------------------");
			
			
		} catch(IOException e){
			JOptionPane.showMessageDialog(null, "Kļūda ierakstot failā.", "Kļūda", JOptionPane.ERROR_MESSAGE);
	}
}
	
	public static String nolasit() {
		StringBuilder teksts =new StringBuilder();
		File fails = new File(failaNosaukums);
		
		if (!fails.exists()) {
			return "Fails neeksistē.";
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(fails))) {
			String rinda;
			while ((rinda = br.readLine()) != null) {
				teksts.append(rinda).append("\n");
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Kļūda lasot failu.", "Kļūda", JOptionPane.ERROR_MESSAGE);
		}
		
		return teksts.length() == 0 ? "Nav saglabātu pasūtījumu." : teksts.toString();
	}
	
	public static void iztiritVesturi() {
		try (FileWriter fw = new FileWriter(failaNosaukums, false)) {
			JOptionPane.showMessageDialog(null, "Vēsture veiksmīgi izdzēsta.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Kļūda tīrot failu.", "Kļūda", JOptionPane.ERROR_MESSAGE);
		}
	}
}