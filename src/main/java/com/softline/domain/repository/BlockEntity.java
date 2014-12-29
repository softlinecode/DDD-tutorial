package com.softline.domain.repository;

import java.util.Date;

/**
 * @author softlinecode@gmail.com
 */
public class BlockEntity {
	private String memberId;
	private String blockStatus;
	private Date blockDate;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getBlockStatus() {
		return blockStatus;
	}

	public void setBlockStatus(String blockStatus) {
		this.blockStatus = blockStatus;
	}

	public Date getBlockDate() {
		return blockDate;
	}

	public void setBlockDate(Date blockDate) {
		this.blockDate = blockDate;
	}
}
