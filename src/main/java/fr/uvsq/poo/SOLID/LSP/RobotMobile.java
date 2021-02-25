package fr.uvsq.poo.SOLID.LSP;

/**
 * La classe <code>RobotMobile</code> représente  un robot sur un terrain qui peut se deplacer(qui est mobile et non statique).
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class RobotMobile extends RobotStatique {

    public void setPOS(int x, int y){this.getPOS().setX(x); this.getPOS().setY(y);}
    public void setDIR(String direction){this.getDIR().setDirection(direction);}

    public RobotMobile(Position position1, String direction1) {
        super(position1, direction1);
    }

    public void avance() {
        if (this.getDIR().getDirection() == "LEFT") {
            this.getPOS().setX(this.getPOS().getX() - 1);
        } else if (this.getDIR().getDirection() == "RIGHT") {
            this.getPOS().setX(this.getPOS().getX() + 1);
        } else if (this.getDIR().getDirection() == "BACKWARD"){
            this.getPOS().setY(this.getPOS().getY() - 1);
        } else this.getPOS().setY(this.getPOS().getY() + 1);
    }

    public void tourne(){
        if (this.getDIR().getDirection() == "LEFT") {
            setDIR("FORWARD");
        } else if (this.getDIR().getDirection() == "RIGHT") {
            setDIR("BACKWARD");
        } else if (this.getDIR().getDirection() == "BACKWARD"){
            setDIR("LEFT");
        } else
            setDIR("RIGHT");
    }

}
