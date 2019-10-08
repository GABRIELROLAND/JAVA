
public class Pessoa {

		privare String nome;
		privare int idade;
		privare String sexo;
		
		public void fazerAniv()
		{
			this.idade = idade++;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
}
