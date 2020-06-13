// MEHMET https://github.com/SouL-H
package strategypattern;


import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
public class pdfFile extends JFrame implements Communicate {
     public static String pdf = "";
    @Override
    
    public void send() {
    
    JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
 
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("PDF Dosyası", "pdf"));
 
        fileChooser.setAcceptAllFileFilterUsed(false);
 
        int result = fileChooser.showOpenDialog(this);
 
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String abcd = selectedFile.getAbsolutePath();
            
                PdfReader reader;

        try {

            reader = new PdfReader(abcd);

            String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);
            pdf= textFromPage;
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
            
    }
}
}




