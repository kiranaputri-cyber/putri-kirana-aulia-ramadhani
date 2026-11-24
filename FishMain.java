public class FishMain {
    public static void main(String[] args) {
        // Soal 6: Inisialisasi dua ikan baru
        Fish amber = new Fish("Amber", "AngelFish", 5);
        Fish james = new Fish("James", "Guppy", 3);

        // Soal 7 & 9: Uji nicestFish(Fish, Fish)
        Fish mostFriendlyTwo = Fish.nicestFish(amber, james);
        System.out.println("Hasil perbandingan dua ikan: " + mostFriendlyTwo);

        // Soal 8 & 9: Uji nicestFish(Fish...) dengan varargs
        Fish nemo = new Fish("Nemo", "Clownfish", 4);
        Fish mostFriendlyMany = Fish.nicestFish(amber, james, nemo);
        System.out.println("Hasil perbandingan banyak ikan: " + mostFriendlyMany);
    }
}