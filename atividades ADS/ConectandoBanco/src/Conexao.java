import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private String user = "root";
	private String password = "";
	private String host = "127.0.0.1:3308";
	private String dbName = "Agenda";
	private String url="jdbc:mysql://"+host+"/"+dbName;

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
