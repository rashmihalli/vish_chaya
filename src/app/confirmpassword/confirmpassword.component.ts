import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AlertService, UserService, AuthenticationService } from '@/_services';

@Component({
  selector: 'app-confirmpassword',
  templateUrl: './confirmpassword.component.html',
  styleUrls: ['./confirmpassword.component.css']
})
export class ConfirmpasswordComponent implements OnInit {
    confirmpasswordForm: FormGroup;
    loading = false;
    submitted = false;

    constructor(
      private formBuilder: FormBuilder,
      private router: Router,
      private authenticationService: AuthenticationService,
      private userService: UserService,
      private alertService: AlertService
    ) {  }

  ngOnInit() {
    this.confirmpasswordForm = this.formBuilder.group({
      newpassword: ['', Validators.required],
      confirmnewpassword: ['', Validators.required] ,
  });
  }

}
