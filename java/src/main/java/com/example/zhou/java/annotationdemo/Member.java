package com.example.zhou.java.annotationdemo;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/7/17  16:38
 * @Desc :
 */

public class Member
{
    @SQLString(30)
    String firstName;
    @SQLString(50)
    String lastName;
    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    Integer age;
    String handle;
    static int memberCount;


    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Integer getAge()
    {
        return age;
    }

    public String getHandle()
    {
        return handle;
    }

    public static int getMemberCount()
    {
        return memberCount;
    }

    @Override
    public String toString()
    {
        return "Member{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", handle='" + handle + '\'' +
                '}';
    }
}
