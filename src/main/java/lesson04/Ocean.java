package lesson04;

public class Ocean {
    private String name;
    private double weight;
    private String habitat;
    private int age;

    public Ocean(String name, double weight, String habitat, int age) {
        this.name = name;
        this.weight = weight;
        this.habitat = habitat;
        this.age = age;
    }

    public Ocean() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + (int) weight;
        result = prime * result + ((habitat == null) ? 0 : habitat.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Ocean anyFish = (Ocean) obj;
        return age == anyFish.age && weight == anyFish.weight && (name == anyFish.name || (name != null && name.equals(anyFish.getName()))) &&
                (habitat == anyFish.habitat || (habitat != null && habitat.equals(anyFish.getHabitat())));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                '}';
    }
}
