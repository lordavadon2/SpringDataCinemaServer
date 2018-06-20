package DAOLayer;

import ModelLayer.Entity.Grade;

import java.util.List;

public interface IDAOGrade {


    void addGrade(Grade newGrade);

    Grade getByIdGrade(int id);

    List<Grade> getAlldGrade();

    void updatedGrade(Grade changedGrade);

    void diactivedGrade (Grade removedGrade);
}
