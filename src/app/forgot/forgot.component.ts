import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AlertService, UserService, AuthenticationService } from '@/_services';

@Component({templateUrl: 'forgot.component.html'})
export class ForgotComponent implements OnInit {
    forgotForm: FormGroup;
    loading = false;
    submitted = false;

    constructor(
        private formBuilder: FormBuilder,
        private router: Router,
        private authenticationService: AuthenticationService,
        private userService: UserService,
        private alertService: AlertService
    ) { }

    ngOnInit() {
        this.forgotForm = this.formBuilder.group({
            userid: ['', Validators.required],
            emailid: ['', Validators.required] ,
        }); 
        
    }

    // convenience getter for easy access to form fields
    get f() { return this.forgotForm.controls; }

    onSubmit() {
        
        this.router.navigateByUrl("confirmpassword");

        
    }
}






