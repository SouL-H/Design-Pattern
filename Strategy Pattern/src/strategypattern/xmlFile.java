// MEHMET https://github.com/SouL-H
package strategypattern;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class xmlFile extends JFrame implements Communicate {

     public static String test1 = "";
     public static String test2 = "";
     public static String test3 = "";
     public static String test4 = "";
     public static String xml = "";
    @Override
    
    public void send() {
    
    JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
 
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Xml Dosyası", "xml"));

 
        fileChooser.setAcceptAllFileFilterUsed(false);
 
        int result = fileChooser.showOpenDialog(this);
	Document document = null;
        try {
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String abcd = selectedFile.getAbsolutePath();
            String path = abcd;
			document = getDocument(path);
		 }
        }
	catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println(ex.getMessage());
        }
		
	Element songs = document.getDocumentElement(); 
        String title= getSingleChildText(songs,"title");
        test1 = "Baslık : " + title;
        NodeList songList = songs.getElementsByTagName("song");

        for (int i = 0; i < songList.getLength(); i++) {
            Element song = (Element) songList.item(i);
           
            String artistNumber=song.getAttribute("number");

             String artistName = getSingleChildText(song, "artist");
             
             test2 += artistNumber+ "-" + artistName + "\n";
              

             NodeList trackList = song.getElementsByTagName("option");

            for (int j = 0; j < trackList.getLength(); j++) {
                Element option = (Element) trackList.item(j);
 
                test3 +="Sarki No: " + option.getAttribute("code") + " -" + option.getTextContent();
                
            }
            xml = test1+test2+test3;
            test4+="-------------------------------------------";
        }
                xml += test4; 
    }

 public static String getSingleChildText(Element element, String tagName) {
 
        String body = element.getElementsByTagName(tagName).item(0).getTextContent();
 
        return body;
 
    }
 
    public static Document getDocument(String uri) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(uri);
        return document;
    }
}