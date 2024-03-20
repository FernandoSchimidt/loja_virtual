import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { EstadoService } from '../../../service/estado.service';

@Component({
  selector: 'app-estado-list',
  standalone: true,
  imports: [HttpClientModule, CommonModule],
  templateUrl: './estado-list.component.html',
  styleUrl: './estado-list.component.scss',
})
export class EstadoListComponent {
  constructor(public service: EstadoService) {
    this.service.listaEstados();
    // console.log(this.service.listaEstados());
    // console.log('chegou aqui component')
  }
}
