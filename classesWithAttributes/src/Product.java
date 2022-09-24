public class Product {

    public Product (int id, String name, String description, double price, int stockAmount, String color ) {
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.color = color;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }
    //overloading
    public Product () {

    }

    //attribute | field
    //private : sadece tanımlandığı blok içerisinde geçerli.
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    private  String color;

    private String kod;

    //getId: Ürünün id'sini sadece okuyaiblir, değiştiremez!..(Read-Only).
    public int getId() {
        return id;
    }

    //setId: Ürünün değerini gir, kur.
    //this: İçerisinde bulunan class demek.
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }
}
