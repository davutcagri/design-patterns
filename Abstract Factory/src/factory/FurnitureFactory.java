package factory;

import products.Chair;
import products.Table;

public interface FurnitureFactory {
    Table createTable();
    Chair createChair();
}
