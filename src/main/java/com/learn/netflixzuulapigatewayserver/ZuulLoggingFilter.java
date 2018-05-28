package com.learn.netflixzuulapigatewayserver;

import com.netflix.zuul.ZuulFilter;

import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by MACHUNAGENDRADURGP on 24/05/2018.
 */
@Component
public class ZuulLoggingFilter extends ZuulFilter{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //Filter should execute before request or after request or
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    //Filter should execute for every request
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
       HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
       logger.info("The request is  -> {} request uri -> {}",request,request.getRequestURI());
        return null;
    }
}
