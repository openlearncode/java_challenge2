public class CreateUserDAOTest{
    
	public static void main(String []args){
       UserDAO.createUser("John","Smith","john@test.com","11/11/1999","1"); 
       UserDAO.createUser("James","Jones","james@test.com","01/01/1995","2"); 

       print(UserDAO.findAll());
	}

	public static void print(String [][] db){
		for(String [] row:db){
			if(null != row && null != row[0]){
				System.out.println("name = "+row[0]
					+" surname = "+row[1]
					+" email = "+row[2]
					+" dob = "+row[3]
					+" id = "+row[4]);
			}
		}
	}
}