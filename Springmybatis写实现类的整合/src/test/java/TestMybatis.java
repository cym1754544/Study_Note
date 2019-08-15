import com.xiaochen.zhenghe.dao.IUserDao;
import com.xiaochen.zhenghe.dao.UserImpl;
import com.xiaochen.zhenghe.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMybatis {

    private ApplicationContext applicationContext;
    @Before
    public void beforemethod(){
        applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");}
     @Test
     public void Test11(){
            UserImpl userDao= (UserImpl) applicationContext.getBean("UserDao");

            List<User> userList = userDao.findAll();
            for (User user:userList) {
                System.out.println(user);
            }

          User qwerqw = userDao.findById(41);
         System.out.println(qwerqw);
     }



}