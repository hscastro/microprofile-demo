package com.hscastro.consumers;

public class MunicipioDTO {
	
	private Integer id;
	
	private String nome;
	
	private Integer populacao;
	
	public MunicipioDTO() {
		// TODO Auto-generated constructor stub
	}

	public MunicipioDTO(Integer id, String nome, Integer populacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPopulacao() {
		return populacao;
	}

	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MunicipioDTO other = (MunicipioDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MunicipioDTO [id=" + id + ", nome=" + nome + ", populacao=" + populacao + "]";
	}
	
	
	
}
