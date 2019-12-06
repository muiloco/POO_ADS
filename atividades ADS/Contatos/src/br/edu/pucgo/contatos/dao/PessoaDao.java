package br.edu.pucgo.contatos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.edu.pucgo.contatos.modelo.Pessoa;
import br.edu.pucgo.contatos.persistencia.Conexao;

public class PessoaDao extends Conexao {
	public ArrayList<Pessoa> listAll() throws ClassNotFoundException, InterruptedException, SQLException
	{
		ResultSet rs = null;
		Connection conn = this.getConnection();
		ArrayList<Pessoa> al = new ArrayList<Pessoa>();
		Pessoa pessoa = new Pessoa();
		Statement st = null;
		int x = 0;
		
		String select = "SELECT * FROM pessoa order by nome_pessoa";
		try {
			
			st = conn.createStatement();
			rs = st.executeQuery(select);
			while (rs.next()) {
				pessoa = new Pessoa();
				pessoa.setCodigo(rs.getInt("codigo"));
				pessoa.setNome_pessoa(rs.getString("nome_pessoa"));
				pessoa.setCpf(rs.getString("cpf"));
				al.add(pessoa);
			}
		} catch (SQLException e) {
			al = null;
		} finally {
			
		}
		return al;
	}
	
	public ArrayList<Pessoa> listAllSql(String sql) throws ClassNotFoundException, InterruptedException, SQLException
	{
		ResultSet rs = null;
		Connection conn = this.getConnection();
		ArrayList<Pessoa> al = new ArrayList<Pessoa>();
		Pessoa pessoa = new Pessoa();
		Statement st = null;
		int x = 0;
		
		try {
			
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				pessoa = new Pessoa();
				pessoa.setCodigo(rs.getInt("codigo"));
				pessoa.setNome_pessoa(rs.getString("nome_pessoa"));
				pessoa.setCpf(rs.getString("cpf"));
				al.add(pessoa);
			}
		} catch (SQLException e) {
			al = null;
		} finally {
			
		}
		return al;
	}
	
	public ArrayList<Pessoa> buscaPorNomeGeral(String str) throws ClassNotFoundException, InterruptedException, SQLException
	{
		ResultSet rs = null;
		Connection conn = this.getConnection();
		ArrayList<Pessoa> al = new ArrayList<Pessoa>();
		Pessoa pessoa = new Pessoa();
		Statement st = null;
		int x = 0;
		
		String select = "SELECT * FROM pessoa WHERE nome_pessoa = '"+str+"'";
		if (str.equals("")) {
			select = "SELECT * FROM pessoa order by nome_pessoa";
		}
		try {
			
			st = conn.createStatement();
			rs = st.executeQuery(select);
			while (rs.next()) {
				pessoa = new Pessoa();
				pessoa.setCodigo(rs.getInt("codigo"));
				pessoa.setNome_pessoa(rs.getString("nome_pessoa"));
				pessoa.setCpf(rs.getString("cpf"));
				al.add(pessoa);
			}
		} catch (SQLException e) {
			al = null;
		} finally {
			
		}
		return al;
	}
	
	public Pessoa buscaPorNome(String str) throws ClassNotFoundException, InterruptedException, SQLException
	{
		ResultSet rs = null;
		Connection conn = this.getConnection();
		ArrayList<Pessoa> al = new ArrayList<Pessoa>();
		Pessoa pessoa = new Pessoa();
		Statement st = null;
		int x = 0;
		
		String select = "SELECT * FROM pessoa WHERE nome_pessoa = '"+str+"'";
		try {
			
			st = conn.createStatement();
			rs = st.executeQuery(select);
			while (rs.next()) {
				pessoa = new Pessoa();
				pessoa.setCodigo(rs.getInt("codigo"));
				pessoa.setNome_pessoa(rs.getString("nome_pessoa"));
				pessoa.setCpf(rs.getString("cpf"));
				al.add(pessoa);
			}
		} catch (SQLException e) {
			pessoa = null;
		} finally {
			
		}
		return pessoa;
	}
	
	public Pessoa buscaPorId(int id) throws ClassNotFoundException, InterruptedException, SQLException
	{
		ResultSet rs = null;
		Connection conn = this.getConnection();
		Pessoa pessoa = new Pessoa();
		Statement st = null;
		int x = 0;
		
		String select = "SELECT * FROM pessoa WHERE codigo = "+id;
		try {
			
			st = conn.createStatement();
			rs = st.executeQuery(select);
			while (rs.next()) {
				pessoa = new Pessoa();
				pessoa.setCodigo(rs.getInt("codigo"));
				pessoa.setNome_pessoa(rs.getString("nome_pessoa"));
				pessoa.setCpf(rs.getString("cpf"));
			}
		} catch (SQLException e) {
			pessoa = null;
		} finally {
			
		}
		return pessoa;
	}
	
	public Pessoa incluir(Pessoa pessoa) throws ClassNotFoundException, InterruptedException, SQLException
	{
		boolean retorno = false;
		Connection conn = this.getConnection();
		Statement st = null;
		st = conn.createStatement();
		PreparedStatement pstm;
		String select = "SELECT * FROM pessoa WHERE nome_pessoa = ?";
		PreparedStatement pstm1;
		pstm1 = conn.prepareStatement(select);
		pstm1.setString(1, pessoa.getNome_pessoa());
		String palavraChave = "";
		ResultSet rs1 = pstm1.executeQuery();
		if (rs1.next()) {
			pessoa.setMsgErro("Pessoa ja cadastrada");
			return pessoa;
		}
		String insert = "INSERT INTO pessoa (nome_pessoa, cpf)";
		insert += " VALUES(?,?)";
		try {
			//conn = this.getConnection();
			pstm = conn.prepareStatement(insert);
			pstm.setString(1, pessoa.getNome_pessoa());
			pstm.setString(2, pessoa.getCpf());
			pstm.executeUpdate();
			pessoa.setMsgErro("Inclusao realizada com sucesso");
		} catch (SQLException e) {
			pessoa.setMsgErro("Erro na Inclusao");
		}
		return pessoa;
	}
	
	public Pessoa alterar(Pessoa pessoa) throws ClassNotFoundException, InterruptedException, SQLException
	{
		boolean retorno = false;
		Connection conn = this.getConnection();
		PreparedStatement pstm;
		String update = "UPDATE pessoa SET nome_pessoa = ?, cpf = ?";
		update += "WHERE codigo = ?";
		try {
			pstm = conn.prepareStatement(update);
			pstm.setString(1, pessoa.getNome_pessoa());
			pstm.setString(2, pessoa.getCpf());
			pstm.setInt(3, pessoa.getCodigo());
			pstm.execute();
			retorno = true;
			pessoa.setMsgErro("Alteracao realizada com sucesso");
		} catch (SQLException e) {
			pessoa.setMsgErro("Erro na Alteracao");
		}
		return pessoa;
	}
}
