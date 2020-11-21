package org.martinzhekov.config;

import org.martinzhekov.utill.ViewNames;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by martinzhekov on 21.11.20
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName(ViewNames.HOME);
        registry.addViewController("/home").setViewName(ViewNames.HOME);
    }


}
