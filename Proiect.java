import java.applet.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Proiect extends Applet implements Runnable {
Thread t;
Image dbi, ora,dd,min;
Graphics dbg;
Date d; 

int delay=1000; 

int w, h; 

int hh, mm, ss; 

long t0; 

int d1, d2, d3, d4; 

public void init (){
w = size().width;
h = size().height;
t0 = (new Date()).getTime(); 

dbi = createImage(w, h);
dbg = dbi.getGraphics();


dd=getImage (getCodeBase(), "ceas1.gif");
ora = getImage (getCodeBase(), "o00-00.gif");//acul de ora
min= getImage (getCodeBase(), "m (1).gif");//acul de minut

}
public void start(){if(t == null) {t = new Thread(this); t.start();}}
public void stop(){if(t != null) {t.stop(); t = null;}}
public void run() {
while(true) {
repaint ();
try{Thread.sleep (delay) ; }
catch (Exception e) {return; }
}
}
public void update(Graphics g) {


Date date = new Date();
hh = date.getHours();
mm = date.getMinutes();
ss = date.getSeconds();
AudioClip coocoo;
coocoo=getAudioClip(getCodeBase(), "coocoo.wav");//clipul audio
 

dbg.drawImage(dd, 0, 0, this);

dbg.drawImage(min, 0, 0, this);
dbg.drawImage(ora, 0, 0, this);


		hh=hh%12;
		if(hh ==0)hh=12;

		d1=hh/10;
		d2=hh%10;
		d3=mm/10;
		d4=mm%10;
	
				
switch (hh) {//am luat cazurile orelor
  case 12:
    ora= getImage (getCodeBase(), "o00-00.gif");
	
	 if(mm==0 && hh==12)
	  {dd=getImage (getCodeBase(), "ceas2.gif");
		if(ss==0||ss==3||ss==6||ss==9||ss==12||ss==15||ss==18||ss==21||ss==24||ss==27||ss==30||ss==33) 
	coocoo.play();
	if(ss==0||ss==1||ss==3||ss==6||ss==9||ss==12||ss==15||ss==18||ss==21||ss==24||ss==27||ss==30||ss==33)
	{  dd=getImage (getCodeBase(), "ceas2.gif");
	}
	  else dd=getImage (getCodeBase(), "ceas1.gif");}
    
if(mm>=12 && mm<24)
    ora= getImage (getCodeBase(), "o00-12.gif");
   else if(mm>=24 && mm<36)
    ora= getImage (getCodeBase(), "o00-24.gif");
    else if(mm>=36 && mm<48)
    ora= getImage (getCodeBase(), "o00-36.gif");
   if(mm>=48)
    ora= getImage (getCodeBase(), "o00-48.gif");

break;

 case 1:
    ora= getImage (getCodeBase(), "o13-00.gif");
      
	  if(mm==0 && hh==1)
	  {dd=getImage (getCodeBase(), "ceas2.gif");
		if(ss==0) 
	coocoo.play();
	if(ss==0||ss==1)
	{  dd=getImage (getCodeBase(), "ceas2.gif");
	}
	  else dd=getImage (getCodeBase(), "ceas1.gif");}
	
if(mm>=12 && mm<24)
    ora= getImage (getCodeBase(), "o13-12.gif");
   else if(mm>=24 && mm<36)
    ora= getImage (getCodeBase(), "o13-24.gif");
    else if(mm>=36 && mm<48)
    ora= getImage (getCodeBase(), "o13-36.gif");
   if(mm>=48)
    ora= getImage (getCodeBase(), "o13-48.gif");

break;

 case 2:
    ora= getImage (getCodeBase(), "o14-00.gif");
	
	   if(mm==0 && hh==2)
	  {dd=getImage (getCodeBase(), "ceas2.gif");
		if(ss==0||ss==3) 
	coocoo.play();
	if(ss==0||ss==1||ss==3)
	{  dd=getImage (getCodeBase(), "ceas2.gif");
	}
	  else dd=getImage (getCodeBase(), "ceas1.gif");}
    
if(mm>=12 && mm<24)
    ora= getImage (getCodeBase(), "o14-12.gif");
   else if(mm>=24 && mm<36)
    ora= getImage (getCodeBase(), "o14-24.gif");
    else if(mm>=36 && mm<48)
    ora= getImage (getCodeBase(), "o14-36.gif");
   if(mm>=48)
    ora= getImage (getCodeBase(), "o14-48.gif");

break;

 case 3:
    ora= getImage (getCodeBase(), "o15-00.gif");
	 if(mm==0 && hh==3)
	  {dd=getImage (getCodeBase(), "ceas2.gif");
		if(ss==0||ss==3||ss==6) 
	coocoo.play();
	if(ss==0||ss==1||ss==3||ss==6)
	{  dd=getImage (getCodeBase(), "ceas2.gif");
	}
	  else dd=getImage (getCodeBase(), "ceas1.gif");}
    
if(mm>=12 && mm<24)
    ora= getImage (getCodeBase(), "o15-12.gif");
   else if(mm>=24 && mm<36)
    ora= getImage (getCodeBase(), "o15-24.gif");
    else if(mm>=36 && mm<48)
    ora= getImage (getCodeBase(), "o15-36.gif");
   if(mm>=48)
    ora= getImage (getCodeBase(), "o15-48.gif");

break;

 case 4:
    ora= getImage (getCodeBase(), "o16-00.gif");
	
	   if(mm==0 && hh==4)
	  {dd=getImage (getCodeBase(), "ceas2.gif");
		if(ss==0||ss==3||ss==6||ss==9) 
	coocoo.play();
	if(ss==0||ss==1||ss==3||ss==6||ss==9)
	{  dd=getImage (getCodeBase(), "ceas2.gif");
	}
	  else dd=getImage (getCodeBase(), "ceas1.gif");}
    
if(mm>=12 && mm<24)
    ora= getImage (getCodeBase(), "o16-12.gif");
   else if(mm>=24 && mm<36)
    ora= getImage (getCodeBase(), "o16-24.gif");
    else if(mm>=36 && mm<48)
    ora= getImage (getCodeBase(), "o16-36.gif");
   if(mm>=48)
    ora= getImage (getCodeBase(), "o16-48.gif");

break;

 case 5:
    ora= getImage (getCodeBase(), "o17-00.gif");
	
	   if(mm==0 && hh==5)
	  {dd=getImage (getCodeBase(), "ceas2.gif");
		if(ss==0||ss==3||ss==6||ss==9||ss==12) 
	coocoo.play();
	if(ss==0||ss==1||ss==3||ss==6||ss==9||ss==12)
	{  dd=getImage (getCodeBase(), "ceas2.gif");
	}
	  else dd=getImage (getCodeBase(), "ceas1.gif");}
if(mm>=12 && mm<24)
    ora= getImage (getCodeBase(), "o17-12.gif");
   else if(mm>=24 && mm<36)
    ora= getImage (getCodeBase(), "o17-24.gif");
    else if(mm>=36 && mm<48)
    ora= getImage (getCodeBase(), "o17-36.gif");
   if(mm>=48)
    ora= getImage (getCodeBase(), "o17-48.gif");

break;

 case 6:
    ora= getImage (getCodeBase(), "o18-00.gif");
	
	  if(mm==0 && hh==6)
	  {dd=getImage (getCodeBase(), "ceas2.gif");
		if(ss==0||ss==3||ss==6||ss==9||ss==12||ss==15) 
	coocoo.play();
	if(ss==0||ss==1||ss==3||ss==6||ss==9||ss==12||ss==15)//trebuia sa fie in if-ul anterior dar datorita tranzitiei se intrerupe in intervalul 0-1
	{  dd=getImage (getCodeBase(), "ceas2.gif");
	}
	  else dd=getImage (getCodeBase(), "ceas1.gif");}
    
if(mm>=12 && mm<24)
    ora= getImage (getCodeBase(), "o18-12.gif");
   else if(mm>=24 && mm<36)
    ora= getImage (getCodeBase(), "o18-24.gif");
    else if(mm>=36 && mm<48)
    ora= getImage (getCodeBase(), "o18-36.gif");
   if(mm>=48)
    ora= getImage (getCodeBase(), "o18-48.gif");

break;

 case 7:
    ora= getImage (getCodeBase(), "o19-00.gif");
	
	   if(mm==0 && hh==7)
	  {dd=getImage (getCodeBase(), "ceas2.gif");
		if(ss==0||ss==3||ss==6||ss==9||ss==12||ss==15||ss==18) 
	coocoo.play();
	if(ss==0||ss==1||ss==3||ss==6||ss==9||ss==12||ss==15||ss==18)
	{  dd=getImage (getCodeBase(), "ceas2.gif");
	}
	  else dd=getImage (getCodeBase(), "ceas1.gif");}
    
if(mm>=12 && mm<24)
    ora= getImage (getCodeBase(), "o19-12.gif");
   else if(mm>=24 && mm<36)
    ora= getImage (getCodeBase(), "o19-24.gif");
    else if(mm>=36 && mm<48)
    ora= getImage (getCodeBase(), "o19-36.gif");
   if(mm>=48)
    ora= getImage (getCodeBase(), "o19-48.gif");

break;

 case 8:
    ora= getImage (getCodeBase(), "o20-00.gif");
	
	 if(mm==0 && hh==8)
	  {dd=getImage (getCodeBase(), "ceas2.gif");
		if(ss==0||ss==3||ss==6||ss==9||ss==12||ss==15||ss==18||ss==21) 
	coocoo.play();
	if(ss==0||ss==1||ss==3||ss==6||ss==9||ss==12||ss==15||ss==18||ss==21)
	{  dd=getImage (getCodeBase(), "ceas2.gif");
	}
	  else dd=getImage (getCodeBase(), "ceas1.gif");}
    
if(mm>=12 && mm<24)
    ora= getImage (getCodeBase(), "o20-12.gif");
   else if(mm>=24 && mm<36)
    ora= getImage (getCodeBase(), "o20-24.gif");
    else if(mm>=36 && mm<48)
    ora= getImage (getCodeBase(), "o20-36.gif");
   if(mm>=48)
    ora= getImage (getCodeBase(), "o20-48.gif");

break;

 case 9:
    ora= getImage (getCodeBase(), "o21-00.gif");
	
	 if(mm==0 && hh==9)
	  {dd=getImage (getCodeBase(), "ceas2.gif");
		if(ss==0||ss==3||ss==6||ss==9||ss==12||ss==15||ss==18||ss==21||ss==24) 
	coocoo.play();
	if(ss==0||ss==1||ss==3||ss==6||ss==9||ss==12||ss==15||ss==18||ss==21||ss==24)
	{  dd=getImage (getCodeBase(), "ceas2.gif");
	}
	  else dd=getImage (getCodeBase(), "ceas1.gif");}
	
if(mm>=12 && mm<24)
    ora= getImage (getCodeBase(), "o21-12.gif");
   else if(mm>=24 && mm<36)
    ora= getImage (getCodeBase(), "o21-24.gif");
    else if(mm>=36 && mm<48)
    ora= getImage (getCodeBase(), "o21-36.gif");
   if(mm>=48)
    ora= getImage (getCodeBase(), "o21-48.gif");

break;

 case 10:
    ora= getImage (getCodeBase(), "o22-00.gif");
	
	   if(mm==0 && hh==10)
	  {dd=getImage (getCodeBase(), "ceas2.gif");
		if(ss==0||ss==3||ss==6||ss==9||ss==12||ss==15||ss==18||ss==21||ss==24||ss==27) 
	coocoo.play();
	if(ss==0||ss==1||ss==3||ss==6||ss==9||ss==12||ss==15||ss==18||ss==21||ss==24||ss==27)
	{  dd=getImage (getCodeBase(), "ceas2.gif");
	}
	  else dd=getImage (getCodeBase(), "ceas1.gif");}
    
if(mm>=12 && mm<24)
    ora= getImage (getCodeBase(), "o22-12.gif");
   else if(mm>=24 && mm<36)
    ora= getImage (getCodeBase(), "o22-24.gif");
    else if(mm>=36 && mm<48)
    ora= getImage (getCodeBase(), "o22-36.gif");
   if(mm>=48)
    ora= getImage (getCodeBase(), "o22-48.gif");

break;

 case 11:
    ora= getImage (getCodeBase(), "o23-00.gif");
	
	 if(mm==0 && hh==11)
	  {dd=getImage (getCodeBase(), "ceas2.gif");
		if(ss==0||ss==3||ss==6||ss==9||ss==12||ss==15||ss==18||ss==21||ss==24||ss==27||ss==30) 
	coocoo.play();
	if(ss==0||ss==1||ss==3||ss==6||ss==9||ss==12||ss==15||ss==18||ss==21||ss==24||ss==27||ss==30)
	{  dd=getImage (getCodeBase(), "ceas2.gif");
	}
	  else dd=getImage (getCodeBase(), "ceas1.gif");}
	  
if(mm>=12 && mm<24)
    ora= getImage (getCodeBase(), "o23-12.gif");
   else if(mm>=24 && mm<36)
    ora= getImage (getCodeBase(), "o23-24.gif");
    else if(mm>=36 && mm<48)
    ora= getImage (getCodeBase(), "o23-36.gif");
   if(mm>=48)
    ora= getImage (getCodeBase(), "o23-48.gif");

break;
}



		
		
		
switch (mm) {//minutele
  case 1:
    min= getImage (getCodeBase(), "m (2).gif");
    break;
  case 2:
    min= getImage (getCodeBase(), "m (3).gif");
    break;
	case 3:
    min= getImage (getCodeBase(), "m (4).gif");
    break;
  case 4:
    min= getImage (getCodeBase(), "m (5).gif");
    break;
	case 5:
    min= getImage (getCodeBase(), "m (6).gif");
    break;
  case 6:
    min= getImage (getCodeBase(), "m (7).gif");
    break;
	case 7:
    min= getImage (getCodeBase(), "m (8).gif");
    break;
  case 8:
    min= getImage (getCodeBase(), "m (9).gif");
    break;
	case 9:
    min= getImage (getCodeBase(), "m (10).gif");
    break;
  case 10:
    min= getImage (getCodeBase(), "m (11).gif");
    break;
	case 11:
    min= getImage (getCodeBase(), "m (12).gif");
    break;
  case 12:
    min= getImage (getCodeBase(), "m (13).gif");
    break;
	case 13:
    min= getImage (getCodeBase(), "m (14).gif");
    break;
  case 14:
    min= getImage (getCodeBase(), "m (15).gif");
    break;
	case 15:
    min= getImage (getCodeBase(), "m (16).gif");
    break;
  case 16:
    min= getImage (getCodeBase(), "m (17).gif");
    break;
	case 17:
    min= getImage (getCodeBase(), "m (18).gif");
    break;
  case 18:
    min= getImage (getCodeBase(), "m (19).gif");
    break;
	case 19:
    min= getImage (getCodeBase(), "m (20).gif");
    break;
  case 20:
    min= getImage (getCodeBase(), "m (21).gif");
    break;
	case 21:
    min= getImage (getCodeBase(), "m (22).gif");
    break;
  case 22:
    min= getImage (getCodeBase(), "m (23).gif");
    break;
	case 23:
    min= getImage (getCodeBase(), "m (24).gif");
    break;
  case 24:
    min= getImage (getCodeBase(), "m (25).gif");
    break;
	case 25:
    min= getImage (getCodeBase(), "m (26).gif");
    break;
  case 26:
    min= getImage (getCodeBase(), "m (27).gif");
    break;
  case 27:
    min= getImage (getCodeBase(), "m (28).gif");
	break;
	case 28:
    min= getImage (getCodeBase(), "m (29).gif");
    break;
  case 29:
    min= getImage (getCodeBase(), "m (30).gif");
    break;
	case 30:
    min= getImage (getCodeBase(), "m (31).gif");
    break;
  case 31:
    min= getImage (getCodeBase(), "m (32).gif");
    break;
	case 32:
    min= getImage (getCodeBase(), "m (33).gif");
    break;
  case 33:
    min= getImage (getCodeBase(), "m (34).gif");
    break;
	case 34:
    min= getImage (getCodeBase(), "m (35).gif");
    break;
  case 35:
    min= getImage (getCodeBase(), "m (36).gif");
    break;
	case 36:
    min= getImage (getCodeBase(), "m (37).gif");
    break;
  case 37:
    min= getImage (getCodeBase(), "m (38).gif");
    break;
	case 38:
    min= getImage (getCodeBase(), "m (39).gif");
    break;
  case 39:
    min= getImage (getCodeBase(), "m (40).gif");
    break;
	case 40:
    min= getImage (getCodeBase(), "m (41).gif");
    break;
  case 41:
    min= getImage (getCodeBase(), "m (42).gif");
    break;
	case 42:
    min= getImage (getCodeBase(), "m (43).gif");
    break;
  case 43:
    min= getImage (getCodeBase(), "m (44).gif");
    break;
	case 44:
    min= getImage (getCodeBase(), "m (45).gif");
    break;
  case 45:
    min= getImage (getCodeBase(), "m (46).gif");
    break;
	case 46:
    min= getImage (getCodeBase(), "m (47).gif");
    break;
  case 47:
    min= getImage (getCodeBase(), "m (48).gif");
    break;
	case 48:
    min= getImage (getCodeBase(), "m (49).gif");
    break;
  case 49:
    min= getImage (getCodeBase(), "m (50).gif");
    break;
	case 50:
    min= getImage (getCodeBase(), "m (51).gif");
    break;
  case 51:
    min= getImage (getCodeBase(), "m (52).gif");
    break;
	case 52:
    min= getImage (getCodeBase(), "m (53).gif");
    break;
  case 53:
    min= getImage (getCodeBase(), "m (54).gif");
    break;
	case 54:
    min= getImage (getCodeBase(), "m (55).gif");
    break;
  case 55:
    min= getImage (getCodeBase(), "m (56).gif");
    break;
	case 56:
    min= getImage (getCodeBase(), "m (57).gif");
    break;
  case 57:
    min= getImage (getCodeBase(), "m (58).gif");
    break;
	case 58:
    min= getImage (getCodeBase(), "m (59).gif");
    break;
  case 59:
    min= getImage (getCodeBase(), "m (60).gif");
    break;
default:
    min= getImage (getCodeBase(), "m (1).gif");

}
		


g.drawImage(dbi, 0, 0, this);
}
}
	