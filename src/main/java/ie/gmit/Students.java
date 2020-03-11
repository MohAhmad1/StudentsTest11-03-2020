package ie.gmit;

public class Students{
    private String name;
    private String email;

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public Students(String name, String email) {
        if (name == "" || email == "") {
            throw new IllegalArgumentException("Missing data");
        } else {
            this.name = name;
            this.email = email;
        }
    }
}

