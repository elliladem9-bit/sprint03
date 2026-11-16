import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { TypeVol } from '../model/type-vol.model';

@Component({
  selector: 'app-update-type',
  imports: [FormsModule],
  templateUrl: './update-type.component.html',
})
export class UpdateTypeComponent implements OnInit {
  @Input()
  type!: TypeVol;

  @Input()
  ajout!: boolean;

  @Output()
  typeUpdated = new EventEmitter<TypeVol>();

  ngOnInit(): void {
    console.log('ngOnInit du composant UpdateType ', this.type);
  }

  saveType() {
    this.typeUpdated.emit(this.type);
  }
}
