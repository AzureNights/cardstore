import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CardDetails } from '../models';
import { Subscription } from 'rxjs';
import { CardDeetsService } from '../card-deets.service';

@Component({
  selector: 'app-productinfo',
  templateUrl: './productinfo.component.html',
  styleUrls: ['./productinfo.component.css']
})
export class ProductinfoComponent implements OnInit {

  params$!: Subscription
  card: CardDetails[] = []
  //activatedRoute: any;

  constructor(private cardSvc: CardDeetsService) { }

  ngOnInit(): void {

    this.params$ = this.activatedRoute.params.subscribe(
      (params) =>{
        const product_id = params['product_id']
        this.cardSvc.getCardById(product_id)
          .then(result => {
            this.card = result
            console.info('>>> card: ', this.card)
          })
          .catch(error => {
            console.error('>> error: ', error)
          })
    }

  }

}



