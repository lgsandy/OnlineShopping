/**
 * 
 */

$(function() {
	
	/*solving active menu problem*/
	switch (menu) {
	case 'Home':
		$('#home').addClass('active');
		break;
	case 'ContactUs':
		$('#contact').addClass('active');
		break;
	case 'AboutUs':
		$('#about').addClass('active');
		break;
	case 'All Products':
		$('#listproduct').addClass('active');
		break;

	default :
		$('#listproduct').addClass('active');
	$('#a_'+menu).addClass('active');
		break;
	}
	
});