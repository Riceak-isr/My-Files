/**
 *File: State.java
 *Author: 
 *Date: December 6, 2017
 *Details: Request user to input state name
 *      output state bird and flower
 *      ignore case statename is typed in
*/

public class State {
	
	   //Array to hold state name, bird, and flower information
	   private String state [][] = {
		        {"ALABAMA","Nothern Flicker","Camellia"},
		        {"ALASKA","Willow Ptarmigan","Forget-me-not"},
		        {"ARIZONA","Cactus Wren","Saguaro Cactus Blossom"},
		        {"ARKANSAS","Mockingbird","Apple Blossom"},
		        {"CALIFORNIA","California Quail","California Poppy"},
		        {"COLORADO","Lark Bunting","Rocky Mountain Columbine"}, 
		        {"CONNECTICUT","American Robin","Mountain Laurel"},
		        {"DELAWARE","Blue Hen","Peach Blossom"},
		        {"FLORIDA","Northern Mockingbird","Orange Blossom"},
		        {"GEORGIA","Brown Thrasher","Azalea"},
		        {"HAWAII","Hawaiian Goose","Hawaiian Hibiscus"},
		        {"IDAHO","Mountain Bluebird","Mock Oragnge"},
		        {"ILLINOIS","Northern Cardinal","Violet"},
		        {"INDIANA","Cardinal","Peony"},
		        {"IOWA","Eastern Goldfinch","Iowa"},
		        {"KANSAS","Western Meadowlark","Sunflower"},
		        {"KENTUCKY","Northern Cardinal","Goldenrod"},
		        {"LOUISIANA","Brown Pelican","Magnolia"},
		        {"MAINE","Black-capped Chickadee","White Pine Cone and Tassel"},
		        {"MARYLAND","Baltimore Oriole","Black-eyed Susan"},
		        {"MASSACHUSETTS","Black-capped Chickadee","Mayflower"},
		        {"MICHIGAN","American Robin","Apple Blossom"},
		        {"MINNESOTA","Common Loon","Cypripedium Reginae"},
		        {"MISSISSIPPI","Northern Mockingbird","Magnolia"},
		        {"MISSOURI","Eastern Bluebird","Hawthorn (flower)"},
		        {"MONTANA","Western Meadowlark","Bitterroot"},
		        {"NEBRASKA","Western Meadowlark","Goldenrod"},
		        {"NEVADA","Mountain Bluebird","Sagebrush"},
		        {"NEW HAMPSHIRE","Purple Finch","Purple Lilac"},
		        {"NEW JERSEY","Eastern Goldfinch","Violet"},
		        {"NEW MEXICO","Roadruner","Yucca Flower"},
		        {"NEW YORK","Eastern Bluebird","Rose"},
		        {"NORTH CAROLINA","Northern Cardinal","Flowering Dogwood"},
		        {"NORTH DAKOTA","Western Meadowlark","Wild Prairie Rose"},
		        {"OHIO","Northern Cardinal","Scarlet Carnation"},
		        {"OKLAHOMA","Scissor-tailed Flycatcher","Oklahoma Rose"},
		        {"OREGON","Western Meadowlark","Oregon Grape"},
		        {"PENNSYLVANIA","Ruffed Grouse","Mountain Laurel"},
		        {"RHODE ISLAND","Rhode Island Red","Violet"},
		        {"SOUTH CAROLINA","Carolina Wren","Yellow Jessamine"},
		        {"SOUTH DAKOTA","Ring-necked Pheasant","Pasque Flower"},
		        {"TENNESSEE","Nothern Mockingbird","Iris"},
		        {"TEXAS","Northern Mockingbird","Bluebonnet"},
		        {"UTAH","California Gull","Sego Lily"},
		        {"VERMONT","Hermit Thrush","Red Clover"},
		        {"VIRGINIA","Northern Cardinal","American Dogwood"},
		        {"WASHINGTON","Willow Goldfinch","Coast Rhodedendron"},
		        {"WEST VIRGINIA","Northern Cardinal","Rhodedendrom"},
		        {"WISCONSIN","American Robin","Wood Violet"},
		        {"WYONMING","Western Meadolark","Indian Paintbrush"},
		    };
	   
		   //No arguement constructor
		   public State(){
		   }
		   
		   //Getters and Setters
		   public String[][] getState() {
		       return state;
		   }
		   
		   public void setState(String[][] state) {
		       this.state = state;
		   }
}