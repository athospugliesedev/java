import java.util.List;

public class Usuario {
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private String endereco;
    private String telefone;
  
    public Usuario(String nome, String sobrenome, String email, String senha, String endereco, String telefone) {
      this.nome = nome;
      this.sobrenome = sobrenome;
      this.email = email;
      this.senha = senha;
      this.endereco = endereco;
      this.telefone = telefone;
    }
  
    public String getNome() {
      return nome;
    }
  
    public void setNome(String nome) {
      this.nome = nome;
    }
  
    public String getSobrenome() {
      return sobrenome;
    }
  
    public void setSobrenome(String sobrenome) {
      this.sobrenome = sobrenome;
    }
  
    public String getEmail() {
      return email;
    }
  
    public void setEmail(String email) {
      this.email = email;
    }
  
    public String getSenha() {
      return senha;
    }
  
    public void setSenha(String senha) {
      this.senha = senha;
    }
  
    public String getEndereco() {
      return endereco;
    }
  
    public void setEndereco(String endereco) {
      this.endereco = endereco;
    }
  
    public String getTelefone() {
      return telefone;
    }
  
    public void setTelefone(String telefone) {
      this.telefone = telefone;
    }

  
  public static void main(String[] args) {
      Usuario novoUsuario = new Usuario("Athos", "Pugliese", "athospugliesedev@gmail.com", "123456", "Rua A, 123", "999999999");
      Cadastro cadastro = new Cadastro();
      cadastro.cadastrarUsuario(novoUsuario);

      List<Usuario> usuariosCadastrados = cadastro.getUsuariosCadastrados();
    for (Usuario usuario : usuariosCadastrados) {
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Sobrenome: " + usuario.getSobrenome());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Senha: " + usuario.getSenha());
        System.out.println("Endereço: " + usuario.getEndereco());
        System.out.println("Telefone: " + usuario.getTelefone());

  }
}
}