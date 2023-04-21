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


}
