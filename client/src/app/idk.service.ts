import { HttpClient } from '@angular/common/http';
import { Injectable, OnInit } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class IdkService implements OnInit{

  
  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.http.get('/') 

    //observable 
    //need to dubscribe to trigger it 

  }
}
