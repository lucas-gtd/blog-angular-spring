import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Credentials } from '../models/credentials';
import { LoginService } from '../services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  email: string = '';
  password: string = '';

  constructor(private service: LoginService, private router: Router) {}

  connectUser(): void {
    this.service
      .connectUser(new Credentials(this.email, this.password))
      .subscribe((res) => {
        if (res !== null) {
          this.router.navigateByUrl('/home');
        }
      });
  }

  ngOnInit(): void {}
}
