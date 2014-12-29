package com.softline.domain.repository;

import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @author softlinecode@gmail.com
 */
@Repository
public class BlockRepository {

	public BlockEntity save(BlockEntity blockEntity) {
		return new BlockEntity();
	}

	public BlockEntity select(String memberId) {
		BlockEntity blockEntity = new BlockEntity();
		blockEntity.setMemberId(memberId);
		blockEntity.setBlockStatus("BLOCK");
		blockEntity.setBlockDate(new Date());
		return blockEntity;
	}
}
