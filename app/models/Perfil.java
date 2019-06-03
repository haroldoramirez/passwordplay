package models;

public enum Perfil {

    USUARIO(1), GERENTE(2), SUPERVISOR(3), ADMINISTRADOR(4);

    public int valorPerfil;

    Perfil(int valor) {
        valorPerfil = valor;
    }
}
