package at.tugraz.asdafternoon3.data;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "flats")
public class Flat {
    @DatabaseField()
    private String name;

    // TODO
    private int size;

    @DatabaseField()
    private String address;

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField()
    private boolean is_current;

    public Flat() {
        this.name = "";
        this.size = 0;
        this.address = "";
        this.id = 0;
        this.is_current = false;
    }

    public Flat(String name, int size, String address) {
        this.name = name;
        this.size = size;
        this.address = address;
        this.is_current = false;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isCurrent() {
        return is_current;
    }

    public void setIsCurrent(boolean state) {
        is_current = state;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }
}
