import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CardDetails } from './models';
import { Observable, firstValueFrom } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CardDeetsService {

  constructor(private http: HttpClient) { }
  

  getCards(): Observable<CardDetails[]> {
    // return firstValueFrom(
      return this.http.get<CardDetails[]>('/api/cards')
  }

  getEachCard(product_id: number): Observable<CardDetails[]> {

    // need to build URL based on product id
    //const productUrl = `${this.baseUrl}/${theProductId}`;

    return this.http.get<CardDetails[]>(`/api/cards/${product_id}`);
  }
}

//need to get info frtom backend ui think 
