public class Daughter extends  Company{
    private String toy;

    public Daughter(String name, int createYear, String toy) {
        super(name, createYear);
        this.toy = toy;
    }

    @Override
    public String toString() {
        return "Daughter{" +
                "toy='" + toy + '\'' +
                '}'+super.toString();
    }
}
