package controller;

import java.io.Serializable;

public class ValidationTester implements Serializable {
    private String loginname;
    private String password;

    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }
}
