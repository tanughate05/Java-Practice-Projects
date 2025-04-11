package org.example.mavenprroject1;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users1")
public class Users {
    @Id
    @Column(name="username")
    String username;
    @Id
    @Column(name="password")
    String password;


    public Users(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public Users() {

    }

    /**
     * @return the userid
     */
    public String getUserid() {
        return username;
    }
    /**
     * @param username the userid to set
     */
    public void setUserid(String username) {
        this.username = username;
    }
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }



}
