import { NumberValueAccessor } from "@angular/forms";

export interface Driver {
	id: number;
	fullName: string;
	team: string;
	gpEntered: number;
	numberOfWins: number;
	podiums: number;
	poles: number;
	age: number;
	driverPhoto: string;
	teamPhoto: string;
	points: number;
}