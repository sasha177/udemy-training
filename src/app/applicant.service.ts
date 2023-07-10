import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Applicant } from './applicant';

@Injectable({
  providedIn: 'root'
})
export class ApplicantService {

  private baseUrl = "http://localhost:8080/applicants";

  constructor(private http: HttpClient) { }

  getApplicants(): Observable<Applicant[]>{
    return this.http.get<Applicant[]>(`${this.baseUrl}`);
  }
}