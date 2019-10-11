import java.sql.Connection;

public class Principal {
	public static void main(String[] args) {
		Conexao cx = new Conexao();
		Connection conn = null;
		
		conn = cx.getConnection();
		if (conn == null) {
			System.out.println("A conexao nao ocorreu");
		} else {
			System.out.println("O banco de dados esta conectado");
		}
	}
}
