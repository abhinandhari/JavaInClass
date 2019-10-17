package JavaObjects;
public class Admin extends User {
    String pass;
    public Admin(){super();}
    public Admin(String n, String e,String p){
        super(n,e);
        pass=p;
    }
}
