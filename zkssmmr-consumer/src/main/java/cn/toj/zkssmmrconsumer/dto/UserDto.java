package cn.toj.zkssmmrconsumer.dto;

import java.io.Serializable;

/**
 * @author Carlos
 * @description
 * @Date 2020/7/21
 */

public class UserDto implements Serializable {

    private String username;
    private String password;
    private String sex;
    private String address;

    public UserDto(String username, String password, String sex, String address) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
