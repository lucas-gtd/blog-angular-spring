import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Post } from '../models/post';

@Injectable({
  providedIn: 'root',
})
export class PostService {
  constructor(private http: HttpClient) {}

  // enregistrer un post
  public createPost(post: Post): Observable<any> {
    return this.http.post('http://localhost:8080/users/register', post, {
      headers: new HttpHeaders('Content-Type: application/json'),
    });
  }

  // récup les post
  public getAllPosts(): Observable<any> {
    return this.http.get('http://localhost:8080/post/getall');
  }
}
