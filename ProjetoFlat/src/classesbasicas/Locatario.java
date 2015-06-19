package classesbasicas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Locatario {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String endereco;
	private String apto;
	private String numero;
	private String bairro;
	private String cep;
	@Column(nullable = false)
	private String cidade;
	private String estado;
	private String telefone;
	private String telefone2;
	private String procedencia;
	private String motivoviagem;
	private String email;
	private String identidade;
	private String orgexp;
	private String passaporte;
	@Column(nullable = false)
	private String cpf;
	private int idade;
	private String estadocivil;
	private String responsavelpagamento;
	private String carro;
	private String carrocor;
	private String placa;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCarrocor() {
		return carrocor;
	}

	public void setCarrocor(String carrocor) {
		this.carrocor = carrocor;
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	public String getResponsavelpagamento() {
		return responsavelpagamento;
	}

	public void setResponsavelpagamento(String responsavelpagamento) {
		this.responsavelpagamento = responsavelpagamento;
	}

	

	

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpg() {
		return cpf;
	}

	public void setCpg(String cpg) {
		this.cpf = cpg;
	}

	public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	public String getOrgexp() {
		return orgexp;
	}

	public void setOrgexp(String orgexp) {
		this.orgexp = orgexp;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotivoviagem() {
		return motivoviagem;
	}

	public void setMotivoviagem(String motivoviagem) {
		this.motivoviagem = motivoviagem;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getApto() {
		return apto;
	}

	public void setApto(String apto) {
		this.apto = apto;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
