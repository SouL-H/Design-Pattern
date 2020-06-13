// MEHMET https://github.com/SouL-H
package strategypattern;



import java.io.*;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javax.swing.filechooser.FileNameExtensionFilter;
public class docxFile extends JFrame implements Communicate {
     public static String docx = "";
    @Override
    
    public void send() {
    
    JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
 

      fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Office Documents", "docx"));
 
        fileChooser.setAcceptAllFileFilterUsed(false);
 
        int result = fileChooser.showOpenDialog(this);
 
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String abcd = selectedFile.getAbsolutePath();
            
                

        try {
            FileInputStream fis = new FileInputStream(abcd);            
            XWPFWordExtractor oleTextExtractor =new XWPFWordExtractor(new XWPFDocument(fis));
            docx = oleTextExtractor.getText();            
        } catch (Exception e) {
                e.printStackTrace();
        }
            
    }
}
}




