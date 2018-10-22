package com.flapper.stark.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.flapper.stark.DAO.MusicVO;
import com.flapper.stark.DAO.MusicVO_;
import com.flapper.stark.DAO.SessionFactoryManager;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
		
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<MusicVO> criteria = builder.createQuery( MusicVO.class );
		
		Root<MusicVO> root = criteria.from( MusicVO.class );
		
		criteria.select( root );
		criteria.where( builder.equal( root.get( MusicVO_.musicTitle ), "편지" ) );

		List<MusicVO> musics = session.createQuery( criteria ).getResultList();
		
		for (int i = 0; i < musics.size();i++) {
			System.out.println(musics.get(i));
		}
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("Music_list", musics);
		
		return "index";
	}
}