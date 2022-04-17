//package com.mordy.aclsecurity.rest;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.http.HttpHeaders;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//@Component
//public class JwtTokenFilter extends OncePerRequestFilter {
//
//	@Autowired
//	private ApplicationContext ac; 
//	
//    @Override
//    protected void doFilterInternal(HttpServletRequest request,HttpServletResponse response,
//    		FilterChain chain) throws ServletException, IOException {
//        final String header = request.getHeader(HttpHeaders.AUTHORIZATION);
//        if (header==null || header.length()==0 || !header.startsWith("Bearer ")) {
//            chain.doFilter(request, response);
//            return;
//        }
//        final String token = header.split(" ")[1].trim();
//        if (!ac.getBean(JwtTokenUtil.class).validate(token)) {
//            chain.doFilter(request, response);
//            return;
//        }
//		UserDetails userDetails =new User(ac.getBean(JwtTokenUtil.class).getUsername(token), "", true, true,true,true,
//				AuthorityUtils.NO_AUTHORITIES);
//        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
//                userDetails, null,userDetails == null ? List.of() : userDetails.getAuthorities());
//        authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        chain.doFilter(request, response);
//    }
//}
