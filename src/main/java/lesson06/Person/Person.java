package lesson06.Person;

public class Person {
    private String name;
    private int age;
    private boolean driversLicense;
    private int dayOfLastFine;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", driversLicense=" + driversLicense +
                ", dayOfLastFine=" + dayOfLastFine +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public int getDayOfLastFine() {
        return dayOfLastFine;
    }

    public void setDayOfLastFine(int dayOfLastFine) {
        this.dayOfLastFine = dayOfLastFine;
    }

    public Person(String name, int age, boolean driversLicense, int dayOfLastFine) {
        this.name = name;
        this.age = age;
        this.driversLicense = driversLicense;
        this.dayOfLastFine = dayOfLastFine;
    }

    public Person() {
    }
}
