package com.example.xmlparsing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@XmlRootElement
public class Offer implements OfferInt {
    private String model;
    private String brand;
    private List<Availabilities> availabilities;
    private int price;
    private String available;

    @Override
    public String toString() {
        return "offer: {" +
                "model: '" + model + '\'' +
                ", brand: '" + brand + '\'' +
//                ", availabilities=" + getAvailabilityStatus(i) +
                ", availabilities=" + availabilities +
                ", price: " + price +
                '}';
    }

    @Override
    public List<Availabilities> getAvailabilities() {
        return availabilities;
    }

    @Override
    public Availabilities getAvailabilityById(int i) {
        return availabilities.get(i);
    }
//    @Override
//    public String getAvailabilityStatus(int i) {
//        String storeId = null;
//        try {
//            File file = new File("/home/altyn/Desktop/spring/xml-parsing/src/main/resources/kaspi2.xml");
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//
//            Document document = builder.parse(file);
//
//            document.getDocumentElement().normalize();
//
//            NodeList nList = document.getElementsByTagName("availability");
//            System.out.println(nList.getLength());
//
//            int limit = availabilities.size();
//
//            for (int temp = 0; temp < limit; temp++)
//            {
//                Node node = nList.item(temp);
//                System.out.println("");    //Just a separator
//                if (node.getNodeType() == Node.ELEMENT_NODE)
//                {
//                    //Print each employee's detail
//                    Element eElement = (Element) node;
//                    System.out.println("Available : "    + eElement.getAttribute("available"));
//                    System.out.println("Store ID : "    + eElement.getAttribute("storeId"));
//                    System.out.println("=================");
//                }
//            }
//
////            available = eElement.getAttribute("available");
////            storeId = element.getAttribute("storeId");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return available + " " + storeId;
//    }
}
