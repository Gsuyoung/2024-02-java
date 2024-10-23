package com.green.day12.blackjack;

public class CardDeck {
    //Card 객체 주소값 52개를 저장할 수 있어야 한다.
    private final Card[] cards;
    private final String[] patterns;
    private int selectedIdx = 0; // 외부에 줘야할 카드의 index값

    public CardDeck() {
        cards = new Card[52];
        patterns = new String[]{"Diamond", "Heart", "Clova", "Spade"};

        //미션1 "", "" 값을 가지고 있는 Card객체를 52개를 만들어주시고 cards배열에 하나씩 넣어주세요.
       int idx = 0;
       for (int i = 0; i < patterns.length; i++) { //0,1,2,3
           String pattern = patterns[i];
           for (int j = 1; j <= 13; j++) { //1~13
               String denomination = getDenomination(j);
               cards[idx++] = new Card(pattern,denomination);

               //cards[idx++] = new Card(patterns[i], getDenomination(j));
           }
        }
       /* 섞어주세요.
        Card temp;
        for (int i = 0; i < cards.length; i++) {
            int Ridx = (int)(Math.random()* cards.length);
            temp = cards[i];
            cards[i] = cards[Ridx];
            cards[Ridx] = temp;
        }
        */
    }

    private void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int ridx = (int)(Math.random() * cards.length); //0 ~ 51
            Card tmp = cards[i];
            cards[i] = cards[ridx];
            cards[ridx] = tmp;
        }
    }

    public String getDenomination(int n) {
        if (n == 1) {
            return "A";
        } else if (n == 11) {
            return "J";
        } else if (n == 12) {
            return "Q";
        } else if (n == 13) {
            return "K";
        } else if (n < 1 || n > 13) {
            return "";
        } else {
            return String.valueOf(n);
        }
    }
    //주소값 하나씩 리턴, 리턴 주소값 지워야되고, selectedIdx 이용하여 해결
   public Card draw() {
        Card c = cards[selectedIdx];
        cards[selectedIdx] = null;
        selectedIdx++;
        return c;
        }

   public void checkCard() {
        for(Card c : cards) {
            System.out.println(c);
        }
   }
}