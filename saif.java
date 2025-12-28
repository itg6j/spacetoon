import java.io.BufferedReader;//bufferedReader greater then filereader use to read file and read line line 
import java.io.BufferedWriter;//bufferedWriter greater then filewriter use to write file
import java.io.File;//class in io it is represent of file and foldar can check if found or show metadata or create and delet 
import java.io.FileReader;//read file
import java.io.FileWriter;//write file
import java.time.LocalDate;//present date without clock 
import java.util.Scanner;
public class saif{
    //login
    public static void login(){
        Scanner input = new Scanner (System.in);
        final String username = "saif";//can't change until call him
        final String password = "password123";
        boolean google = true;
        final String company = "spacetoon program";
        while(google){
            System.out.println();
            System.out.println("                ********************************                ");
            System.out.println("                *      "+company+"       *                       ");
            System.out.println("                ********************************                ");
            System.out.print("                *      username : ");
            String user = input.nextLine();
            System.out.print("                *      password : ");
            String pass = input.nextLine();
            System.out.println("                ********************************                ");
            if (user.equals(username)&&pass.equals(password)){
                google = false;
            }
        }
    }
        //add new good
        public static void initGoods() throws Exception{// throws Exception in java some command sometimes cause error such as read file not found or assign data false && try catch this is same process but this you can control it such as code error in try can write anthor code in catch
            Scanner input = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(new FileWriter("good.txt",true));//true becuase save
            System.out.print("how mach of good you want add ? : ");
            int num1 = input.nextInt();
            for (int i=0;i<num1;i++){
                System.out.print(i+1+")"+"Goods : ");//nextInt(); make empty line after use it this process get emtpy line and can assign in String 
                if(i==0){
                    input.nextLine();
                }
                String name =input.nextLine();
                writer.write(name);//write in file
                writer.newLine();//new line in file 
            }
            writer.close();//close file 
    }
            public static void read12345()throws Exception{
            BufferedReader reader = new BufferedReader(new FileReader("good.txt"));
            String line ;//use becuase store reader 
            int num1 = 0;
            while((line = reader.readLine())!=null){
                num1++;
                System.out.println(num1+")"+line);
            }
            reader.close();
        }
        public static String read1234(int ansgood)throws Exception{
            BufferedReader reader = new BufferedReader(new FileReader("good.txt"));
            String line ;
            int num1 = 0;
            while((line = reader.readLine())!=null){
                num1++;
                if(num1==ansgood){
                    reader.close();
                    return line;
                }
            }
            reader.close();
            return null;
        }
        public static void package123()throws Exception{
            Scanner input = new Scanner (System.in);
            BufferedWriter writer = new BufferedWriter(new FileWriter("package.txt",true));
            System.out.print("How many you want add ? : ");
            int number = input.nextInt();
            for (int i =0;i<number;i++){
                System.out.print(i+1+")"+"package : ");
                if(i==0){
                    input.nextLine();
                }
                String package321 = input.nextLine();
                writer.write(package321);
                writer.newLine();
            }
            writer.close();

        }
        public static void showpackage()throws Exception{
            BufferedReader reader = new BufferedReader(new FileReader("package.txt"));
            String line;
            int num1 = 0;
            while((line=reader.readLine())!=null){
                num1++;
                System.out.println(num1+")"+line);
            }
            reader.close();
        }
        public static void sellernum() throws Exception{
            BufferedReader reader = new BufferedReader(new FileReader("seller.txt"));
            String line;
            int num1  = 0; 
            while((line=reader.readLine())!=null){
                String part[] = line.split(",");//split function split string to array why choose , this can split to number 
                if(part.length<2)continue;//this if statment i write it becuase if found thing less then 2 make continue
                String name = part[0];//why begin 0 becuase array begin counter 0 
                String status = part[1];
                if(status.equals("seller")){
                    num1 ++;
                    System.out.println(num1+")"+name);
                }
            }
            reader.close();//reader close 
        }
        public static String sellernum1(int numofseller) throws Exception{
            BufferedReader reader = new BufferedReader(new FileReader("seller.txt"));
            String line;
            int num1  = 0;
            String name1 = null ; 
            while((line=reader.readLine())!=null){
                String part[] = line.split(",");
                if(part.length<2) continue;
                String name = part[0];
                String status = part[1];
                if(status.equals("seller")){
                    num1 ++;
                    if(numofseller==num1){
                        name1 = name;
                        break;
                    }
                }
            }
            reader.close();
            if(name1==null){
                System.out.print("Seller number not found!");
            }
            return name1;
        }  
        public static int getNextId() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("Data1.txt"));
        String line;
        int lastId = 0;
        while ((line = reader.readLine()) != null) {
            if (!line.isEmpty()) {//this condition check if line not empty 
                String[] parts = line.split(",");
                lastId = Integer.parseInt(parts[0]);//change String to int 
            }
        }

        reader.close();
        return lastId+1;//why +1 becuase this method for save if want save in Data1.txt this give number new or number old +1 and can write new save 
    }

        public static int get1NextId() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("sell1.txt"));
        String line;
        int lastId = 0;
        while ((line = reader.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                String[] parts = line.split(",");
                lastId = Integer.parseInt(parts[0]);
            }
        }

        reader.close();
        return lastId + 1;

    }  
        public static int get2NextId() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("invoicefarmer1.txt"));
        String line;
        int lastId = 0;

        while ((line = reader.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                String[] parts = line.split(",");
                lastId = Integer.parseInt(parts[0]);
            }
        }

        reader.close();
        return lastId + 1;
    }  

    public static void showsave() throws Exception{
        Scanner input = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));
        System.out.println("Enter Shipment number");
        System.out.print("choose : ");
        int answer = input.nextInt();
        String line1;
        int id = 1;
        while ((line1 = reader.readLine()) != null) {
            if (answer == id) {
                System.out.println(id+") "+line1);
                break;
            }
            id++;
        }
        reader.close();
    }
    public static void saver(double kilo312,double feesbuy,LocalDate today,int numberoffarmer,double fees,int statmentnumber,int num11good2,String sellername,String answer123,int package213) throws Exception{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Data.txt", true));
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("Data1.txt", true));
            BufferedReader reader3 = new BufferedReader(new FileReader("farmer.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("Data1.txt"));
            BufferedReader reader1 = new BufferedReader(new FileReader("Data.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("package.txt"));
            String line1;
            String numberoffarmer1 = "";
            int counter = 1;
            while ((line1 = reader3.readLine()) != null) {
                if (counter == numberoffarmer) {
                    numberoffarmer1 = line1;
                    break; 
                }
                counter++;
            }
            String line;
            int num1 = 0;
            String package132 = null;
            while ((line = reader.readLine()) != null) {
                num1++;
                if (num1 == package213) {
                    package132 = line;
                    break;
                }
            }
            reader.close();
            int id = getNextId();
            String numberofgood = String.valueOf(num11good2);
            if (kilo312==0){
                writer.write("today : "+today + " | "+"statmentnumber : "+statmentnumber+ " | "+"fees : "+fees + " | "+"farmer : "+numberoffarmer1+" | "+"seller : "+sellername + " | "+"good : "+answer123 + " | "+"number of good : "+numberofgood + " | "+"package : "+package132);
            }else{
                writer.write("today : "+today + " | "+"statmentnumber : "+statmentnumber+ " | "+"fees : "+fees + " | "+"farmer : "+numberoffarmer1+" | "+"seller : "+sellername + " | "+"good : "+answer123 + " | "+"number of good : "+numberofgood + " | "+"package : "+package132+ " | "+"kilo : "+kilo312);
            }
            writer.newLine();
            writer.close();
            if (kilo312==0){
                writer1.write(id + "," +today+ "," +feesbuy+","+statmentnumber+ "," +fees+ "," +numberoffarmer1+ "," +sellername + "," + answer123 + "," + numberofgood + "," + package132);
            }else{
                writer1.write(id + "," +today+ "," +feesbuy+","+statmentnumber+ "," +fees+ "," +numberoffarmer1+ "," +sellername + "," + answer123 + "," + numberofgood + "," + package132+ "," + kilo312);
            }
            writer1.newLine();
            writer1.close();
    }
    public static void editsave() throws Exception{
        Scanner input = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter (new FileWriter("Data.txt",true));
        BufferedReader reader1 = new BufferedReader(new FileReader("Data1.txt"));
        BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));
        BufferedWriter writer2 = new BufferedWriter(new FileWriter("temp.txt"));
        System.out.print("what shipment do you need edit : ");
        int num1 = input.nextInt();
        String line ;
        int num = 0;
        while((line=reader.readLine())!=null){
            num++;
            if(num==num1){
                System.out.println(num+") "+line);
            }
        }
        System.out.print("what you want edit : ");
        input.nextLine();
        String num2 = input.nextLine();
        while((line=reader1.readLine())!=null){
            num++;
            String[] parts = line.split(",");
            String namberofsave = parts[0];
            String date = parts[1];
            String feebuy = parts[2];
            String number = parts[3];
            String fee = parts[4];
            String farmer = parts[5];
            String seller = parts[6];
            String good = parts[7];
            String numofgood = parts[8];
            String package2 = parts[9];
            if(num2.equals("seller")){
                System.out.print("Enter name : ");
                String name123 = input.nextLine();
                seller = name123;
                writer2.write(namberofsave+","+date+","+feebuy+","+number+","+fee+","+farmer+","+seller+","+good+","+numofgood+","+package2);
                writer2.newLine();
            }            
        }reader1.close();
    }
    public static double kilo231(String kilo123321){
        Scanner input = new Scanner (System.in);
        if (kilo123321.equals("kilo")){
            System.out.print("how much : ");
            double kilo32112 = input.nextDouble();
            return kilo32112;
        }
        return 0;
    }
    public static void goods()throws Exception{
        Scanner input = new Scanner (System.in);
        int count = 3;
        int num123 = 0 ;
        while (num123!=5) { 
        System.out.println("\n1)show");
        System.out.println("2)add,goods,package");
        System.out.println("3)do you want save procses of goods ?");
        System.out.println("4)edit save");
        System.out.println("5)Exit");
        System.out.print("choose : ");
        num123 = input.nextInt();
        switch(num123){
            case 1 :
            int show = 0;
            do{
                System.out.println("1)show goods");
                System.out.println("2)show package");
                System.out.println("3)show seller");
                System.out.println("4)show save");
                System.out.println("5)show farmer");
                System.out.println("6)Exit");
                System.out.print("choose : ");
                show = input.nextInt();
                switch(show){
                case 1 : read12345();break;
                case 2 : showpackage();break;
                case 3 : sellernum();break;
                case 4 : showsave();break;
                case 5 : showfarmer();break;
                case 6 : break;
                default: System.out.print("invalid input");
                }
            }while (show!=6);
            break;
            case 2 :
            System.out.println("1)add new goods");
            System.out.println("2)add new package");
            System.out.println("3)Exit");
            System.out.print("choose : ");
            int add1 = input.nextInt();
            switch(add1){
                case 1 :             
            initGoods(); 
            break;
                case 2 : 
                package123();break;
                case 3 : break;
            } 
            break;
            case 4 : editsave(); break;
            case 5 : break;
            case 3 :  
                LocalDate today = LocalDate.now();
                System.out.println("date : "+today);
                System.out.print("Enter the statment number : ");
                int statmentnumber = input.nextInt();
                System.out.print("Enter Fees : ");
                double fees = input.nextDouble();
                fees =fees/2;
                System.out.print("Enter number of farmer : ");
                int numberoffarmer  = input.nextInt();
                System.out.println("seller : ");               
                sellernum();
                System.out.print("Enter number who is seller : ");
                int numofseller = input.nextInt();
                String sellername  = sellernum1(numofseller);
                //good
                read12345();
                System.out.print("what is good : ");
                int ansgood = input.nextInt(); 
                //number of good count
                System.out.print("Enter fees of buy : ");
                double feesbuy = input.nextDouble();
                System.out.print("how mach number of good : ");
                int num11good2 = input.nextInt();
                System.out.print("this sell kilo or package : ");
                input.nextLine();
                String kilo123321 = input.nextLine();
                double kilo312 = kilo231(kilo123321);
                BufferedReader reader = new BufferedReader(new FileReader("package.txt"));
                String line;
                int number123 = 0;
                while((line=reader.readLine())!=null){
                    number123++;
                    System.out.println(number123+") "+line);
                }
                System.out.print("What package : ");
                int package213= input.nextInt();
                String answer123 = read1234(ansgood);
                int id = getNextId();
                System.out.print("this is shipment of save : "+id);
                saver(kilo312,feesbuy,today,numberoffarmer,fees,statmentnumber,num11good2,sellername,answer123,package213);
                break;
            }
        }        
    }
    public static void invoice() throws Exception{
        Scanner input = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("sell.txt"));
        BufferedReader reader1 = new BufferedReader(new FileReader("sell1.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("buy.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("invoicefarmer.txt",true));
        System.out.print("who buyer : ");
        int  answer = input.nextInt();
        String line ;
        int num1 = 0;
        String buy = "";
        while((line=reader2.readLine())!=null){
            num1++;
            if(num1==answer){
                buy=line;
                System.out.println(num1+") "+line);
            }
        }
        System.out.print("Enter date form : ");
        input.nextLine();
        String date = input.nextLine();
        System.out.print("to : ");
        String dateto = input.nextLine();
        String line1;
        int num = 0;
        int num2 = 0;
        double totalprice = 0.0;
        while((line1=reader.readLine())!=null){
            num++;
            String[] parts = line1.split("\\|");// why write \\ before | in , why dont write \\ the , don't belong to regex if symbol belong regex can escape \\ ||||  what regex or regular expression : use search or split text In a certain style. or extract data from file or line 
            String date123 = parts[0].trim();// "today : 2025-12-08"  ||| trim is remove space in begin and end 
            String date213 = date123.split(":")[1].trim(); // "2025-12-08"
            String good = parts[2].trim();
            String good132 = good.split(":")[1].trim();
            String numofgood = parts[3].trim();
            String numofgood321 = numofgood.split(":")[1].trim();
            String price = parts[6].trim();
            String price123 = price.split(":")[1].trim();
            if(date213.compareTo(date)>= 0 && date213.compareTo(dateto)<= 0){//compareTo function use to compare bettween two string  ||||| why use <>= the first = this allow take this date ||||| <> this make condition boolean not int if true&&true = true  ||||| this check in begin year then month then day then compare then compare with zero 
                String line2;
                num2++;
                System.out.println(num2+")"+line1);
            }
            String line2;
            int num8 =1;
            
            do { 
                System.out.print("do you want print invoice yea = 1 or no = 0 : ");
                int num132 = input.nextInt();
            } while (num8!=1);
            System.out.println("                                spacetoon");
            System.out.println("");
            System.out.println("General Manager : saif abusnaneh           phone : +962799238259");
            System.out.println("");
            System.out.println("MR."+buy);
            System.out.println("");
            System.out.println("       good       |       number of good       |       price");
            System.out.println("       "+good132+"              "+numofgood321+"              "+price123);
            totalprice=totalprice+Double.parseDouble(price123);//convert string to double value
            System.out.println("");
            System.out.println("");
            System.out.println("total price : "+totalprice);
        } 
        reader.close();
        reader2.close();
        
    }
    public static void addbuy() throws Exception{
        Scanner input = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new FileWriter("buy.txt",true));
        System.out.print("how many you want add : ");
        int num1 = input.nextInt();
        for (int i=1;i<=num1;i++){
            System.out.print(i+")buyer : ");
            if(i==1){
                input.nextLine();
            }
            String name = input.nextLine();
            writer.write(name);
            writer.newLine();
        }
        writer.close();
    }
    public static void showbuyer() throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("buy.txt"));
        String line;
        int num1 = 0;
        while((line=reader.readLine())!=null){
            num1++;
            System.out.println(num1+")"+line);
        }
        reader.close();
    }
    public static void makesell() throws Exception{
        Scanner input = new Scanner (System.in);
        BufferedReader reader = new BufferedReader(new FileReader("Data.txt"));
        BufferedReader reader1 = new BufferedReader(new FileReader("Data1.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("buy.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("sell.txt",true));
        BufferedWriter writer1 = new BufferedWriter(new FileWriter("sell1.txt",true));
        BufferedWriter wirter2 = new BufferedWriter (new FileWriter("invoicefarmer.txt",true));
        BufferedWriter writer3 = new BufferedWriter(new FileWriter("invoicefarmer1.txt",true));
        System.out.print("Do you want see save : ");   
        String answer132 = input.nextLine();
        if (answer132.equals("yes")){
            System.out.print("Enter shipment : ");
            int num7 = input.nextInt();
            String line213123;
            int num5 = 0;
            while((line213123=reader.readLine())!=null){
                num5++;
                if(num5==num7){
                    System.out.println(num5+")"+line213123);
                } 
            }
        }
        System.out.print("What shipment you want sell : ");
        int num1 = input.nextInt();
        String line;
        int num0 = 0;
        while((line=reader1.readLine())!=null){
            num0++;
            if (num1==num0){
                int id123 = get1NextId();
                int id231 = get2NextId();
                String[] parts = line.split(",");
                String id = parts[0];
                String today = parts[1];
                String feebuy = parts[2];
                double fee1buy = Double.parseDouble(feebuy);
                String numberstatment = parts[3];
                String fee = parts[4];
                String farmer = parts[5];
                String seller = parts[6];
                String good = parts[7];
                String numofgood = parts[8];
                int num1ofgood = Integer.parseInt(numofgood);
                String package123321 = parts[9];
                System.out.print("who buy : ");
                int buy = input.nextInt();
                String line1;
                int num = 0;
                String buy1 ="";
                while((line1=reader2.readLine())!=null){
                    num++;
                    if (buy==num){
                        buy1 = line1;
                    }
                }
                System.out.print("how much sell number of good : ");
                int numberofgood = input.nextInt();
                int totalnumberofgood = num1ofgood-numberofgood;
                System.out.print("price : ");
                double price1 = input.nextDouble();
                System.out.print("this sell kilo or package : ");
                input.nextLine();
                String whosell = input.nextLine();
                if (whosell.equals("kilo")){
                    String kilo = parts[10];
                    double kilo1 = Double.parseDouble(kilo);
                    System.out.print("how much kilo : ");
                    double kilo2 = input.nextDouble();
                    double totalkilo = kilo1-kilo2;
                    double kilo3 = kilo2/numberofgood;
                    double fee321 = fee1buy*kilo2;
                    double price = kilo2*price1+fee321;
                    writer.write("today : "+today+" | "+"buy : "+buy1+" | "+"good : "+good+" | "+"package : "+package123321+" | "+"number of good : "+numberofgood+"price : "+price1+" | "+"fee : "+fee1buy+" | "+"average weight : "+kilo3+" | "+"price : "+price);
                    writer.newLine();
                    writer1.write(id231+","+today+","+buy1+","+good+","+numberofgood+","+fee1buy+","+price+","+kilo3);
                    writer1.newLine();
                    wirter2.write("today : "+today+" | "+"farmer : "+farmer+" | "+"buy : "+buy1+" | "+"good : "+good+" | "+"package : "+package123321+" | "+"number of good : "+numberofgood+"price : "+price1+" | "+"fee : "+fee+" | "+"average weight : "+kilo3+" | "+"price : "+price);
                    wirter2.newLine();
                    writer3.write(id231+","+farmer+","+today+","+buy1+","+good+","+numberofgood+","+package123321+","+fee1buy+","+price+","+fee+","+kilo3);
                    writer.newLine();
                    System.out.println("remainder number of good : "+totalnumberofgood);
                    System.out.println("remainder kilo of good "+totalkilo);
                }else if (whosell.equals("package")){
                    double fee321 = fee1buy*numberofgood;
                    double price = numberofgood*price1+fee321;
                    writer.write("today : "+today+" | "+"buy : "+buy1+" | "+"good : "+good+" | "+"number of good : "+numberofgood+" | "+"fee : "+fee1buy+" | "+"fee : "+fee1buy+" | "+"price : "+price);
                    writer.newLine();
                    writer1.write(id231+","+today+","+buy1+","+good+","+numberofgood+","+fee1buy+","+price);
                    writer1.newLine();
                    wirter2.write("today : "+today+"farmer : "+farmer+" | "+"buy : "+buy1+" | "+"good : "+good+" | "+"number of good : "+numberofgood+" | "+"fee : "+fee+" | "+"price : "+price);
                    wirter2.newLine();
                    writer3.write(id231+","+farmer+","+today+","+buy1+","+good+","+numberofgood+","+package123321+","+fee1buy+","+price+","+fee);
                    writer3.newLine();
                    System.out.println("remainder number of good : "+totalnumberofgood);
                }else {
                    System.out.println("invalid input");
                }
                System.out.println("this sell shipment : "+id123);
            }
        }
        writer.close();
        writer1.close();
        wirter2.close();
        writer3.close();
    }
    public static void showsell() throws Exception{
        Scanner input = new Scanner (System.in);
        BufferedReader reader = new BufferedReader(new FileReader("sell.txt"));
        System.out.print("what shipment of sell : ");
        int num1 = input.nextInt();
        String line;
        int counter = 0;
        while((line=reader.readLine())!=null){
            counter++;
            if (num1==counter){
                System.out.println(counter+") "+line);
                break;
            }
        }
        reader.close();
    }
    public static void selles()throws Exception{
        Scanner input = new Scanner(System.in);
        int answer1 = 0;
        do { 
            System.out.println("1)add buyer");
            System.out.println("2)show buyer");
            System.out.println("3)make sell");
            System.out.println("4)show sell");
            System.out.println("5)invoice");
            System.out.println("6)Exit");
            System.out.print("choose : ");
            answer1 = input.nextInt();
            switch(answer1){
                case 1 : addbuy();break;
                case 2 : showbuyer();break;
                case 3 : makesell();break;
                case 4 : showsell();break;
                case 5 : invoice();break;
                case 6 : break;
                default: System.out.println("invalid input");
            }
        } while (answer1!=6);
    }
    public static void newemployees()throws Exception {
            Scanner input = new Scanner(System.in);
            System.out.print("how many employees you want assign : ");
            int num1 = input.nextInt();
            String [] employees = new String[num1];
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("name.txt",true));
            for (int i=0;i<employees.length;i++){
                System.out.print(i+1+")"+"employess : ");
                if(i==0){
                    input.nextLine();
                }
                employees[i]=input.nextLine();
                writer1.write(employees[i]);
                writer1.newLine();
            }
            writer1.close();
            BufferedWriter writer3 = new BufferedWriter(new FileWriter("seller.txt",true));
            BufferedWriter writer = new BufferedWriter(new FileWriter("employess.txt",true));
            BufferedWriter writer2 = new BufferedWriter(new FileWriter("salary.txt",true));
            for(int i =0;i<employees.length;i++){
                System.out.print("what jop "+employees[i]+" : ");
                String answer = input.nextLine();
                System.out.print("how much salary "+employees[i]+" : ");
                int answer321 = input.nextInt();
                input.nextLine();
                System.out.print("what National number "+employees[i]+" : ");
                int national = input.nextInt();
                System.out.print("What date of birthday "+employees[i]+" : ");
                input.nextLine();
                String birthday = input.nextLine();
                writer.write("name : "+employees[i]);
                writer2.write(employees[i]+","+answer321);
                writer3.write(employees[i]+",");
                if(answer.equals("seller")){
                    writer3.write(answer);
                }
                writer.write(" | national : "+ String.valueOf(national));
                writer.write(" | birthday : "+birthday);
                writer.write(" | jop : "+answer);
                writer.write(" | salary : "+answer321+"$");
                writer3.newLine();
                writer2.newLine();
                writer.newLine();
            }
            writer3.close();
            writer2.close();
            writer.close();
        }
        public static void reademployees()throws Exception{
            BufferedReader reader = new BufferedReader(new FileReader("employess.txt"));
            String line ;
            int num1 = 0;
            while((line = reader.readLine())!=null){
                num1++;
                System.out.println(num1+")"+line);
            }
            reader.close();
        }
       public static void assaignemployess() throws Exception{
        Scanner input = new Scanner (System.in);
        BufferedReader reader = new BufferedReader(new FileReader("employess.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("presence.txt",true));
        BufferedWriter writer2 = new BufferedWriter(new FileWriter("presence1.txt",true));
        BufferedWriter writer1 = new BufferedWriter(new FileWriter("absent.txt",true));
        BufferedReader reader1 = new BufferedReader(new FileReader("name.txt"));
        String line;
        int num1 = 0;
        while((line = reader1.readLine())!=null){
            num1++;
            System.out.print("are "+line+" working ? yea = 1 / no = 0 : ");
            int num2 = input.nextInt();
            if (num2==1){
                writer1.write(line+","+"present");
                writer.write(line+" : present");
                //writer2.write();
                writer.newLine();
                writer1.newLine();
            }else if (num2 == 0){
                writer1.write(line+","+"absent");
                writer.write(line+" : absent");
                writer.newLine();
                writer1.newLine();
            }
        }
        writer1.close();
        writer.close();
    }
            public static void saemployess()throws Exception{
            BufferedReader reader = new BufferedReader(new FileReader("presence.txt"));
            String line ;
            int num1 = 0;
            while((line = reader.readLine())!=null){
                num1++;
                System.out.println(num1+")"+line);
            }     
            reader.close();
       }
        public static void calender()throws Exception{
            Scanner input = new Scanner (System.in);
            System.out.println("1)Do you want see all employees schedule");
            System.out.println("2)Do you want assaign Presence and absence");
            System.out.println("3)Exit");
            System.out.print("choose : ");
            int num1  = input.nextInt();
            switch(num1){
                case 1 : saemployess(); break;
                case 2 : assaignemployess();break;
                case 3 : break;
                default: System.out.print("invalid input");
            }
        }
    public static void salary() throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("absent.txt"));
        BufferedWriter writer1 = new BufferedWriter(new FileWriter("sallaryofmonth.txt",true));
        BufferedWriter writer = new BufferedWriter(new FileWriter("sallaryofmonth1.txt",true));
        Scanner input = new Scanner (System.in);
        System.out.print("Enter employee name : ");
        String name123 = input.nextLine();
        int present = 0;
        int absent = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            String status = parts[1];
            if (name.equals(name123)) {
                if (status.equals("present")) present++;
                if (status.equals("absent")) absent++;
            }
        }
        reader.close();
        System.out.println("Present days = " + present);
        System.out.println("Absent days = " + absent);
        BufferedReader reader1 = new BufferedReader(new FileReader("salary.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("selaryofmonth1.txt"));
        BufferedWriter writer2 = new BufferedWriter(new FileWriter("temp.txt"));
        String line1;
        int salary = 0;
        while((line1=reader1.readLine())!=null){
            String [] part =line1.split(",");
            if (part.length < 2) continue;
            String name = part[0].trim();
            String status = part[1].trim();
            if (name.equals(name123)) {
                salary = Integer.parseInt(status);
                break;
            }
        }
        String line2;
        double value=0.0;
        int num231 = 0;
        writer1.write(name123 + " | " + salary);
        writer1.newLine();
        while((line2=reader2.readLine())!=null){
            String [] parts = line2.split(",");
            if (parts.length < 2) continue;
            String name = parts[0];
            String status = parts[1];
            if(name123.equals(name)){
                value = Double.parseDouble(status);
                num231++;
            }
        }
        reader2.close();
        double dayofsalary = (double) salary / 30;
        double newSalary = present * dayofsalary;
        double finalSalary;
        if (num231 == 0) {
            finalSalary = newSalary;
        }
        else{
            finalSalary = newSalary - value;
        }
        System.out.println("your salary : " +finalSalary);
        System.out.println("1)do you want giving salary: ");
        System.out.println("2)Exit");
        System.out.print("choose : ");
        int give = input.nextInt();
        switch(give){
            case 1 : 
            System.out.print("how much : ");
            int give1selery = input.nextInt();
            double selery = finalSalary  - give1selery ;
            int daysdelet = (int)(give1selery/dayofsalary);
            BufferedReader reader32 = new BufferedReader(new FileReader("absent.txt"));
            String line122;
            int delet =1;
            BufferedWriter writer3 = new BufferedWriter(new FileWriter("temp1.txt"));
            while((line122=reader32.readLine())!=null){
                String[] parts = line122.split(",");
                String name = parts[0];
                String status = parts[1];
                if(name.equals(name123)&&status.equals("present")&&delet<=daysdelet){
                    delet++;
                    continue;
                }
                writer3.write(line122);
                writer3.newLine();
            }
            reader32.close();
            writer3.close();
            File original = new File("absent.txt");
            File temp = new File("temp1.txt");
            original.delete();
            temp.renameTo(original);
            writer1.write(name123+ " | " + String.valueOf(selery));
            writer.write(name123+","+String.valueOf(selery));
            writer.newLine();
            writer1.newLine();
            System.out.println("The remainder of the salary : " + selery);break;
            case 2 : break;
            default : System.out.print("invalid input");
        }
        writer.close();
        writer1.close();
        reader1.close();
    }
    public static void employees()throws Exception{
        Scanner input = new Scanner (System.in);
        int num1 = 0;
        while (num1!=5){
            System.out.println("1)show employees");
            System.out.println("2)add new employees");
            System.out.println("3)salary calculate ");
            System.out.println("4)Employee time schedule");
            System.out.println("5)Exit");
            System.out.print("choose : ");
            num1 = input.nextInt();
            switch(num1){
                case 1 : reademployees();break;
                case 2 : newemployees() ;break;
                case 3 : salary();break;
                case 4 : calender();break;
                case 5 : break;
                default: System.out.print("invalid input");
                
            }
        }
    }
    public static void addfarmer() throws Exception{
        Scanner input = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new FileWriter("farmer.txt",true));
        System.out.print("how much you want add : ");
        int num1 = input.nextInt();
        for(int i = 1; i<=num1;i++){
            System.out.print(i+")"+" farmer : ");
            if (i==1){
                input.nextLine();
            }
            String name = input.nextLine();
            writer.write(name);
            writer.newLine();
        }
        writer.close();
    }
    public static void showfarmer() throws Exception{
        Scanner input = new Scanner (System.in);
        BufferedReader reader = new BufferedReader(new FileReader("farmer.txt"));
        String line;
        int num1 = 0;
        while((line=reader.readLine())!=null){
            num1++;
            System.out.println(num1+") "+line);
        }
        reader.close();
    }
    public static void invoicefarmer()throws Exception{
        Scanner input = new Scanner (System.in);
        BufferedReader reader = new BufferedReader(new FileReader("farmer.txt"));
        BufferedReader reader1 = new BufferedReader(new FileReader("invoicefarmer1.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("invoicefarmer.txt"));
        System.out.print("who is farmer : ");
        int num1 = input.nextInt();
        String line;
        int num2  = 0;
        String namefarmer="";
        while((line = reader.readLine())!=null){
            num2++;
            if (num1==num2){
                namefarmer=line;
                System.out.println(num1+")"+line);
            }
        }
        reader.close();
        System.out.print("Enter date form : ");
        input.nextLine();
        String date = input.nextLine();
        System.out.print("to : ");
        String dateto = input.nextLine();
        String line321;
        int count = 0;
        while((line321=reader1.readLine())!=null){
            String [] parts = line321.split(",");
            String number = parts[0];
            String farmer  = parts[1];
            String date2123 = parts[2];
            String good = parts[4];
            String numofgood = parts[5];
            String package213 = parts[6];
            String price = parts[8];
            String fee = parts[9];
            int num321231 = 0;
            if (farmer.equals(namefarmer)){
                if(date2123.compareTo(date)>= 0 &&date2123.compareTo(dateto)<= 0){
                count++;
                line321 = reader2.readLine();
                System.out.println(count+")"+line321);
                }
            } 
            System.out.println("                                spacetoon");
            System.out.println("");
            System.out.println("General Manager : saif abusnaneh           phone : +962799238259");
            System.out.println("");
            System.out.println("MR."+farmer);
            System.out.println("");
            System.out.println("       good       |       number of good       |       price");
            for (int i = 1;i<=1;i++){
                for (int j = 1;j<=7;j++){
                    if (j==7&&j<=18){
                        System.out.print(good);
                    }
                }
            }
            for (int i = 1;i<=7;i++){
                if (i==7&&i<=18){
                    System.out.print(good);
                }
            }
            System.out.println("       "+good+"              "+numofgood+"              "+price);
            System.out.println("");
            System.out.println("");
            System.out.println("fee : "+fee);
        }
    }
    public static void farmer123321()throws Exception{
        Scanner input = new Scanner (System.in);
        int num1 =0;
        do{ 
            System.out.println("1)add farmer");
            System.out.println("2)show farmer");
            System.out.println("3)invoice of farmer");
            System.out.println("4)Exit");
            System.out.print("choose : ");
            num1 = input.nextInt();
            switch(num1){
            case 1 : addfarmer();break;
            case 2 : showfarmer();break;
            case 3 : invoicefarmer();break;
            case 4 : break;
            }
        }while(num1!=4);
    }
    
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner (System.in);
        login();
        int num1 = 0;
        boolean google = true;
        do { 
            System.out.println("\n1)goods") ;
            System.out.println("2)sells");
            System.out.println("3)farms");
            System.out.println("4)employees");
            System.out.println("5)exit");
            System.out.print("choose : ");
            num1 = input.nextInt();
            switch(num1){
            case 1 : goods();break;
            case 2 : selles();break;
            case 3 : farmer123321();break;
            case 4 : employees();break;
            case 5 : System.exit(1);
            }
        } while (google);
    }
}