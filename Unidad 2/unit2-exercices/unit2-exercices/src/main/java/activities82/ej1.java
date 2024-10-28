package activities82;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class ej1 {
    public static void main(String[] args) {
        try {
            SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
            saxParser.parse("contacts.xml", new myXMLContactsHandler());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}