class Person{
 name: string="";
constructor(name:string){
    this.name=name;
}
show(){
    console.log("name="+this.name);
}

}

class Student extends Person{
private marks:number=0;
constructor(marks:number, name:string){
    super(name);
    this.marks=marks;

}
display(){
   super.show();
    console.log("marks="+this.marks);
}

}

let student=new Student(23,'Lalit');
student.display();