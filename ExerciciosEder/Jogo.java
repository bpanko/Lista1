import java.io.*;

public class Jogo {

    final int LARGURA = Definicoes.LARGURA_MAPA;
    final int ALTURA = Definicoes.ALTURA_MAPA;
    final int Q_CELULAS_HOR = LARGURA / Definicoes.LARGURA_CELULA;
    final int Q_CELULAS_VER = ALTURA / Definicoes.ALTURA_CELULA;

    int mapa[][] = null;

    private static Jogo jogo = null;
    Tela tela = null;

    private Jogo(String nomeArquivo) {
        mapa = new int[Definicoes.LARGURA_MAPA/Definicoes.LARGURA_CELULA]
            [Definicoes.ALTURA_MAPA/Definicoes.ALTURA_CELULA]; 
        carregarMapa(nomeArquivo);
        tela = new Tela(this);
    }

    public static void main(String [] args) {
        Jogo jogo = new Jogo(args[0]);
    }

    public void carregarMapa(String nomeJogo) {
        FileInputStream entrada = null;
        try {
            entrada = new FileInputStream(nomeJogo);
            for (int x = 0; x < mapa.length; x++) {
                for (int y = 0; y < mapa[x].length; y++) {
                    mapa[x][y] = entrada.read();
                    System.out.print(mapa[x][y]);
                }
                System.out.println();
            }

        }
        catch (IOException i) {
            System.out.println(i);
        }
        finally {
            try {
                if (entrada != null)
                    entrada.close();
            }
            catch (IOException i) {
                System.out.println(i);
            }
        }
    }

    public static Jogo criar(String nomeArquivo) {
        if (jogo == null)
            jogo = new Jogo(nomeArquivo);
        return jogo;
    }

    public void tecla(Teclas t) {
        for (int x = 0; x < mapa.length; x++) {
            for (int y = 0; y < mapa[x].length; y++) {
                if (mapa[x][y] == 1) {
                    tela.area.getGraphics().fillRect(x * Definicoes.LARGURA_CELULA,
                        y * Definicoes.ALTURA_CELULA, Definicoes.LARGURA_CELULA,
                        Definicoes.ALTURA_CELULA);
                }
            }
        }

    }
}

