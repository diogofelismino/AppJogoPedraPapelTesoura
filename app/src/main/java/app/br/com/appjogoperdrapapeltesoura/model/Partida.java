package app.br.com.appjogoperdrapapeltesoura.model;

public class Partida {

    private boolean pedra;
    private boolean tesoura;
    private boolean papel;

    public boolean isPedra() {
        return pedra;
    }

    public void setPedra(boolean pedra) {
        this.pedra = pedra;
    }

    public boolean isTesoura() {
        return tesoura;
    }

    public void setTesoura(boolean tesoura) {
        this.tesoura = tesoura;
    }

    public boolean isPapel() {
        return papel;
    }

    public void setPapel(boolean papel) {
        this.papel = papel;
    }
}
