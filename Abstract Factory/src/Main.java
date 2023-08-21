import factory.FurnitureFactory;
import factory.PlasticFurnitureFactory;
import factory.WoodenFurnitureFactory;
import products.Chair;
import products.Table;

public class Main {
    public static void main(String[] args) {

        FurnitureFactory woodenFactory = new WoodenFurnitureFactory();
        Table woodenTable = woodenFactory.createTable();
        Chair woodenChair = woodenFactory.createChair();
        woodenTable.create();
        woodenChair.create();

        FurnitureFactory plasticFactory = new PlasticFurnitureFactory();
        Table plasticTable = plasticFactory.createTable();
        Chair plasticChair = plasticFactory.createChair();
        plasticTable.create();
        plasticChair.create();

    }
}
