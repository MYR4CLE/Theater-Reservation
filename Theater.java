import java.util.*;

public class Theater {
	
	static ArrayList<String> customerPos = new ArrayList<String>();
	
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		String reserve = "";
		String unreserve = "";
		String unreserve2 = "";
		String enterName = "";
		String yn = "";
		
		char choice = ' ';
		int seats = 0;
		int totalSeats = 24;
		int availableSeats = 0;
		int availableSeats2 = 0;
		
		
		// Make a table using TWO-DIMENSIONAL ARRAY
		char [] [] theaterMap = { {' ', '|', '1', '|', '2', '|', '3', '|', '4', '|', '5', '|', '6', '|', '7', '|', '8', '|'},
								  {'-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '|'}, 
								  {'A', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
								  {'-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '|'},
								  {'B', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
								  {'-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '|'},
								  {'C', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|', ' ', '|'},
								  {'-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '+', '-', '|'}};
		
		String [] custName = new String[24];
		
		
		// To loop the program
		while(true) {
		System.out.println("Theater Reservation System");
		System.out.println("\nMain Options");
		
		System.out.println("\tA. Reserve a customer");
		System.out.println("\tB. Unreserve a customer");
		System.out.println("\tC. Display Summary");
		System.out.println("\tD. Display Theater map");
		System.out.println("\tX. Exit");
		
		// Choose an option A, B, C, D, X
		System.out.print("\nChoose an option: ");
		choice = s.next().charAt(0);
		switch(choice) {
		
		// Option A. Reserve a customer
		case 'A':
		case 'a':
			do {
			printMap(theaterMap);
			System.out.println("\nTheater Reservation System");
			System.out.println("\nReserve a Customer");
			
			System.out.print("    Enter customer name: ");
			enterName = s.next();
			
			System.out.print("    Enter seat number: ");
			reserve = s.next();
			
			placeCustomer(custName, reserve, enterName);
			
			seats += 1;
			availableSeats = 24 - seats;
			availableSeats2 = availableSeats;
			
		// To check if the seat is already taken using while
			while(customerPos.contains(reserve)) {
				System.out.print("Seat taken! Enter another seat number: ");
				reserve = s.next();
			}
			
			System.out.println();
			System.out.println("Reservation successfully done!\n");
			placeReserve(theaterMap, reserve);
			
			
			System.out.println("Reserve another seat? (y/n)");
			yn = s.next();
			} while (yn.equalsIgnoreCase("y"));
			
			break;
			
		// Option B. Unreserve a customer
		case 'B':
		case 'b':
			do {
			printMap(theaterMap);
			
			
			System.out.println("\nTheater Reservation System");
			System.out.println("\nUnreserve a Customer");
			System.out.print("    Enter seat number: ");
			
			unreserve2 = s.next();
			
			switch(unreserve2) {
			// A1-A8
			case "A1":
			case "a1":
				System.out.println("    Seat taken by: " + custName[0]);
				break;
			case "A2":
			case "a2":
				System.out.println("    Seat taken by: " + custName[1]);
				break;
			case "A3":
			case "a3":
				System.out.println("    Seat taken by: " + custName[2]);
				break;
			case "A4":
			case "a4":
				System.out.println("    Seat taken by: " + custName[3]);
				break;
			case "A5":
			case "a5":
				System.out.println("    Seat taken by: " + custName[4]);
				break;
			case "A6":
			case "a6":
				System.out.println("    Seat taken by: " + custName[5]);
				break;
			case "A7":
			case "a7":
				System.out.println("    Seat taken by: " + custName[6]);
				break;
			case "A8":
			case "a8":
				System.out.println("    Seat taken by: " + custName[7]);
				break;
			// B1-B8
			case "B1":
			case "b1":
				System.out.println("    Seat taken by: " + custName[8]);
				break;
			case "B2":
			case "b2":
				System.out.println("    Seat taken by: " + custName[9]);
				break;
			case "B3":
			case "b3":
				System.out.println("    Seat taken by: " + custName[10]);
				break;
			case "B4":
			case "b4":
				System.out.println("    Seat taken by: " + custName[11]);
				break;
			case "B5":
			case "b5":
				System.out.println("    Seat taken by: " + custName[12]);
				break;
			case "B6":
			case "b6":
				System.out.println("    Seat taken by: " + custName[13]);
				break;
			case "B7":
			case "b7":
				System.out.println("    Seat taken by: " + custName[14]);
				break;
			case "B8":
			case "b8":
				System.out.println("    Seat taken by: " + custName[15]);
				break;
			// C1-C8
			case "C1":
			case "c1":
				System.out.println("    Seat taken by: " + custName[16]);
				break;
			case "C2":
			case "c2":
				System.out.println("    Seat taken by: " + custName[17]);
				break;
			case "C3":
			case "c3":
				System.out.println("    Seat taken by: " + custName[18]);
				break;
			case "C4":
			case "c4":
				System.out.println("    Seat taken by: " + custName[19]);
				break;
			case "C5":
			case "c5":
				System.out.println("    Seat taken by: " + custName[20]);
				break;
			case "C6":
			case "c6":
				System.out.println("    Seat taken by: " + custName[21]);
				break;
			case "C7":
			case "c7":
				System.out.println("    Seat taken by: " + custName[22]);
				break;
			case "C8":
			case "c8":
				System.out.println("    Seat taken by: " + custName[23]);
				break;
			}
			
			System.out.print("Do yo want to proceed? (y/n) ");
			yn = s.next();
			
			while(yn.equalsIgnoreCase("y")) {
			unreserve = unreserve2;
			seats -= 1;
			availableSeats = availableSeats2 + 1;
			availableSeats2 = availableSeats;
				if (seats == 0) {
					availableSeats = 80;
				}
			System.out.println("Reservation successfully undone!\n");
			break;
			}
			if(yn.equalsIgnoreCase("n")) {
			System.out.println("Cancelled.\n");
			}
			System.out.println("Unreserve another customer? (y/n)");
			yn = s.next();

			unreserve(theaterMap, unreserve);
			
			}while(yn.equalsIgnoreCase("y"));
			break;
		
		// Option C. Display Summary
		case 'C':
		case 'c':
			System.out.println("\nTheater Reservation System");
			System.out.println("Summary:");
			System.out.println("\tTotal No. of Seats: " + totalSeats);
			System.out.println("\tNo. of Seats Taken: " + seats);
			System.out.println("\tNo. of Available Seats: " + availableSeats2);
			break;
		
		// Option D. Display Theater Map
		case 'D':
		case 'd':
			System.out.println("Display Theater Map...");
			printMap(theaterMap);
			break;
		
		// Option X. Exit the Program
		case 'X':
		case 'x':
			System.exit(0);
		}
	}
}
	
	// Placing 'X' to a specific position of the TWO-DIMENSIONAL ARRAYS in theaterMap after inputting the reservation seat number
	public static void placeReserve(char [][] theaterMap, String reserve) {
		
		
		char symbol = 'X';
		
		switch(reserve) {
		// A(1-8)
		case "A1":
		case "a1":
			theaterMap[2][2] = symbol;
			break;
		case "A2":
		case "a2":
			theaterMap[2][4] = symbol;
			break;
		case "A3":
		case "a3":
			theaterMap[2][6] = symbol;
			break;
		case "A4":
		case "a4":
			theaterMap[2][8] = symbol;
			break;
		case "A5":
		case "a5":
			theaterMap[2][10] = symbol; 
			break;
		case "A6":
		case "a6":
			theaterMap[2][12] = symbol; 
			break;
		case "A7":
		case "a7":
			theaterMap[2][14] = symbol; 
			break;
		case "A8":
		case "a8":
			theaterMap[2][16] = symbol; 
			break;
			
		// B(1-8)
		case "B1":
		case "b1":
			theaterMap[4][2] = symbol; 
			break;
		case "B2":
		case "b2":
			theaterMap[4][4] = symbol;
			break;
		case "B3":
		case "b3":
			theaterMap[4][6] = symbol;
			break;
		case "B4":
		case "b4":
			theaterMap[4][8] = symbol;
			break;
		case "B5":
		case "b5":
			theaterMap[4][10] = symbol;
			break;
		case "B6":
		case "b6":
			theaterMap[4][12] = symbol;
			break;
		case "B7":
		case "b7":
			theaterMap[4][14] = symbol;
			break;
		case "B8":
		case "b8":
			theaterMap[4][16] = symbol;
			break;
		// C(1-8)
		case "C1":
		case "c1":
			theaterMap[6][2] = symbol;
			break;
		case "C2":
		case "c2":
			theaterMap[6][4] = symbol;
			break;
		case "C3":
		case "c3":
			theaterMap[6][6] = symbol;
			break;
		case "C4":
		case "c4":
			theaterMap[6][8] = symbol;
			break;
		case "C5":
		case "c5":
			theaterMap[6][10] = symbol;
			break;
		case "C6":
		case "c6":
			theaterMap[6][12] = symbol;
			break;
		case "C7":
		case "c7":
			theaterMap[6][14] = symbol;
			break;
		case "C8":
		case "c8":
			theaterMap[6][16] = symbol;
			break;
			
		}
		customerPos.add(reserve);
	}
	
	// Replacing 'X' of the specific position in theaterMap to a blank char = ' ';
	public static void unreserve(char [][] theaterMap, String reserve) {
		
		char symbol = ' ';
		
		customerPos.remove(reserve);
		
		switch(reserve) {
		// A(1-8)
		case "A1":
		case "a1":
			theaterMap[2][2] = symbol;
			break;
		case "A2":
		case "a2":
			theaterMap[2][4] = symbol;
			break;
		case "A3":
		case "a3":
			theaterMap[2][6] = symbol;
			break;
		case "A4":
		case "a4":
			theaterMap[2][8] = symbol;
			break;
		case "A5":
		case "a5":
			theaterMap[2][10] = symbol; 
			break;
		case "A6":
		case "a6":
			theaterMap[2][12] = symbol; 
			break;
		case "A7":
		case "a7":
			theaterMap[2][14] = symbol; 
			break;
		case "A8":
		case "a8":
			theaterMap[2][16] = symbol; 
			break;
			
		// B(1-8)
		case "B1":
		case "b1":
			theaterMap[4][2] = symbol; 
			break;
		case "B2":
		case "b2":
			theaterMap[4][4] = symbol;
			break;
		case "B3":
		case "b3":
			theaterMap[4][6] = symbol;
			break;
		case "B4":
		case "b4":
			theaterMap[4][8] = symbol;
			break;
		case "B5":
		case "b5":
			theaterMap[4][10] = symbol;
			break;
		case "B6":
		case "b6":
			theaterMap[4][12] = symbol;
			break;
		case "B7":
		case "b7":
			theaterMap[4][14] = symbol;
			break;
		case "B8":
		case "b8":
			theaterMap[4][16] = symbol;
			break;
		// C(1-8)
		case "C1":
		case "c1":
			theaterMap[6][2] = symbol;
			break;
		case "C2":
		case "c2":
			theaterMap[6][4] = symbol;
			break;
		case "C3":
		case "c3":
			theaterMap[6][6] = symbol;
			break;
		case "C4":
		case "c4":
			theaterMap[6][8] = symbol;
			break;
		case "C5":
		case "c5":
			theaterMap[6][10] = symbol;
			break;
		case "C6":
		case "c6":
			theaterMap[6][12] = symbol;
			break;
		case "C7":
		case "c7":
			theaterMap[6][14] = symbol;
			break;
		case "C8":
		case "c8":
			theaterMap[6][16] = symbol;
			break;
			
		}
	}
	
	public static void placeCustomer(String custName[], String reserve, String enterName) {
		
		switch(reserve.toUpperCase()) {
		// A(1-8)
		case "A1":
		case "a1":
			custName[0] = enterName;
			break;
		case "A2":
		case "a2":
			custName[1] = enterName;
			break;
		case "A3":
		case "a3":
			custName[2] = enterName;
			break;
		case "A4":
		case "a4":
			custName[3] = enterName;
			break;
		case "A5":
		case "a5":
			custName[4] = enterName; 
			break;
		case "A6":
		case "a6":
			custName[5] = enterName; 
			break;
		case "A7":
		case "a7":
			custName[6] = enterName; 
			break;
		case "A8":
		case "a8":
			custName[7] = enterName; 
			break;
			
		// B(1-8)
		case "B1":
		case "b1":
			custName[8] = enterName; 
			break;
		case "B2":
		case "b2":
			custName[9] = enterName;
			break;
		case "B3":
		case "b3":
			custName[10] = enterName;
			break;
		case "B4":
		case "b4":
			custName[11] = enterName;
			break;
		case "B5":
		case "b5":
			custName[12] = enterName;
			break;
		case "B6":
		case "b6":
			custName[13] = enterName;
			break;
		case "B7":
		case "b7":
			custName[14] = enterName;
			break;
		case "B8":
		case "b8":
			custName[15] = enterName;
			break;
		// C(1-8)
		case "C1":
		case "c1":
			custName[16] = enterName;
			break;
		case "C2":
		case "c2":
			custName[17] = enterName;
			break;
		case "C3":
		case "c3":
			custName[18] = enterName;
			break;
		case "C4":
		case "c4":
			custName[19] = enterName;
			break;
		case "C5":
		case "c5":
			custName[20] = enterName;
			break;
		case "C6":
		case "c6":
			custName[21] = enterName;
			break;
		case "C7":
		case "c7":
			custName[22] = enterName;
			break;
		case "C8":
		case "c8":
			custName[23] = enterName;
			break;
			
		}
	}

	
	// To print the theaterMap
	public static void printMap(char[][] theaterMap) {
		for(char[] row : theaterMap) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
		
	}
		
}

