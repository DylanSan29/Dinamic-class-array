public class Student {
    /*These are the attributes, are required to describe or know, how the student is composed.
    As in this example, you have the possibility of establish data by default (You could just don´t do it).
     */
    private String name = "without name";
    private int age = 0;
    private long telephone = 0;
    private float average = 0;
    private char gender = '0';

    //The Builder, needs the parameter to register for the student
    public Student(String name, int age, long telephone, float average, char gender){
        //Validate the variable structure.
        setName(name);
        setAge(age);
        setTelephone(telephone);
        setAverage(average);
        setGender(gender);
    }
    //Methods
    /* As you can see, the attributes are privates, so it means you won´t access those directly, for this reason
    you need methods, let me show you. :)
     */
    //Setters: Save value
    public void setName(String name){
        boolean isValid = validateName(name);
        if(isValid)
            this.name = name;
    }
    public void setAge(int age){
        boolean isValid = validateAge(age);
        if(isValid)
            this.age = age;
    }
    public void setTelephone(long telephone){
        boolean isValid = validateTelephone(telephone);
        if(isValid)
            this.telephone = telephone;
    }
    public void setAverage(float average){
        boolean isValid = validateAverage(average);
        if(isValid)
            this.average = average;
    }
    public void setGender(char gender){
        boolean isValid = validateGender(gender);
        if(isValid)
            this.gender = gender;
    }
    //Getters: Access value
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public long getTelephone(){
        return telephone;
    }
    public float getAverage(){
        return average;
    }
    public char getGender(){
        return gender;
    }
    //Validators: Not necessary but if you variable needs a structure you may validate it.
    public boolean validateName(String name){
        boolean isValid = true;
        if(name.length() < 4)
            isValid = false;
        return isValid;
    }
    public boolean validateAge(int age){
        boolean isValid = true;
        if(age > 110)
            isValid = false;
        return isValid;
    }
    public boolean validateTelephone(long telephone){
        boolean isValid = true;
        if(telephone < 1000000000)
            isValid = false;
        return isValid;
    }
    public boolean validateAverage(float average){
        boolean isValid = true;
        if(average < 1 || average > 100)
            isValid = false;
        return isValid;
    }
    public boolean validateGender(char gender){
        boolean isValid = true;
        if(gender!= 'M' && gender!= 'm' && gender!= 'f' && gender!= 'F')
            isValid = false;
        return isValid;
    }

}
