import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms'
import { HttpClient } from '@angular/common/http';
import { formatCurrency } from '@angular/common';

@Component({
  selector: 'app-applicant-form',
  templateUrl: './applicant-form.component.html',
  styleUrls: ['./applicant-form.component.css']
})
export class ApplicantFormComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  onSubmit1(form: NgForm){
    const value=form.value;
  }

  onCreateApplicant(postData: {
    name: string, 
    title: string,
    username: string,
    dob: string,
    location: string,
    personalInfo: string,
    video: string,
    jobCategory: string,
    skills: string,
    number: string
  }){
    this.http.post('http://localhost:8080/saveApplicant/',postData)
    .subscribe(responseData => {
      console.log(responseData);
    });
  }

  private fetchApplicants(){
    this.http.get('http://localhost:8080/saveApplicant/').subscribe();
  }

}
