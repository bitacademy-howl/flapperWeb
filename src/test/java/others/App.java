//package others;
//
//import org.hibernate.Session;
//
//import com.flapper.stark.DAO.MusicVO;
//import com.flapper.stark.DAO.SessionFactoryManager;
//
//public class App {
//	public static void main(String[] args) {
////		jar 파일 외부 라이브러리로 프로젝트에 포함 시킬 때 먼저 추가된 jar 가 우선한다.
////		SessionFactory sessionFactory = new SimpleTableAccess().getSessionFactory();
//		
////		여기서 자바 external jar 임포트 순서 및 이클립스에서 우선순위가 중요한 이유...
////		hibernate core 4.4.4
////		hibernate core 5.1.4
////		순서로 임포트 되면 4.4.4 가 우선한다...
////		자세한 것은 추후 알아볼 것!
//		
//		MusicVO mvo = new MusicVO();
//		SessionFactoryManager sf = new SessionFactoryManager();
//		
//		mvo.setMusicID(1000000000);
//		mvo.setMusicTitle("test title");
//		mvo.setHash_tags("{str:tojson}");
//		
//		Session session = sf.getSessionFactory().openSession();
//		
//		session.beginTransaction();
//		session.save(mvo);
//		session.getTransaction().commit();
//		
//		System.out.println("insert Complete");
//		
//		session.close();
//		sf.getSessionFactory().close();
////		sf.getSessionFactory().getCurrentSession();
//	}
//}
