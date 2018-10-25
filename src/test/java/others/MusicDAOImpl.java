package others;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//
//
@Repository
public class MusicDAOImpl implements MusicDAO{
	@Autowired
	private DataSource dataSource;
//
	@Override
	public MusicVO getMusicById(int id) {
		MusicVO mvo = null;
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from Music_table where Music_ID = ?");
//			PreparedStatement ps = conn.prepareStatement("select * from Music_table where Music_title Like /\"%?%/\"");
			
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			ArrayList<MusicVO> mlist = new ArrayList<>();
			if (rs.next()) {
				mvo = new MusicVO();
				mvo.setMusicID(rs.getInt("Music_ID"));
				mvo.setAlbumID(rs.getInt("Album_ID"));
				mvo.setMusicTitle(rs.getString("Music_Title"));
				mvo.setLyrics(rs.getString("Lyrics"));
				mvo.setGenre(rs.getString("Genre"));
				mvo.setLyricistID(rs.getString("lyricist_ID"));
				mvo.setComposerID(rs.getString("Composer_ID"));
				
				mlist.add(mvo);
				
				System.out.println(mvo);
			}
			
			System.out.println(mlist);
			
			rs.close();
			ps.close();
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if(conn != null) {
				try {
					conn.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return mvo;
	}
//	
//	private void createMusic() {
//		MusicVO mvo = null;
//		Connection conn = null;
//		
//		try {
//			conn = dataSource.getConnection();
//			PreparedStatement ps = conn.prepareStatement("select * from Music_table where Music_ID = ?");
////			PreparedStatement ps = conn.prepareStatement("select * from Music_table where Music_title Like /\"%?%/\"");
//			
//			ps.setInt(1, id);
//			ResultSet rs = ps.executeQuery();
//			
//			ArrayList<MusicVO> mlist = new ArrayList<>();
//			if (rs.next()) {
//				mvo = new MusicVO();
//				mvo.setMusicID(rs.getInt("Music_ID"));
//				mvo.setAlbumID(rs.getInt("Album_ID"));
//				mvo.setMusicTitle(rs.getString("Music_Title"));
//				mvo.setLyrics(rs.getString("Lyrics"));
//				mvo.setGenre(rs.getString("Genre"));
//				mvo.setLyricistID(rs.getString("lyricist_ID"));
//				mvo.setComposerID(rs.getString("Composer_ID"));
//				
//				mlist.add(mvo);
//				
//				System.out.println(mvo);
//			}
//			
//			System.out.println(mlist);
//			
//			rs.close();
//			ps.close();
//		
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} finally {
//			if(conn != null) {
//				try {
//					conn.close();
//				}catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//
//	}
//	
}
