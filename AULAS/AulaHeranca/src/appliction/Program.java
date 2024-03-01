package appliction;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account (1001, "Bob", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria" , 0.0, 500.0);

		//UPCASTING
		
		//-Quando um sub classe converte para a classe principal
		
		//businessAccount pode ser convertida para Account por que é uma subClasse portanto ela tbm é account 
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "mood", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Lucas", 0.0, 0.01);
		
		
		//DOWNCASTING
		
		//-Quando a classe principal tenta converter par uma sub classe
		
		//Account nao pode ser convertida para uma subClasse de si mesma
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100);
		// assim funciona por ser uma forma de forçar essa converção 
		
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		//ja essa aplicação dá problema, porem a IDE no ve isso, entao so vai dr problema quando compilar
		
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200);
		}
	}

}
