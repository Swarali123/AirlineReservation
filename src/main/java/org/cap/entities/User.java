package org.cap.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "test")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Integer getId(){
        return id;
    }

    public void setId(final Integer id){
        this.id=id;
    }

    private String first_name;

    public String getFirstName(){
        return first_name;
    }

    public void setFirstName(final String first_name){
        this.first_name=first_name;
    }

    private String last_name;

    public String getLastName(){
        return last_name;
    }

    public void setLastName(final String last_name){
        this.last_name=last_name;
    }

    
    private String email;

    public String getEmail(){
        return email;
    }

    public void setEmail(final String email){
        this.email=email;
    }
    
    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(final String password){
        this.password=password;
    }
    
    
    
    private String dob;

    public String getDob(){
        return dob;
    }

    public void setDob(final String dob){
        this.dob=dob;
    }
    
    private Integer phno;

    public Integer getPhoneno(){
        return phno;
    }

    public void setPhoneno(final Integer phno){
        this.phno=phno;
    }
    
    
    
    
    public User(){

    }

    


    @Override
    public int hashCode() {
        if(id==null){
            return 0;
        }
        return id.hashCode();
    }
}











