import com.taotao.rest.controller.ControllerConfiguration;
import com.taotao.rest.controller.IndexController;
import com.taotao.rest.dao.IndexDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.swing.*;

/**
 * Created by Administrator on 2017/5/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ControllerConfiguration.class)
public class Demo {

    @Autowired
    public IndexController indexController;

    @Autowired
    public IndexDao indexDao;


    @Test
    public void showTest(){

//        indexController.showDetial();
        indexDao.showIndexDaoDetial();



    }
}
