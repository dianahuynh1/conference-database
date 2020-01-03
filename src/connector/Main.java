package connector;
import java.sql.*;
import java.io.File;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/conferences","admin","root");
			
			//ADD REGISTRANTS
			/*
            Scanner input = new Scanner (new File("registrants.txt"));
            while(input.hasNextLine()) {
                Statement stmt = con.createStatement();
                String line = input.nextLine();
                String[] values = line.split(",");
                String sql = "Insert Into registrants values (\"" + values[0] + "\", \"" + values[1] + "\",\"" + values[2] + "\",\"" 
                												+ values[3] + "\",\"" + values[4] + "\",\"" + values[5] + "\",\""
                												+ values[6] + "\")";
                System.out.println(sql);
                Boolean ret = stmt.execute(sql);
            }
            */
            
			
			//ADD COMPANIES
			/*
			Scanner input = new Scanner (new File("companies.txt"));
            while(input.hasNextLine()) {
                Statement stmt = con.createStatement();
                String line = input.nextLine();
                String[] values = line.split(",");
                String sql = "Insert Into companies values (\"" + values[0] + "\", \"" + values[1] + "\",\"" + values[2] + "\",\"" 
                												+ values[3] + "\")";
                System.out.println(sql);
                Boolean ret = stmt.execute(sql);
            }
			*/
			
			//ADD CONFERENCES
			/*
			Scanner input = new Scanner (new File("conferences.txt"));
            while(input.hasNextLine()) {
                Statement stmt = con.createStatement();
                String line = input.nextLine();
                String[] values = line.split(",");
                String sql = "Insert Into conferences values (\"" + values[0] + "\", \"" + values[1] + "\",\"" + values[2] + "\",\"" 
                												+ values[3] + "\",\"" + values[4] + "\",\"" + values[5] + "\",\""
                												+ values[6] + "\",\"" + values[7] + "\",\"" + values[8] + "\")";
                Boolean ret = stmt.execute(sql);
            }
			*/
			
			//ADD EVENTS
			/*
			Scanner input = new Scanner (new File("events.txt"));
            while(input.hasNextLine()) {
                Statement stmt = con.createStatement();
                String line = input.nextLine();
                String[] values = line.split(",");
                String sql = "Insert Into events values (\"" + values[0] + "\", \"" + values[1] + "\",\"" + values[2] + "\",\"" 
                												+ values[3] + "\",\"" + values[4] + "\",\"" + values[5] + "\",\""
                												+ values[6] + "\")";
                Boolean ret = stmt.execute(sql);
            }
			*/
			
			//ADD SPONSERS
			/*
			Scanner input = new Scanner (new File("sponsers.txt"));
            while(input.hasNextLine()) {
                Statement stmt = con.createStatement();
                String line = input.nextLine();
                String[] values = line.split(",");
                String sql = "Insert Into sponsers values (\"" + values[0] + "\", \"" + values[1] +"\")";
                Boolean ret = stmt.execute(sql);
            }
			*/
			
			//ADD ATTENDS
			/*
			Scanner input = new Scanner (new File("attends.txt"));
            while(input.hasNextLine()) {
                Statement stmt = con.createStatement();
                String line = input.nextLine();
                String[] values = line.split(",");
                String sql = "Insert Into attends values (\"" + values[0] + "\", \"" + values[1] + "\",\"" + values[2] + "\")";
                Boolean ret = stmt.execute(sql);
            }
			*/
			
			//--------------------QUERIES--------------------
			
			/*
			//Show the company and event names where event subject is Robotics and the company incorporation type is Foreign.
			Statement s1 = con.createStatement();
			ResultSet rs1 = s1.executeQuery("select C.name, E.name from events AS E, companies AS C where C.COID = E.companye AND E.subject = 'Robotics' AND C.incorporation = 'Foreign'");
			while(rs1.next()) {
				String name = rs1.getString("C.name");
				String name2 = rs1.getString("E.name");
				System.out.println("Company: " + name + " " + "Event name: " + name2);
			}
			*/
			
			/*
			//Show the conference name, event name and time for events presented by Elon Musk
			Statement s2 = con.createStatement();
			ResultSet rs2 = s2.executeQuery("select C.name, E.name, E.time from events AS E, conferences AS C where C.CFID = E.conferencee AND E.presenter = 'Elon Musk'");
			while(rs2.next()) {
				String name1 = rs2.getString("C.name");
				String name2 = rs2.getString("E.name");
				String name3 = rs2.getString("E.time");
				System.out.println("Conference: " + name1 + " Event: " + name2 + " Time: " + name3);
			}
			*/
			
			/*
			//Show the number of events by subject where the conference type is Technology
			Statement s3 = con.createStatement();
			ResultSet rs3 = s3.executeQuery("select E.subject, COUNT(E.subject) from events AS E, conferences AS C where C.CFID = E.conferencee AND C.type = 'Technology' group by E.subject");
			while(rs3.next()) {
				String name1 = rs3.getString("E.subject");
				String n1 = rs3.getString("COUNT(E.subject)");
				System.out.println(name1 + " " + n1);
			}
			*/
			
			/*
			//Show event names and times where the subject is Cyber Security
			Statement s4 = con.createStatement();
			ResultSet rs4 = s4.executeQuery("select E.name, E.time from events AS E, conferences AS C where C.CFID = E.conferencee AND E.subject = 'Cyber Security'");
			while(rs4.next()) {
				String name1 = rs4.getString("E.name");
				String name2 = rs4.getString("E.time");
				System.out.println(name1 + " " + name2);
			}
			*/
			
			/*
			//Show events by name hosted by Apple and is attended by professionals.
			Statement s5 = con.createStatement();
			ResultSet rs5 = s5.executeQuery("select distinct CF.name from events AS E, companies AS C, registrants AS R, attends AS A, conferences AS CF where C.COID = A.companya AND A.registranta = R.RID AND C.COID = CF.companyc AND R.type = 'Professional' AND C.name = 'Microsoft'");
			while(rs5.next()) {
				String name1 = rs5.getString("CF.name");
				System.out.println(name1);
			}
			if(!rs5.first())
				System.out.println("No results.");
			*/
			
			/*
			Scanner kb = new Scanner(System.in);
			System.out.println("Option 1");
			System.out.println("Option 2");
			System.out.println("Option 3");
			System.out.print("Enter an option number: ");
			int n = kb.nextInt();
			System.out.println("You picked option" + n);
			*/
			boolean stop = false;
			String[] sub1 = {"", "Cyber Security", "Software Engineering", "Artificial Intelligence", "Cloud Computing", "Mobile Applications"};
			String[] con1 = {"", "United States", "Germany", "United Kingdom", "Czech Republic", "Singapore"};
			String[] pres1 = {"", "Elon Musk", "Tim Cook", "Gina Mack", "Caroline Hyde", "David Carr"};
			String[] conftype = {"", "STEM", "Technology", "Javascript", "DevOps", "Artificial Intelligence"};
			String[] confcity = {"", "San Francisco", "New York City", "Berlin", "London", "Chicago"};
			String[] comp1 = {"", "FedEx", "Intel", "Apple", "Comcast", "Ericsson"};
			while(!stop) {
				Scanner kb = new Scanner(System.in);
				System.out.println("1: Count the total number of of registrants that attended all events by Microsoft.");
	            System.out.println("2: Display the names of the registrants who received a scholarship and whose academic background is in Mobile Applications.");
	            System.out.println("3: Display the names of all events that occur in the evening and the subject is Data Science.");
	            System.out.println("4: Display the names of all conferences located in Chicago and are sponsored by McKesson.");
	            System.out.println("5: Display the names of all conferences sponsored by foreign companies.");
				System.out.println("6: Find conferences and events depending on the event subject and the incorporation type of the conference sponsors.");
				System.out.println("7: Find conferences located in some country and events with their times where a specific person is presenting.");
				System.out.println("8: Display the number of events by subject at conferences of a certain type.");
				System.out.println("9: Dispaly event names and times of a specific subject and the conference is located in a specific city.");
				System.out.println("10: Display the names of the companies that host events on a certain subject.");
				
				boolean option = false;
				int n = 0;
				while(!option) {
					System.out.print("Enter a number that corresponds to a query: ");
					n = kb.nextInt();
					if(n > 0 && n < 11)
						option = true;
				}
				System.out.println("You picked option " + n);
				System.out.println();
				
				
				//----------------------QUERY 1----------------
				
				if(n == 1) {
					Statement s1 = con.createStatement();
                    ResultSet rs1 = s1.executeQuery("select COUNT(R.RID) FROM registrants AS R, conferences AS CF, attends AS A, companies AS C WHERE C.COID = A.companya AND R.RID = A.registranta AND CF.companyc = C.COID AND C.name = 'Intel'");
                    while(rs1.next()) {
                        String numOfReg = rs1.getString("COUNT(R.RID)");
                        System.out.println(numOfReg);
                    }
                    if(!rs1.first())
                    	System.out.println("No results.");
    				System.out.println();
				}
				
				
				//----------------------QUERY 2----------------
				//Display the names of the registrants who received a scholarship and whose academic background is in Mobile Applications.
				if(n == 2) {
					Statement s2 = con.createStatement();
                    ResultSet rs2 = s2.executeQuery("select name from registrants where field = 'Mobile Applications' AND scholarship = 'Yes'");
                    while(rs2.next()) {
                        String nameOfReg = rs2.getString("name");
                        System.out.println(nameOfReg);
                    }
                    if(!rs2.first())
						System.out.println("No results.");
					System.out.println();
				}
				
				//----------------------QUERY 3----------------
				//Display the names of all events that occur in the evening and the subject is Data Science.
				if(n == 3) {
					Statement s3 = con.createStatement();
                    ResultSet rs3 = s3.executeQuery("select name from events WHERE time = 'evening' AND subject = 'Data Science'");
                    while(rs3.next()) {
                        String nameEvent = rs3.getString("name");
                        System.out.println(nameEvent);
                    }
                    if(!rs3.first())
						System.out.println("No results.");
					System.out.println();
				}
				
				//----------------------QUERY 4----------------
				//Display the names of all conferences located in Chicago and are sponsored by McKesson.
				if(n == 4) {
					Statement s4 = con.createStatement();
                    ResultSet rs4 = s4.executeQuery("select CF.name, CF.type from conferences AS CF, companies AS C WHERE CF.city = 'Chicago' AND C.COID = CF.companyc AND C.name = 'McKesson'");
                    while(rs4.next()) {
                        String name1 = rs4.getString("CF.name");
                        String name2 = rs4.getString("CF.type");
                        System.out.println("Conference name: " + name1 + " Conference type: " + name2);
                    }
                    if(!rs4.first())
						System.out.println("No results.");
					System.out.println();
				}
				
				//----------------------QUERY 5----------------
				//Display the names of all conferences sponsored by foreign companies.
				if(n == 5) {
					Statement s5 = con.createStatement();
                    ResultSet rs5 = s5.executeQuery("select CF.name from conferences AS CF, companies AS C where C.incorporation = 'Foreign' AND C.COID = CF.companyc");
                    while(rs5.next()) {
                        String nameOfconf2 = rs5.getString("CF.name");
                        System.out.println(nameOfconf2);
                    }
                    if(!rs5.first())
						System.out.println("No results.");
					System.out.println();
				}
				
				
				//-----------------QUERY 6----------------
				//1: Find conferences and events depending on the event subject and the incorporation type of the conference sponsors
				if(n == 6) {
					boolean b1 = false;
					int n1 = 0;
					System.out.println("Subjects:");
					System.out.println("1: Cybersecurity");
					System.out.println("2: Software Engineering");
					System.out.println("3: Artificial Intelligence");
					System.out.println("4: Cloud Computing");
					System.out.println("5: Mobile Application");
					while(!b1) {
						System.out.println("Enter a number that corresponds to a subject: ");
						n1 = kb.nextInt();
						if(n1 > 0 && n1 < 6)
							b1 = true;
					}
					boolean b2 = false;
					int n2 = 0;
					System.out.println("Incorporation types:");
					System.out.println("1: Domestic");
					System.out.println("2: Foreign");
					while(!b2) {
						System.out.println("Enter a number that corresponds to an incorporation type: ");
						n2 = kb.nextInt();
						if(n2 > 0 && n2 < 3)
							b2 = true;
					}
					String ct1 = "";
					if(n2 == 1)
						ct1 = "Domestic";
					else
						ct1 = "Foreign";
					
					System.out.println();
					Statement s1 = con.createStatement();
					String q1 = "select C.name, CF.name, E.name from events AS E, conferences AS CF, companies AS C where C.COID = E.companye AND C.COID = CF.companyc AND E.subject = '" + sub1[n1] + "' AND C.incorporation = '" + ct1 + "'";
					ResultSet rs1 = s1.executeQuery(q1);
					while(rs1.next()) {
						String name = rs1.getString("C.name");
						String name1 = rs1.getString("CF.name");
						String name2 = rs1.getString("E.name");
						System.out.println("Company: " + name + " Conference: " + name1 + " Event name: " + name2);
					}
					if(!rs1.first())
						System.out.println("No results.");
					System.out.println();
				}
				
				//------------------QUERY 7------------------------
				//2: Find conferences located in some country and events with their times where a specific person is presenting
				if(n == 7) {
					boolean b1 = false;
					int n1 = 0;
					System.out.println("Countries:");
					System.out.println("1: United States");
					System.out.println("2: Germany");
					System.out.println("3: United Kingdom");
					System.out.println("4: Czech Republic");
					System.out.println("5: Singapore");
					while(!b1) {
						System.out.println("Enter a number that corresponds to a country: ");
						n1 = kb.nextInt();
						if(n1 > 0 && n1 < 6)
							b1 = true;
					}
					boolean b2 = false;
					int n2 = 0;
					System.out.println("Presenters:");
					System.out.println("1: Elon Musk");
					System.out.println("2: Tim Cook");
					System.out.println("3: Gina Mack");
					System.out.println("4: Caroline Hyde");
					System.out.println("5: David Carr");
					while(!b2) {
						System.out.println("Enter a number that corresponds to a presenter: ");
						n2 = kb.nextInt();
						if(n2 > 0 && n2 < 6)
							b2 = true;
					}
					
					System.out.println();
					Statement s2 = con.createStatement();
					String q2 = "select C.name, E.name, E.time from events AS E, conferences AS C where C.CFID = E.conferencee AND C.country = '" + con1[n1] + "' AND E.presenter = '" + pres1[n2] + "'";
					ResultSet rs2 = s2.executeQuery(q2);
					while(rs2.next()) {
						String name1 = rs2.getString("C.name");
						String name2 = rs2.getString("E.name");
						String name3 = rs2.getString("E.time");
						System.out.println("Conference: " + name1 + " Event: " + name2 + " Time: " + name3);
					}
					if(!rs2.first())
						System.out.println("No results.");
					System.out.println();
				}
				
				//-----------------QUERY 8-------------------------
				//3: Show the number of events by subject at conferences of a certain type
				if(n == 8) {
					boolean b1 = false;
					int n1 = 0;
					System.out.println("Conference types:");
					System.out.println("1: STEM");
					System.out.println("2: Technology");
					System.out.println("3: Javascript");
					System.out.println("4: DevOps");
					System.out.println("5: Artificial Intelligence");
					while(!b1) {
						System.out.println("Enter a number that corresponds to a conference type: ");
						n1 = kb.nextInt();
						if(n1 > 0 && n1 < 6)
							b1 = true;
					}
					
					System.out.println();
					Statement s3 = con.createStatement();
					String q3 = "select E.subject, COUNT(E.subject) from events AS E, conferences AS C where C.CFID = E.conferencee AND C.type = '" + conftype[n1] + "' group by E.subject";
					ResultSet rs3 = s3.executeQuery(q3);
					while(rs3.next()) {
						String name1 = rs3.getString("E.subject");
						String c1 = rs3.getString("COUNT(E.subject)");
						System.out.println(name1 + " " + c1);
					}
					if(!rs3.first())
						System.out.println("No results.");
					System.out.println();
				}
				
				//-------------------QUERY 9-------------------
				//Show event names and times of a specific subject and the conference is located in a specific city
				if(n == 9) {
					boolean b1 = false;
					int n1 = 0;
					System.out.println("Subjects:");
					System.out.println("1: Cybersecurity");
					System.out.println("2: Software Engineering");
					System.out.println("3: Artificial Intelligence");
					System.out.println("4: Cloud Computing");
					System.out.println("5: Mobile Application");
					while(!b1) {
						System.out.println("Enter a number that corresponds to an event subject: ");
						n1 = kb.nextInt();
						if(n1 > 0 && n1 < 6)
							b1 = true;
					}
					
					boolean b2 = false;
					int n2 = 0;
					System.out.println("Cities:");
					System.out.println("1: San Francisco");
					System.out.println("2: New York City");
					System.out.println("3: Berlin");
					System.out.println("4: London");
					System.out.println("5: Chicago");
					while(!b2) {
						System.out.println("Enter a number that corresponds to a city: ");
						n2 = kb.nextInt();
						if(n2 > 0 && n2 < 6)
							b2 = true;
					}
					
					Statement s4 = con.createStatement();
					String q4 = "select E.name, E.time from events AS E, conferences AS C where C.CFID = E.conferencee AND E.subject = '" + sub1[n1] + "' AND C.city = '" + confcity[n2] + "'";
					ResultSet rs4 = s4.executeQuery(q4);
					while(rs4.next()) {
						String name1 = rs4.getString("E.name");
						String name2 = rs4.getString("E.time");
						System.out.println("Event name: " + name1 + " Event time: " + name2);
					}
					if(!rs4.first())
						System.out.println("No results.");
					System.out.println();
				}
				

				//----------------QUERY 10-----------------
				//Display the names of the companies that host events on a certain subject.
				if(n == 10) {
					boolean b1 = false;
					int n1 = 0;
					System.out.println("Subjects:");
					System.out.println("1: Cybersecurity");
					System.out.println("2: Software Engineering");
					System.out.println("3: Artificial Intelligence");
					System.out.println("4: Cloud Computing");
					System.out.println("5: Mobile Application");
					while(!b1) {
						System.out.println("Enter a number that corresponds to a subject: ");
						n1 = kb.nextInt();
						if(n1 > 0 && n1 < 6)
							b1 = true;
					}
					
					System.out.println();
					Statement s5 = con.createStatement();
					String q5 = "select C.name from events AS E, companies AS C where C.COID = E.companye AND E.subject= '" + sub1[n1] + "'";
					ResultSet rs5 = s5.executeQuery(q5);
					while(rs5.next()) {
						String name1 = rs5.getString("C.name");
						System.out.println(name1);
					}
					if(!rs5.first())
						System.out.println("No results.");
					System.out.println();
				}
				
				//----------------QUERY 11-----------------
				//Show events by name hosted by some company and is attended by professionals in the morning
				if(n == 11) {
					boolean b1 = false;
					int n1 = 0;
					System.out.println("Companies:");
					System.out.println("1: FedEx");
					System.out.println("2: Intel");
					System.out.println("3: Apple");
					System.out.println("4: Comcast");
					System.out.println("5: Ericsson");
					while(!b1) {
						System.out.println("Enter a number that corresponds to a company: ");
						n1 = kb.nextInt();
						if(n1 > 0 && n1 < 6)
							b1 = true;
					}
					
					System.out.println();
					Statement s5 = con.createStatement();
					String q5 = "select distinct C.name from events AS E, companies AS C where C.COID = A.companya AND A.registranta = R.RID AND C.COID = CF.companyc AND R.type = 'Professional' AND C.name = '" + comp1[n1] + "' AND E.time = 'Morning'";
					ResultSet rs5 = s5.executeQuery(q5);
					while(rs5.next()) {
						String name1 = rs5.getString("E.name");
						System.out.println(name1);
					}
					if(!rs5.first())
						System.out.println("No results.");
					System.out.println();
				}
				
				
				
				
				//-----------------KEEP GOING OR NAH------------------------
				System.out.println("Do you want to continue?");
				System.out.println("Enter 0 for NO or any other number for YES.");
				int go = kb.nextInt();
				if(go == 0)
					stop = true;
			}
			
			System.out.println("Have a nice day.");
			con.close();
			//kb.close();
			//input.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
