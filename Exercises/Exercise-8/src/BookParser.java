import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class BookParser {

    private static final String FILENAME = "test.xml";

    public static void main(String[] args) {

        // Instantiate the Factory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {


            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(FILENAME));


            System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
            System.out.println("------");

            // get <Book>
            NodeList list = doc.getElementsByTagName("Book");

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;

                    // get staff's attribute
                    String title = element.getAttribute("title");

                    // get text
                    String publishedYear = element.getElementsByTagName("publishedYear").item(0).getTextContent();
                    String numberOfPages = element.getElementsByTagName("numberOfPages").item(0).getTextContent();
                    String authors = element.getElementsByTagName("authors").item(0).getTextContent();

                    System.out.println("title :" + title);
                    System.out.println("publishedYear : " + publishedYear);
                    System.out.println("numberOfPages : " + numberOfPages);
                    System.out.println("authors : " + authors);

                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }

}