/*
 * Purpose: to define a contact class
 * 
 * @version 02/10/2025
 * @author William Van Uitert
 */

public class Contact {
    String name;
    String relation;
    String birthday;
    String phoneNum;
    String email;

    public Contact(String name, String relation, String birthday, String phoneNum, String email) {
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getRelation() {
        return this.relation;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getPhoneNum() {
        return this.phoneNum;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return String.format("%s\t %-10s\t%17s\t\t%s\t%22s", this.name, this.relation, this.birthday, this.phoneNum, this.email);
    }
}
