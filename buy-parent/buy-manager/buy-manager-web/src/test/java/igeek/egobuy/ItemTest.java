package igeek.egobuy;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.igeek.egobuy.ManagerWebApplication;
import com.igeek.egobuy.pojo.Item;
import com.igeek.egobuy.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = ManagerWebApplication.class)
public class ItemTest {

    @Autowired
    public ItemService itemService;

    @Test
    public void saveTest(){
        Item item = new Item();
        item.setId(1L);
        item.setTitle("测试测试测试测试");
        item.setPrice(12345L);
        item.setNum(99);
        item.setCid(1L);
        item.setStatus(new Byte("1"));
        boolean save = itemService.save(item);
        System.out.println(save);
        System.out.println(item);

    }

    @Test
    public void removeTest(){
        boolean b = itemService.removeById(1);
        System.out.println(b);
    }
    @Test
    public void getTest(){
        Item byId = itemService.getById(1018006);
        System.out.println("_____________________________________________");
        System.out.println(byId);
    }

    @Test
    public void updateTest(){
        Item item = new Item();
        item.setId(1L);
        item.setTitle("测试测试测试测试2222222");
        boolean b = itemService.updateById(item);
        System.out.println(item);
        System.out.println(b);

    }

    @Test
    public void getPageTest(){
        Page<Item> itemPage = new Page<>(1,10);
        Page<Item> page = itemService.page(itemPage);
        System.out.println(page.getRecords());
    }

    @Test
    public void wrapperTest(){
       /* Map<String, Object> params = new HashMap<>();
        params.put("price",999900);
        params.put("num",99999);
        QueryWrapper<Item> itemQueryWrapper = new QueryWrapper<>();
        itemQueryWrapper.allEq(params);
        List<Item> list = itemService.list(itemQueryWrapper);
        System.out.println(list);*/
        QueryWrapper<Item> itemQueryWrapper = new QueryWrapper<>();
        itemQueryWrapper.gt("price", 999900).eq("num",99999);
        List<Item> list = itemService.list(itemQueryWrapper);
        System.out.println(list.size());

    }

}
