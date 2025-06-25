import java.util.Date;
import java.util.Scanner;
public class Evcpluss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date currentDateANDTime=new Date();
        int mibankpin=2424;
        int  mybankbalance=200;
        int mibankbalance=700;
        int mypin = 1303;
        String code = "*770#";
        double haragaga = 1000;
        System.out.println("fadlan gali numberka");
        String mycode = input.next();
        if (!mycode.equals(code))
            System.out.println(" invalid code");
        else if (mycode.equals(code))
            System.out.println(" fadlan geli pinkaga");


        int pin = input.nextInt();

        if (pin != mypin) {
            System.out.println(" wrong pin , try again");
        } else {
            System.out.println("==EVC PLUS==");
            System.out.println("1: itus haragaga");
            System.out.println("2: kaarka hadalka");
            System.out.println("3  uwareeji evc plus");
            System.out.println("4: bixi biil ");
            System.out.println("5: warbixin kooban");
            System.out.println("6: maaraynta ");
            System.out.print("7: salaam bank:");
            System.out.println("0: kabax");
            int choice = input.nextInt();


            if (choice == 1) {
                System.out.println(" haragagu wa " + haragaga);

            } else if (choice == 2) {
                System.out.println("1:ku shubo air time");
                System.out.println("2:ugu shub air time");
                System.out.println("3:ku shubo internet & air time");
                System.out.println("4:ugu shub internet ");
                int dooro = input.nextInt();
                switch (dooro) {
                    case 1:
                        System.out.println("fadlan geli lacagta");
                        double airtime = input.nextInt();
                        System.out.println("ma hubta inaad " + " " + airtime + " " + " ugu shubatid undefined" +
                                " 1: haa" +
                                " 2: maya");
                        double anotherchoice = input.nextInt();
                        double newblance = airtime - haragaga;
                        if (anotherchoice == 1 && (airtime < haragaga))
                            System.out.println(" waa ku gulaystay ina ku shubatid air time haragagu waa" + newblance);
                        else if (airtime > haragaga)
                            System.out.println("kugu ma filna haraga xisabtada");
                        else if (anotherchoice == 2)
                            System.out.println(" mahadanid");

                        break;


                    case 2:
                        System.out.println(" fadlan geli mobelka");
                        int mobile = input.nextInt();
                        System.out.println("fadlan geli lacagta");
                        int lacagta = input.nextInt();
                        System.out.println(" ma hubta in " + lacagta + " " + "ugu shubtid" + mobile +
                                " 1:haa" +
                                " 2:maya");
                        int jawab = input.nextInt();
                        double urbalance = lacagta - haragaga;
                        if (jawab == 1)
                            if (lacagta < haragaga)
                                System.out.println(" wa ku gulaysatay ina air time ugu shubto " + mobile + "haragau ha waa " + urbalance);
                            else
                                System.out.println("haraga xisabtada kuguma filna");
                        break;

                    case 3:
                        System.out.println("1: isbuucle" +
                                "2:malinle");
                        int subchoice = input.nextInt();

                        if (subchoice == 1)
                            System.out.println("fadlan geli lacagta");
                        int lacagta2 = input.nextInt();
                        System.out.println("ma hubta ina " + lacagta2 + "ku shubatid" +
                                " 1:haa" + " 2:maya");
                        int subchoice2 = input.nextInt();
                        double nowblance = lacagta2 - haragaga;
                        if (subchoice2 == 1)
                            if (lacagta2 < haragaga)
                                System.out.println(" waxa ku shubtay " + lacagta2 + " haragau waa" + nowblance);
                            else
                                System.out.println(" kuguma filna haraga xisabtada");
                        break;

                    case 4:
                        System.out.println(" fadlan geli numberka");
                        int numberka = input.nextInt();
                        System.out.println(" fadlan geli lacagta");
                        int lacgta = input.nextInt();
                        System.out.println("ma hubta in aad " + numberka + "ugu shubtid" + lacgta
                                + " 1:haa"
                                + " 2:maya");
                        int choice2 = input.nextInt();
                        double newharaga = lacgta - haragaga;
                        if (choice2 == 1)
                            if (lacgta < haragaga)
                                System.out.println("waxa ugu shubtay " + lacgta + "numberka" + numberka + " haragaga hada wa " + newharaga);
                            else
                                System.out.println(" haraga xisabtada kuguma filna");
                        break;
                }


            } else if (choice == 3) {
                System.out.println("fadlan geli numberkaga");
                int numberkaga = input.nextInt();
                System.out.println(" fadlan geli lacagta");
                int lacagta3 = input.nextInt();
                System.out.println(" ma hubta inaad " + " " + lacagta3 + " " + "uwarejisid " + numberkaga + " "
                        + "1:haa" + " " +
                        "2:maya");
                int doorasho = input.nextInt();
                double newbalance = lacagta3 - haragaga;

                if (doorasho == 1)
                    if (lacagta3 < haragaga)
                        System.out.println("waad ku gulaysatay , haragag wa " + newbalance);
                    else
                        System.out.println(" haraga xisabtada kuguma filna fadlan isku day markale");
                else
                    System.out.println("mahadsanid");


            } else if (choice == 4) {
                System.out.println(" bixi bil ");
                System.out.println(" 1: post paid ");
                System.out.println(" 2: ku iibso");
                int answer = input.nextInt();
                switch (answer) {
                    case 1:
                        System.out.println(" 1: ogow biilka");
                        System.out.println(" 2: bixi biilka");
                        System.out.println(" 3:kabixi billka");
                        int taabo = input.nextInt();
                        if (taabo == 2)
                            System.out.println(" fadlan geli lacagta");
                        int lacgtabiilka = input.nextInt();
                        System.out.println(" ma hubta ina aad bixisid bill lacgtiisu tahay " + lacgtabiilka +
                                " 1 : haa " +
                                " 2 : maya");
                        int jawabta = input.nextInt();
                        if (jawabta == 1)
                            if (lacgtabiilka < haragaga)
                                System.out.println(" waa bixisay");
                            else
                                System.out.println("haraga xisabtada kuguma filna ");
                        if (jawabta == 2)
                            System.out.println(" welcome markle ");
                        if (taabo == 3)
                            System.out.println(" fadlan geli numberka");
                        int numbillkaga = input.nextInt();
                        System.out.println(" fadlan geli lacagta");
                        int moneybills = input.nextInt();
                        System.out.println(" ma hubta in aad biil ka bixisid NO." + numbillkaga + " bill lacgtiisu tahay" +
                                moneybills + " 1: haa" +
                                " 2: maya");
                        int uranswer = input.nextInt();
                        if (uranswer == 1)
                            if (moneybills < haragaga)
                                System.out.println(" waa ku gulaystay");
                            else
                                System.out.println(" you welcome");

                        break;
                    case 2:
                        System.out.println(" fadlan geli aqoonsiga ganacsigaga");
                        int unique = input.nextInt();
                        System.out.println(" wad ibsatay");
                        break;
                }


            } else if (choice == 5) {
                System.out.println(" warbixin kooban");
                System.out.println(" 1: last action");
                System.out.println(" 2: warejinti u danbaysay");
                System.out.println(" 3: ibsashadi ugu danbeysay");
                System.out.println(" 4 : last 3 actions");
                System.out.println(" 5: Email my activity ");
                int inchoice = input.nextInt();
                switch (inchoice) {
                    case 1:
                        System.out.println("waxa 100$ ka heshay 0615111588");
                        break;
                    case 2:
                        System.out.println("waxa 10$ u warejisay  0612005408");
                        break;
                    case 3:
                        System.out.println(" waxad 50$ u wareejisay midnimo super market");
                        break;
                    case 4:
                        System.out.println(" waxa kugu so dirnay fariin ahaan ka fiirso wll ");
                        break;
                    case 5:
                        System.out.println("waxaan kugu so dirnay emailkaga");
                        break;
                }


            } else if (choice == 6) {
                System.out.println(" 1: bedel lamberka sirta ah ");
                System.out.println(" 2: bedel luqada ");
                System.out.println(" 3: wargelin mobile lumay ");
                System.out.println(" 4: lacag xirasho ");
                System.out.println(" 5: u celi lacag qaldantay ");

                int mchoice = input.nextInt();
                switch (mchoice) {
                    case 1:
                        System.out.println("fadlan geli pinkaga cusub");
                        int newpin = input.nextInt();
                        System.out.println("hubi pinkaga cusub");
                        int checkpin = input.nextInt();
                        if (newpin == checkpin)
                            System.out.println("wa ku gulaystay ina badashid pinkaga");
                        else
                            System.out.println("isku mid maha isku day markale mahdsanid");
                        break;
                    case 2:
                        System.out.println(" fadlan dooro luqada aad rabto" +
                                " 1 : english" +
                                "2 : soomali");
                        int language = input.nextInt();
                        if (language == 1)
                            System.out.println("wad ku guulesate inad bedesho luqada");
                        else
                            System.out.println(" wad ku gulaystay badalida luqada");
                        break;
                    case 3:

                        int lumidnumberpin = 1234;
                        System.out.println(" fadlan geli numberka lumay");
                        int missnum = input.nextInt();
                        System.out.println(" fadlan geli number siredka mobileka lumay");
                        int misspin = input.nextInt();
                        System.out.println(" ma hubta in aad " + missnum + " u diwangalisay mobile lumay " +
                                " 1: haa" +
                                " 2: maya");
                        int misschoice = input.nextInt();
                        if (misschoice == 1)
                            if (misspin == lumidnumberpin) {
                                System.out.println("wad ku guleysatay ina aad is diwangelisid");
                            } else {
                                System.out.println("numberka sirta waa qalad");
                            }

                        else
                            System.out.println("thank you");
                        break;
                    case 4:
                        System.out.println(" fadlan geli numberka qaladka ah");
                        int wrongnum = input.nextInt();
                        System.out.println(" fadlan geli numberki loo rabay");
                        int corrrctnum = input.nextInt();
                        System.out.println("fadlan geli macluumad");
                        int information = input.nextInt();
                        System.out.println("ma hubta in aad xirato lacagtan" +
                                " 1 : haa " +
                                " 2 : maya");
                        int urans = input.nextInt();
                        if (urans == 1)
                            System.out.println(" waa lagu xiray");
                        else
                            System.out.println(" thank you");
                        break;

                    case 5:
                        int numberklacgtaqalday = 612882647;
                        int lacgtalasoqalday = 100;
                        System.out.println("fadlan geli talephnka u celinaysid");
                        int numberka = input.nextInt();
                        System.out.println(" fadlan geli macluumad");
                        int maclumad = input.nextInt();
                        System.out.println(" ma hubta in aad celisid lacagtan" +
                                " 1 : haa" +
                                " 1 : maya");
                        int ang = input.nextInt();
                        if (ang == 1) {
                            if (numberklacgtaqalday == numberka & lacgtalasoqalday == maclumad)
                                System.out.println(" wad ku gulaystay inaad celiso ");
                            else
                                System.out.println(" dhaqdhaqaqan ma ahn mid jira");
                        } else
                            System.out.println("thank you");
                        break;
                } }
            else if (choice == 7) {
                System.out.println("1: itus haraga bankga");
                System.out.println("2: lacag dhigasho");
                System.out.println("3: lacag kala bixid");
                int answer = input.nextInt();
                switch (answer) {
                    case 1:

                        System.out.println("haraga waa" + haragaga);
                        break;
                    case 2:

                        System.out.println(" geli lacagta aad dhiganayso");
                        int moneysave = input.nextInt();
                        System.out.println(" fadlan geli number sireedka bankigaga");
                        int accountpin = input.nextInt();
                        if (accountpin == haragaga)
                            System.out.println(" wa ku guulaystay in aad dhigato " + moneysave);
                        break;

                    case 3:

                        System.out.println(" fadlan geli lacagta kala baxayso");
                        int outmoney = input.nextInt();
                        System.out.println(" fadlan geli number siredkaga bankiga");
                        int bankpin = input.nextInt();
                        if (bankpin == mibankpin)
                            System.out.println(" ma hubta in aad " + outmoney + " $" +
                                    " kala baxdid acount bankigaga" +
                                    " 1: haa" +
                                    "2: maya");
                        int lastanswer = input.nextInt();
                        int newbalnce = mibankbalance - outmoney;
                        if (lastanswer == 1 && outmoney < mibankpin)
                            System.out.println(" wa ku gulaysatay in aad kala baxdid" + outmoney +
                                    " acounkaga" + " tarikhda " + currentDateANDTime + "haraga bankigana waa: " + newbalnce + "$");
                        else if (outmoney > mybankbalance)
                            System.out.println(" haraga xisabtada kugum filna");
                        else if (lastanswer == 2)
                            System.out.println(" mahadsanid");
                        else {
                            System.out.println(" mahadsanid ");
                        }

                }
            } else if (choice == 0) {
                System.out.println("thank you");
            }
        }

    }
}