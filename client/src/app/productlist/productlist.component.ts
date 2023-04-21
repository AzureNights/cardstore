import { Component, OnInit } from '@angular/core';
import { CardDetails } from '../models';
import { CardDeetsService } from '../card-deets.service';

@Component({
  selector: 'app-productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent implements OnInit{

  cards: CardDetails[] = []

  constructor(private cardSvc: CardDeetsService) { }

  ngOnInit(): void {
      this.cardSvc.getCards()
        .subscribe(cards => {
          this.cards = cards
          console.info('>>>>>', this.cards)
        })
        
  }



}
