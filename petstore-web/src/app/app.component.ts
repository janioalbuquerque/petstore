import { Component, ViewChild } from '@angular/core';
import { LoginComponent } from './views/login/login.component';
import { NavComponent } from './components/template/nav/nav.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  @ViewChild(NavComponent) navComponent: NavComponent | undefined;
  title = 'petstore-web';

  rootPage: any = "login";

  constructor(){}

}
