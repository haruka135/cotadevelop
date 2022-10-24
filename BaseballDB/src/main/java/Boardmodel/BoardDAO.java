package Boardmodel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import java.util.Vector;

public class BoardDAO {

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void getConnect() {
		
		try {
			
			Context initctx = new InitialContext();
			
			Context envctx = (Context) initctx.lookup("java:comp/env");
			
			DataSource ds = (DataSource) envctx.lookup("jdbc/pool");
			
			con = ds.getConnection();
			
			
		}catch(Exception e) {
			
			
			e.printStackTrace();
			
		}
		
		
		
	}
	
	public void insertBoard(BoardBean bean) {
		
		
		getConnect();
		
		int ref = 0;
		
		int re_step = 1;
		
		int re_level = 1;
		
		try {
			
			String refsql = "select max(ref) from board";
			
			pstmt = con.prepareStatement(refsql);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				ref = rs.getInt(1)+1;
				
				
			}
			
			String sql = "insert into board values(board_seq.NEXTVAL,?,?,?,?,sysdate,?,?,?,0,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getWriter());
			pstmt.setString(2, bean.getEmail());
			pstmt.setString(3, bean.getSubject());
			pstmt.setString(4, bean.getPassword());
			pstmt.setInt(5,ref);
			pstmt.setInt(6,re_step);
			pstmt.setInt(7,re_level);
			pstmt.setString(8, bean.getContent());
			
			pstmt.executeUpdate();
			
			con.close();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
	}
	
	public Vector<BoardBean> getAllBoard(int start,int end){
		
		Vector<BoardBean> v = new Vector<>();
		
		getConnect();
		
		try {
			
			String sql = "select * from (select A.* ,Rownum Rnum from (select * from board order by ref desc, re_step asc)A)"
					+ "where Rnum > ? and Rnum <= ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, start);
			pstmt.setInt(2, end+1);
			
			rs = pstmt.executeQuery(); 
			
			while(rs.next()) {
				
				BoardBean bean = new BoardBean();
				
				bean.setNum(rs.getInt(1));
				bean.setWriter(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setSubject(rs.getString(4));
				bean.setPassword(rs.getString(5));
				bean.setReg_date(rs.getDate(6).toString());
				bean.setRef(rs.getInt(7));
				bean.setRe_step(rs.getInt(8));
				bean.setRe_level(rs.getInt(9));
				bean.setReadcount(rs.getInt(10));
				bean.setContent(rs.getString(11));
				
				v.add(bean);
			}
			
			con.close();
			
		} catch(Exception e) {
			
			
		e.printStackTrace();
			
		}
		
		return v;
		
	}
	
	
	public BoardBean getOneBoard(int num) {
		
		
		BoardBean bean = new BoardBean();
		
		getConnect();
		
		try {
			
			
			String readsql = "update board set readcount = readcount+1 where num = ?";
			
			pstmt = con.prepareStatement(readsql);
			
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
			
			String sql = "select * from board where num = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				bean.setNum(rs.getInt(1));
				bean.setWriter(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setSubject(rs.getString(4));
				bean.setPassword(rs.getString(5));
				bean.setReg_date(rs.getDate(6).toString());
				bean.setRef(rs.getInt(7));
				bean.setRe_step(rs.getInt(8));
				bean.setRe_level(rs.getInt(9));
				bean.setReadcount(rs.getInt(10));
				bean.setContent(rs.getString(11));
				
			}
			
			con.close();
			
		} catch(Exception e) {
			
			
			
			e.printStackTrace();
			
		}
		
		
		return bean;
		
	}
	
	public void reWriteBoard(BoardBean bean) {
		
		
		int ref = bean.getRef();
		int re_step = bean.getRe_step();
		int re_level = bean.getRe_level();
		
		getConnect();
		
		try {
			
			String levelsql = "update board set re_level = re_level + 1 where ref = ? and re_level > ? ";
			
			pstmt = con.prepareStatement(levelsql);
			
			pstmt.setInt(1, ref);
			pstmt.setInt(2, re_level);
			
			pstmt.executeUpdate();
			
			String sql = " insert into board values(board_seq.NEXTVAL,?,?,?,?,sysdate,?,?,?,0,?)";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bean.getWriter());
			pstmt.setString(2, bean.getEmail());
			pstmt.setString(3, bean.getSubject());
			pstmt.setString(4, bean.getPassword());
			pstmt.setInt(5, ref);
			pstmt.setInt(6, re_step+1);
			pstmt.setInt(7, re_level+1);
			pstmt.setString(8, bean.getContent());
			pstmt.executeUpdate();
			con.close();
			
			
			
			
		}catch(Exception e) {
			
			
			e.printStackTrace();
			
		}
		
	}
	
	
public BoardBean getOneUpdateBoard(int num) {
		
		
		BoardBean bean = new BoardBean();
		
		getConnect();
		
		try {
			
			
			String readsql = "update board set readcount = readcount+1 where num = ?";
			
			pstmt = con.prepareStatement(readsql);
			
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
			
			String sql = "select * from board where num = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				bean.setNum(rs.getInt(1));
				bean.setWriter(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setSubject(rs.getString(4));
				bean.setPassword(rs.getString(5));
				bean.setReg_date(rs.getDate(6).toString());
				bean.setRef(rs.getInt(7));
				bean.setRe_step(rs.getInt(8));
				bean.setRe_level(rs.getInt(9));
				bean.setReadcount(rs.getInt(10));
				bean.setContent(rs.getString(11));
				
			}
			
			con.close();
			
		} catch(Exception e) {
			
			
			
			e.printStackTrace();
			
		}
		
		
		return bean;
		
	}


	public String getPass(int num) {
		
		
		String pass = "";
		
		getConnect();
		
		try {
			
			String sql = "select password from board where num = ? ";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				pass = rs.getString(1);
				
				
			}
			
			con.close();
			
		}catch(Exception e) {
			
			
			e.printStackTrace();
			
		}
		
		return pass;
	}

	public void updateBoard(BoardBean bean) {
		
		
		getConnect();
		
		try {
			
			String sql = "update board set subject = ? , content = ? where num = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bean.getSubject());
			pstmt.setString(2, bean.getContent());
			pstmt.setInt(3, bean.getNum());
			
			pstmt.executeUpdate();
			
			con.close();
			
			
			
		}catch(Exception e) {
			
			
			e.printStackTrace();
			
		}
		
		
	}
	
	public void deleteBoard(int num) {
		
		
		getConnect();
		
		try {
			
			String sql = "delete from board where num = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
			con.close();
			
			
		} catch(Exception e) {
			
			
			e.printStackTrace();
			
		}
		
		
	}
	
	
	public int getAllCount() {
		
		
		getConnect();
		
		int count = 0;
		
		try {
			
			String sql = "select count(*) from board";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				count = rs.getInt(1);
				
			}
			
			con.close();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return count;
		
	}
	
}
