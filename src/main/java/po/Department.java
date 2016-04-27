package po;

/**
 * Created by jinzil on 2016/4/25.
 */
public class Department {
    private String name;
    private String type;
    private int id;

    public Department(String name, String type,int id) {
        this.name = name;
        this.type = type;
        this.id=id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}