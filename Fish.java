public class Fish {
    // Soal 1: Instance variable (tanpa nilai awal langsung)
    public String name;
    public String typeOfFish;
    public int friendliness;

    // Soal 2: Constructor tanpa argumen
    public Fish() {
        this.name = "Unnamed";
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    // Soal 3: Constructor dengan parameter String t dan int f
    public Fish(String t, int f) {
        this.name = "Unnamed";
        this.typeOfFish = t;
        this.friendliness = f;
    }

    // Constructor tambahan untuk menyertakan nama ikan (memudahkan soal 6 & 9)
    public Fish(String name, String t, int f) {
        this.name = name;
        this.typeOfFish = t;
        this.friendliness = f;
    }

    // Soal 5: Mengembalikan tingkat keramahan ikan
    public int getFriendliness() {
        return friendliness;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfFish() {
        return typeOfFish;
    }

    // Soal 7: Membandingkan dua ikan dan mengembalikan yang lebih ramah
    public static Fish nicestFish(Fish first, Fish second) {
        if (second.getFriendliness() > first.getFriendliness()) {
            return second;
        }
        return first;
    }

    // Soal 8: Variable argument method (varargs) untuk mencari ikan paling ramah
    public static Fish nicestFish(Fish... fishes) {
        if (fishes == null || fishes.length == 0) {
            return null;
        }
        Fish temp = fishes[0];
        for (int i = 1; i < fishes.length; i++) {
            if (fishes[i].getFriendliness() > temp.getFriendliness()) {
                temp = fishes[i];
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        return name + " (" + typeOfFish + ", keramahan: " + friendliness + ")";
    }
}