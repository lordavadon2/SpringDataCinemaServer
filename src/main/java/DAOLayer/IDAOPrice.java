package DAOLayer;

import ModelLayer.Entity.Price;

import java.util.List;

public interface IDAOPrice {
    void addPrice(Price newPrice);

    Price getByIdPrice(int id);

    List<Price> getAllPrice();

    void updatePrice(Price changedPrice);

    void diactivedPrice (Price removedPrice);
}
