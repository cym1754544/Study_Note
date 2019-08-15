package xiaochen.dao;

import org.apache.ibatis.annotations.Select;
import xiaochen.domain.User;

import java.util.List;

public interface IUserDao {
//    不用设置返回值,根据接口自动知道返回值为List
    @Select("select * from user")
    List<User> findAll();


}
