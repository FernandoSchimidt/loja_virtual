import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { first, tap } from 'rxjs';
import { Estado } from '../model/Estado';

@Injectable({
  providedIn: 'root',
})
export class EstadoService {
  private readonly API = 'http://localhost:8080/api/estado/';

  constructor(private http: HttpClient) {
    this.listaEstados();
    console.log("aqui")
  }

  listaEstados() {
    return this.http.get<Estado>(this.API).pipe(
      tap((estados) => console.log(estados)),
      tap(() => console.log('chegou aui')),
      first()
    );
  }
}
