package com.softline.domain;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Configurable;

import com.softline.domain.repository.BlockEntity;
import com.softline.domain.repository.BlockRepository;
import com.softline.domain.repository.UserEntity;

/**
 * @author softlinecode@gmail.com
 */
@Configurable(value = "member", preConstruction = true, autowire = Autowire.BY_NAME)
public class Member {
	private String memberId;
	private UserEntity userEntity;
	private BlockEntity blockEntity;

	private BlockRepository blockRepository;

	public boolean blocked() {
		BlockEntity blockEntity1 = blockRepository.select(this.memberId);
		if (blockEntity1 == null) {
			return false;
		}
		return true;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public BlockEntity getBlockEntity() {
		return blockEntity;
	}

	public void setBlockEntity(BlockEntity blockEntity) {
		this.blockEntity = blockEntity;
	}

	public void setBlockRepository(BlockRepository blockRepository) {
		this.blockRepository = blockRepository;
	}
}
