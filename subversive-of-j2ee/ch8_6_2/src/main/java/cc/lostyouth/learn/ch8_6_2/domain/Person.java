package cc.lostyouth.learn.ch8_6_2.domain;

import java.io.Serializable;

/**
 * Created by endless on 12/18/2017.
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -4027951665412864685L;
    private String id;
    private String name;
    private Integer age;

    public Person() {
        super();
    }

    public Person(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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