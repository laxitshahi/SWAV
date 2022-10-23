package project.controller;

import java.io.File;
import java.util.ArrayList;


import java.io.FileReader;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import project.model.User;
//import com.csvreader.CsvReader; import com.csvreader.CsvWriter;

public class MaintainUser {
    public ArrayList<User> users = new ArrayList<User>();
//	public String path;

    public void load(FileReader file) throws Exception {
        CSVReader reader = new CSVReader(file);
        String[] line;
        while (reader.readNext() != null) {

            line = reader.readNextSilently();

            User user = new User(line[0], Integer.parseInt(line[1]), line[2], line[3]);
            users.add(user);

        }

        reader.close();
        System.out.println("Number of Users: " + users.size());

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
//        System.out.println(users.get(0).getClass());
    }


//		
//		while(reader.readNext() != null){ 
//			User user = new User();
//			//name,id,email,password
//			user.setName(reader.get("name"));
//			user.setId(Integer.valueOf(reader.get("id")));
//			user.setEmail(reader.get("email"));
//			user.setPassword(reader.get("password"));
//			users.add(user);
//		}
//	}

    //	public void update(String path) throws Exception{
//		try {		
//				CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
//				//name,id,email,password
//				csvOutput.write("name");
//				csvOutput.write("id");
//		    	csvOutput.write("email");
//				csvOutput.write("password");
//				csvOutput.endRecord();
//
//				// else assume that the file already has the correct header line
//				// write out a few records
//				for(User u: users){
//					csvOutput.write(u.getName());
//					csvOutput.write(String.valueOf(u.getId()));
//					csvOutput.write(u.getEmail());
//					csvOutput.write(u.getPassword());
//					csvOutput.endRecord();
//				}
//				csvOutput.close();
//			
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//	}
    public static void main(String[] args) throws Exception {

        String filePath = new File("project/src/main/resources/user.csv").getAbsolutePath();
        System.out.println(filePath);
        FileReader p = new FileReader(filePath); //Buffer: Putting file in memory

        MaintainUser maintain = new MaintainUser();

        maintain.load(p);

//		for(User u: maintain.users){
//			System.out.println(u.toString());
//		}
//	
//		
//		maintain.users.clear();


//		User newUser1 = new User("t3", 3, "t3@yorku.ca", "t3t3");
//		maintain.users.add(newUser1);
//		
//		User newUser = new User("t4", 4, "t4@yorku.ca", "t4t4");
//		maintain.users.add(newUser);
//		
//		User testUser= new User("t5", 5, "t5@yorku.ca", "t5t5");
//		maintain.users.add(testUser);
//		
//		maintain.update(path);
    }
}
