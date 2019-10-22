import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class Principal {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Conexao cx = new Conexao();
		Connection conn = null;
		
		conn = cx.getConnection();
		if (conn == null) {
			System.out.println("A conexao nao ocorreu");
		} else {
			System.out.println("O banco de dados esta conectado");
		}
		
		
		//Inclusão de registros
		String nome;
		String ddd;
		String telefone;
		String ddd2;
		String telefone2;
		String sql;
		
		System.out.print("Informe o Nome da pessoa:");
		nome = sc.next();
		System.out.print("Informe o DDD da pessoa:");
		ddd = sc.next();
		System.out.print("Informe o Telefone da pessoa:");
		telefone = sc.next();
		System.out.print("Informe o DDD 2 da pessoa:");
		ddd2 = sc.next();
		System.out.print("Informe o Telefone 2 da pessoa:");
		telefone2 = sc.next();
		
		sql = "INSERT INTO pessoa (NOMEPESSOA,COD_CATEGORIA,COD_TIPOPESSOA) values ('"+nome+"',2,1)\n"
			  +"INSERT INTO telefone (DDDTEL,NUMEROTELEFONE,COD_PESSOA,COD_TIPOTEL) values ('"+ddd+"','"+telefone+"',1,1)\n" +
			  "INSERT INTO telefone (DDDTEL,NUMEROTELEFONE,COD_PESSOA,COD_TIPOTEL) values ('"+ddd2+"','"+telefone2+"',1,3)\n";
		System.out.print(sql);
		java.sql.Statement st = conn.createStatement();
		int intRs = st.executeUpdate(sql);
		if (intRs>0) {
			System.out.println("Inclusao realizada com sucesso");
		} else {
			System.out.println("Inclusao nao realizada");
		}
		
		
	}
}
