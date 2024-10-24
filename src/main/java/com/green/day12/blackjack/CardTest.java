package com.green.day12.blackjack;

import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.checkCard();
        System.out.println("-------------------");
        Card c = cd.draw();
        System.out.println(c);
        System.out.println("-------------------");
        Card c2 = cd.draw();
        cd.checkCard();

        while (true) {
            Card draw = cd.draw();
            if(draw == null) {
                break;
            }
            System.out.println(cd.draw());
        }
    }
}

class CardTest2 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Card c1 = cd.draw();
        Gamer gamer = new Gamer();
        gamer.receiveCard(c1); //카드를 저장한다.
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.showYourCards();

        List<Card> list = gamer.openCards();
        System.out.println(list);
    }
}

class CardTest3 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.showYourCards();
    }
}