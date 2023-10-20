package HW2;

public class Main {
    public static void main(String[] args) {
        Human humann = new Human();
        humann.name = "Сергей";
        Market market = new Market();
        market.acceptToMarket(humann);
        market.takeQueue(humann);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromMarket(humann);
        market.releaseFromQueue(humann);
    }
}
