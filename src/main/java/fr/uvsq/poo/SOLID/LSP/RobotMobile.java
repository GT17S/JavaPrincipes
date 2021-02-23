package fr.uvsq.poo.SOLID.LSP;

/**
 * La classe <code>RobotMobile</code> représente  un robot sur un terrain qui peut se deplacer(qui est mobile et non statique).
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class RobotMobile extends RobotStatique {

    public Position getPOS(){return this.position;}
    public Direction getDIR(){return this.direction;}

    public void setPOS(int x, int y){this.position.setX(x); this.position.setY(y);}
    public void setDIR(String direction){this.direction.setDirection(direction);}

    public RobotMobile(Position position1, String direction1) {
        super(position1, direction1);
    }

    public void avance() {
        if (this.direction.getDirection() == "LEFT") {
            this.position.setX(this.position.getX() - 1);
        } else if (this.direction.getDirection() == "RIGHT") {
            this.position.setX(this.position.getX() + 1);
        } else if (this.direction.getDirection() == "BACKWARD"){
            this.position.setY(this.position.getY() - 1);
        } else this.position.setY(this.position.getY() + 1);
    }

    public void tourne(){
        if (this.direction.getDirection() == "LEFT") {
            setDIR("FORWARD");
        } else if (this.direction.getDirection() == "RIGHT") {
            setDIR("BACKWARD");
        } else if (this.direction.getDirection() == "BACKWARD"){
            setDIR("LEFT");
        } else
            setDIR("RIGHT");
    }

    public static void main(String[] args) {
        RobotMobile m= new RobotMobile(new Position(0,0),"LEFT");
        m.avance();
        System.out.println("x= "+ m.getPOS().getX()+"  "+"Y= "+m.getPOS().getY());

        m.avance();
        System.out.println("x= "+ m.getPOS().getX()+"  "+"Y= "+m.getPOS().getY());

        m.avance();
        System.out.println("x= "+ m.getPOS().getX()+"  "+"Y= "+m.getPOS().getY());

        m.setDIR("RIGHT");
        System.out.println(m.getDIR().getDirection());
        m.avance();
        System.out.println("x= "+ m.getPOS().getX()+"  "+"Y= "+m.getPOS().getY());

        m.tourne();
        System.out.println(m.getDIR().getDirection());

    }
}
