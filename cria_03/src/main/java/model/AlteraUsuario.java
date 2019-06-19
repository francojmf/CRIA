package model;
  
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
  
@Entity
@Table(name = "usuario")
public class AlteraUsuario {
  
         @Id
         private Long id;
         @Column
         private String nome;
         @Column
         private String nomeusuario;
         public String getNomeUsuario() {
			return nomeusuario;
		}
		public void setNomeUsuario(String nomeusuario) {
			this.nomeusuario = nomeusuario;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public String getEntidade() {
			return entidade;
		}
		public void setEntidade(String entidade) {
			this.entidade = entidade;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public Long getId_cidade() {
			return id_cidade;
		}
		public void setId_cidade(Long id_cidade) {
			this.id_cidade = id_cidade;
		}
		@Column
         private String senha;
         @Column
         private String entidade;
         @Column
         private String telefone;
         @Column
         private Long id_cidade;
         @Column
         private String cpf;
         @Column
         private String obs;
          
         public Long getId() {
                   return id;
         }
         public void setId(Long id) {
                   this.id = id;
         }
         public String getNome() {
                   return nome;
         }
         public void setNome(String nome) {
                   this.nome = nome;
         }
         public String getCpf() {
                   return cpf;
         }
         public void setCpf(String cpf) {
                   this.cpf = cpf;
         }
         public String getObs() {
                   return obs;
         }
         public void setObs(String obs) {
                   this.obs = obs;
         }
}