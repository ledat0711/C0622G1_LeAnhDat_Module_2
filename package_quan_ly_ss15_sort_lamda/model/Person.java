package package_quan_ly_ss15.model;

public abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(int id, String name, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getID() {
        return id;
    }

    public void setID(int iD) {
        this.id = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return " Mã số ID=" + id +
                ", tên='" + name + '\'' +
                ", ngày sinh='" + dateOfBirth + '\''
                ;
    }
}
