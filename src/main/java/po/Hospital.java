package po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Koche on 2016/5/10.
 * 医院的Pure Object
 */
@Entity
public class Hospital {
    private long ID;
    private String name;
    private String description;
    private Set<Department> departments = new HashSet<>(10);
    private List<Order> orders = new ArrayList<>(10);

    public Hospital() {
    }

    @Id
    @GeneratedValue
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "hospital")
    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "hospital")
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}


