package demo.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int phn;
    public int getPhn() {
        return phn;
    }
    public void setPhn(int phn) {
        this.phn = phn;
    }
    
}
