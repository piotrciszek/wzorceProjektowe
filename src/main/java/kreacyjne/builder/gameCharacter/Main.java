package kreacyjne.builder.gameCharacter;

public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter.Builder()
                .setHealth(90)
                .setName("Piotr")
                .build();

        System.out.println(gameCharacter);
    }

}
