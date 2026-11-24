public class Hand {
    private Card[] cards = new Card[5];
    private int cardCount = 0;

    public boolean addCard(Card c) {
        if (cardCount < cards.length && c != null) {
            cards[cardCount] = c;
            cardCount++;
            return true;
        }
        return false;
    }

    public int getCardCount() {
        return cardCount;
    }

    public int calculatePoints() {
        int total = 0;
        int aceCount = 0;

        for (int i = 0; i < cardCount; i++) {
            total += cards[i].points;
            if (cards[i].name.equals("Ace")) {
                aceCount++;
            }
        }

        // Jika total > 21 dan ada Ace bernilai 11, ubah Ace menjadi 1 (-10 poin per Ace)
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    public void showHand(String owner) {
        System.out.println("Kartu " + owner + ":");
        for (int i = 0; i < cardCount; i++) {
            System.out.println("  - " + cards[i]);
        }
        System.out.println("Total poin " + owner + ": " + calculatePoints());
    }
}