import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { ApplicantFormComponent } from './applicant-form/applicant-form.component';

import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { LaunchPageComponent } from './launch-page/launch-page.component';
import { SignUpPageComponent } from './sign-up-page/sign-up-page.component';
import { CompanyFormComponent } from './company-form/company-form.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { MainPageComponent } from './main-page/main-page.component';
import { HeaderComponent } from './header/header.component';
import { ApplicantComponent } from './applicant/applicant.component';
import { JobListComponent } from './job-list/job-list.component';
import { JobFormComponent } from './job-form/job-form.component';

const appRoutes: Routes = [
  { path:'registerApplicant', component: ApplicantFormComponent } ,
  { path:'main', component: MainPageComponent } ,
  { path:'signup', component: SignUpPageComponent } ,
  { path:'home', component: LaunchPageComponent },
  { path:'login', component: LoginPageComponent },
  { path:'registerCompany', component: CompanyFormComponent },
  { path:'applicants', component: ApplicantComponent },
  { path: 'jobs', component: JobListComponent },
  { path: 'addjob', component: JobFormComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    ApplicantFormComponent,
    LaunchPageComponent,
    SignUpPageComponent,
    CompanyFormComponent,
    LoginPageComponent,
    MainPageComponent,
    HeaderComponent,
    ApplicantComponent,
    JobListComponent,
    JobFormComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
