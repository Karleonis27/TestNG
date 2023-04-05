//package MondayClassReview;
//Xpath 
//
//Absolute Xpath vs Relative Xpath
//
//
//1. Absolute Xpath: Parent to Child Path.
//
//
//It is the direct way to find the element, but the disadvantage of the absolute XPath is that if there are any changes made in the path of the element then that XPath gets failed.
//
//
//
///html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input
//
//
//Relative Xpath:
//
////tagname[@attribute='value']
//
//
//
//
//// : Select current node.
//
//Tagname: Tagname of the particular node.
//
//@: Select attribute.
//
//Attribute: Attribute name of the node.
//
//Value: Value of the attribute.
//
//
//id = "twotabsearchtextbox"
//
//Basic Xpath:
//
////*[@id='twotabsearchtextbox']
//
//
//
//Contains() Xpath:
//
////*[contains(@type,'sub')] -- this is the contain xpath structor 
//
//id = "twotabsearchtextbox-123123123"
//
//
////*[contains(@id,'searchtext')]