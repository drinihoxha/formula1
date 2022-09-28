import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'sortByPoints'
})
export class SortByPointsPipe implements PipeTransform {

  transform(value: any[]): any[] {
    return value.sort((n1, n2) => {
      return n2.points - n1.points;
    });
  }
}
