/**
 * 
 */

$(function() {
	
	/*solving active menu problem*/
	switch (menu) {
	case 'ContactUs':
		$('#contact').addClass('active');
		break;
	case 'AboutUs':
		$('#about').addClass('active');
		break;

	default :
		$('#home').addClass('active');
		break;
	}
	
});