import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})



export class NavComponent {
  hora =   ("00" + new Date().getHours()).slice(-2) + ":" + ("00" + new Date().getMinutes()).slice(-2);
  data = ("00" + new Date().getDate()).slice(-2) + "/" + 
  ("00" + new Date().getMonth()).slice(-2) + "/" + new Date().getFullYear() + " - " + this.hora;
 
  constructor(private route: ActivatedRoute) {}


}




