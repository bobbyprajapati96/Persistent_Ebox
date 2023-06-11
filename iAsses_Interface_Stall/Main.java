package iAsses_Interface_Stall;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose Stall Type\n1)Gold Stall\n2)Premium Stall\n3)Executive Stall");
		int choice = Integer.parseInt(br.readLine());
		switch (choice) {
		case 1:
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
           String inp=br.readLine();
           String [] gold=inp.split(",");
           GoldStall gs=new GoldStall(gold[0],Integer.parseInt(gold[1]),gold[2],Integer.parseInt(gold[3]));
           gs.display();
           break;
		case 2:
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
           String inp2=br.readLine();
           String [] pro=inp2.split(",");
           PremiumStall ps=new PremiumStall(pro[0],Integer.parseInt(pro[1]),pro[2],Integer.parseInt(pro[3]));
           ps.display();
           break;
		case 3:
			System.out.println(
					"Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
           String inp3=br.readLine();
           String [] exstall=inp3.split(",");
           ExecutiveStall ex=new ExecutiveStall(exstall[0],Integer.parseInt(exstall[1]),exstall[2],Integer.parseInt(exstall[3]));
           ex.display();
           break;
           default:System.out.println("Invalid Stall Type");
		}
	}
}
