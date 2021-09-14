import { Comment } from './comment';
import { User } from './user';

export class Post {
  private content: string;
  private title: string;
  private date: string;
  private user: User;
  private comments: Comment[];

  constructor(content: string, title: string, date: string, user: User) {
    this.content = content;
    this.title = title;
    this.user = user;
    this.comments = [];
  }

  public addComment(comment: Comment) {
    this.comments.push(comment);
  }

  public getContent(): string {
    return this.content;
  }

  public setContent(content: string): void {
    this.content = content;
  }

  public getTitle(): string {
    return this.title;
  }

  public setTitle(title: string): void {
    this.title = title;
  }

  public getDate(): string {
    return this.date;
  }

  public setDate(date: string): void {
    this.date = date;
  }

  public getUser(): User {
    return this.user;
  }

  public setUser(user: User): void {
    this.user = user;
  }

  public getComments(): Comment[] {
    return this.comments;
  }

  public setComments(comments: Comment[]): void {
    this.comments = comments;
  }
}
