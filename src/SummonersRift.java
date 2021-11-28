import java.util.Scanner;
import java.util.ArrayList;

public class SummonersRift {
    private static int damage = 0;
    public static void  main(String args[]){


        String ChampionType = "Sylas";

        ChampionFactory championFactory = new ChampionFactory();
        Champion champion = championFactory.createChampion(ChampionType);
        System.out.println(champion);


        Scanner sc = new Scanner(System.in);
        System.out.println("커맨드를 입력하세요 : ");
        String cmd = sc.nextLine();
        String[] cmdArray = cmd.split(" ");

        ArrayList<String> TokenArray = new ArrayList<>();
        for(String i : cmdArray){
            TokenArray.add(i);
            // System.out.println(i);
        }

        if (ChampionType =="Kayle") {

            Kayle kayle = (Kayle) champion; // 다운캐스팅
            KayleQStrategy KayleQ = new KayleQStrategy(kayle);
            KayleWStrategy KayleW = new KayleWStrategy(kayle);
            KayleEStrategy KayleE = new KayleEStrategy(kayle);
            KayleRStrategy KayleR = new KayleRStrategy(kayle);


            for(int i = 0; i < TokenArray.size(); i++){
                if (TokenArray.get(i).equals("Q")) {  damage += KayleQ.action(); }
                else if (TokenArray.get(i).equals("W")) {  damage += KayleW.action(); }
                else if (TokenArray.get(i).equals("E")) { damage += KayleE.action(); }
                else if (TokenArray.get(i).equals("R")) {  damage += KayleR.action(); }
            }
            System.out.println(kayle.getName()+"이 준 피해는 "+damage+"입니다");
            System.out.println(kayle.getName()+"의 HP는 "+kayle.getHP()+"입니다 (최대 HP : "+kayle.getMax_HP()+")");
            System.out.println(kayle.getName()+"의 Mana는 "+kayle.getMana()+"입니다 (최대 Mana : "+kayle.getMax_Mana()+")");


        }

        else if (ChampionType =="Sylas") {
            Sylas sylas = (Sylas) champion; // 다운캐스팅
            SylasQStrategy SylasQ = new SylasQStrategy(sylas);
            SylasWStrategy SylasW = new SylasWStrategy(sylas);
            SylasEStrategy SylasE = new SylasEStrategy(sylas);
//            SylasRStrategy SylasR = new SylasRStrategy(sylas);

            for(int i = 0; i < TokenArray.size(); i++){
                if (TokenArray.get(i).equals("Q")) {  damage += SylasQ.action(); }
                else if (TokenArray.get(i).equals("W")) {  damage += SylasW.action(); }
                else if (TokenArray.get(i).equals("E")) { damage += SylasE.action(); }
//                else if (TokenArray.get(i).equals("R")) {  damage += SylasR.action(); }
            }
            System.out.println(sylas.getName()+"가 준 피해는 "+damage+"입니다");
            System.out.println(sylas.getName()+"의 HP는 "+sylas.getHP()+"입니다 (최대 HP : "+sylas.getMax_HP()+")");
            System.out.println(sylas.getName()+"의 Mana는 "+sylas.getMana()+"입니다 (최대 Mana : "+sylas.getMax_Mana()+")");
        }







    }


}
