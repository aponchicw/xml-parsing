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
public class Offers implements OffersInt {
    private List<Offer> offer;

    @Override
    public List<Offer> getOffer() {
        return offer;
    }

    @Override
    public Offer getOfferById(int i) {
        return offer.get(i);
    }
}
