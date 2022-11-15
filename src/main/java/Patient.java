import java.io.Serializable;

public class Patient implements Serializable {
    private String name;
    private int id;
    private int phoneNumber;

    public Patient(String name, int id, int phoneNumber){
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }
}

