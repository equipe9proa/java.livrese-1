package com.javatpoint.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.javatpoint.bean.Usuario;

public class UsuarioDao {
	
	public static Connection getConnection(){
		Connection con=null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/livre_se","root","");
		}catch(Exception e){
		System.out.println("Erro Connection SQL");
		System.out.println(e);
		}
		return con;
		}
	
		/* CRUD - Create */
		public static int save(Usuario u){
			int status=0;
			try{
				Connection con=getConnection();
				PreparedStatement ps=con.prepareStatement(
				"insert into usuario(nome,nome_social,e_mail,senha,cpf,data_nasc,tel_celular,"
				+ "tel_fixo,foto,end_cep,end_estado,end_cidade,end_bairro,end_rua,end_numero,"
				+ "end_complemento,data_cadastro) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,NOW())");
				ps.setString(1,u.getnome());
				ps.setString(2,u.getnome_social());
				ps.setString(3,u.gete_mail());
				ps.setString(4,u.getsenha());
				ps.setString(5,u.getcpf());
				ps.setDate(6,new java.sql.Date(u.getdata_nasc().getTime()));
				ps.setString(7,u.gettel_celular());
				ps.setString(8,u.gettel_fixo());
				ps.setString(9,u.getfoto());
				ps.setString(10,u.getend_cep());
				ps.setString(11,u.getend_estado());
				ps.setString(12,u.getend_cidade());
				ps.setString(13,u.getend_bairro());
				ps.setString(14,u.getend_rua());
				ps.setString(15,u.getend_numero());
				ps.setString(16,u.getend_complemento());
				status=ps.executeUpdate();
				
		}catch(Exception e){
			System.out.println("Erro Insert SQL");
			System.out.println(e);
		}
		return status;
		}
		
		/* CRUD - Update */
		public static int update(Usuario u){
		    int status=0;
		    try{
		        Connection con=getConnection();
		        PreparedStatement ps=con.prepareStatement(  
		"UPDATE usuario SET nome=?,nome_social=?,e_mail=?,senha=?,cpf=?,data_nasc=?,tel_celular=?"
				+ "tel_fixo=?,foto=?,end_cep=?,end_estado=?,end_cidade=?,end_bairro=?,end_rua=?,"
				+ "end_numero=?,end_complemento=? WHERE ID_usuario=?");
		        
		        ps.setString(1,u.getnome());
				ps.setString(2,u.getnome_social());
				ps.setString(3,u.gete_mail());
				ps.setString(4,u.getsenha());
				ps.setString(5,u.getcpf());
				ps.setDate(6,new java.sql.Date(u.getdata_nasc().getTime()));
				ps.setString(7,u.gettel_celular());
				ps.setString(8,u.gettel_fixo());
				ps.setString(9,u.getfoto());
				ps.setString(10,u.getend_cep());
				ps.setString(11,u.getend_estado());
				ps.setString(12,u.getend_cidade());
				ps.setString(13,u.getend_bairro());
				ps.setString(14,u.getend_rua());
				ps.setString(15,u.getend_numero());
				ps.setString(16,u.getend_complemento());
		        ps.setInt(17,u.getID_usuario());
		        status=ps.executeUpdate();
		    }catch(Exception e){
		    	System.out.println("Erro Update SQL");
		    	System.out.println(e);
		    }
		    return status;
		}
		
		/* CRUD - Delete */
		public static int delete(Usuario u){
		    int status=0;
		    try{
		        Connection con=getConnection();
		        PreparedStatement ps=con.prepareStatement("DELETE FROM usuario WHERE ID_usuario=?");
		        ps.setInt(1,u.getID_usuario());
		        status=ps.executeUpdate();
		    }catch(Exception e){
		    	System.out.println("Erro Delete SQL");
		    	System.out.println(e);
		    }
		  
		    return status;
		}
		
				
		
		
		/* CRUD - Read */
		public static List<Usuario> getRecordsBySQL(String sql){
		    List<Usuario> list=new ArrayList<Usuario>();
		    
		    try{
		        Connection con=getConnection();
		        PreparedStatement ps=con.prepareStatement(sql);
		        ResultSet rs=ps.executeQuery();
		        while(rs.next()){
		        	Usuario u=new Usuario();
		            u.setID_usuario(rs.getInt("ID_usuario"));
		            u.setnome(rs.getString("nome"));
		            u.setnome_social(rs.getString("nome_social"));
		            u.sete_mail(rs.getString("e_mail"));
		            u.setsenha(rs.getString("senha"));
		            u.setcpf(rs.getString("cpf"));
		            u.setdata_nasc(rs.getDate("data_nasc"));
		            u.settel_celular(rs.getString("tel_celular"));
		            u.settel_fixo(rs.getString("tel_fixo"));
		            u.setfoto(rs.getString("foto"));
		            u.setend_cep(rs.getString("end_cep"));
		            u.setend_estado(rs.getString("end_estado"));
		            u.setend_cidade(rs.getString("end_cidade"));
		            u.setend_bairro(rs.getString("end_bairro"));
		            u.setend_rua(rs.getString("end_rua"));
		            u.setend_numero(rs.getString("end_numero"));
		            u.setend_complemento(rs.getString("end_complemento"));
		            list.add(u);
		        }
		    }catch(Exception e){
		    	System.out.println("Erro getAllRecords SQL");
		    	System.out.println(e);
		    }
		    return list;
		}
}

