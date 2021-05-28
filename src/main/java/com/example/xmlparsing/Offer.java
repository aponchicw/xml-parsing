package com.example.xmlparsing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
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

    @Override
    public String toString() {
        return "Offer{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", availabilities=" + availabilities.toString()+
                ", price=" + price +
                '}';
    }

    @Override
    public List<Availabilities> getAvailability() {
        return availabilities;
    }
}
