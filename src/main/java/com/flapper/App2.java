package com.flapper;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;

import com.flapper.stark.DAO.MusicVO;
import com.flapper.stark.DAO.MusicVO_;
import com.flapper.stark.DAO.SessionFactoryManager;

public class App2 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		session.close();
		
//		sf.getSessionFactory().close();
	}
}
//		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////		1. 
//
//		// Create CriteriaBuilder
//		CriteriaBuilder cb = session.getCriteriaBuilder();
//
//		// Create CriteriaQuery
//		cb.like(arg1)
//		CriteriaQuery<MusicVO> criteria = cb.createQuery(MusicVO.class);
//		
//		
//		
////		EntityManager em = session.unwrap(MusicVO);
//		
//		CriteriaQuery<MusicVO> cq = cb.createQuery(MusicVO.class);
//		Root<MusicVO> mvo = cq.from(MusicVO.class);
//		cq.where(cb.like(), "*do");
//        
//        @SuppressWarnings("unchecked")
//		Iterator<MusicVO> itr = musics.iterator();
//        while(itr.hasNext()){
//        	System.out.println(itr.next());
//        }
//        }

