package com.xingyi.logistic.authentication.db.entity;

import com.xingyi.logistic.business.bean.BaseDBQueryPage;

/**
 * @author tsingtao_tung
 * Created At: 2018/1/21 上午12:43.
 */
public class UserProfileDBQuery extends BaseDBQueryPage {
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
