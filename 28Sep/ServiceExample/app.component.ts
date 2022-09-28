import { Component } from '@angular/core';
//1. import service
import { AppServiceService } from './app-service.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  //2. Add Service in metadata
  providers: [AppServiceService] 
})
export class AppComponent {
  title = 'ServiceExample';
//3. Declare variables
  value: string = ""; 
  productList: Array<any>=[];
  //inject service in constructor

   constructor(private _appService: AppServiceService) { } 
  //calling functions from service
   ngOnInit(): void { 
      this.value = this._appService.getApp();
      this.productList=this._appService.getProducts(); 
   }   
}
