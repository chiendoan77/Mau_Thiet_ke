package a.b;

public class CandyFactory {

    public static Candy createCandy(String type) {

        switch (type.toLowerCase()) {
            case "chocolate":
                return new Chocolate();
            case "lollipop":
                return new Lollipop();
            default:
                throw new IllegalArgumentException("Unknown candy type");
        }
    }
}