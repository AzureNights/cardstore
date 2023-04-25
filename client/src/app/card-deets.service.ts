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

  getCardById(product_id: number): Promise<CardDetails> {

    // need to build URL based on product id
    //const productUrl = `${this.baseUrl}/${theProductId}`;

    return firstValueFrom(
      this.http.get<CardDetails>(`/api/cards/${product_id}`)
    )


    //return this.http.get<CardDetails[]>(`/api/cards/${product_id}`);
  }
}

//need to get info frtom backend ui think 
