package com.flapper.stark.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import others.MusicDAO;
import others.MusicVO;

public class GetMu {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/flapper/stark/DAO/Spring.xml");
		
		MusicDAO musicDAO = context.getBean("musicDAOImpl", MusicDAO.class);
		MusicVO musicVO = musicDAO.getMusicById(10004);
		
		System.out.println(musicVO);
	}

}
