package govardhan.springbootkafka.payload;


// This class is to send the data from producers to consumers while sending from producers to consumers we have to convert the payload/model/bins java object to JSON object. and vice versa to consumers.
//POJO = Plain Old Java Object
public class User {

    private int id;
    private String firstName;
    private String lastName;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", FirstName='" + firstName + "'"+
                ", LastName='" + lastName + "'"+
                '}';
    }
}

