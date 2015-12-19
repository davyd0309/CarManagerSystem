package pl.cms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CarManagerSystemApplication.class)
@WebAppConfiguration
public class CarManagerSystemApplicationTests {

	@Test
	public void contextLoads() {
	}

}
