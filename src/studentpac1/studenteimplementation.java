package studentpac1;

import java.util.ArrayList;

public class studenteimplementation implements operations1  {

	@Override
	public studente findStudent(int id, ArrayList<studente> studlist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStudent(studente s, ArrayList<studente> studlist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int id, ArrayList<studente> studlist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayStudent(ArrayList<studente> studlist) {
		// TODO Auto-generated method stub
		if(studlist!=null) {
			for(studente s:studlist) {
				System.out.println(s);
			}
		}
	}

	@Override
	public void updateName(int id, ArrayList<studente> studlist, String un) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int countStudents(ArrayList<studente> studlist) {
		// TODO Auto-generated method stub
		return 0;
	}

}
