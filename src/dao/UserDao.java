package dao;

import java.util.List;

    import org.springframework.orm.hibernate5.HibernateTemplate;

import model.User;

public class UserDao {
    private HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    // 添加用户
    public boolean addUser(User user) {
        if(!verifyname(user.getName())) {
            hibernateTemplate.save(user);
            return true;
        }
        return false;
    }

    // 验证用户名是否存在
    public boolean verifyname(String name) {
        List<User> users = (List<User>) hibernateTemplate.find("from User  where name="+name+"");
        return users.isEmpty() ? false:true;
    }

    // 验证密码是否正确
    public boolean verifyPassword(String name, String password) {
        List queryList = hibernateTemplate.find("select password from User where name="+name+"");

        return ( queryList.get(0).toString() ).equals(password);
    }


}
