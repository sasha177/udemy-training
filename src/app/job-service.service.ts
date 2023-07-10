import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Job } from './job';

@Injectable({
  providedIn: 'root'
})
export class JobService {
	private jobsUrl: string;

  constructor(private http: HttpClient) {
    this.jobsUrl = 'http://localhost:8080/jobs';
  }
  
  public findAll(): Observable<Job[]> {
    return this.http.get<Job[]>(this.jobsUrl);
  }

  public save(job: Job) {
    return this.http.post<Job>(this.jobsUrl, job);
  }
}

