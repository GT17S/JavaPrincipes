package fr.uvsq.poo.SOLID.LSP;

import org.junit.Before;
import org.junit.Test;


public class lspTEST {

    RobotMobile RM1,RM2,RM3;
    RobotStatique RS1,RS2,RS3;
    Terrain terrain;

    @Before
    public void setup() {

        RM1=new RobotMobile(new Position(0,0),"RIGHT");
        RM2=new RobotMobile(new Position(1,0),"FORWARD");
        RM3=new RobotMobile(new Position(0,1),"FORWARD");
        RS1=new RobotMobile(new Position(99,99),"BACKWARD");
        RS2=new RobotMobile(new Position(99,98),"LEFT");
        RS3=new RobotMobile(new Position(9,6),"RIGHT");

        terrain=new Terrain();
    }


    @Test
    public void test() {

        terrain.getMobileList().add(0,RM1);
        terrain.getMobileList().add(1,RM2);
        terrain.getMobileList().add(2,RM3);

        terrain.getRobotList().add(RS1);
        terrain.getRobotList().add(RS2);
        terrain.getRobotList().add(RS3);
        terrain.getRobotList().add(RM1);
        terrain.getRobotList().add(RM2);
        terrain.getRobotList().add(RM3);

        int i=0;
        while(i<terrain.getRobotList().size()) {
            System.out.println("la direction de robot est : " + terrain.getRobotList().get(i).getDIR().getDirection());
            System.out.println("et ça position est de : " + "("+terrain.getRobotList().get(i).getPOS().getX()+"," + terrain.getRobotList().get(i).getPOS().getY()+")");
            i++;
        }

        terrain.avancerTous();
        System.out.println("***********************************************************************************************");


        for (Robot robot : terrain.getRobotList()) {
            System.out.println("la direction de robot est : " + robot.getDIR().getDirection());
            System.out.println("et ça position est de : " + "("+robot.getPOS().getX()+"," + robot.getPOS().getY()+")");

        }

    }

}