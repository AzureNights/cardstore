import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, firstValueFrom } from 'rxjs';
import { Customer } from './models';

@Injectable({
  providedIn: 'root'
})
export class CustomerdeetsService {
  httpClient: any;

  constructor(private http: HttpClient) { }

  addCust(customer: Customer[]): Observable<Customer[]> {
    //return firstValueFrom(this.httpClient.post<Customer>('/api/signup'))

    return this.http.post<Customer[]>('/api/signup', customer);

  }
}
