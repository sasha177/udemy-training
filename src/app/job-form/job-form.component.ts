import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Job } from '../job';
import { JobService } from '../job-service.service';

@Component({
  selector: 'app-job-form',
  templateUrl: './job-form.component.html',
  styleUrls: ['./job-form.component.css']
})
export class JobFormComponent implements OnInit {

	job: Job;
	constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private jobService: JobService) {
    this.job = new Job();
  }
  
  onSubmit() {
    this.jobService.save(this.job).subscribe(result => this.gotoJobList());
  }
  
  gotoJobList() {
    this.router.navigate(['/jobs']);
  }
  
  ngOnInit(): void {
  }

}
