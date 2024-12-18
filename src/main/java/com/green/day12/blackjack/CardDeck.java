package com.green.day12.blackjack;

public class CardDeck {
    //Card 객체 주소값 52개를 저장할 수 있어야 한다.
    private final Card[] cards;
    private final String[] patterns; //기본적으로 디폴트 값인 null이 들어가있음
    private int selectedIdx = 0; // 외부에 줘야할 카드의 index값

    public CardDeck() {
        cards = new Card[52];
        patterns = new String[]{"Diamond", "Heart", "Clova", "Spade"};

        int idx = 0;
        for (int i = 0; i < patterns.length; i++) { //0,1,2,3
            String pattern = patterns[i];//4번반복
            for (int j = 1; j <= 13; j++) { //1~13
                String denomination = getDenomination(j); //52번반복
                cards[idx++] = new Card(pattern, denomination);

                //cards[idx++] = new Card(patterns[i], getDenomination(j));
            }
        }
       /* 섞어주세요.(랜덤, 스와핑)
        Card temp;
        for (int i = 0; i < cards.length; i++) {
            int Ridx = (int)(Math.random()* cards.length);
            temp = cards[i];
            cards[i] = cards[Ridx];
            cards[Ridx] = temp;
        }
        */
        shuffle();
    }

    private void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int ridx = (int) (Math.random() * cards.length); //0 ~ 51
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
        if(selectedIdx == (cards.length)) {
            return null;
        }
            Card tmp = cards[selectedIdx];
            cards[selectedIdx] = null;
            selectedIdx++;
            return tmp;
        }
        public void checkCard () {
            for (Card c : cards) {
                System.out.println(c);
            }
        }
    }