package lesson04;

public class Main {
    public static void main(String[] args) {
        Ocean octopus = new Ocean();
        Ocean whaleShark = new Ocean();
        Ocean stingray = new Ocean();
        Ocean whiteShark = new Ocean();

        octopus.setName("Gloria");
        octopus.setAge(2);
        octopus.setWeight(1);
        octopus.setHabitat("California");

        whaleShark.setName("Alex");
        whaleShark.setAge(70);
        whaleShark.setWeight(3000.5);
        whaleShark.setHabitat("Indian Ocean");

        stingray.setName("Mel'man");
        stingray.setAge(8);
        stingray.setWeight(1230.73);
        stingray.setHabitat("Gulf stream");

        whiteShark.setName("Alex");
        whiteShark.setAge(70);
        whiteShark.setWeight(3000.5);
        whiteShark.setHabitat("Indian Ocean");

        System.out.println(whiteShark.equals(whaleShark));
        System.out.println(whiteShark.hashCode());
        System.out.println(whaleShark.hashCode());

        System.out.println(octopus.equals(stingray));
        System.out.println(octopus.hashCode());
        System.out.println(stingray.hashCode());


    }
}
