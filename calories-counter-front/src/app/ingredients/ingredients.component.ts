import { Component, OnInit } from '@angular/core';
import { IngredientDto } from '../dtos/ingredient.dto';
import { ingredientsService } from './ingredients.service';

@Component({
  selector: 'app-ingredients',
  templateUrl: './ingredients.component.html',
  styleUrls: ['./ingredients.component.scss']
})
export class IngredientsComponent implements OnInit{
  ingredients?: IngredientDto[];

  constructor(protected ingredientsService: ingredientsService){
    }
    ngOnInit(): void {
        this.ingredientsService.getIngredients().subscribe(result=>this.ingredients=result);
    }
}
