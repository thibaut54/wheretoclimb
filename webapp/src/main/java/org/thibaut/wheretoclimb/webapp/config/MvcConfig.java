//package org.thibaut.wheretoclimb.webapp.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@Configuration
//public class MvcConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addViewControllers( ViewControllerRegistry registry) {
//        registry.addViewController("/atlas").setViewName("atlas");
////        registry.addViewController("/").setViewName("atlas");
////        registry.addViewController("/secured/users").setViewName("users");
////        registry.addViewController("/login").setViewName("login");
////        registry.addViewController("/403").setViewName("403");
//    }
//
//    @Bean
//	public InternalResourceViewResolver viewResolver() {
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/WEB-INF/jsp/");
//		resolver.setSuffix(".jsp");
//		return resolver;
//	}
//}
