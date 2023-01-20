import java.util.ArrayList;
import java.util.List;

public class ProductCatalog implements ICatalogComponent{

    private String name;
    private List<ICatalogComponent> catalogList;

    public ProductCatalog(String name) {
        this.name = name;
        catalogList = new ArrayList<>();
    }

    public void add(ICatalogComponent catalog){
        catalogList.add(catalog);
    }
    public void remove(ICatalogComponent catalog){
        catalogList.remove(catalog);
    }

    @Override
    public void drawHierarchy() {
        System.out.println(name);
        for(ICatalogComponent component : catalogList){
            component.drawHierarchy();
        }
    }
}
