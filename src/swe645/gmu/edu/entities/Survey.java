package swe645.gmu.edu.entities;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "survey_subs")
public class Survey implements Serializable
{
    public static final long serialVersionUID = 1L;
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="first_name", length=100)
    String firstName;
    
    @Column(name="last_name", length=100)
    String lastName;
    
    @Column(name="street", length=100)
    String street;
    
    @Column(name="city", length=100)
    String city;
    
    @Column(name="state", length=100)
    String state;
    
    @Column(name="zip", length=100)
    String zip;
    
    @Column(name="tel", length=100)
    String tel;
    
    @Column(name="email", length=100)
    String email;
    
    @Column(name="date", length=100)
    String date;
    
    @Column(name="like_students", nullable = false, columnDefinition = "TINYINT(1)")
    boolean likeStudents;
    @Column(name="like_location", nullable = false, columnDefinition = "TINYINT(1)")
    boolean likeLocation;
    @Column(name="like_campus", nullable = false, columnDefinition = "TINYINT(1)")
    boolean likeCampus;
    @Column(name="like_atmos", nullable = false, columnDefinition = "TINYINT(1)")
    boolean likeAtmos;
    @Column(name="like_dorm", nullable = false, columnDefinition = "TINYINT(1)")
    boolean likeDorm;
    @Column(name="like_sports", nullable = false, columnDefinition = "TINYINT(1)")
    boolean likeSports;
    @Column(name="how_interest", nullable = false)
    int howInterest;
    @Column(name="likely_rec", nullable = false)
    int recommend;
    @Column(name="raffle", length=100)
    String raffle; 
    @Column(name="comments", length=100)
    String comments;

    public int getId() 
    { 
        return id; 
    }
    public void setId(int id)
    { 
        this.id = id; 
    }
    public String getFirstName() 
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getLastName() 
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getStreet()
    {
        return street;
    }
    public void setStreet(String street)
    {
        this.street = street;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public String getState()
    {
        return state;
    }
    public void setState(String state)
    {
        this.state = state;
    }
    public String getZip()
    {
        return zip;
    }
    public void setZip(String zip)
    {
        this.zip = zip;
    }
    public String getTel()
    {
        return tel;
    }
    public void setTel(String tel)
    {
        this.tel = tel;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public boolean getLikeStudents()
    {
        return likeStudents;
    }
    public void setLikeStudents(boolean likeStudents)
    {
        this.likeStudents = likeStudents;
    }
    public boolean getLikeLocation()
    {
        return likeLocation;
    }
    public void setLikeLocation(boolean likeLocation)
    {
        this.likeLocation = likeLocation;
    }
    public boolean getLikeCampus()
    {
        return likeCampus;
    }
    public void setLikeCampus(boolean likeCampus)
    {
        this.likeCampus = likeCampus;
    }
    public boolean getLikeAtmos()
    {
        return likeAtmos;
    }
    public void setLikeAtmos(boolean likeAtmos)
    {
        this.likeAtmos = likeAtmos;
    }
    public boolean getLikeDorm()
    {
        return likeDorm;
    }
    public void setLikeDorm(boolean likeDorm)
    {
        this.likeDorm = likeDorm;
    }
    public boolean getLikeSports()
    {
        return likeSports;
    }
    public void setLikeSports(boolean likeSports)
    {
        this.likeSports = likeSports;
    }
    public int getHowInterest()
    {
        return howInterest;
    }
    public void setHowInterest(int howInterest)
    {
        this.howInterest = howInterest;
    }
    public int getRecommend()
    {
        return recommend;
    }
    public void setRecommend(int recommend)
    {
        this.recommend = recommend;
    }
    public String getRaffle()
    {
        return raffle;
    }
    public void setRaffle(String raffle)
    {
        this.raffle = raffle;
    }
    public String getComments()
    {
        return comments;
    }
    public void setComments(String comments)
    {
        this.comments = comments;
    }
}

