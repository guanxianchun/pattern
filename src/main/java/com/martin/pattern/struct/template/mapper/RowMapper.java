package com.martin.pattern.struct.template.mapper;

import java.sql.ResultSet;
/**
 * 将数据库的查询结果集转换成对象的接口
 * 相当于mybatis中的mapper
 * @author 管贤春
 * @时间 2018年12月26日 下午8:42:47
 * @Email psyche19830113@163.com
 * @Description
 * @param <T>
 */
public interface RowMapper<T> {
	
	public T mapRow(ResultSet rs,int rowNum) throws Exception;
	
}
