import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ValidtemplateformComponent } from './validtemplateform.component';

describe('ValidtemplateformComponent', () => {
  let component: ValidtemplateformComponent;
  let fixture: ComponentFixture<ValidtemplateformComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ValidtemplateformComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ValidtemplateformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
