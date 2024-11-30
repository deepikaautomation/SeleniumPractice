 package Locators;

public class CustomCSSLocator {
	
	//css doesmt have double slash
	
	//  CSS WITH ID
    //  #idvalue
	//  tag#idvalue
	
	//  CSS WITH class
    //  .classname
	//  tag.classname
	
	//  css with id and classname
	//  button#loginBtn.uiButton.private-button.private-button--primary.private-button--default.m-bottom-4.login-submit.private-button--non-link
	//  button.uiButton.private-button.private-button--primary.private-button--default.m-bottom-4.login-submit.private-button--non-link#loginBtn
	
	
	
	//      if you dont want id or class  use other attributes
	//      tag[attributename='value']
	//      input[type='text'] -css
	//     //input[@type='text'] -xpath
	
	// if thre is multiple classname, wholeclassname should need to be used when passed as attribute
	
	//     input[class='class1']   //this willnot work  
	//use whole classdname  input[class='class1.class2....classn']  
	
	//xpath also same whole classname should be use
	//    //input[@class='class1.class2....classn'] 
	//with contins we can use singlename
	//  //input[contains(@class,class1')]
	
	//     CSS with mutiple attribute  -individula square bracket used
	//    input[id='username'][type='email'][class='form-control private-form__control login-email']
	//xpath with mutiple attribute  -single square bracket
	//input[@id='username' and @type='email' and @class='form-control private-form__control login-email']
	
	//css  this also would  work
	//     input#username[type='email'][class='form-control private-form__control login-email']
	//     input#username[type='email'].form-control
	
	//Text is not supported  for CSS
	//XPATH WITH text  function--  //h1[text()='Egister account']
	
	
	//Contains inCSS
	
	//  tag[attr*='value']
	//  input[placeholder*='First']
	
	
	//CSS starts-with
	//     tag[attr^='value']
	//     input[placeholder^='First']
	
	//CSS ends-with
	//      tag[att$='value']
	//      input[placeholder$='name']
	
	//CSS parent to child 
	
	// tagname#idvalue tagname --- this will return direct and indirect childelements
	// tagname#idvalue>tagname --this will return only direct child 
	
	//   form.form-horizontal div  --19elemnts returned direct +indirect
	//    form.form-horizontal>div  --1 elemnts returned direct 
	
	
	//CSS child to parent -backwards  traversing is not possible
	
	
	//Comma in CSS -that is OR
	//USEcase :to check the importants fields count -to checkthe quick sanity check, this is not available in Xpath
	
	//   i[class='fa fa-phone'],button[data-toggle='dropdown'],img[title='naveenopencart']  -use  FEs  to check the size
	
	
	//css-not in  -u can remove one at atime
	
	//   input.form-control:not(#input-firstname)  -this will exculde id with input-firtsname
	
	//    input.form-control:not(input[name='search'],#input-firstname)
	
	
	//indexing
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
