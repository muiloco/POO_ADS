import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String user;
	private String password;
	private String host;
	private String dbName;
	private String url="jbbc:mysql://"+host+"/"+dbName;
	
	public Connection conexao = null;
	
	public Conexao() {}
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			return null;
		}
		try {
			this.conexao = (Connection) DriverManager.getConnection(url, user, password);
		} catch (SQLException ex) {
			return null;
		}
		return this.conexao;
	}
}
