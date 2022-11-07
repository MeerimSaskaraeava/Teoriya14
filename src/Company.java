public class Company {
    private String name;
    private int createYear;

    public Company(String name, int age) {
        this.name = name;
        this.createYear = age;
    }
    public Company() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return createYear;
    }
    public void setAge(int age) {
        this.createYear = age;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", age=" + createYear +
                '}';
    }
}
