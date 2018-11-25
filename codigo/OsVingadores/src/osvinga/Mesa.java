package osvinga;

import br.ufsc.inf.leobr.cliente.Jogada;
import java.util.ArrayList;
import java.util.Collections;

public class Mesa implements Jogada {

    protected Monte monteCompra;
    protected Monte monteVilao;
    protected Monte monteDescarte;
    protected Monte monteVilaosAtivos;
    protected boolean partidaEmAndamento;
    protected ArrayList<Jogador> jogadores;
    protected boolean comJogadorVencedor;

    public Mesa() {
        monteCompra = new Monte();
        monteVilao = new Monte();
        monteDescarte = new Monte();
        monteVilaosAtivos = new Monte();
        partidaEmAndamento = true;
        jogadores = new ArrayList();
        comJogadorVencedor = false;

    }

    public boolean isPartidaEmAndamento() {
        return this.partidaEmAndamento;
    }

    public ArrayList<Jogador> getColecaoJogadores() {
        return this.jogadores;
    }

    public void removerVilao(Carta vilao) {
        this.monteVilaosAtivos.removerCarta(vilao);
    }

    public boolean isJogadorVencedor() {
        return comJogadorVencedor;
    }

    public Jogador temJogadorVencedor() {
        Jogador jogadorVencedor = new Jogador();
        int tamanho = this.monteVilaosAtivos.tamanhoMonte();
        if (tamanho == 0) {
            this.setComJogadorVencedor(comJogadorVencedor);
            jogadorVencedor = encontrarJogadorVencedor();
        }

        return jogadorVencedor;
    }

    public void setComJogadorVencedor(boolean aTemjogadorVencedor) {
        this.comJogadorVencedor = aTemjogadorVencedor;
    }

    public Jogador encontrarJogadorVencedor() {
        Jogador jogador1 = this.jogadores.get(0);
        Jogador jogador2 = this.jogadores.get(1);

        if (jogador2.temPontuacaoMaior(jogador1.getPontuacao())) {
            return jogador2;
        } else {
            return jogador1;
        }

    }

    public TipoArtefato verificarQualArtefato(Artefato cartaArtefato) {
        return cartaArtefato.getTipo();
    }

    public Carta comprarCartaDoMonteCompra() {
        Carta novaCarta = this.monteCompra.comprarCarta();
        return novaCarta;
    }

    public void trocarMaosDosJogadores() {
        Jogador jogador1 = this.jogadores.get(0);
        Jogador jogador2 = this.jogadores.get(1);

        Monte maoJogador1 = jogador1.getMao();
        Monte maoJogador2 = jogador2.getMao();

        jogador1.setMaoJogador(maoJogador2);
        jogador2.setMaoJogador(maoJogador1);

        return;
    }

    public Monte getMonteCompra() {
        return monteCompra;
    }

    public void setMonteCompra(Monte monteCompra) {
        this.monteCompra = monteCompra;
    }

    public Monte getMonteVilao() {
        return monteVilao;
    }

    public void setMonteVilao(Monte monteVilao) {
        this.monteVilao = monteVilao;
    }

    public Monte getMonteDescarte() {
        return monteDescarte;
    }

    public void setMonteDescarte(Monte monteDescarte) {
        this.monteDescarte = monteDescarte;
    }

    public Monte getMonteVilaosAtivos() {
        return monteVilaosAtivos;
    }

    public void setMonteVilaosAtivos(Monte monteVilaosAtivos) {
        this.monteVilaosAtivos = monteVilaosAtivos;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void cirarMonteDeCompra() {
        Monte novoMonteCompra = new Monte();

        novoMonteCompra.adicionarCarta(new Personagem("Groot", 1, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Bucky", 1, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Shuri", 1, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Wong", 1, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Matins", 1, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Falcão", 1, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Homem-Aranha", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Thor", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Okoye", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Feiticeira Escarlate", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Rocky", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Pantera Negra", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Hulk", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Gamora", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Doutor Estranho", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Drax", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Máquina de Combate", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Visão", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Senhor das Estrelas", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Viúva Negra", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Hulkbuster", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Nebulosa", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Capitão América", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Homem de Ferro", 2, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Pantera Negra e Shuri", 3, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Doutro Estranho e Wong", 3, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Groot e Rocky", 3, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Homem de Ferro e Homem-Aranha", 4, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Senhor das Estrelas e Gamora", 4, TipoPersonagem.HEROI));
        novoMonteCompra.adicionarCarta(new Personagem("Thor e Hulk", 4, TipoPersonagem.HEROI));

        Collections.shuffle(novoMonteCompra.getCartas());
        this.setMonteCompra(novoMonteCompra);
    }

    public void criarMonteVilao() {
        Monte novoMonteVilao = new Monte();
        
        novoMonteVilao.adicionarCarta(new Personagem("Batedor da Ordem Negra",5,TipoPersonagem.VILAO));
        novoMonteVilao.adicionarCarta(new Personagem("Batedor da Ordem Negra",5,TipoPersonagem.VILAO));
        novoMonteVilao.adicionarCarta(new Personagem("Batedor da Ordem Negra",5,TipoPersonagem.VILAO));
        novoMonteVilao.adicionarCarta(new Personagem("Batedor da Ordem Negra",5,TipoPersonagem.VILAO));
        novoMonteVilao.adicionarCarta(new Personagem("Batedor da Ordem Negra",5,TipoPersonagem.VILAO));
        novoMonteVilao.adicionarCarta(new Personagem("Abate Obsidiano",8,TipoPersonagem.VILAO));
        novoMonteVilao.adicionarCarta(new Personagem("Fauce de Ébano",8,TipoPersonagem.VILAO));
        novoMonteVilao.adicionarCarta(new Personagem("Corvus Glaive",10,TipoPersonagem.VILAO));
        novoMonteVilao.adicionarCarta(new Personagem("Próxima Meia-Noite",10,TipoPersonagem.VILAO));
        novoMonteVilao.adicionarCarta(new Personagem("Thanos",15,TipoPersonagem.VILAO));
        
        Collections.shuffle(novoMonteVilao.getCartas());
        this.setMonteVilao(novoMonteVilao);
    }

}
