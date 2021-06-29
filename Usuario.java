package com.javatpoint.bean;

import java.util.*;

public class Usuario {
	
	private int ID_usuario;
	private String nome;
	private String nome_social;
	private String e_mail;
	private String senha;
	private String cpf;
	private Date data_nasc= new Date();
	private String tel_celular;
	private String tel_fixo;
	private String foto;
	private String end_cep;
	private String end_estado;
	private String end_cidade;
	private String end_bairro;
	private String end_rua;
	private String end_numero;
	private String end_complemento;
	private Date data_cadastro= new Date();


	public int getID_usuario() {
		return ID_usuario;
	}
	public void setID_usuario(int ID_usuario) {
		this.ID_usuario= ID_usuario;
	}
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome= nome;
	}
	
	public String getnome_social() {
		return nome_social;
	}
	public void setnome_social(String nome_social) {
		this.nome_social= nome_social;
	}
	
	public String gete_mail() {
		return e_mail;
	}
	public void sete_mail(String e_mail) {
		this.e_mail= e_mail;
	}
	
	public String getsenha() {
		return senha;
	}
	public void setsenha(String senha) {
		this.senha= senha;
	}
	
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf= cpf;
	}
	
	public Date getdata_nasc() {
		return data_nasc;
	}
	public void setdata_nasc(Date data_nasc) {
		this.data_nasc= data_nasc;
	}
	
	public String gettel_celular() {
		return tel_celular;
	}
	public void settel_celular(String tel_celular) {
		this.tel_celular= tel_celular;
	}
	
	public String gettel_fixo() {
		return tel_fixo;
	}
	public void settel_fixo(String tel_fixo) {
		this.tel_fixo= tel_fixo;
	}
	
	public String getfoto() {
		return foto;
	}
	public void setfoto(String foto) {
		this.foto= foto;
	}
	
	public String getend_cep() {
		return end_cep;
	}
	public void setend_cep(String end_cep) {
		this.end_cep = end_cep ;
	}
	
	public String getend_estado() {
		return end_estado;
	}
	public void setend_estado(String end_estado) {
		this.end_estado= end_estado;
	}
	
	public String getend_cidade() {
		return end_cidade;
	}
	public void setend_cidade(String end_cidade) {
		this.end_cidade= end_cidade;
	}
	
	public String getend_bairro() {
		return end_bairro;
	}
	public void setend_bairro(String end_bairro) {
		this.end_bairro= end_bairro;
	}
	
	public String getend_rua() {
		return end_rua;
	}
	public void setend_rua(String end_rua) {
		this.end_rua= end_rua;
	}
	
	public String getend_numero() {
		return end_numero;
	}
	public void setend_numero(String end_numero) {
		this.end_numero= end_numero;
	}
	
	public String getend_complemento() {
		return end_complemento;
	}
	public void setend_complemento(String end_complemento) {
		this.end_complemento= end_complemento;
	}
	
	public Date getdata_cadastro() {
		return data_cadastro;
	}
	public void setdata_cadastro(Date data_cadastro) {
		this.data_cadastro= data_cadastro;
	}

}
	
	
