package activities82;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class myXMLContactsHandler extends DefaultHandler {
    private String tagContent;
    private String name;
    private String surname;
    private String cellPhone;
    private String workPhone;
    private String homePhone;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("contact")) {
            // Reset contact information at the start of each <contact> element
            name = null;
            surname = null;
            cellPhone = null;
            workPhone = null;
            homePhone = null;
        }
    }

    public void characters(char ch[], int start, int length) throws SAXException {
        tagContent = new String(ch, start, length).trim();
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "name" -> name = tagContent;
            case "surname" -> surname = tagContent;
            case "cell" -> cellPhone = tagContent;
            case "work" -> workPhone = tagContent;
            case "home" -> homePhone = tagContent;
            case "contact" -> {
                String fullName = (name != null ? name : "") + " " + (surname != null ? surname : "");
                String phoneNumber = cellPhone != null ? cellPhone : (workPhone != null ? workPhone : homePhone);

                System.out.println("Contact: " + fullName);
                if (phoneNumber != null) {
                    System.out.println("Phone: " + phoneNumber);
                } else {
                    System.out.println("Phone: Not available");
                }
                System.out.println();
            }
        }
    }
}


