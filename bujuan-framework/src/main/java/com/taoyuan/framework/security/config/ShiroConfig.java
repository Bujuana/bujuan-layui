//package com.taoyuan.framework.security.config;
//
//import com.taoyuan.framework.security.UserRealm;
//import org.apache.shiro.spring.LifecycleBeanPostProcessor;
//import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.filter.DelegatingFilterProxy;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//@Configuration
//public class ShiroConfig {
//
//
//    /**
//     * 注册DelegatingFilterProxy（Shiro）
//     */
//    @Bean
//    public FilterRegistrationBean<DelegatingFilterProxy> filterRegistrationBean() {
//        FilterRegistrationBean<DelegatingFilterProxy> filterRegistration = new FilterRegistrationBean<>();
//        filterRegistration.setFilter(new DelegatingFilterProxy());
//        filterRegistration.addUrlPatterns("/*");
//        filterRegistration.setName("shiroFilter");
//        return filterRegistration;
//    }
//
//    //配置Shiro的Web过滤器
//    @Bean
//    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager securityManager) {
//        ShiroFilterFactoryBean filterFactoryBean = new ShiroFilterFactoryBean();
//        filterFactoryBean.setSecurityManager(securityManager);
//
//        // 配置登录页面
//        filterFactoryBean.setLoginUrl("/login");
//
//        // 配置无权限时跳转的页面
//        filterFactoryBean.setUnauthorizedUrl("/403");
//
//        // 配置URL的权限控制规则
//        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
//        // 公开访问的URL
//        filterChainDefinitionMap.put("/static/**", "anon");
//        filterChainDefinitionMap.put("/login", "anon");
//        // 需要登录才能访问的URL
//        filterChainDefinitionMap.put("/admin/**", "authc");
//        // 需要特定角色才能访问的URL
//        filterChainDefinitionMap.put("/user/**", "roles[user]");
//        // 需要特定权限才能访问的URL
//        filterChainDefinitionMap.put("/article/**", "perms[article:read]");
//        filterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
//
//        return filterFactoryBean;
//    }
//
////    @Bean
////    public DefaultWebSecurityManager securityManager() {
////        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
////        securityManager.setRealm(realm);
////        return securityManager;
////    }
//
//    /**
//     * 配置安全管理器，可配置一个或多个Realm，可配置缓存管理器等
//     */
//    @Bean
//    public DefaultWebSecurityManager securityManager() {
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        // 设置自定义Realm
//        securityManager.setRealm(userRealm());
//        return securityManager;
//    }
//
//    @Bean
//    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
//        return new LifecycleBeanPostProcessor();
//    }
//
//    @Bean
//    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
//        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
//        advisor.setSecurityManager(securityManager);
//        return advisor;
//    }
//
//    /**
//     * 自定义Realm配置
//     */
//    @Bean
//    public UserRealm userRealm() {
//        UserRealm userRealm = new UserRealm();
//        return userRealm;
//    }
//
//
//}