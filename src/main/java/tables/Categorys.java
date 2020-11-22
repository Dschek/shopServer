package tables;

import javax.persistence.*;

@Entity
@Table(name="category")
public class Categorys extends  Model{
    @Column(name="name")
    private String name;
    @Column(name="parentId")
    private int parentId;

    public Categorys(){}

    public Categorys(String name, int parentId) {
        this.name = name;
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Category{" +
                super.toString()+
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
