import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Usuario> usuariosCadastrados = new ArrayList<>();
  
    public void cadastrarUsuario(Usuario usuario) {
      usuariosCadastrados.add(usuario);
    }

    public List<Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }
  }
  