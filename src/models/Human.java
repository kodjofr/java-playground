package models;

public class Human {
    String number;
    String name;
    String country;

    public Human(String number, String name, String country) {
        this.number = number;
        this.name = name;
        this.country = country;
    }

    public Human() {
        super();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    // string representation method

    @Override
    public String toString() {
        return "Human{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
