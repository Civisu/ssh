package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import model.User;
import service.UserService;

public class LoginAction extends ActionSupport implements SessionAware {
    public UserService getUserService() {
        return userService;
    }

    private UserService userService;

    private String name;
    private String password;

    private Map session;
    public void setSession(Map session) {
        this.session = session;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void validate() {
        super.clearErrorsAndMessages();
        if("".equals(name)) {
            super.addActionError("用户名不能为空！");
        }
        if("".equals(password)) {
            super.addActionError("密码不能为空！");
            System.out.println();
        }
    }

    public String execute() {
        if(userService.loginVerify(name, password)){
            User user = new User();
            user.setName(name);
            user.setPassword(password);
            session.put("user", user);
            return "success";
        } else {
            super.addActionError("登录失败！");
            return INPUT;
        }
    }
}
