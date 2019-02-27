// 2
import javax.swing.*;
import java.awt.event.*;	
import java.awt.*;
import java.awt.font.*;
// test 1
// 1 & 3
class Sound extends JFrame implements ActionListener	
{
	JPanel pnl = new JPanel();
	
	// 4
	ClassLoader ldr = this.getClass().getClassLoader();
	java.net.URL crossURL = ldr.getResource("cross_2.2.png");
	ImageIcon cross = new ImageIcon( crossURL );	
	
	// 5
	java.applet.AudioClip audio = JApplet.newAudioClip( ldr.getResource("midi/unmindful.mid") );
	java.applet.AudioClip audio_1 = JApplet.newAudioClip( ldr.getResource("midi/wave_man.mid") );
	java.applet.AudioClip audio_2 = JApplet.newAudioClip( ldr.getResource("midi/city_moonlight.mid") );
	java.applet.AudioClip audio_3 = JApplet.newAudioClip( ldr.getResource("midi/butterfly.mid") );
	java.applet.AudioClip audio_4 = JApplet.newAudioClip( ldr.getResource("midi/courage.mid") );
	java.applet.AudioClip audio_5 = JApplet.newAudioClip( ldr.getResource("midi/unrestrained.mid") );
	java.applet.AudioClip audio_6 = JApplet.newAudioClip( ldr.getResource("midi/prayer.mid") );
	java.applet.AudioClip audio_7 = JApplet.newAudioClip( ldr.getResource("midi/roof.mid") );
	java.applet.AudioClip audio_8 = JApplet.newAudioClip( ldr.getResource("midi/taipei.mid") );
	java.applet.AudioClip audio_9 = JApplet.newAudioClip( ldr.getResource("midi/listen_sea.mid") );
	//java.applet.AudioClip audio_10 = JApplet.newAudioClip( ldr.getResource("midi/atleast_you.mid") );
	//java.applet.AudioClip audio_11 = JApplet.newAudioClip( ldr.getResource("midi/without_you.mid") );
	//java.applet.AudioClip audio_12 = JApplet.newAudioClip( ldr.getResource("midi/lion_king.mid") );
	//java.applet.AudioClip audio_13 = JApplet.newAudioClip( ldr.getResource("midi/my_way.mid") );
	//java.applet.AudioClip audio_14 = JApplet.newAudioClip( ldr.getResource("midi/yesterday_once_more.mid") );
	//java.applet.AudioClip audio_15 = JApplet.newAudioClip( ldr.getResource("midi/rain.mid") );
	//java.applet.AudioClip audio_16 = JApplet.newAudioClip( ldr.getResource("midi/sailing.mid") );
	//java.applet.AudioClip audio_17 = JApplet.newAudioClip( ldr.getResource("midi/flower.mid") );
	//java.applet.AudioClip audio_18 = JApplet.newAudioClip( ldr.getResource("midi/memory_1.mid") );
	//java.applet.AudioClip audio_19 = JApplet.newAudioClip( ldr.getResource("midi/let.mid") );
	//java.applet.AudioClip audio_20 = JApplet.newAudioClip( ldr.getResource("midi/country_road.mid") );
	//java.applet.AudioClip audio_21 = JApplet.newAudioClip( ldr.getResource("midi/bell.mid") );
	//java.applet.AudioClip audio_22 = JApplet.newAudioClip( ldr.getResource("midi/ten_thousand.mid") );
	//java.applet.AudioClip audio_23 = JApplet.newAudioClip( ldr.getResource("midi/men_cry.mid") );
	//java.applet.AudioClip audio_24 = JApplet.newAudioClip( ldr.getResource("midi/future.mid") );
	//java.applet.AudioClip audio_25 = JApplet.newAudioClip( ldr.getResource("midi/world.mid") );
	//java.applet.AudioClip audio_26 = JApplet.newAudioClip( ldr.getResource("midi/memory_1.mid") );
	//java.applet.AudioClip audio_27 = JApplet.newAudioClip( ldr.getResource("midi/shanghai.mid") );
	//java.applet.AudioClip audio_28 = JApplet.newAudioClip( ldr.getResource("midi/green_sleeves.mid") );
	java.applet.AudioClip audio_29 = JApplet.newAudioClip( ldr.getResource("midi/you_when_come.mid") );
	java.applet.AudioClip audio_30 = JApplet.newAudioClip( ldr.getResource("midi/moon_heart.mid") );
	java.applet.AudioClip audio_31 = JApplet.newAudioClip( ldr.getResource("midi/high_hill.mid") );
	java.applet.AudioClip audio_32 = JApplet.newAudioClip( ldr.getResource("midi/conan.mid") );
	
	
	// 6
	JButton playBtn = new JButton("忘情水");
	JButton playBtn_1 = new JButton("浪人情歌");
	JButton playBtn_2 = new JButton("城裡的月光");
	JButton playBtn_3 = new JButton("新鴛鴦蝴蝶夢");
	JButton playBtn_4 = new JButton("勇氣");
	JButton playBtn_5 = new JButton("瀟灑走一回");
	JButton playBtn_6 = new JButton("祈禱");
	JButton playBtn_7 = new JButton("屋頂");
	JButton playBtn_8 = new JButton("台北的天空");
	JButton playBtn_9 = new JButton("聽海");
	//JButton playBtn_10 = new JButton("至少還有你");
	//JButton playBtn_11 = new JButton("Without You");
	//JButton playBtn_12 = new JButton("Can You Feel the Love Tonight");
	//JButton playBtn_13 = new JButton("My Way");
	//JButton playBtn_14 = new JButton("Yesterday Once More");
	//JButton playBtn_15 = new JButton("Rhythm of the Rain");
	//JButton playBtn_16 = new JButton("Sailing");
	//JButton playBtn_17 = new JButton("Where Have All The Flowers Gone");
	//JButton playBtn_18 = new JButton("Memory");
	//JButton playBtn_19 = new JButton("Let it Be");
	//JButton playBtn_20 = new JButton("Country Road Take Me Home");
	//JButton playBtn_21 = new JButton("夢陀鈴");
	//JButton playBtn_22 = new JButton("愛你一萬年");
	//JButton playBtn_23 = new JButton("男人哭吧不是罪");
	//JButton playBtn_24 = new JButton("我的未來不是夢");
	//JButton playBtn_25 = new JButton("We Are The World");
	//JButton playBtn_26 = new JButton("Memory (II)");
	//JButton playBtn_27 = new JButton("上海灘");
	//JButton playBtn_28 = new JButton("Green Sleeves");
	JButton playBtn_29 = new JButton("何日君再來");
	JButton playBtn_30 = new JButton("月亮代表我的心");
	JButton playBtn_31 = new JButton("站在高崗上");
	JButton playBtn_32 = new JButton("名偵探柯南");
	JButton stopBtn = new JButton(cross );
	
	JTextArea txtArea = new JTextArea( 5 , 45 ) ;
	Font font1 = new Font("SansSerif", Font.BOLD, 18);
	
	JTextField txtArea2 = new JTextField( 45 ) ;
	Color customColor = new Color(255,255,255);
	Font customFont = new Font("serif",Font.PLAIN,26);
	

	char x = '\u24B8';
	// 1
	public Sound()
	{
		super("CHARLES KARAOKE BOX \u24B8 \u266A \u266B \u266A \u266B \u266A \u266B \u266A \u266B \u266A \u266B \u266A \u266B");
		setSize( 850, 700);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		txtArea2.setForeground( Color.BLACK );
		txtArea2.setBackground( Color.ORANGE );
		
		add(pnl);
		pnl.setBackground( Color.DARK_GRAY );
		txtArea.setForeground( Color.WHITE );
		txtArea.setBackground( Color.BLACK );
		// 7
		
		pnl.add( playBtn );
		pnl.add( playBtn_1 );
		pnl.add( playBtn_2 );
		pnl.add( playBtn_3 );
		pnl.add( playBtn_4 );
		pnl.add( playBtn_5 );
		pnl.add( playBtn_6 );
		pnl.add( playBtn_7 );
		pnl.add( playBtn_8 );
		pnl.add( playBtn_9 );
		//pnl.add( playBtn_10 );
		//pnl.add( playBtn_11 );
		//pnl.add( playBtn_12 );
		//pnl.add( playBtn_13 );
		//pnl.add( playBtn_14 );
		//pnl.add( playBtn_15 );
		//pnl.add( playBtn_16 );
		//pnl.add( playBtn_17 );
		//pnl.add( playBtn_18 );
		//pnl.add( playBtn_19 );
		//pnl.add( playBtn_20 );
		//pnl.add( playBtn_21 );
		//pnl.add( playBtn_22 );
		//pnl.add( playBtn_23 );
		//pnl.add( playBtn_24 );
		//pnl.add( playBtn_25 );
		//pnl.add( playBtn_26 );
		//pnl.add( playBtn_27 );
		//pnl.add( playBtn_28 );
		pnl.add( playBtn_29);
		pnl.add( playBtn_30);
		pnl.add( playBtn_31);
		pnl.add( playBtn_32);
		pnl.add( stopBtn );
		pnl.add( txtArea2 ) ;
		pnl.add( txtArea ) ;
		txtArea.setText( "*** CHARLES卡拉OK點唱機 ***" ) ;
		//txtArea.setHorizontalAlignment(JTextField.CENTER);
		
		// 8
		playBtn.addActionListener(this);
		playBtn_1.addActionListener(this);
		playBtn_2.addActionListener(this);
		playBtn_3.addActionListener(this);
		playBtn_4.addActionListener(this);
		playBtn_5.addActionListener(this);
		playBtn_6.addActionListener(this);
		playBtn_7.addActionListener(this);
		playBtn_8.addActionListener(this);
		playBtn_9.addActionListener(this);
		//playBtn_10.addActionListener(this);
		//playBtn_11.addActionListener(this);
		//playBtn_12.addActionListener(this);
		//playBtn_13.addActionListener(this);
		//playBtn_14.addActionListener(this);
		//playBtn_15.addActionListener(this);
		//playBtn_16.addActionListener(this);
		//playBtn_17.addActionListener(this);
		//playBtn_18.addActionListener(this);
		//playBtn_19.addActionListener(this);
		//playBtn_20.addActionListener(this);
		//playBtn_21.addActionListener(this);
		//playBtn_22.addActionListener(this);
		//playBtn_23.addActionListener(this);
		//playBtn_24.addActionListener(this);
		//playBtn_25.addActionListener(this);
		//playBtn_26.addActionListener(this);
		//playBtn_27.addActionListener(this);
		//playBtn_28.addActionListener(this);
		playBtn_29.addActionListener(this);
		playBtn_30.addActionListener(this);
		playBtn_31.addActionListener(this);
		playBtn_32.addActionListener(this);
		stopBtn.addActionListener(this);

		setVisible(true);		
		txtArea.setFont(font1);
		txtArea2.setText("中秋節在美國唱歌 XD  9.18.13 Berkeley \n");
		txtArea2.setFont(customFont);
		txtArea2.setHorizontalAlignment(JTextField.CENTER);
	}

	// 9
	public void actionPerformed( ActionEvent event )	
	{
		// 10
		if (event.getSource() == playBtn) {
			audio.play();
			txtArea.setText( ">>>　您正在播放的是: " + "忘情水" ) ;
			txtArea.append( "\n曾經年少愛追夢　一心只想往前飛\n行遍千山和萬水　一路走來不能回\n慕然回首情已遠　身不由己在天邊\n才明白愛恨情仇　最傷最痛是後悔\n如果你不曾心碎　你不會懂得我傷悲\n當我眼中有淚　別問我是為誰　就讓我忘了這一切\n啊　給我一杯忘情水　換我一夜不流淚\n所有真心真意　任它雨打風吹　付出的愛收不回\n給我一杯忘情水　換我一生不傷悲\n就算我會喝醉　就算我會心碎　不會看見我流淚");
		}
		else if (event.getSource() == playBtn_1) {
			audio_1.play();
			txtArea.setText( ">>>　您正在播放的是: " + "浪人情歌" ) ;
			txtArea.append( 	"\n不要再想妳　不要再愛妳　讓時間悄悄的飛逝　抹去我倆的回憶\n對於妳的名字　從今不會再提起　不再讓悲傷　將我心佔據\n\n讓它隨風去　讓它無痕跡　所有快樂悲傷所有過去通通都拋去\n心中想的念的盼的望的不會再是妳　不願再承受　要把妳忘記\n\n我會擦去我不小心滴下的淚水　還會裝做一切都無所謂\n將妳和我的愛情全部敲碎　再將它通通趕出我受傷的心扉\n\n不願再承受　我把妳忘記\n妳會看見的　把妳忘記");
		}
		else if (event.getSource() == playBtn_2) {
			audio_2.play();
			txtArea.setText( ">>>　您正在播放的是: " + "城裡的月光" ) ;
			txtArea.append("\n每顆心上某一個地方　總有個記憶揮不散\n每個深夜某一個地方　總有著最深的思量\n\n這個世間萬千的變化　愛把有情的人分兩端\n心若知道靈犀的方向　那怕不能夠朝夕相伴\n\n城裡的月光把夢照亮　請溫暖他心房\n看透了人間聚散　能不能多點快樂片段\n城裡的月光把夢照亮　請守候它身旁\n若有一天能重逢　讓幸福撒滿整個夜晚" );
		}
		else if (event.getSource() == playBtn_3) {
			audio_3.play();
			txtArea.setText( ">>>　您正在播放的是: " + "新鴛鴦蝴蝶夢" ) ;
			txtArea.append( "\n昨日像那東流水　離我遠去不可留　今日亂我心　多煩憂\n抽刀斷水水更流　舉杯消愁愁更愁　明朝清風四飄流\n\n由來只有新人笑　有誰聽到舊人哭　愛情兩個字　好辛苦\n是要問一個明白　還是要裝作糊塗　知多知少難知足\n\n看似個鴛鴦蝴蝶　不應該的年代\n可是誰又能擺脫人世間的悲哀\n\n花花世界　鴛鴦蝴蝶\n在人間已是癲　何苦要上青天　不如溫柔同眠");
		}
		else if (event.getSource() == playBtn_4) {
			audio_4.play();
			txtArea.setText( ">>>　您正在播放的是: " + "勇氣" ) ;
			txtArea.append( "\n終於作了這個決定　別人怎麼說我不理\n只要你也一樣的肯定\n我願意天涯海角都隨你去　我知道一切不容易\n我的心一直溫習說服自己　最怕你忽然說要放棄\n\n愛真的需要勇氣　來面對流言蜚語\n只要你一個眼神肯定　我的愛就有意義\n我們都需要勇氣　去相信會在一起\n人潮擁擠我能感覺你　放在我手心裡　你的真心\n\n如果我的堅強任性　會不小心傷害了你\n你能不能溫柔提醒\n我雖然心太急　更害怕錯過你");
		}
		else if (event.getSource() == playBtn_5) {
			audio_5.play();
			txtArea.setText( ">>>　您正在播放的是: " + "瀟灑走一回" ) ;
			txtArea.append( "\n天地悠悠　過客匆匆　潮起又潮落\n恩恩怨怨　生死白頭　幾人能看透\n\n紅塵啊滾滾　癡癡啊情深　聚散終有時\n留一半清醒　留一半醉　至少夢裡有你追隨\n\n我拿青春賭明天　你用真情換此生\n歲月不知人間　多少的憂傷　何不瀟灑走一回");
		}
		else if (event.getSource() == playBtn_6) {
			audio_6.play();
			txtArea.setText( ">>>　您正在播放的是: " + "祈禱" ) ;
			txtArea.append( "\n讓我們敲希望的鐘呀　多少祈禱在心中\n讓大家看不到失敗　叫成功永遠在\n\n讓地球忘記了轉動呀　四季少了夏秋冬\n讓宇宙關不了天窗　叫太陽不西衝\n\n讓歡喜代替了哀愁呀　微笑不會再害羞\n讓時光懂得去倒流　叫青春不開溜\n\n讓貧窮開始去逃亡呀　快樂健康流四方\n讓世間找不到黑暗　幸福像花開放\n\n不再有悲哀　不會沒有愛\n幸福直到永遠\n\n讓我們敲希望的鐘呀　多少祈禱在心中\n讓大家看不到失敗　叫成功永遠在\n讓我們看不到失敗　叫成功永遠在");
		}
		else if (event.getSource() == playBtn_7) {
			audio_7.play();
			txtArea.setText( ">>>　您正在播放的是: " + "屋頂" ) ;
			txtArea.append( "\n[男]半夜睡不著覺　把心情哼成歌　只好到屋頂找另一個夢境\n[女]睡夢中被敲醒　我還是不確定　怎會有動人旋律在對面的屋頂\n我悄悄關上門　帶著希望上去　原來是我夢裡常出現的那個人\n[男]那個人不就是我夢裡那模糊的人　我們有同樣的默契\n[合]用天線(用天線)　排成愛你的形狀　Ｈｏ～Ｈｏ～\n[女]在屋頂唱著你的歌　讓星星點綴成最浪漫的夜晚\n[男]在屋頂和我愛的人　浪漫的夜晚\n[合]擁抱這時刻　這一分一秒全都停止　[男]愛開始糾結\n[女]在屋頂唱著你的歌　將泛黃的夜獻給最孤獨的月\n[男]在屋頂和我愛的人　最孤獨的月\n[合]擁抱這時刻這一分一秒全都停止　[男]愛開始糾結　[合]夢有你而美\n[女]讓我愛你是誰　讓你愛我是誰　怎會有動人旋律環繞在我倆的身邊\n[男]是我～是妳～動人旋律環繞在我倆的身邊\n[女]讓我愛你是誰　讓你愛我是誰　原來是這屋頂有美麗的邂逅\n[男]是我～是妳～這屋頂有美麗的邂逅　在屋頂唱著你的歌　在屋頂和我愛的人");
		}
		else if (event.getSource() == playBtn_8) {
			audio_8.play();
			txtArea.setText( ">>>　您正在播放的是: " + "台北的天空" ) ;
			txtArea.append( "\n風好像倦了　雲好像累了\n這世界再沒有屬於自己的夢想\n我走過青春　我失落年少\n如今我又再回到思念的地方\n\n台北的天空\n有我年輕的笑容\n還有我們休息和共享的角落\n\n台北的天空\n常在你我的心中\n多少風雨的歲月我只願和你渡過\n\n風也曾溫暖　雨也曾輕柔\n這世界又好像充滿熟悉的陽光\n我走過異鄉　我走過滄桑\n如今我又再回到自己的地方");
		}
		else if (event.getSource() == playBtn_9) {
			audio_9.play();
			txtArea.setText( ">>>　您正在播放的是: " + "聽海" ) ;
			txtArea.append( "\n寫信告訴我今天　海是什麼顏色\n夜夜陪著你的海　心情又如何\n灰色是不想說　藍色是憂鬱\n而漂泊的你　狂浪的心　停在哪裡\n\n寫信告訴我今夜　你想要夢什麼\n夢裡外的我是否　都讓你無從選擇\n我揪著一顆心　整夜都閉不了眼睛\n為何你明明動了情　卻又不靠近\n\n聽　海哭的聲音　嘆息著誰又被傷了心　卻還不清醒\n一定不是我　至少我很冷靜\n可是淚水　就連淚水也都不相信\n\n聽　海哭的聲音　這片海未免也太多情　悲泣到天明\n寫封信給我　就當最後約定\n說你在離開我的時候　是怎樣的心情");
		}
		/*
		else if (event.getSource() == playBtn_10) {
			audio_10.play();
			txtArea.setText( "您正在播放的是: " + "至少還有你" ) ;
		}
		else if (event.getSource() == playBtn_11) {
			audio_11.play();
			txtArea.setText( "您正在播放的是: " + "Without You" ) ;
		}
		*/
		/*
		else if (event.getSource() == playBtn_12) {
			audio_12.play();
			txtArea.setText( ">>> 您正在播放的是: " + "Can You Feel the Love Tonight" ) ;
		}
		else if (event.getSource() == playBtn_13) {
			audio_13.play();
			txtArea.setText( ">>> 您正在播放的是: " + "My Way" ) ;
			txtArea.append( "\nAnd now, the end is here\nAnd so I face the final curtain\nMy friend, I'll say it clear\nI'll state my case, of which I'm certain\nI've lived a life that's full\nI traveled each and ev'ry highway \nAnd more, much more than this, I did it my way\n\nRegrets, I've had a few\nBut then again, too few to mention\nI did what I had to do and saw it through without exemption\nI planned each charted course, each careful step along the byway\nAnd more, much more than this, I did it my way\nYes, there were times, I'm sure you knew\nWhen I bit off more than I could chew\nBut through it all, when there was doubt\nI ate it up and spit it out\nI faced it all and I stood tall and did it my way\n\nI've loved, I've laughed and cried\nI've had my fill, my share of losing\nAnd now, as tears subside, I find it all so amusing\nTo think I did all that\nAnd may I say, not in a shy way,\nOh, no, oh, no, not me, I did it my way\n\nFor what is a man, what has he got?\nIf not himself, then he has naught\nTo say the things he truly feels and not the words of one who kneels\nThe record shows I took the blows and did it my way!\n\nYes, it was my way");
		}
		*/
		/*
		else if (event.getSource() == playBtn_14) {
			audio_14.play();
			txtArea.setText( "您正在播放的是: " + "Yesterday Once More" ) ;
		}
		*/
		/*
		else if (event.getSource() == playBtn_15) {
			audio_15.play();

			txtArea.setText( ">>> 您正在播放的是: " + "Rhythm of the Rain" ) ;
			txtArea.append( "\nListen to the rhythm of the falling rain\nTelling me just what a fool I've been\nI wish that it would go and let me cry in vain\nAnd let me be alone again\n\nThe only girl I care about has gone away\nLooking for a brand new start\nBut little does she know\nThat when she left that day\nAlong with her she took my heart\n\nRain please tell me now does that seem fair\nFor her to steal my heart away when she don't care\nI can't love another when my hearts somewhere far away\n\nThe only girl I care about has gone away\nLooking for a brand new start\nBut little does she know that when she left that day\nAlong with her she took my heart\n\nRain won't you tell her that I love her so\nPlease ask the sun to set her heart aglow\nRain in her heart and let the love we knew start to grow\n\nListen to the rhythm of the falling rain\nTelling me just what a fool I've been\nI wish that it would go and let me cry in vain\nAnd let me be alone again\n\nOh, listen to the falling rain\nPitter pater, pitter pater\nOh, oh, oh, listen to the falling rain\nPitter pater, pitter pater");
		}
		else if (event.getSource() == playBtn_16) {
			audio_16.play();
			txtArea.setText( ">>> 您正在播放的是: " + "Sailing" ) ;
			txtArea.append( "\nI am sailing, I am sailing,\nHome again cross the sea.\nI am sailing, stormy waters,\nTo be near you, to be free.\n\nI am flying, I am flying,\nLike a bird cross the sky.\nI am flying, passing high clouds,\nTo be with you, to be free.\nCan you hear me, can you hear me\nThro the dark night, far away,\nI am dying, forever trying,\nTo be with you, who can say.\n\nCan you hear me, can you hear me,\nThro the dark night far away.\nI am dying, forever trying,\nTo be with you, who can say.\nWe are sailing, we are sailing,\nHome again cross the sea.\nWe are sailing stormy waters,\nTo be near you, to be free.\n\nOh lord, to be near you, to be free.\nOh lord, to be near you, to be free,\nOh lord.");
		}
		else if (event.getSource() == playBtn_17) {
			audio_17.play();
			txtArea.setText( ">>> 您正在播放的是: " + "Where Have All the Flowers Gone" ) ;
		}
		*/
		/*
		else if (event.getSource() == playBtn_18) {
			audio_18.play();
			txtArea.setText( ">>> 您正在播放的是: " + "Memory" ) ;
		}
		else if (event.getSource() == playBtn_19) {
			audio_19.play();
			txtArea.setText( ">>> 您正在播放的是: " + "Let it Be" ) ;
		}
		*/
		/*
		else if (event.getSource() == playBtn_20) {
			audio_20.play();
			txtArea.setText( ">>> 您正在播放的是: " + "Country Road Take Me Home" ) ;
			txtArea.append( "\nAlmost heaven, West Virginia\nBlue Ridge Mountains\nShenandoah River -\nLife is old there\nOlder than the trees\nYounger than the mountains\nGrowin' like a breeze\n\n[*] Country Roads, take me home\nTo the place I belong\nWest Virginia, mountain momma\nTake me home, country roads\n\nAll my memories gathered 'round her\nMiner's lady, stranger to blue water\nDark and dusty, painted on the sky\nMisty taste of moonshine\nTeardrops in my eye\n\nI hear her voice\nIn the mornin' hour she calls me\nThe radio reminds me of my home far away\nAnd drivin' down the road I get a feelin'\nThat I should have been home yesterday, yesterday"); 
		}
		*/
		/*
		else if (event.getSource() == playBtn_21) {
			audio_21.play();
			txtArea.setText( "您正在播放的是: " + "夢陀鈴" ) ;
		}
		else if (event.getSource() == playBtn_22) {
			audio_22.play();
			txtArea.setText( "您正在播放的是: " + "愛你一萬年" ) ;
		}
		else if (event.getSource() == playBtn_23) {
			audio_23.play();
			txtArea.setText( "您正在播放的是: " + "男人哭吧不是罪" ) ;
		}
		else if (event.getSource() == playBtn_24) {
			audio_24.play();
			txtArea.setText( "您正在播放的是: " + "我的未來不是夢" ) ;
		}
		else if (event.getSource() == playBtn_25) {
			audio_25.play();
			txtArea.setText( "您正在播放的是: " + "We Are The World" ) ;
		}
		else if (event.getSource() == playBtn_26) {
			audio_26.play();
			txtArea.setText( "您正在播放的是: " + "Memory" ) ;
		}
		else if (event.getSource() == playBtn_27) {
			audio_27.play();
			txtArea.setText( "您正在播放的是: " + "上海灘" ) ;
		}
		*/
		/*
		else if (event.getSource() == playBtn_28) {
			audio_28.play();
			txtArea.setText( ">>> 您正在播放的是: " + "Green Sleeves" ) ;
		}
		*/
		else if (event.getSource() == playBtn_29) {
			audio_29.play();
			txtArea.setText( ">>>　您正在播放的是: " + "何日君再來" ) ;
			txtArea.append( "\n好花不常開　好景不常在　愁堆解笑眉　淚灑相思帶\n今宵離別後　何日君再來　喝完了這杯　請進點小菜\n\n人生能得幾回醉　不歡更何待\n來，喝完這杯再說吧！\n今宵離別後　何日君再來\n\n停唱陽關疊　重擎白玉杯　慇勤頻致語　牢牢撫君懷\n今宵離別後　何日君再來　喝完了這杯　請進點小菜\n\n人生能得幾回醉　不歡更何待\n來，喝完這杯再說吧！\n今宵離別後　何日君再來");
		}
		else if (event.getSource() == playBtn_30) {
			audio_30.play();
			txtArea.setText( ">>>　您正在播放的是: " + "月亮代表我的心" ) ;
			txtArea.append( "\n你問我愛你有多深，我愛你有幾分。\n我的情也真，我的愛也真，月亮代表我的心。\n你問我愛你有多深，我愛你有幾分。\n我的情不移，我的愛不變，月亮代表我的心。\n\n輕輕的一個吻，已經打動我的心。\n深深的一段情，叫我思念到如今。\n\n你問我愛你有多深，我愛你有幾分。\n你去想一想，你去看一看，月亮代表我的心。\n\n輕輕的一個吻，已經打動我的心。\n深深的一段情，叫我思念到如今。\n\n你問我愛你有多深，我愛你有幾分。\n你去想一想，你去看一看，月亮代表我的心。\n\n你去想一想，你去看一看，月亮代表我的心。");
		}
		else if (event.getSource() == playBtn_31) {
			audio_31.play();
			txtArea.setText( ">>>　您正在播放的是: " + "站在高崗上" ) ;
			txtArea.append( "\n連綿的青山百里長呀\n巍巍聳起像屏障呀喂\n青青的山嶺穿雲霄呀\n白雲片片天蒼蒼呀喂\n\n連綿的青山百里長呀\n郎在崗上等紅妝呀喂\n青青的山嶺穿雲霄呀\n站著一個有情郎呀喂\n\n我站在高崗上遠處望\n那一片綠波海茫茫\n你站在高崗上向下望\n是誰在對你聲聲唱\n\n連綿的青山百里長呀\n郎情妹意配成雙呀喂\n青青的山嶺穿雲霄呀\n我倆相愛在高崗　在高崗");
		}
		else if (event.getSource() == playBtn_32) {
			audio_32.play();
			txtArea.setText( ">>>　您正在播放的是: " + "名偵探柯南" ) ;
		}
		// 11
		if (event.getSource() == stopBtn) {
			audio.stop();
			audio_1.stop();
			audio_2.stop();
			audio_3.stop();
			audio_4.stop();
			audio_5.stop();
			audio_6.stop();
			audio_7.stop();
			audio_8.stop();
			audio_9.stop();
			//audio_10.stop();
			//audio_11.stop();
			//audio_12.stop();
			//audio_13.stop();
			//audio_14.stop();
			//audio_15.stop();
			//audio_16.stop();
			//audio_17.stop();
			//audio_18.stop();
			//audio_19.stop();
			//audio_20.stop();
			//audio_21.stop();
			//audio_22.stop();
			//audio_23.stop();
			//audio_24.stop();
			//audio_25.stop();
			//audio_26.stop();
			//audio_27.stop();
			//audio_28.stop();
			audio_29.stop();
			audio_30.stop();
			audio_31.stop();
			audio_32.stop();
			txtArea.setText( "*** CHARLES卡拉OK點唱機 ***" ) ;
		}
	}

	public static void main(String[] args)
	{
		// 1
		Sound snd = new Sound();
	}
}
