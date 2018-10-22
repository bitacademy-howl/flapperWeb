package com.flapper.stark.DAO;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.metamodel.SingularAttribute;

//import javax.persistence.Entity;
//import javax.persistence.Table;

// JPA 때문인가 hibernate 패키지에 있는 entitiy 쓰지 않음...
//import org.hibernate.annotations.Entity;

//
@Entity(name = "MusicVO")
@Table(name="Music_Table")
public class MusicVO {
	private int musicID;
	private String musicTitle;
	private String genre;
	private String hash_tags;
	private String lyrics;
	private String musicNode;
	private int albumID;
	private String composerID;
	private String lyricistID;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("MusicVO(");
		sb.append("musicID : ");
		sb.append(musicID);
		sb.append(", musicTitle : ");
		sb.append(musicTitle);
		sb.append(", genre : ");
		sb.append(genre);
		sb.append(", albumID : ");
		sb.append(albumID);
		sb.append(")");
		return sb.toString();
	}
	
	public MusicVO(int musicID) {
		super();
		this.musicID = musicID;
	}

	public MusicVO() {
		super();
	}

	public int getMusicID() {
		return musicID;
	}
	public void setMusicID(int musicID) {
		this.musicID = musicID;
	}
	public String getMusicTitle() {
		return musicTitle;
	}
	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getHash_tags() {
		return hash_tags;
	}
	public void setHash_tags(String hash_tags) {
		this.hash_tags = hash_tags;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public String getMusicNode() {
		return musicNode;
	}
	public void setMusicNode(String musicNode) {
		this.musicNode = musicNode;
	}
	public int getAlbumID() {
		return albumID;
	}
	public void setAlbumID(int albumID) {
		this.albumID = albumID;
	}
	public String getComposerID() {
		return composerID;
	}
	public void setComposerID(String composerID) {
		this.composerID = composerID;
	}
	public String getLyricistID() {
		return lyricistID;
	}
	public void setLyricistID(String lyricistID) {
		this.lyricistID = lyricistID;
	}
}
