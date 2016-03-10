import java.util.Scanner;
public class RectangleTester {
    double height, width, x, y;
    
    RectangleTester(){
  	        }
    
    RectangleTester( double _height,double _width, double _x, double _y ){
  	  this.height=_height;
  	  this.width=_width;
  	  this.x=_x;
  	  this.y=_y;
    }
         
    double getHeight(){
  	  return this.height;
    }
    
    double getWidth(){
  	  return this.width;
    }
    
    double getX(){
  	  return this.x;
    }
    
    double getY(){
  	  return this.y;
    }
    
    public String toString(){
  	  return "[X="+this.x+",Y="+this.y+",Heiht="+this.height+
  			  ",Width="+this.width+"]"+"\n Area="+this.width*this.height+
  			  "\n Perimemter="+(this.width+this.height)*2;
    }

	public static void main(String[] args) {
		RectangleTester rectangle1=new RectangleTester(18,57,15,25);
		RectangleTester rectangle2=new RectangleTester(47,60,12,0);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Rectangle#1"+rectangle1);
		System.out.println("Rectangle#2"+rectangle2);
		
		System.out.println("輸入長寬(以空白間隔開)");
		double H, W;
		H=scanner.nextDouble();
		W=scanner.nextDouble();
		System.out.println("Area="+H*W);
		System.out.println("Perimemter="+(H+W)*2);
		System.out.println("繼續? 1.YES 2.NO");
		
		int i;
		i=scanner.nextInt();
		while(i==1){
			if(i==1){
			System.out.println("輸入長寬(以空白間隔開)");
			
			H=scanner.nextDouble();
			W=scanner.nextDouble();
			System.out.println("Area="+H*W);
			System.out.println("Perimemter="+(H+W)*2);
			System.out.println("繼續? 1.YES 2.NO");
		i=scanner.nextInt();}}
		
		if(i==2){
			
			System.out.println("");
		}
		
		System.out.println("End of output!");
		

	}

}
