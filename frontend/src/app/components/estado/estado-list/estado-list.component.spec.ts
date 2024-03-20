import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EstadoListComponent } from './estado-list.component';

describe('EstadoListComponent', () => {
  let component: EstadoListComponent;
  let fixture: ComponentFixture<EstadoListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EstadoListComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EstadoListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
