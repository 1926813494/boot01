package application.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ResoucesWebAppConfigurer extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/myimages/**").addResourceLocations("classpath:/myimages/");
		registry.addResourceHandler("/api_files/**").addResourceLocations("file:E:/images/");
		super.addResourceHandlers(registry);
	}

	
	
}
