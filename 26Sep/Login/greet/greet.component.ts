/*
  View Encapsulation- hides style of a component from other part.
  3 strategies:
ViewEncapsulation.None
ViewEncapsulation.Emulated-- default
ViewEncapsulation.ShadowDOM

*/




import { Component, OnInit,Input, ViewEncapsulation } from '@angular/core';

@Component({
  selector: 'app-greet',
  templateUrl: './greet.component.html',
 
  styleUrls: ['./greet.component.css']
 /* template: `
  <h2>None</h2>
  <div>No encapsulation</div>
`,
styles: ['h1 { color: red; }'],
encapsulation: ViewEncapsulation.None,*/
})
export class GreetComponent implements OnInit {
 
  constructor() { }
ngOnInit(): void {
  
}
username:string="";
password:string="";
msg="";
status:string='error';
cssStringVar: string= '';
validate():void{
  if(this.username=="abc" && this.password=="123"){
  this.status='';
    this.msg="Welcome"+this.username;
  
  }
  else{
  this.msg="Invalid user";
  this.status='error';
  
  }
  
  this.username="";
  this.password="";
}
 
}
