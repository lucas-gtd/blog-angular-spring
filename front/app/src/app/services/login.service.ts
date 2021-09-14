import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Credentials } from '../models/credentials';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root',
})
export class LoginService {
  constructor(private http: HttpClient) {}

  // enregistrer un user
  public registerUser(user: User): Observable<any> {
    return this.http.post('http://localhost:8080/users/register', user, {
      headers: new HttpHeaders('Content-Type: application/json'),
    });
  }

  // connecter un user
  public connectUser(credentials: Credentials): Observable<any> {
    return this.http.post('http://localhost:8080/users/connect', credentials, {
      headers: new HttpHeaders('Content-Type: application/json'),
    });
  }
}
