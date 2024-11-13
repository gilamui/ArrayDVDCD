package Persewaan;

public class dvdarray {
    public static void main(String[] args) {
        Product[] produk = new Product[10];
        CD[] c = new CD[5];
        produk[0] = new Product();
        produk[0].print();
        c[4] = new CD(1, "Friend", 12, 200, "Bruno Mars", 10, "Sony Music");
        produk[1] = new Product(1, "Table", 2, 20.5);
        produk[1].print();
        c[4].print();
    }
}
