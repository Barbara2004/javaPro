package lesson06.Cat;

import java.util.ArrayList;

public class Cats {
    private String name;
    private String address;

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cats(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Cats() {
    }
}
