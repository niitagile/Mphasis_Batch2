import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TemplateformexampleComponent } from './templateformexample.component';

describe('TemplateformexampleComponent', () => {
  let component: TemplateformexampleComponent;
  let fixture: ComponentFixture<TemplateformexampleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TemplateformexampleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TemplateformexampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
