package com.kgisl.springjdbcjavaconfig.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class TeacherRowMapper implements RowMapper<Teacher> {
	@Override
	public Teacher mapRow(ResultSet rs, int row) throws SQLException {
		Teacher teacher = new Teacher();
		teacher.setId(rs.getInt("id"));
		teacher.setName(rs.getString("name"));
		teacher.setExpertise(rs.getString("expertise"));
		return teacher;
	}
}