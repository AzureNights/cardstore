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
  cards!: CardDetails
  //activatedRoute: any;

  constructor(
    private activatedRoute: ActivatedRoute,
    private cardSvc: CardDeetsService) { }

  ngOnInit(): void {

    this.params$ = this.activatedRoute.params.subscribe(
      (params) => {
        const product_id = params['product_id']
        this.cardSvc.getCardById(product_id)
          .then(result => {
            this.cards = result
            console.info('>>> card: ', this.cards)
          })
          .catch(error => {
            console.error('>> error: ', error)
          })
      }
    )

  }



    //FOR OBSERVABLE IN SERVICE 
    // this.params$ = this.activatedRoute.params.subscribe(
    //   (params) =>{
    //     const product_id = params['product_id']
    //     this.cardSvc.getCardById(product_id).subscribe(
    //       (card: CardDetails[]) => {this.card = card
    //         console.info('>>>>', this.card)})
    //     )
        


          // .then((result: CardDetails[]) => {
          //   this.card = result
          //   console.info('>>> book: ', this.card)
          // })



      
              
        }
          //then is only for promise  
    //       .catch((error: any) => {
    //         console.error('>> error: ', error)
    //       })
    // }

  

