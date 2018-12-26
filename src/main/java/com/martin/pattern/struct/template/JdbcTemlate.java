package com.martin.pattern.struct.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.martin.pattern.struct.template.mapper.RowMapper;
/**
 * 模板方法：流程是固定的，但可以参与流程中的某一些环节 。	
 * 
 * 模板方法与策略模式：
 *    策略模式： 只有选择权（由用户选择固定的算法）
 *    模板方法：侧重的点不是选择，你没得选择，只能按固定流程做，但可参与某一部分内容的自定义
 * @author 管贤春
 * @时间 2018年12月26日 下午8:41:53
 * @Email psyche19830113@163.com
 * @Description
 */
public class JdbcTemlate {
	
	private DataSource dataSource;
	
	public JdbcTemlate(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	private Connection getConnection() throws Exception{
		//通常是从连接池获取一个连接
		return this.dataSource.getConnection();
	}
	
	private PreparedStatement createPreparedStatement(Connection conn,String sql) throws Exception{
		return conn.prepareStatement(sql);
	}
	
	private ResultSet executeQuery(PreparedStatement pstmt,Object[] values) throws Exception{
		for (int i = 0; i < values.length; i++) {
			pstmt.setObject(i, values[i]);
		}
		return pstmt.executeQuery();
	}
	
	
	private void closeResult(ResultSet rs) throws Exception{
		rs.close();
	}
	
	private void closeStatment(Statement stmt) throws Exception{
		stmt.close();
	}
	
	private void closeConnection(Connection conn) throws Exception{
		//通常是把其放入到连接池中
		conn.close();
	}
	private List<?> parseResultSet(ResultSet rs,RowMapper<?> rowMapper) throws Exception{
		List<Object> result = new ArrayList<Object>();
		int rowNum = 1;
		while (rs.next()) {
			result.add(rowMapper.mapRow(rs, rowNum++));
		}
		return result;
	}
	/**
	 * 这里就是一个模板方法 
	 * @param sql
	 * @param rowMapper
	 * @param values
	 * @return
	 * @throws Exception
	 */
	public List<?> executeQuery(String sql,RowMapper<?> rowMapper,Object[] values) throws Exception{
		//1. 获取连接
		Connection conn = this.getConnection();
		//2. 创建语句集
		PreparedStatement pstmt = this.createPreparedStatement(conn, sql);
		//3. 执行语句集，并且获取结果集
		ResultSet rs = this.executeQuery(pstmt, values);
		//4. 解释语句集
		List<?> list = this.parseResultSet(rs, rowMapper);
		//5. 关闭结果集
		this.closeResult(rs);
		//6. 关闭语句集
		this.closeStatment(pstmt);
		//7. 关闭连接
		this.closeConnection(conn);
		return list;
	}
	
}
