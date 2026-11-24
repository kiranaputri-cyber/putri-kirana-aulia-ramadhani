public class Card {
    String suit, name;
    int points;

    Card(int n1, int n2) {
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
    }

    public String getSuit(int n) {
        switch (n) {
            case 1: return "Spades";
            case 2: return "Hearts";
            case 3: return "Diamonds";
            case 4: return "Clubs";
            default: return "Unknown";
        }
    }

    public String getName(int n) {
        switch (n) {
            case 1: return "Ace";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 10: return "Ten";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return "Unknown";
        }
    }

    public int getPoints(String cardName) {
        if (cardName.equals("Ace")) {
            return 11;
        } else if (cardName.equals("Jack") || cardName.equals("Queen") || cardName.equals("King")) {
            return 10;
        } else {
            switch (cardName) {
                case "Two": return 2;
                case "Three": return 3;
                case "Four": return 4;
                case "Five": return 5;
                case "Six": return 6;
                case "Seven": return 7;
                case "Eight": return 8;
                case "Nine": return 9;
                case "Ten": return 10;
                default: return 0;
            }
        }
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }
}