package a.b;
public class Main {
    public static void main(String[] args) {

        CandyStore store = new CandyStore();

        Candy candy1 = store.orderCandy("chocolate");
        candy1.pack();

        Candy candy2 = store.orderCandy("lollipop");
        candy2.pack();
    }
}