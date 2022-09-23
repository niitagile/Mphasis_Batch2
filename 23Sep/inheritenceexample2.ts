class Employee1{
private empid:number=0;
private empname: string="";
constructor(id: number, name :string){
    this.empid=id;
    this.empname=name;
}
    public get eid(){
        return this.empid;
    }
    public get ename(){
        return this.empname;
    }
}
class RegEmployee extends Employee1{
private salary:number=0;
constructor(id: number, name :string, salary : number){
    super(id, name);
    this.salary=salary;

}

public get sal(){
    return this.salary;
}

}

let remp=new RegEmployee(1, 'Manika',8978);
console.log("empid="+remp.eid);
console.log("name="+remp.ename);
console.log("salary="+remp.sal);
