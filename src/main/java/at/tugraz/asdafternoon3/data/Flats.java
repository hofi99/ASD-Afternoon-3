package at.tugraz.asdafternoon3.data;

import at.tugraz.asdafternoon3.businesslogic.FlatCreator;

import java.util.ArrayList;
import java.util.HashMap;

public class Flats
{
    FlatCreator creator_ = new FlatCreator();
    HashMap<Integer,Flat> flats_ = new HashMap<Integer,Flat>();
    public Flats()
    {
        //loadFlatsFromDatabase();
    }

    public void loadFlatsFromDatabase()
    {

    }

    public void updateFlat(Flat flat) throws Exception
    {
        Flat return_value = flats_.replace(flat.getId(), flat);
        if (return_value == null)
        {
            throw new Exception("The flat to update does not exist");
        }
        //creator_.updateFlat(flat);
    }

    public Flat getFlatByID(int id)
    {
        //return creator_.getFlat(id);
        return null;
    }

    public void addFlat(Flat flat) throws Exception
    {
        creator_.validateFlat(flat);

        if (flats_.containsKey(flat.getId()))
        {
            throw new Exception("Flat ID is already used");
        }

        flats_.put(flat.getId(), flat);
        creator_.createFlat(flat);
    }

}
