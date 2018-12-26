package com.martin.pattern.struct.template.dao;

import java.sql.ResultSet;
import java.util.List;

import com.martin.pattern.struct.template.JdbcTemlate;
import com.martin.pattern.struct.template.entity.Member;
import com.martin.pattern.struct.template.mapper.RowMapper;
/**
 * DAO层
 * @author 管贤春
 * @时间 2018年12月26日 下午8:50:50
 * @Email psyche19830113@163.com
 * @Description
 */
public class MemberDao {
	
	private JdbcTemlate jdbcTemlate;
	
	public List<?> query() throws Exception {
		String sql ="select * from t_member";
		
		return jdbcTemlate.executeQuery(sql, new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws Exception {
				//可以用反射来做结果集与对象的映射
				Member member = new Member();
				member.setMemberId(rs.getString("Id"));
				member.setName(rs.getString("name"));
				return member;
			}
		}, null);
	}
}
