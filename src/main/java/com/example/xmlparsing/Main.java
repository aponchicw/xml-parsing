package com.example.xmlparsing;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("/home/altyn/Desktop/spring/xml-parsing/src/main/resources/kaspi2.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(KaspiCatalog.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            KaspiCatalog catalog = (KaspiCatalog) unmarshaller.unmarshal(file);
            List<Offer> offer = catalog.getOffers().getOffer();

            // get document builder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // build document
            Document document = builder.parse(file);

            // normalize the XML structure;
            document.getDocumentElement().normalize();

            // root node
            Element root = document.getDocumentElement();

            NodeList offerNodeList = document.getElementsByTagName("offer");
//            System.out.println(offerNodeList.getLength());

            for(int i = 0; i <= offerNodeList.getLength()-1; i++){
                Node oneOffer = offerNodeList.item(i);
                Element eElement = (Element) oneOffer;
                System.out.println(eElement.getElementsByTagName("model").item(0).getTextContent());
                System.out.println(eElement.getElementsByTagName("brand").item(0).getTextContent());

                for(int j = 0; j < eElement.getElementsByTagName("availability").getLength(); j++){
                    System.out.println(eElement.getElementsByTagName("availability").item(j).getAttributes().item(0));
                    System.out.println(eElement.getElementsByTagName("availability").item(j).getAttributes().item(1));
                }
                System.out.println(eElement.getElementsByTagName("price").item(0).getTextContent());
                System.out.println("================================");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


