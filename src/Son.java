public class Son extends Company{
    private String game;

    public Son(String name, int createYear,String game) {
        super(name,createYear );
        this.game=game;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Son{" +
                "game='" + game + '\'' +
                '}'+super.toString();
    }
}
