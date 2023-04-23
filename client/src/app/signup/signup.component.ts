import { Component, Input, Output } from '@angular/core';
import { FormBuilder, FormGroup} from '@angular/forms'

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  
  signupForm!: FormGroup
  // //need array ??



  constructor(private fb: FormBuilder) { } 
  //constructor(private )
  // constructor(private cardSvc: CardDeetsService) { }

  // ngOnInit() {
  //   this.signupForm = new FormGroup({
  //     'username': new FormControl(null, Validators.required),
  //     'email': new FormControl(null, [Validators.required, Validators.email]),
  //     'password': new FormControl(null, Validators.required),
  //     'confirmPassword': new FormControl(null, Validators.required)
  //   });
  // }



}
