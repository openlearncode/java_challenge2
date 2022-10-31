public class UserDAO{
    
    public static String[][] database = new String[100][5];
    public static int position = 0;

	public static void createUser(String name,
									String surname,
									String email,
									String dob,
									String id){

        database[position] = new String[]{name,surname,email,dob,id};
        position++;
	}

	public static String[] getUserByEmail(String email){
        for(String [] row : database){//Iterate through the rows
        	if(null != row[3] && email.equals(row[3])){//Iterate through the columns
                return row;
        	}
        }

        return null;
	}

	public static String[][] findAll(){
		return database;
	}

	public static void updateUser(
		String name,
		String surname,
		String email,
		String dob,
		String id){
        //PLEASE CODE ME
	}

	public static void deleteUser(String email){
     //PLEASE CODE ME   
	}



}