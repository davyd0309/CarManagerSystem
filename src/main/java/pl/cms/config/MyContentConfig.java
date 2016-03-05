package pl.cms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Konrad on 2016-02-19.
 */
@Configuration
public class MyContentConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //strony w index
        registry.addViewController("/").setViewName("forward:/strony/index/index.html");
        registry.addViewController("/cmsGosc/zaloguj").setViewName("forward:/strony/index/zaloguj.html");
        registry.addViewController("/cmsGosc/dodajUzytkownika").setViewName("forward:/strony/index/dodajUzytkownika.html");
        registry.addViewController("/cmsGosc/informacjeDodatkowe").setViewName("forward:/strony/index/informacjeDodatkowe.html");
        //strony w main
        registry.addViewController("/cmsUser/mainPage").setViewName("forward:/strony/main/main.html");
    }

}
