package osvinga;

import osvinga.gui.InterfaceMesa;

public class AtorJogador {

    //Atributos:
    protected InterfaceMesa interfaceMesa;
    protected ControladorJogo controladorJogo;

    //Construtor:
    public AtorJogador(ControladorJogo controladorJogo) {
        this.interfaceMesa = new InterfaceMesa(this);
        this.controladorJogo = controladorJogo;
    }

    //Metodos:
    public InterfaceMesa getInterfaceMesa() {
        return interfaceMesa;
    }

    public void setInterfaceMesa(InterfaceMesa interfaceMesa) {
        this.interfaceMesa = interfaceMesa;
    }

    public ControladorJogo getControladorJogo() {
        return controladorJogo;
    }

    public void setControladorJogo(ControladorJogo controladorJogo) {
        this.controladorJogo = controladorJogo;
    }

    public void conectar() {
        this.controladorJogo.conectar();
    }

    public String solictarEnderecoServidor() {
        return this.interfaceMesa.solictarEnderecoServidor();
    }

    public String solicitarNomeJogador() {
        return this.interfaceMesa.solicitarNomeJogador();
    }

    public void mostrarResultadoConectar(int resultado) {
        this.interfaceMesa.mostrarResultadoConectar(resultado);
    }

    public void iniciarPartida() {
        this.controladorJogo.iniciarPartida();
    }

    public void notificarPartidaEmAndamento() {
        this.interfaceMesa.notificarPartidaEmAndamento();
    }

    public void notificarSucessoIniciarPartida() {
        this.interfaceMesa.notificarSucessoIniciarPartida();
    }

    public void notificarNaoConectado() {
        this.interfaceMesa.notificarNaoConectado();
    }

    public void desconectar() {
        this.controladorJogo.desconectar();
    }

    public void notificarDesconexao(boolean desconectou) {
        this.interfaceMesa.notificarDesconexao(desconectou);
    }

    public void passarTurno() {
        boolean resultado = this.controladorJogo.passarTurno(); //Mudado
        this.interfaceMesa.notificarPassarTurno(resultado);
    }

    public boolean solicitarConfirmacaoPassarTurno() {
        return this.interfaceMesa.solicitarConfirmacaoPassarTurno();
    }

    public void notificarPassarTurno(boolean resultado) {
        this.interfaceMesa.notificarPassarTurno(resultado);
    }

    public void capturarVilao(Carta vilao, Monte monte) {
        boolean capturar = this.interfaceMesa.solicitarConfirmacaoCapturarVilao();
        boolean resultado  = false;
        if (capturar) {
            resultado = this.controladorJogo.capturarVilao(monte, vilao);
            this.interfaceMesa.informarCaputrarVilao(resultado);
        }
        
    }

    public boolean solicitarConfirmacaoCapturarVilao() {
        return this.interfaceMesa.solicitarConfirmacaoCapturarVilao();
    }

    public void informarCaputrarVilao(boolean mensagem) {
        this.interfaceMesa.informarCaputrarVilao(mensagem);
    }

    public void atualizarInterface(Mesa mesa, int indexJogaodr) {
        this.interfaceMesa.atualizarInterface(mesa,indexJogaodr);
    }

    public void notificarJogadorVencedor(Jogador jogadorVencedor) {
        this.interfaceMesa.notificarJogadorVencedor(jogadorVencedor);
    }

    public void usarJoia(Artefato cartaJoia) {
        this.controladorJogo.usarJoia(cartaJoia);
    }

    public boolean confirmarUtilizacaoJoia() {
        return this.interfaceMesa.confirmarUtilizacaoJoia();
    }

    public void notificarNaoTemVilaoRoubar() {
        this.interfaceMesa.notificarNaoTemVilaoRoubar();
    }
}
