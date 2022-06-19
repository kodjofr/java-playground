package models;

public class Client extends Human{
    String client_membership;
    String city;
    Boolean hasLoan;


    public Client(String number,
                  String name,
                  String country,
                  String client_membership,
                  String city,
                  Boolean hasLoan) {
        super(number, name, country);
        this.client_membership = client_membership;
        this.city = city;
        this.hasLoan = hasLoan;
    }

    public String getClient_membership() {
        return client_membership;
    }

    public void setClient_membership(String client_membership) {
        this.client_membership = client_membership;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getHasLoan() {
        return hasLoan;
    }

    public void setHasLoan(Boolean hasLoan) {
        this.hasLoan = hasLoan;
    }
}
