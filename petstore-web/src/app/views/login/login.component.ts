import { Router } from '@angular/router';
import { LoginService } from './login.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  loginValido: any = false;
  isMostrarMenu = false;
  isUsuarioLogado: boolean = false;

  login = {
    username: '',
    senha: ''
  }

  msg: any[] = [
    {
      type: 'success',
      msg: `Logado com sucesso.`,
      timeout: 5000,      
      animation: true
    },

    {
      type: 'danger',
      msg: `Usuário ou senha incorretos. Por favor, verifique suas informações e tente novamente.`,
      timeout: 5000,      
      animation: true
    },
  ];

  dismissible = true;
  defaultAlerts: any[] = [];
  alerts = this.defaultAlerts;

  onClosed(dismissedAlert: any): void {
    this.alerts = this.alerts.filter(alert => alert === dismissedAlert);
  }

  constructor(private loginService: LoginService, private router: Router) {
   }

  validarLogin(): any {
    
    this.loginService.validarLogin(this.login.username, this.login.senha).subscribe((value) => {
      if(value){
        this.alerts.push(this.msg[0]) 
        this.isUsuarioLogado = true;
        this.router.navigate(['/home']);
      }else{
        this.alerts.push(this.msg[1])  
        this.isUsuarioLogado = false;
      }
           
    })


   
    
  }
}
