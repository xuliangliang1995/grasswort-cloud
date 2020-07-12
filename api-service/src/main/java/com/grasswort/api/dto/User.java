package com.grasswort.api.dto;

/**
 * @author xuliangliang
 * @Classname User.java
 * @Description
 * @Date 2020/5/11
 * @blame Java Team
 */
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
