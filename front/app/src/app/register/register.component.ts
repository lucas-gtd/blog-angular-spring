import { Component, OnInit } from '@angular/core';
import { User } from '../models/user';
import { LoginService } from '../services/login.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {
  email: string = '';
  password: string = '';
  passwordConfirm: string = '';
  firstname: string = '';
  lastname: string = '';
  age: number = 1;
  adress: string = '';

  constructor(private service: LoginService) {}

  registerUser(): void {
    if (this.password === this.passwordConfirm) {
      this.service
        .registerUser(
          new User(
            this.email,
            this.password,
            this.firstname,
            this.lastname,
            this.age,
            this.adress
          )
        )
        .subscribe((res) => {
          console.log(res);
        });
    }
  }

  ngOnInit(): void {}
}
