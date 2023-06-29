import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { catchError, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  loginValidado: any = false;

  baseUrl = 'http://localhost:8080/usuarioController';

  constructor(private http: HttpClient) { }


  validarLogin(username: String, senha: String){
   
    const param ={username: "", senha: ""}
    const url = `${this.baseUrl}/validarLogin?username=${username}&senha=${senha}`;
    return this.http.get(url).pipe(
      map((obj) => {
        return obj;
      })
    )};


  errorHandler(e: any): any {
    throw new Error('Method not implemented.');
  }
}
