package com.example.app;

public class OnlineCourse extends Course{
    
    private String CourseUrl;

    public OnlineCourse(String CourseUrl, String teacherName, String CourseName, String room, long idCounter)
    {
        super(teacherName, CourseName,room, idCounter);
        this.CourseUrl = CourseUrl;
        
    }

    public String getCourseUrl(){
        return this.CourseUrl;
    }

    public void setCourseUrl(String CourseUrl){
        this.CourseUrl = CourseUrl;
    }

 
    //Palautetaan kuvaus
    @Override
    public String toString() {
        return String.format(getCourseName() + " - " + getTeacherName() + " - " + getCourseUrl());
    }    
}

