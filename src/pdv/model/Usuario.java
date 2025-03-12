package pdv.model;

public class Usuario {
    private String nome;
    private boolean autorizado;

    public Usuario(String nome, boolean autorizado) {
        this.nome = nome;
        this.autorizado = autorizado;
    }

    public boolean isAutorizado() {
        return autorizado;
    }
}
