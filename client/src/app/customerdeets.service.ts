import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from './models';

@Injectable({
  providedIn: 'root'
})
export class CustomerdeetsService {
  httpClient: any;

  constructor(private http: HttpClient) { }

  addCust(): Observable<Customer[]> {
    return this.httpClient.post('/api/signup')

  }
}
