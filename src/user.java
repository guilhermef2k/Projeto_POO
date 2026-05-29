//package projeto.src;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;


public class user {
    private String name;
    private String email;
    private String password;
    private String cpf;
    private boolean funcionario;
    private boolean cliente;
    private boolean ativo;

    public user(String name, String email, String password, String cpf, boolean funcionario, boolean cliente, boolean ativo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.ativo = ativo;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public user criarUser(String name, String email, String password, String cpf, boolean funcionario, boolean cliente, boolean ativo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.ativo = ativo;
    }
    public void editarUser(String name, String email, String password, String cpf, boolean funcionario, boolean cliente, boolean ativo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.ativo = ativo; 
   
    }
    public void autenticarUser(String password) {
        if (this.password.equals(password)) {
            this.ativo = true;
        } else {
            this.ativo = false;
        }
    }
    public void desativarUser() {
        this.ativo = false;
    }

    List <user> listaUsuarios = new ArrayList<user>();

    public void adicionarUsuario(user usuario) {
        listaUsuarios.add(usuario);
    }

