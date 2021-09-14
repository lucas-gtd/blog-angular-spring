import { Component, OnInit } from '@angular/core';
import { Post } from '../models/post';
import { PostService } from '../services/post.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  post: string = '';
  postList: Post[];

  constructor(private service: PostService) {}

  ngOnInit(): void {
    this.service.getAllPosts().subscribe((res) => {
      this.postList = res;
    });
  }
}
