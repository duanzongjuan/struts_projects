package com.juan.struts.bbs.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.juan.struts.bbs.model.Category;
import com.juan.struts.bbs.util.DB;

public class CategoryService {
	public void add(Category c) {
		Connection conn = DB.createConn();
		String sql = "insert into _category values(null,?,?)";
		PreparedStatement ps = DB.prepare(conn, sql);
		try {
			ps.setString(1,c.getName());
			ps.setString(2, c.getDescription());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
	}
	
	public List<Category> list() {
		List<Category> list = new ArrayList<Category>();
		Connection conn = DB.createConn();
		String sql = "select * from _category";
		PreparedStatement ps = DB.prepare(conn, sql);
		ResultSet rs = null;
		try {
			rs = ps.executeQuery();
			while(rs.next()) {
				Category c = new Category();
				c.setName(rs.getString("name"));
				c.setDescription(rs.getString("description"));
				list.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(rs);
		DB.close(ps);
		DB.close(conn);
		return list;
	}
	
	public void delete(Category c) {
		deleteById(c.getId());
	}
	
	public void deleteById(int id) {
		Connection conn = DB.createConn();
		String sql = "delete from _category where id = ?";
		PreparedStatement ps = DB.prepare(conn, sql);
		try {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
	}
	
	public void update(Category c) {
		Connection conn = DB.createConn();
		String sql = "update _category set name=?,description=? where id=?";
		PreparedStatement ps = DB.prepare(conn, sql);
		try {
			ps.setString(1,c.getName());
			ps.setString(2, c.getDescription());
			ps.setInt(3, c.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DB.close(ps);
		DB.close(conn);
	}
}
