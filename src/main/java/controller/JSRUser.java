package controller;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class JSRUser {
    @NotBlank(message = "登录名不能为空")
    private String loginname;
    @NotBlank(message = "密码不能为空")
    @Length(min = 6, max = 8, message = "密码长度必须在6位到8位之间")
    private String password;
    @NotBlank(message = "用户名不能为空")
    private String username;
    @Range(min = 15, max = 60, message = "年龄必须在15岁到60岁之间")
    private int age;
    @Email(message = "邮箱地址不合法")
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "生日范围不合法")
    private Date birthDate;
    @Pattern(regexp = "[1][3, 8][3,6,9][0-9]{8}", message = "电话号码无效")
    private String phone;

    public String getLoginname() {
        return loginname;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
