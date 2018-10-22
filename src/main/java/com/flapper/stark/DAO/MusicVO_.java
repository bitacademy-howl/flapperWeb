package com.flapper.stark.DAO;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(MusicVO.class)
public class MusicVO_ {
	public static volatile SingularAttribute<MusicVO, Integer> musicID;
	public static volatile SingularAttribute<MusicVO, String> musicTitle;
	public static volatile SingularAttribute<MusicVO, String> genre;
	public static volatile SingularAttribute<MusicVO, String> hash_tags;
	public static volatile SingularAttribute<MusicVO, String> lyrics;
	public static volatile SingularAttribute<MusicVO, String> musicNode;
	public static volatile SingularAttribute<MusicVO, Integer> albumID;
	public static volatile SingularAttribute<MusicVO, String> composerID;
	public static volatile SingularAttribute<MusicVO, String> lyricistID;
}