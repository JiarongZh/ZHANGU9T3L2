import java.awt.Graphics;
public class Line extends Shape{

    public Line(){
        super();
    }

    public void draw(Graphics g){
        g.setColor(getColor());
        g.drawLine(getp1().x,getp1().y,getp2().x,getp2().y);
    }

}
