package com.mapper.main;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

import com.mapper.main.destinatonObject.DestinationObject;
import com.mapper.main.source.SourceObject;
import com.mapper.main.source.Student;

public class App 
{
    public static void main( String[] args )
    {
    	SourceObject sourceObject=new SourceObject();
    	sourceObject.setName("simran");
    	sourceObject.setAddress("hyderabad");

        sourceObject.getStudent().add(new Student("S1", "C1", "diffField1"));
        sourceObject.getStudent().add(new Student("S2", "C2", "diffField2"));
        sourceObject.getStudent().add(new Student("S3", "C3", "diffField3"));
        
        System.out.println(sourceObject.getStudent());
//    	
//    	Student s=new Student();
//    	s.setName("alia");
//    	s.setBatch("A");
//    	s.setAddress("bangalore");
//    	
//    	sourceObject.getStudent().add(s);

    	
//    	DozerBeanMapper mapper=new DozerBeanMapper();
//    	DestinationObject d=mapper.map(sourceObject, DestinationObject.class);
//    	
//    	System.out.println(d);
        
        
    	
        DestinationObject targetObj = new DozerBeanMapper().map(sourceObject, DestinationObject.class);
        System.out.println("DestinationObject : " + targetObj);
    	
    }
}
