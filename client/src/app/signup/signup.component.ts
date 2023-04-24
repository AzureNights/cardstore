import { Component, Input, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators} from '@angular/forms'
import { Customer } from '../models';
import { CustomerdeetsService } from '../customerdeets.service';
import { Router } from '@angular/router';
import { first } from 'rxjs';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  
  form!: FormGroup
  customer!: Customer
  //router: any;



  constructor(private fb: FormBuilder, private cdsvc: CustomerdeetsService) { } 

  ngOnInit(): void {
      this.form = this.createForm()

      const firstName = this.form.get('firstName')?.value
      const lastName = this.form.get('lastName')?.value
      const password = this.form.get('password')?.value
      const email = this.form.get('email')?.value

     
  }

  createForm(): FormGroup { 
    return this.fb.group({
      firstName: this.fb.control<string>('',[Validators.required]),
      lastName: this.fb.control<string>('',[Validators.required]),
      password: this.fb.control<string>('',[Validators.required]),
      email: this.fb.control<string>('',[Validators.required]),
    })

  }

  process() {

    const firstName = this.form.get('firstName')?.value
    const lastName = this.form.get('lastName')?.value
    const password = this.form.get('password')?.value
    const email = this.form.get('email')?.value

    //this.cdsvc.addCust(firstName, lastName, password, email)


    // //ACTUAL CODE 
    // const customer: Customer = { firstName, lastName, password, email };

    // this.cdsvc.addCust(customer)
    // .subscribe(customer => {
    //   this.customer = customer[0];
    //   //this.router.navigate(['/login'])
    //     console.info('>>>>>', this.customer)
    //   }) 
    //   }
      
    // }
    //TILL HEERE
  }


    // this.customer = this.form.value as Customer
    // console.info('>>> form:', this.customer)
    
    
    //this.cdsvc.getCustDeets



 
  // ngOnInit() {
  //   this.signupForm = new FormGroup({
  //     'username': new FormControl(null, Validators.required),
  //     'email': new FormControl(null, [Validators.required, Validators.email]),
  //     'password': new FormControl(null, Validators.required),
  //     'confirmPassword': new FormControl(null, Validators.required)
  //   });
  // }
}
