import java.util.Scanner;

public class Main {
    public static Card drawRandomCard() {
        int suitNumber = (int) (Math.random() * 4.0 + 1);
        int faceNumber = (int) (Math.random() * 13.0 + 1);
        return new Card(suitNumber, faceNumber);
    }

    public static int calculateHandPoints(Card[] hand, int count) {
        int total = 0;
        int aceCount = 0;

        for (int i = 0; i < count; i++) {
            total += hand[i].points;
            if (hand[i].name.equals("Ace")) {
                aceCount++;
            }
        }

        // Jika poin > 21 dan punya Ace (bernilai 11), ubah Ace menjadi 1 (-10 poin)
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Card[] hand = new Card[5];
        int cardCount = 0;

        // Soal 7: Dua kartu acak awal
        hand[cardCount++] = drawRandomCard();
        hand[cardCount++] = drawRandomCard();

        System.out.println("Kartu awal kamu:");
        for (int i = 0; i < cardCount; i++) {
            System.out.println("- " + hand[i] + " (" + hand[i].points + " poin)");
        }

        // Soal 8a: Total nilai poin dua kartu acak
        int totalPoints = calculateHandPoints(hand, cardCount);
        System.out.println("Total poin awal: " + totalPoints);

        // Soal 8b & 8c: Loop tambah kartu hingga poin > 21, jawab tidak, atau kartu mencapai 5
        while (totalPoints <= 21 && cardCount < 5) {
            System.out.print("Mau ambil kartu lagi? (ya/tidak): ");
            String answer = sc.next().trim().toLowerCase();

            if (!answer.equals("ya") && !answer.equals("y")) {
                break;
            }

            Card nextCard = drawRandomCard();
            hand[cardCount++] = nextCard;
            totalPoints = calculateHandPoints(hand, cardCount);

            System.out.println("\nKartu di Hand kamu sekarang (" + cardCount + " kartu):");
            for (int i = 0; i < cardCount; i++) {
                System.out.println("- " + hand[i]);
            }
            System.out.println("Total poin saat ini: " + totalPoints);
        }

        if (totalPoints > 21) {
            System.out.println("Poin kamu melebihi 21!");
        } else if (cardCount == 5) {
            System.out.println("Kamu sudah mencapai batas maksimal 5 kartu.");
        } else {
            System.out.println("Permainan selesai dengan total poin: " + totalPoints);
        }

        sc.close();
    }
}