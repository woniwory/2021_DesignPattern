
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


public class SummonersRift{
    private static int damage = 0;
    public static void  main(String args[]){


        String ChampionType = "Kayle";
        String OpponentChampionType1 = "Talon";

        ChampionFactory factoryofChampionFactory = new ChampionFactory(OpponentChampionType1);
        Champion champion = factoryofChampionFactory.createChampion(ChampionType);
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
            Sylas sylas;
            Talon talon;

            public key(Champion champion, String ChampionType){
                if (ChampionType =="Kayle") {
                    Kayle kayle = (Kayle) champion; // 다운캐스팅
                    this.kayle = kayle;
                }

               else if (ChampionType =="Sylas") {

                    Sylas sylas = (Sylas) champion; // 다운캐스팅
                    this.sylas = sylas;

                }
                else if (ChampionType =="Talon") {
                    Talon talon = (Talon) champion; // 다운캐스팅
                    this.talon = talon;
                }

            }


            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
//                System.out.println(e);

                if (e.getKeyCode() == 81){
                    if (ChampionType =="Kayle") {

                        damage += kayle.Q();
                        System.out.println(kayle.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(kayle.getName()+"의 HP는 "+kayle.getHP()+"입니다 (최대 HP : "+kayle.getMax_HP()+")");
                        System.out.println(kayle.getName()+"의 Mana는 "+kayle.getMana()+"입니다 (최대 Mana : "+kayle.getMax_Mana()+")");
                        System.out.println();
                    }
                    else if (ChampionType =="Sylas") {
                        damage += sylas.Q();
                        System.out.println(sylas.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(sylas.getName()+"의 HP는 "+sylas.getHP()+"입니다 (최대 HP : "+sylas.getMax_HP()+")");
                        System.out.println(sylas.getName()+"의 Mana는 "+sylas.getMana()+"입니다 (최대 Mana : "+sylas.getMax_Mana()+")");
                        System.out.println();
                    }

                    else if (ChampionType =="Talon") {
                        damage += talon.Q();
                        System.out.println(talon.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(talon.getName()+"의 HP는 "+talon.getHP()+"입니다 (최대 HP : "+talon.getMax_HP()+")");
                        System.out.println(talon.getName()+"의 Mana는 "+talon.getMana()+"입니다 (최대 Mana : "+talon.getMax_Mana()+")");
                        System.out.println();
                    }


                }
                else if (e.getKeyCode() == 87){
                    if (ChampionType =="Kayle") {
                        damage += kayle.W();
                        System.out.println(kayle.getName()+"의 HP는 "+kayle.getHP()+"입니다 (최대 HP : "+kayle.getMax_HP()+")");
                        System.out.println(kayle.getName()+"의 Mana는 "+kayle.getMana()+"입니다 (최대 Mana : "+kayle.getMax_Mana()+")");
                        System.out.println();

                    }
                    else if (ChampionType =="Sylas") {
                        damage += sylas.W();
                        System.out.println(sylas.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(sylas.getName()+"의 HP는 "+sylas.getHP()+"입니다 (최대 HP : "+sylas.getMax_HP()+")");
                        System.out.println(sylas.getName()+"의 Mana는 "+sylas.getMana()+"입니다 (최대 Mana : "+sylas.getMax_Mana()+")");
                        System.out.println();

                    }
                    else if (ChampionType =="Talon") {
                        damage += talon.W();
                        System.out.println(talon.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(talon.getName()+"의 HP는 "+talon.getHP()+"입니다 (최대 HP : "+talon.getMax_HP()+")");
                        System.out.println(talon.getName()+"의 Mana는 "+talon.getMana()+"입니다 (최대 Mana : "+talon.getMax_Mana()+")");
                        System.out.println();
                    }
                }
                else if (e.getKeyCode() == 69){
                    if (ChampionType =="Kayle") {
                        damage += kayle.E();
                        System.out.println(kayle.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(kayle.getName()+"의 HP는 "+kayle.getHP()+"입니다 (최대 HP : "+kayle.getMax_HP()+")");
                        System.out.println(kayle.getName()+"의 Mana는 "+kayle.getMana()+"입니다 (최대 Mana : "+kayle.getMax_Mana()+")");
                        System.out.println();

                    }
                    else if (ChampionType =="Sylas") {
                        damage += sylas.E();
                        System.out.println(sylas.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(sylas.getName()+"의 HP는 "+sylas.getHP()+"입니다 (최대 HP : "+sylas.getMax_HP()+")");
                        System.out.println(sylas.getName()+"의 Mana는 "+sylas.getMana()+"입니다 (최대 Mana : "+sylas.getMax_Mana()+")");
                        System.out.println();

                    }
                    else if (ChampionType =="Talon") {
                    damage += talon.E();
                    System.out.println(talon.getName()+"이 준 피해는 "+damage+"입니다");
                    System.out.println(talon.getName()+"의 HP는 "+talon.getHP()+"입니다 (최대 HP : "+talon.getMax_HP()+")");
                    System.out.println(talon.getName()+"의 Mana는 "+talon.getMana()+"입니다 (최대 Mana : "+talon.getMax_Mana()+")");
                    System.out.println();
                }



                }
                else if (e.getKeyCode() == 82){
                    if (ChampionType =="Kayle") {
                        damage += kayle.R();
                        System.out.println(kayle.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(kayle.getName()+"의 HP는 "+kayle.getHP()+"입니다 (최대 HP : "+kayle.getMax_HP()+")");
                        System.out.println(kayle.getName()+"의 Mana는 "+kayle.getMana()+"입니다 (최대 Mana : "+kayle.getMax_Mana()+")");
                        System.out.println();

                    }
                    else if (ChampionType =="Sylas") {
                        damage += sylas.R();
                        System.out.println(sylas.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println(sylas.getName()+"의 HP는 "+sylas.getHP()+"입니다 (최대 HP : "+sylas.getMax_HP()+")");
                        System.out.println(sylas.getName()+"의 Mana는 "+sylas.getMana()+"입니다 (최대 Mana : "+sylas.getMax_Mana()+")");
                        System.out.println();

                    }

                    else if (ChampionType =="Talon") {
                        damage += talon.R();
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
                        damage += sylas.Passive();
                        System.out.println(sylas.getName()+"이 준 피해는 "+damage+"입니다");
                        System.out.println();

                    }

                    else if (ChampionType =="Talon") {
                        damage += talon.Passive();
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
