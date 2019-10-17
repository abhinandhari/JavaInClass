package JavaObjects;
import java.io.Serializable;
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	public String name,email;
	public User(){}
	public User(String n, String e){
		name=n;
		email = e;
	}
	public void setname(String n) {
		this.name = n;
	}
	public void setemail(String e) {
		this.email = e;
	}
	public String getname() {
		return name;
	}
	public String getemail() {
		return email;
	}
	public String toString(){
		return name + email;
	}
}
