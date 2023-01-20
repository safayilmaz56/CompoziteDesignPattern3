public class Product implements ICatalogComponent{

    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public void drawHierarchy() {
        System.out.println(name);
    }
}
