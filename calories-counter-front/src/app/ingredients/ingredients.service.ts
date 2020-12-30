import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs";
import { IngredientDto } from "../dtos/ingredient.dto";

@Injectable({
    providedIn: 'root'
})
export class ingredientsService {
    constructor(protected httpClient: HttpClient){
    }

    getIngredients(): Observable<IngredientDto[]>{
        return this.httpClient.get<IngredientDto[]>('http://localhost:8080/ingredients');
    }
}