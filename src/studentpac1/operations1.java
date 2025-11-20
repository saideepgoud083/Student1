package studentpac1;

import java.util.ArrayList;

public interface operations1   {
	
public studente findStudent(int id,ArrayList<studente> studlist);
	
	public void addStudent(studente s,ArrayList<studente> studlist);
	
	public void deleteStudent(int id,ArrayList<studente> studlist);
	
	public void displayStudent(ArrayList<studente> studlist);
	
	public void updateName(int id,ArrayList<studente>studlist,String un);
	
	public int countStudents(ArrayList<studente> studlist);

}
