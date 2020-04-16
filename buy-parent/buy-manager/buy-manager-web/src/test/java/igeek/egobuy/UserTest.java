package igeek.egobuy;

import com.baomidou.mybatisplus.annotation.Version;
import com.igeek.egobuy.ManagerWebApplication;
import com.igeek.egobuy.pojo.User;
import com.igeek.egobuy.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = ManagerWebApplication.class)
public class UserTest {


    @Autowired
    private UserService userService;

    @Test
    public void testVersion(){
        User user = new User();
        user.setPassword("123456");
        user.setPhone("12123451234");
        user.setUsername("测试");
        userService.save(user);
    }


    @Test
    public void testVersion1(){
        User user = new User();
        user.setId(5L);
        user.setPassword("1234565");
        user.setPhone("12123451234");
        user.setUsername("测试");
        //如果需要乐观锁  先查询版本号
        User byId = userService.getById(5L);
        user.setVersion(byId.getVersion());
        userService.updateById(user);

    }
}
