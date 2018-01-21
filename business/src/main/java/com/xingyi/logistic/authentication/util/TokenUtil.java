package com.xingyi.logistic.authentication.util;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.util.DigestUtils;

import java.util.Arrays;

/**
 * @author tsingtao_tung
 * Created At: 2018/1/21 下午9:40.
 */
public final class TokenUtil {
	private TokenUtil(){

	}

	public static String build(String... src){
		if(ArrayUtils.isEmpty(src)){
			return null;
		}

		char[] chars = new char[]{};
		for(String s:src){
			if(null == s){
				s = "null";
			}
			chars = ArrayUtils.addAll(chars,s.toCharArray());
		}

		Arrays.sort(chars);

		String token = DigestUtils.md5DigestAsHex(new String(chars).getBytes());
		return token;
	}
}
