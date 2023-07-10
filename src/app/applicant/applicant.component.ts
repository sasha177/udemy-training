import { Component, OnInit } from '@angular/core';
import { ApplicantService } from '../applicant.service'
import { Applicant } from '../applicant';

@Component({
  selector: 'app-applicant',
  templateUrl: './applicant.component.html',
  styleUrls: ['./applicant.component.css']
})

export class ApplicantComponent implements OnInit {

  applicants: Applicant[];
  constructor(private applicantService: ApplicantService) {
    this.applicants = [];
   }

  ngOnInit(): void {
    this.applicantService.getApplicants().subscribe((data: Applicant[]) => {
      console.log(data);
      this.applicants = data;
    });
  }
}