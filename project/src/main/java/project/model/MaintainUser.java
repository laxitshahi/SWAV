package project.model;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;


import java.io.FileReader;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class MaintainUser {

    /**
     * @NOTE: The way that eclipse and Intellij handle path files is different, so you must use different paths for each ide
     */
    //Use this path for Eclipse
    private final String filePath = new File("src/main/resources/user.csv").getAbsolutePath();

    //Use this path for Intellij
//    private final String filePath = new File("project/src/main/resources/user.csv").getAbsolutePath();

    // load users from the csv
    public ArrayList<User> load() throws Exception {
        FileReader file = new FileReader(filePath);
        CSVReader reader = new CSVReader(file);
        ArrayList<User> users = new ArrayList<>();

        String[] line;
        //Skip first line
        reader.readNext();
        while (reader.peek() != null) {
            line = reader.readNext();
            if(line.length != 0) {
                User user = new User(line[0], Integer.parseInt(line[1]), line[2], line[3]);
                users.add(user);
            }
        }
        reader.close();
        return users;
    }

    // updates the csv with new and existing users
    public void update(ArrayList<User> users) throws Exception {
        System.out.println(filePath);
        try {
            FileWriter output = new FileWriter(this.filePath);
            CSVWriter writer = new CSVWriter(output);
            //name,id,email,password
            String[] header = {"name", "id", "email", "password"};

            writer.writeNext(header);

//            List<String[]> data
            for (User u : users) {
                String[] data = {u.getName(), String.valueOf(u.getId()), u.getEmail(), u.getPassword()};
                writer.writeNext(data);
            }

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) throws Exception {
//
//        String filePath = new File("project/src/main/resources/user.csv").getAbsolutePath();
//        System.out.println(filePath);
//        FileReader p = new FileReader(filePath); //Buffer: Putting file in memory
//        MaintainUser maintain = new MaintainUser();
//
//
//        maintain.users.clear();
//
//
//        //Create new user
//        User newUser1 = new User("t10", 3, "t10@yorku.ca", "11141");
//        maintain.users.add(newUser1);
//
//        User newUser2 = new User("t10", 3, "t10@yorku.ca", "11141");
//        maintain.users.add(newUser2);
//        //Load from csv to users array list
//        maintain.load(p);
//
//        for (User u : maintain.users) {
//            System.out.println(u);
//        }
//
//        maintain.update(filePath);
//    }
}
