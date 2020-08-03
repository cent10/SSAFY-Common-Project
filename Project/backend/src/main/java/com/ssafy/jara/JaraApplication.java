package com.ssafy.jara;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ssafy.jara.common.interceptor.JwtInterceptor;

@SpringBootApplication
public class JaraApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(JaraApplication.class, args);
	}

	@Autowired
    private JwtInterceptor jwtInterceptor;
	
    /**
     * JWTInterceptor를 설치한다.
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwtInterceptor).addPathPatterns("/**") // 기본 적용 경로
                .excludePathPatterns(Arrays.asList(
                		"/**",
                		"/accounts/**",
                		"/v2/api-docs",
                        "/swagger-resources/**",
                        "/swagger-ui.html",
                        "/webjars/**",
                        "/swagger/**"
                		)); // 적용 제외 경로
    }

    /**
     * Interceptor를 이용해서 처리하므로 전역의 Corss Origin 처리를 해준다.
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*")
                .exposedHeaders("jwt-auth-token");
    }
}
