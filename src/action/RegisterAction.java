package action;

import com.opensymphony.xwork2.ActionSupport;

import service.UserService;

public class RegisterAction extends ActionSupport {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private String name;
    private String password;

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
        }
    }

    public String execute() {
        if(userService.userRegister(name, password)) {
            super.addActionMessage("注册成功！");
        } else {
            super.addActionError("注册失败,该用户名已存在！");
        }
        return "success";
    }
}
