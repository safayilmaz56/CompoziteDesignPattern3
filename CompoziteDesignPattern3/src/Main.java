public class Main {
    public static void main(String[] args) {

        ProductCatalog items = new ProductCatalog("Urunler");
        ProductCatalog phones = new ProductCatalog("Telefonlar");
        ProductCatalog iphone = new ProductCatalog("İphone telefonlar");
        ProductCatalog samsung = new ProductCatalog("Samsung telefonlar");

        Product iphone5Item = new Product("İphone 5 telefon");
        Product samsungGalaxyİtem = new Product("Samsung galaxy telefon");

        items.add(phones);
        phones.add(iphone);
        phones.add(samsung);

        iphone.add(iphone5Item);
        samsung.add(samsungGalaxyİtem);

        items.drawHierarchy();
    }
}