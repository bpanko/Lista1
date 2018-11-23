import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;

/**
 * Classe Janela
 */
public class Janela extends JFrame implements KeyListener {

    final int LARGURA = 600;
    final int ALTURA = 600;

    /**
     * Construtor da classe Janela
     */ 
    public Janela() {
        super("Super Vetores");
        setSize(LARGURA, ALTURA);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
    //    desenhaEixos(51, 51);
        desenhaVetor(100, 200);
    }

    public void keyReleased(KeyEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }   

    public Point cartParaCG(Point p) {
        return new Point(p.x + LARGURA/2, (-1)*p.y + ALTURA/2);
    }

    public void desenhaEixos(int dx, int dy) {
        Graphics g = this.getGraphics();
        g.drawLine(0, ALTURA/2, LARGURA, ALTURA/2);
        g.drawLine(LARGURA/2, 0, LARGURA/2, ALTURA);
        int compLinha = 40;
        g.setColor(Color.GRAY);
        for (int i = LARGURA/2; i < LARGURA; i+= dx) {
            g.drawLine(i, 0, i,ALTURA);
            g.drawLine(LARGURA-i, 0, LARGURA-i,ALTURA);
        }
        for (int i = ALTURA/2; i < ALTURA; i+= dy) {
            g.drawLine(0,i,LARGURA,i);
            g.drawLine(0,ALTURA-i,LARGURA,ALTURA-i);
        }
        g.setColor(Color.BLACK);
        for (int i = LARGURA/2; i < LARGURA; i+= dx) {
            g.drawLine(i, ALTURA/2-compLinha/2, i,ALTURA/2+compLinha/2 );
            g.drawLine(LARGURA-i, ALTURA/2-compLinha/2, 
                LARGURA-i,ALTURA/2+compLinha/2 );
        }
        for (int i = ALTURA/2; i < ALTURA; i+= dy) {
            g.drawLine(LARGURA/2-compLinha/2,i,LARGURA/2+compLinha/2,i);
            g.drawLine(LARGURA/2-compLinha/2,ALTURA-i,LARGURA/2+compLinha/2,ALTURA-i);
        }
       
    }

    public void desenha{

    }

    public void desenhaVetor(int x, int y) {
        Graphics g = this.getGraphics();
        g.setColor(Color.BLUE);
        
        double inicioVetor_x = 0;
        double inicioVetor_y = 0;
        double fimVetor_x = x;
        double fimVetor_y = y;
        double inicioSeta_x = fimVetor_x;
        double inicioSeta_y = fimVetor_y;
        double fimSeta1_x = inicioSeta_x +30*Math.cos(3*Math.PI/4);
        double fimSeta1_y = inicioSeta_y +30*Math.sin(3*Math.PI/4);
        double fimSeta2_x = inicioSeta_x +30*Math.cos(5*Math.PI/4);
        double fimSeta2_y = inicioSeta_y +30*Math.sin(5*Math.PI/4);

        Point inicioVetor = cartParaCG(new Point((int)inicioVetor_x, 
                    (int) inicioVetor_y));   
        Point fimVetor = cartParaCG(new Point((int)fimVetor_x, (int)fimVetor_y));
        Point inicioSeta = cartParaCG(new Point((int)inicioSeta_x, (int)inicioSeta_y));   
        Point fimSeta1 = cartParaCG(new Point((int)fimSeta1_x, (int)fimSeta1_y));   
        Point fimSeta2 = cartParaCG(new Point((int)fimSeta2_x, (int)fimSeta2_y));   

        g.drawLine(inicioVetor.x, inicioVetor.y, fimVetor.x, fimVetor.y);
        g.drawLine(inicioSeta.x, inicioSeta.y, fimSeta1.x, fimSeta1.y);
        g.drawLine(inicioSeta.x, inicioSeta.y, fimSeta2.x, fimSeta2.y);
    }

}
