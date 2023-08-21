package factory;

import products.Chair;
import products.PlasticChair;
import products.PlasticTable;
import products.Table;

public class PlasticFurnitureFactory implements FurnitureFactory{
    @Override
    public Table createTable() {
        return new PlasticTable();
    }

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }
}
