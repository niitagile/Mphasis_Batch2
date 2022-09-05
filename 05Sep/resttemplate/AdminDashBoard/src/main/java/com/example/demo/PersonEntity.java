package com.example.demo;



//@Entity
public class PersonEntity {

  //  @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id", updatable = false, nullable = false)
    //private Integer personId;
    //@Column
    private String name;
   private int age;

    public PersonEntity() {
        super();
    }
    public PersonEntity( String name, Integer age) {
        super();
      
        this.name = name;
        this.age = age;
    }
    /*public Integer getPersonId() {
        return personId;
    }
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }*/
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}

