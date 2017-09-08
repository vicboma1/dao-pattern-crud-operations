package demo;

import demo.base.Data;

public class User extends Data {

    private String name;
    private String pass;

    public User(){
        this("","",0);
    }

    public User(String name, String pass, int id){
        this.name = name;
        this.pass = pass;
        this.setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object obj) {
        final User user = (User) obj;
        return name.equals(user.name) && pass.equals(user.pass);
    }

    @Override
    public int hashCode() {
        return this.pass.hashCode() + this.name.hashCode() + getId();
    }
}
