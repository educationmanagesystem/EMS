package shu.ems.service;

import shu.ems.model.Copen;

public class CopenService {
    public boolean insertCopen(Copen copen){
        return new CopenDAO().insertCopen(copen);
    }

    public boolean updateCopen(Copen copen){
        return new CopenDAO().updateCopen(copen);
    }

    public boolean deleteCopen(int id){
        return new CopenDAO().deleteCopen(id);
    }

    public Copen findCopenById(int id){
        // find in database
        return null;
    }

    public Copen findCopenByName(String name){
        // find in database
        return null;
    }
}
