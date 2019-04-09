import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.awt.color.*;


class Game{
    JFrame f=new JFrame("Snake & Ladder");
    JLabel tf,a3,x,l[],m[],dc[],z,k;
    JTextField tf1,tf2;
    JButton b1;
    JButton au,reset,start;
    JTextField screen;
    JLabel myimage=new JLabel(" ");
    Listener L=new Listener(this);



Game(){
    l=new JLabel[101];
    m=new JLabel[6];


    m[1]=new JLabel();
    m[1].setBounds(140,650,20,52);
    m[1].setIcon(new ImageIcon(".//player2.png"));
    f.add(m[1]);


    m[2]=new JLabel();
    m[2].setBounds(70,650,20,52);
    m[2].setIcon(new ImageIcon(".//player1.png"));
    f.add(m[2]);

    m[3]=new JLabel();
    m[3].setBounds(50,570,150,150);
    m[3].setIcon(new ImageIcon(".//start.jpg"));
    

    m[4]=new JLabel();
    m[4].setBounds(5,290,20,52);
    m[4].setIcon(new ImageIcon(".//player2.png"));
    f.add(m[4]);

    m[5]=new JLabel();
    m[5].setBounds(5,340,20,52);
    m[5].setIcon(new ImageIcon(".//player1.png"));
    f.add(m[5]);




    int j=0;
    for(int i=100;i>90;i--){
        l[i]=new JLabel();
        l[i].setBounds((200+j*70),0,70,70);
        l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
        f.add(l[i]);
        j++;
    }

    j=0;
    for(int i=81;i<=90;i++){
        l[i]=new JLabel();
        l[i].setBounds((200+j*70),70,70,70);
        l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
        f.add(l[i]);
        j++;
    }

    j=0;
    for(int i=80;i>70;i--){
        l[i]=new JLabel();
        l[i].setBounds((200+j*70),140,70,70);
        l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
        f.add(l[i]);
        j++;
    }
    j=0;
    for(int i=61;i<=70;i++){
        l[i]=new JLabel();
        l[i].setBounds((200+j*70),210,70,70);
        l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
        f.add(l[i]);
        j++;
    }
    j=0;
    for(int i=60;i>50;i--){
        l[i]=new JLabel();
        l[i].setBounds((200+j*70),280,70,70);
        l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
        f.add(l[i]);
        j++;
    }
    j=0;
    for(int i=41;i<=50;i++){
        l[i]=new JLabel();
        l[i].setBounds((200+j*70),350,70,70);
        l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
        f.add(l[i]);
        j++;
    }
    j=0;
    for(int i=40;i>30;i--){
        l[i]=new JLabel();
        l[i].setBounds((200+j*70),420,70,70);
        l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
        f.add(l[i]);
        j++;
    }
    j=0;
    for(int i=21;i<=30;i++){
        l[i]=new JLabel();
        l[i].setBounds((200+j*70),490,70,70);
        l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
        f.add(l[i]);
        j++;
    }
    j=0;
    for(int i=20;i>10;i--){
        l[i]=new JLabel();
        l[i].setBounds((200+j*70),560,70,70);
        l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
        f.add(l[i]);
        j++;
    }
    j=0;
    for(int i=1;i<=10;i++){
        l[i]=new JLabel();
        l[i].setBounds((200+j*70),630,70,70);
        l[i].setIcon(new ImageIcon(".//cut/"+i+".jpg"));
        f.add(l[i]);
        j++;
    }

    tf=new JLabel();
    tf.setBounds(920,0,37,663);
    tf.setIcon(new ImageIcon(".//img.png"));
    f.add(tf);

    z=new JLabel();
    z.setBounds(0,0,200,100);
    z.setIcon(new ImageIcon(".//name.jpg"));
    f.add(z);

    
    screen= new JTextField("Roll The Dice");
    screen.setBounds(25,250,150,40);
    screen.setBackground(Color.BLACK);
	screen.setForeground(Color.GREEN);
	f.add(screen);

	tf1=new JTextField();
	tf1.setBounds(25,310,150,35);
	tf1.setText("Player 1 ");
	f.add(tf1);
	tf1.setBackground(Color.YELLOW);

	tf2=new JTextField();
	tf2.setBounds(25,350,150,35);
	tf2.setText("Player 2");
	f.add(tf2);
    tf2.setBackground(Color.YELLOW);
    
    k=new JLabel();
    k.setBounds(60,400,100,100);
    f.add(k);

    a3=new JLabel();
    a3.setBounds(50,400,100,100);
    a3.setText("");
    a3.setIcon(new ImageIcon(".//dice.gif"));
    f.add(a3);


    b1=new JButton();
    b1.setBounds(25,490,150,40);
    b1.setText("Roll");
    b1.addActionListener(L);
    f.add(b1);

    myimage=new JLabel();
    myimage.setForeground(Color.WHITE);
    myimage.setBounds(120,400,100,100);
    f.add(myimage);

    Font font=new Font("Comic Sans MS",Font.BOLD,20);
    Font font1=new Font("Tecton Pro",Font.BOLD,26);
    Font font2=new Font ("Comic Sans MS",Font.BOLD,18);
    Font font3=new Font("forte",Font.BOLD,30);

    // font setting
    tf.setFont(font1);
    tf1.setFont(font);
    screen.setFont(font2);
    tf2.setFont(font);
    myimage.setFont(font3);
    a3.setFont(font1);
    b1.setFont(font3);
    f.setLayout(null);

    start=new JButton();
    start.setIcon(new ImageIcon(".//start.gif"));
    start.setBounds(50,580,150,60);
  start.addActionListener(L);
    f.add(start);

    au=new JButton();
    au.setIcon(new ImageIcon(".//about.jpg"));
    au.addActionListener(L);
    au.setBounds(40,120,120,40);
    f.add(au);

    reset=new JButton();
    reset.addActionListener(L);
    reset.setBounds(40,170,120,40);
    reset.setIcon(new ImageIcon(".//reset.png"));
    f.add(reset);

    f.setLayout(null);
    f.setVisible(true);
    f.setResizable(false);
    
    f.setSize(990,735);
    f.getContentPane().setBackground(new Color(255,130,4));
   
}
public static void main(String []s){
    new Game();
}
}


class Listener implements ActionListener{

    Game d;
    int rno,x1,y1;
    static int pc1,pc2;
    static int w;
    Rectangle r=new Rectangle();
    double y,z;



    Listener(Game d){
        this.d=d;
    }

    void randomNumber(){
        Random generator = new Random();
        rno= generator.nextInt(6) + 1;

        d.myimage.setText(String.valueOf(rno));
        d.a3.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==d.reset){
            d.m[1].setBounds(140,650,20,52);
            d.m[2].setBounds(70,650,20,52);
            d.b1.setEnabled(true);
            d.myimage.setText(" ");
            pc1=0;
            w=0;
            pc2=0;
        }
        else if(e.getSource()==d.au){
            JFrame jn=new JFrame("About Us");
            jn.setBounds(20,20,900,562);
            jn.setSize(900,600);
            jn.setVisible(true);

            JLabel a4=new JLabel();
            a4.setBounds(0,0,900,562);
            a4.setText("");
            a4.setIcon(new ImageIcon(".//ma.jpg"));
            jn.add(a4);
        }
        else if(e.getSource()==d.b1){
            randomNumber();

            if(w%2==0)

  {d.screen.setText("Player 2 chance");


	  w++;

          if((pc1+rno)<101)                               
          {
			  pc1=pc1+rno;
            r=d.l[pc1].getBounds();
		   y=r.getX();
			z=r.getY();
			 x1=(int)Math.round(y);
			 y1=(int)Math.round(z);
			d.m[1].setBounds((x1+10),(y1+20),20,52);



                    int a[]=new int[]{36,49,56,82,87,95};
                    int b[]=new int[]{5,7,8,20,66,38};

                    for(int i=0;i<6;i++){
                        if(pc1==a[i]){
                            r=d.l[b[i]].getBounds();
                            y=r.getX();
                            z=r.getY();
                            x1=(int)Math.round(y);
                            y1=(int)Math.round(z);
                            d.m[1].setBounds((x1+10),(y1+17),20,52);
                            pc1=b[i];
                        }
                    }


                    int c[]=new int[]{5,9,23,48,62,69};
                    int f[]=new int[]{35,51,42,86,83,91};
                    for(int i=0;i<6;i++){
                        if(pc1==c[i]){
                            r=d.l[f[i]].getBounds();
                            y=r.getX();
                            z=r.getY();
                            x1=(int)Math.round(y);
                            y1=(int)Math.round(z);
                            d.m[1].setBounds((x1+10),(y1+16),20,52);
                            pc1=f[i];
                        }
                    }
                }
            }
            else{               
                d.screen.setText("Player 1 chance");

                w++;
         
                   if((pc2+rno)<101)
                   {pc2=pc2+rno;
                   r=d.l[pc2].getBounds();
                    y=r.getX();
                    z=r.getY();
                      x1=(int)Math.round(y);
                      y1=(int)Math.round(z);
                   d.m[2].setBounds((x1+30),(y1+20),20,52);

                    int a[]=new int[]{36,49,56,82,87,95};
                    int b[]=new int[]{5,7,8,20,66,38};

                    for(int i=0;i<6;i++){
                        if(pc2==a[i]){
                            r=d.l[b[i]].getBounds();
                            y=r.getX();
                            z=r.getX();
                            x1=(int)Math.round(y);
                            y1=(int)Math.round(z);
                            d.m[2].setBounds((x1+30),(y1+17),20,52);
                            pc2=b[i];
                        }
                    }

                    int c[]=new int[]{5,9,23,48,62,69};
                    int f[]=new int[]{35,51,42,86,83,91};

                    for(int i=0;i<6;i++){
                        if(pc2==c[i]){
                            r=d.l[f[i]].getBounds();
                            y=r.getX();
                            z=r.getY();
                            x1=(int)Math.round(y);
                            y1=(int)Math.round(z);
                            d.m[2].setBounds((x1+30),(y1+16),20,52);
                            pc2=f[i];
                        }
                    }
                }
            }
            if(pc1==100){
                JFrame jn=new JFrame("About Us");
            jn.setBounds(20,20,900,562);
            jn.setSize(900,600);
            jn.setVisible(true);

            JLabel a4=new JLabel();
            a4.setBounds(0,0,900,562);
            a4.setText("");
            a4.setIcon(new ImageIcon(".//ma.jpg"));
            jn.add(a4);
                d.screen.setText("Player 1 Wins");
                d.b1.setEnabled(false);
            }
            else if(pc2==100){
                d.screen.setText("Player 2 Wins");
                d.b1.setEnabled(false);
            }
        }
    }
}