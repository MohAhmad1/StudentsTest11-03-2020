package ie.gmit;

import java.util.ArrayList;

public class StudentsList {
    private ArrayList<Students> list;

    private StudentsList(){
        list = new ArrayList<Students>();
    }

    public void addStudent(Students myStudent)
    {
        list.add(myStudent);
    }

    public int getSize()
    {
        list.size();
        return list.size();
    }

    public Students findByName(String name)
    {
        for(Students student : list)
        {
            if(student.getName().equals(name))
            {
                return student;
            }
        }
        return null;
    }
}
