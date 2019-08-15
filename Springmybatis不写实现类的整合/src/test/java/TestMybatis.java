import com.xiaochen.zhenghe.domain.User;
import com.xiaochen.zhenghe.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMybatis {

    private ApplicationContext applicationContext;
    @Before
    public void beforemethod(){
        applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");}
     @Test
     public void Test11(){
         UserMapper userMapper = (UserMapper) applicationContext.getBean("UserMapper");
         System.out.println(userMapper);
         User user=userMapper.findById(41);
         System.out.println(user);
     }



}