package Librarys;

public class Author {


    int id;
    String name;
    String phone;
    String email;
    private static int idIncrementer = 0;

    public Author(String name, String phone, String email) {
        idIncrementer++;
        this.id = idIncrementer;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

}
