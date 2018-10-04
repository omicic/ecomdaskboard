package com.ecomdashboard.demo.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication auth)
			throws IOException, ServletException {
		System.out.println("Login Successful");
		httpServletResponse.setStatus(HttpServletResponse.SC_OK);
		httpServletResponse.sendRedirect("/dashboard");
		
	}

}
