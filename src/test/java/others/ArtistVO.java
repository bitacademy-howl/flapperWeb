package others;

public class ArtistVO {
	private int artistID;
	private String artistName;
	private String gender;
	private boolean group;
	private String artistNode;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ArtistVO(");
		sb.append("artistID : ");
		sb.append(artistID);
		sb.append(", artistName : ");
		sb.append(artistName);
		sb.append(", gender : ");
		sb.append(gender);
		sb.append(", group : ");
		sb.append(group);
		sb.append(")");
		return sb.toString();
	}
	
	public ArtistVO() {
		super();
	}
	
	public ArtistVO(int artistID) {
		super();
		this.artistID = artistID;
	}

	public int getArtistID() {
		return artistID;
	}
	public void setArtistID(int artistID) {
		this.artistID = artistID;
	}
	public String getArtistName() {
		return this.artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean getGroup() {
		return this.group;
	}
	public void setGroup(boolean group) {
		this.group = group;
	}
	public String getArtistNode() {
		return this.artistNode;
	}
	public void setArtistNode(String artistNode) {
		this.artistNode = artistNode;
	}
}
