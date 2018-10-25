package com.flapper.stark.main;

import com.flapper.stark.model.UserVO;

public class hibernate_annotation_test {

	public static void main(String[] args) {
		
		UserVO user = new UserVO();
		user.setFirstName("희웅");
		user.setLastName("이");
		
		user.setPassword("1234");
		user.seteMail("stark@daum.net");
		
		
		System.out.println(user);
		System.out.println(user.hashCode());
	}

}
