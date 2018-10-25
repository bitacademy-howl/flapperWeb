package others;

import java.util.Date;

public class AlbumVO {
	private int albumID;
	private String albumTitle;
	private String agency;
	private String distributor;
	private String description;
	private Date releaseDate;
	private String albumNode;
	private int singerID;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("AlbumVO(");
		sb.append("albumID : ");
		sb.append(albumID);
		sb.append(", albumTitle : ");
		sb.append(albumTitle);
		sb.append(", releaseDate : ");
		sb.append(releaseDate);
		sb.append(", singerID : ");
		sb.append(singerID);
		sb.append(")");
		return sb.toString();
	}
	
	public AlbumVO() {
		super();
	}

	public AlbumVO(int albumID) {
		super();
		this.albumID = albumID;
	}

	public int getAlbumID() {
		return albumID;
	}

	public void setAlbumID(int albumID) {
		this.albumID = albumID;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getAlbumNode() {
		return albumNode;
	}

	public void setAlbumNode(String albumNode) {
		this.albumNode = albumNode;
	}

	public int getSingerID() {
		return singerID;
	}

	public void setSingerID(int singerID) {
		this.singerID = singerID;
	}
}
