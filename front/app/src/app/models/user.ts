export class User {
  private email: string;
  private password: string;
  private firstname: string;
  private lastname: string;
  private age: number;
  private adress: string;

  constructor(
    email: string,
    password: string,
    firstname: string,
    lastname: string,
    age: number,
    adress: string
  ) {
    this.email = email;
    this.password = password;
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
    this.adress = adress;
  }

  public getEmail(): string {
    return this.email;
  }

  public setEmail(email: string): void {
    this.email = email;
  }

  public getPassword(): string {
    return this.password;
  }

  public setPassword(password: string): void {
    this.password = password;
  }

  public getFirstname(): string {
    return this.firstname;
  }

  public setFirstname(firstname: string): void {
    this.firstname = firstname;
  }

  public getLastname(): string {
    return this.lastname;
  }

  public setLastname(lastname: string): void {
    this.lastname = lastname;
  }

  public getAge(): number {
    return this.age;
  }

  public setAge(age: number): void {
    this.age = age;
  }

  public getAdress(): string {
    return this.adress;
  }

  public setAdress(adress: string): void {
    this.adress = adress;
  }
}
