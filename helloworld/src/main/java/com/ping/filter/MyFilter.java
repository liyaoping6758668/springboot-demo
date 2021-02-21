package com.ping.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author liyaoping
 * @version 1.0
 * @date 2021-2-21 23:41
 */
@WebFilter(urlPatterns="/hello/*",filterName="LoginFilter")
public class MyFilter  implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化过滤器。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行过滤器。。");
    }

    @Override
    public void destroy() {
        System.out.println("销毁过滤器。。");
    }
}
