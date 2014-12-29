package com.softline.domain.repository;

import org.springframework.stereotype.Repository;

/**
 * @author softlinecode@gmail.com
 */
@Repository
public class UserRepository {

	public UserEntity save(UserEntity userEntity) {
		return new UserEntity();
	}

	public UserEntity select(String memberId) {
		UserEntity userEntity = new UserEntity();
		userEntity.setMemberId(memberId);
		userEntity.setName("test");
		return userEntity;
	}
}
