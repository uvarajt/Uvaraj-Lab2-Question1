package com.greatlearning.driver;

import java.util.Arrays;
import java.util.Scanner;
import com.greatlearning.services.TransactionTargetAlgo;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TransactionTargetAlgo transactionTargetAlgo = new TransactionTargetAlgo();
        System.out.println("Enter the size of transaction array");
        //Get totalNoOfTransactions of the transactions array
        int totalNoOfTransactions = scanner.nextInt();
        //Initialize the transactions array
        int[] transactions = new int[totalNoOfTransactions];
        		
        System.out.println("Enter the values of array");
        //Get the transactions
        for(int i=0; i<totalNoOfTransactions; i++)
        	transactions[i] = scanner.nextInt();
        //Get the no. of targets
        System.out.println("Enter the total no. of targets that needs to be achieved");
        int targetCount = scanner.nextInt();
        System.out.println("Enter the value of targets");
        int target;
        //[TBD]Calculate the min and overall sum in advance and check
        // Input:  arr[] = {10, 20, 10, 5, 15}
        // Output: prefixSum[] = {10, 30, 40, 45, 60}
        int prefixSum[] = new int[totalNoOfTransactions];
        prefixSum[0] = transactions[0];
        for(int i=1; i<totalNoOfTransactions; i++) {
        	prefixSum[i] = prefixSum[i-1] + transactions[i];
        }
        System.out.println(Arrays.toString(prefixSum));
        for(int i=0; i<targetCount; i++) {
        	target = scanner.nextInt();
        	transactionTargetAlgo.processTransactions(prefixSum, target);
        }
        
        scanner.close();

	}

}
