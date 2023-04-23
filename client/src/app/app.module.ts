import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms'

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { ProductinfoComponent } from './productinfo/productinfo.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { CarouselModule } from 'ngx-bootstrap/carousel';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { AboutComponent } from './about/about.component';
import { CardDeetsService } from './card-deets.service';
import { SignupComponent } from './signup/signup.component';
import { CustomerdeetsService } from './customerdeets.service'


const appRoutes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'login', component: LoginComponent},
  {path: 'productinfo/productId', component: ProductinfoComponent},
  {path: 'checkout', component: CheckoutComponent},
  {path: 'productlist', component: ProductlistComponent},
  {path: 'about', component: AboutComponent},
  {path: 'signup', component: SignupComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    CheckoutComponent,
    ProductinfoComponent,
    NavbarComponent,
    FooterComponent,
    ProductlistComponent,
    AboutComponent,
    SignupComponent,
  ],

  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    RouterModule. forRoot(appRoutes),
    CarouselModule.forRoot(),
    ReactiveFormsModule,
  ],
  providers: [CardDeetsService, CustomerdeetsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
