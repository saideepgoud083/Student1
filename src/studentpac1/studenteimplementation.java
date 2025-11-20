package studentpac1;

import java.util.ArrayList;

public class studenteimplementation implements operations1  {

	@Override
	public studente findStudent(int id, ArrayList<studente> studlist) {
		// TODO Auto-generated method stub
		studente s=null;
		for(int i=0;i<studlist.size();i++)
		{
			if(studlist.get(i).getSid()==id) 
			{
				s = studlist.get(i);
				break;
			}
		}
		return s;

	}

	@Override
	public void addStudent(studente s, ArrayList<studente> studlist) {
		// TODO Auto-generated method stub
		studlist.add(s);

	}

	@Override
	public void deleteStudent(int id, ArrayList<studente> studlist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayStudent(ArrayList<studente> studlist) {
		// TODO Auto-generated method stub
		
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
