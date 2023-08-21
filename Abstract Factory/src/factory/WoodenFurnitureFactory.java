package factory;

import products.Chair;
import products.Table;
import products.WoodenChair;
import products.WoodenTable;

public class WoodenFurnitureFactory implements FurnitureFactory {
    @Override
    public Table createTable() {
        return new WoodenTable();
    }

    @Override
    public Chair createChair() {
        return new WoodenChair();
    }
}
