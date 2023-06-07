
class Product {
    String name;
    double price;
    int quantity;
    static int totalSold;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            totalSold += quantity;
            System.out.println(quantity + " " + name + "(s) sold successfully.");
        } else {
            System.out.println("Insufficient quantity of " + name + " to sell.");
        }
    }

    public static int getTotalSold() {
        return totalSold;
    }
}

