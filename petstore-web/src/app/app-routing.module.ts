import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './views/home/home.component';
import { LoginComponent } from './views/login/login.component';
import { HeaderComponent } from './components/template/header/header.component';
import { PessoaReadComponent } from './components/pessoa/pessoa-read/pessoa-read.component';
import { PessoaCreateComponent } from './components/pessoa/pessoa-create/pessoa-create.component';

const routes: Routes = [
    
    { path: '', component: LoginComponent },
    { path: 'home', component: HomeComponent,
    children: [
      { path: '',  component: HeaderComponent },
      { path: 'pessoa',  component: PessoaReadComponent },
      { path: 'criar-pessoa',  component: PessoaCreateComponent },
      
    ]},

    { path: '**', component: LoginComponent }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})



export class AppRoutingModule { }
