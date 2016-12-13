package application.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.core.PreparedStatementCreator;

/**
 * 
 * @author kunyao
 *
 */
public class PrimaryKeyHodler implements PreparedStatementCreator {

	private String sql = null;

	private Object[] args = null;
		
	public PrimaryKeyHodler(String sql, Object[] args) {
		this.sql = sql;
		this.args = args;
	}
	
	public PreparedStatement createPreparedStatement(Connection con)
			throws SQLException {
		PreparedStatement ps = con.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS);

		for(int i=0,len=args.length;i<len;i++) {			
			ps.setObject(i + 1, args[i]);
		}
		
		return ps;
	}
}
