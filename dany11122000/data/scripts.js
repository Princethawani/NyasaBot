function getTime() {
	var t = new Date();
	var hour = t.getHours();
	var minute = t.getMinutes();
	if (minute < 10) {
		minute = "0" + minute;
	}
	return hour + ":" + minute;
}

function getToday() {
	var t = new Date();
	var m = t.getMonth();
	var d = t.getDate();
	var dow = t.getDay();
	var y = t.getFullYear();
	switch (dow) {
	case 0:
		dow = "Sunday";
		break;
	case 1:
		dow = "Monday";
		break;
	case 2:
		dow = "Tuesday";
		break;
	case 3:
		dow = "Wednesday";
		break;
	case 4:
		dow = "Thursday";
		break;
	case 5:
		dow = "Friday";
		break;
	case 6:
		dow = "Saturday";
		break;
	}
	switch (m) {
	case 0:
		m = "January";
		break;
	case 1:
		m = "February";
		break;
	case 2:
		m = "March";
		break;
	case 3:
		m = "April";
		break;
	case 4:
		m = "May";
		break;
	case 5:
		m = "June";
		break;
	case 6:
		m = "July";
		break;
	case 7:
		m = "August";
		break;
	case 8:
		m = "September";
		break;
	case 9:
		m = "October";
		break;
	case 10: 
		m = "November";
		break;
	case 11:
		m = "December";
		break;
	}
	
	
	return dow + ", " + m + " " + d + ", " + y;
}

