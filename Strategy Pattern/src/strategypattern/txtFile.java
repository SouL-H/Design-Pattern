// MEHMET https://github.com/SouL-H
package strategypattern;




import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
public class txtFile extends JFrame implements Communicate {
     public static String txt = "";
    @Override
    
    public void send() {
    
    JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
 
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Txt Dosyası", "txt"));
 
        fileChooser.setAcceptAllFileFilterUsed(false);
 
        int result = fileChooser.showOpenDialog(this);
 
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String abcd = selectedFile.getAbsolutePath();
            
             File file = new File(abcd);
        try {
            
            FileReader fileReader = new FileReader(file);
            String line;
            BufferedReader br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
            txt = line;
}
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
            
    }
}
}