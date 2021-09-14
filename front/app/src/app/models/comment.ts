import { User } from './user';

export class Comment {
  private content: string;
  private date: string;
  private user: User;

  constructor(content: string, date: string, user: User) {
    this.content = content;
    this.date = date;
    this.user = user;
  }

  public getContent(): string {
    return this.content;
  }

  public setContent(content: string): void {
    this.content = content;
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
}
