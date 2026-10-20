package Company.Persons.Clients;

import Company.Persons.Person;

public class Client extends Person {
    private String companyName;
    private String province;

    final String DEFAULT_COMPANY = "";
    final String DEFAULT_PROVINCE = "";

    public Client() {
        super();
        companyName = DEFAULT_COMPANY;
        province = DEFAULT_PROVINCE;
    }

    public Client(String name, int age, int ID, String companyName, String province) {
        super(name, age, ID);
        this.companyName = companyName;
        this.province = province;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
