package DAOLayer;

import ModelLayer.Entity.Place;

import java.util.List;

public interface IDAOPlace {

    void addPlace(Place newPlace);

    void addListPlace(List<Place> listPlace);

    Place getByIdPlace(int id);

    List<Place> getAlldPlace();

    void updatedPlace(Place changedPlace);

    void diactivedPlace (Place removedPlace);
}
