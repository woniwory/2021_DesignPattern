import java.util.Scanner;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


public class SummonersRift {
    private static int damage = 0;
    public static void  main(String args[]){


        String ChampionType = "Kayle";
        String OpponentChampionType1 = "Kayle";

        ChampionFactory championFactory = new ChampionFactory();
        Champion champion = championFactory.createChampion(ChampionType);
        System.out.println(champion);
        System.out.println();


        JFrame fr = new JFrame(ChampionType);
        fr.setSize(700,190);//프레임의 크기
        fr.setResizable(false);//창의 크기를 변경하지 못하게
        fr.setLocationRelativeTo(null);//창이 가운데 나오게
        fr.setVisible(true);//창이 보이게
        JPanel pn = new JPanel();
        JButton[] bt = new JButton[5];

        pn.setLayout(null); // 레이아웃을 내맘대로 설정가능하게 해줌.



        bt[0] = new JButton("Attack");
        bt[1] = new JButton("Q");
        bt[2] = new JButton("W");
        bt[3] = new JButton("E");
        bt[4] = new JButton("R");

        for (int i = 0; i < 5; i++)
        {
            bt[i].setBounds(50+125*i, 25, 100, 100);
            pn.add(bt[i]);
        }



        fr.setContentPane(pn);
        fr.setVisible(true);


        class key implements KeyListener {
            Kayle kayle;
            KaylePassiveStrategy KaylePassive;
            KayleQStrategy KayleQ;
            KayleWStrategy KayleW;
            KayleEStrategy KayleE;
            KayleRStrategy KayleR;

            Sylas sylas;
            SylasPassiveStrategy SylasPassive;
            SylasQStrategy SylasQ;
            SylasWStrategy SylasW;
            SylasEStrategy SylasE;
            SylasRStrategy SylasR;


            Talon talon;
            TalonPassiveStrategy TalonPassive;
            TalonQStrategy TalonQ;
            TalonWStrategy TalonW;
            TalonEStrategy TalonE;
            TalonRStrategy TalonR;




            public key(Champion champion, String ChampionType){
                if (ChampionType =="Kayle") {

                    Kayle kayle = (Kayle) champion; // 다운캐스팅
                    KaylePassiveStrategy KaylePassive = new KaylePassiveStrategy(kayle);
                    KayleQStrategy KayleQ = new KayleQStrategy(kayle);
                    KayleWStrategy KayleW = new KayleWStrategy(kayle);
                    KayleEStrategy KayleE = new KayleEStrategy(kayle);
                    KayleRStrategy KayleR = new KayleRStrategy(kayle);

                    this.kayle = kayle;
                    this.KaylePassive = KaylePassive;
                    this.KayleQ = KayleQ;
                    this.KayleW = KayleW;
                    this.KayleE = KayleE;
                    this.KayleR = KayleR;


                }

                else if (ChampionType =="Sylas") {
                    Kayle DummyKayle = new Kayle();
                    Talon DummyTalon = new Talon();
                    Sylas sylas = (Sylas) champion; // 다운캐스팅
                    SylasPassiveStrategy SylasPassive = new SylasPassiveStrategy(sylas);
                    SylasQStrategy SylasQ = new SylasQStrategy(sylas);
                    SylasWStrategy SylasW = new SylasWStrategy(sylas);
                    SylasEStrategy SylasE = new SylasEStrategy(sylas);
                    SylasRStrategy SylasR = new SylasRStrategy(sylas,OpponentChampionType1);


                    this.sylas = sylas;
                    this.SylasPassive = SylasPassive;
                    this.SylasQ = SylasQ;
                    this.SylasW = SylasW;
                    this.SylasE = SylasE;
                    this.SylasR = SylasR;

                }
                else if (ChampionType =="Talon") {
                    Talon talon = (Talon) champion; // 다운캐스팅
                    TalonPassiveStrategy TalonPassive = new TalonPassiveStrategy(talon);
                    TalonQStrategy TalonQ = new TalonQStrategy(talon);
                    TalonWStrategy TalonW = new TalonWStrategy(talon);
                    TalonEStrategy TalonE = new TalonEStrategy(talon);
                    TalonRStrategy TalonR = new TalonRStrategy(talon);

                    this.talon = talon;
                    this.TalonPassive = TalonPassive;
                    this.TalonQ = TalonQ;
                    this.TalonW = TalonW;
                    this.TalonE = TalonE;
                    this.TalonR = TalonR;



                }

            }


            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
//                System.out.println(e);

                if (e.getKeyCode() == 81){
                    if (ChampionType =="Kayle") {
                        damage += KayleQ.action();
                        System.out.println(kayle.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(kayle.getName()+"의 HP는 "+kayle.getHP()+"입니다 (최대 HP : "+kayle.getMax_HP()+")");
                        System.out.println(kayle.getName()+"의 Mana는 "+kayle.getMana()+"입니다 (최대 Mana : "+kayle.getMax_Mana()+")");
                        System.out.println();
                    }
                    else if (ChampionType =="Sylas") {
                        damage += SylasQ.action();
                        System.out.println(sylas.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(sylas.getName()+"의 HP는 "+sylas.getHP()+"입니다 (최대 HP : "+sylas.getMax_HP()+")");
                        System.out.println(sylas.getName()+"의 Mana는 "+sylas.getMana()+"입니다 (최대 Mana : "+sylas.getMax_Mana()+")");
                        System.out.println();
                    }

                    else if (ChampionType =="Talon") {
                        damage += TalonQ.action();
                        System.out.println(talon.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(talon.getName()+"의 HP는 "+talon.getHP()+"입니다 (최대 HP : "+talon.getMax_HP()+")");
                        System.out.println(talon.getName()+"의 Mana는 "+talon.getMana()+"입니다 (최대 Mana : "+talon.getMax_Mana()+")");
                        System.out.println();
                    }


                }
                else if (e.getKeyCode() == 87){
                    if (ChampionType =="Kayle") {
                        damage += KayleW.action();
                        System.out.println(kayle.getName()+"의 HP는 "+kayle.getHP()+"입니다 (최대 HP : "+kayle.getMax_HP()+")");
                        System.out.println(kayle.getName()+"의 Mana는 "+kayle.getMana()+"입니다 (최대 Mana : "+kayle.getMax_Mana()+")");
                        System.out.println();

                    }
                    else if (ChampionType =="Sylas") {
                        damage += SylasW.action();
                        System.out.println(sylas.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(sylas.getName()+"의 HP는 "+sylas.getHP()+"입니다 (최대 HP : "+sylas.getMax_HP()+")");
                        System.out.println(sylas.getName()+"의 Mana는 "+sylas.getMana()+"입니다 (최대 Mana : "+sylas.getMax_Mana()+")");
                        System.out.println();

                    }
                    else if (ChampionType =="Talon") {
                        damage += TalonW.action();
                        System.out.println(talon.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(talon.getName()+"의 HP는 "+talon.getHP()+"입니다 (최대 HP : "+talon.getMax_HP()+")");
                        System.out.println(talon.getName()+"의 Mana는 "+talon.getMana()+"입니다 (최대 Mana : "+talon.getMax_Mana()+")");
                        System.out.println();
                    }
                }
                else if (e.getKeyCode() == 69){
                    if (ChampionType =="Kayle") {
                        damage += KayleE.action();
                        System.out.println(kayle.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(kayle.getName()+"의 HP는 "+kayle.getHP()+"입니다 (최대 HP : "+kayle.getMax_HP()+")");
                        System.out.println(kayle.getName()+"의 Mana는 "+kayle.getMana()+"입니다 (최대 Mana : "+kayle.getMax_Mana()+")");
                        System.out.println();

                    }
                    else if (ChampionType =="Sylas") {
                        damage += SylasE.action();
                        System.out.println(sylas.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(sylas.getName()+"의 HP는 "+sylas.getHP()+"입니다 (최대 HP : "+sylas.getMax_HP()+")");
                        System.out.println(sylas.getName()+"의 Mana는 "+sylas.getMana()+"입니다 (최대 Mana : "+sylas.getMax_Mana()+")");
                        System.out.println();

                    }
                    else if (ChampionType =="Talon") {
                    damage += TalonE.action();
                    System.out.println(talon.getName()+"이 준 피해는 "+damage+"입니다");
                    System.out.println(talon.getName()+"의 HP는 "+talon.getHP()+"입니다 (최대 HP : "+talon.getMax_HP()+")");
                    System.out.println(talon.getName()+"의 Mana는 "+talon.getMana()+"입니다 (최대 Mana : "+talon.getMax_Mana()+")");
                    System.out.println();
                }



                }
                else if (e.getKeyCode() == 82){
                    if (ChampionType =="Kayle") {
                        damage += KayleR.action();
                        System.out.println(kayle.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(kayle.getName()+"의 HP는 "+kayle.getHP()+"입니다 (최대 HP : "+kayle.getMax_HP()+")");
                        System.out.println(kayle.getName()+"의 Mana는 "+kayle.getMana()+"입니다 (최대 Mana : "+kayle.getMax_Mana()+")");
                        System.out.println();

                    }
                    else if (ChampionType =="Sylas") {
                        damage += SylasR.action();
                        System.out.println(sylas.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(sylas.getName()+"의 HP는 "+sylas.getHP()+"입니다 (최대 HP : "+sylas.getMax_HP()+")");
                        System.out.println(sylas.getName()+"의 Mana는 "+sylas.getMana()+"입니다 (최대 Mana : "+sylas.getMax_Mana()+")");
                        System.out.println();

                    }

                    else if (ChampionType =="Talon") {
                        damage += TalonR.action();
                        System.out.println(talon.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(talon.getName()+"의 HP는 "+talon.getHP()+"입니다 (최대 HP : "+talon.getMax_HP()+")");
                        System.out.println(talon.getName()+"의 Mana는 "+talon.getMana()+"입니다 (최대 Mana : "+talon.getMax_Mana()+")");
                        System.out.println();
                    }
                }
                else if (e.getKeyCode() ==65){
                    if (ChampionType =="Kayle") {
                        damage += kayle.getAD();
                        System.out.println(kayle.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println();

                    }
                    else if (ChampionType =="Sylas") {
                        damage += SylasPassive.action();
                        System.out.println(sylas.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println();

                    }

                    else if (ChampionType =="Talon") {
                        damage += TalonPassive.action();
                        System.out.println(talon.getName() + "이 준 피해는 " + damage + "입니다");
                        System.out.println();
                    }

                }



            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
            }
        }
        fr.setVisible(true);
        fr.addKeyListener(new key(champion,ChampionType));







    }


}
