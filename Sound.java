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
	JButton playBtn = new JButton("�ѱ���");
	JButton playBtn_1 = new JButton("���H���q");
	JButton playBtn_2 = new JButton("���̪����");
	JButton playBtn_3 = new JButton("�s�p�m������");
	JButton playBtn_4 = new JButton("�i��");
	JButton playBtn_5 = new JButton("�t�x���@�^");
	JButton playBtn_6 = new JButton("��ë");
	JButton playBtn_7 = new JButton("�γ�");
	JButton playBtn_8 = new JButton("�x�_���Ѫ�");
	JButton playBtn_9 = new JButton("ť��");
	//JButton playBtn_10 = new JButton("�ܤ��٦��A");
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
	//JButton playBtn_21 = new JButton("�ڪ��a");
	//JButton playBtn_22 = new JButton("�R�A�@�U�~");
	//JButton playBtn_23 = new JButton("�k�H���a���O�o");
	//JButton playBtn_24 = new JButton("�ڪ����Ӥ��O��");
	//JButton playBtn_25 = new JButton("We Are The World");
	//JButton playBtn_26 = new JButton("Memory (II)");
	//JButton playBtn_27 = new JButton("�W���y");
	//JButton playBtn_28 = new JButton("Green Sleeves");
	JButton playBtn_29 = new JButton("���g�A��");
	JButton playBtn_30 = new JButton("��G�N��ڪ���");
	JButton playBtn_31 = new JButton("���b���^�W");
	JButton playBtn_32 = new JButton("�W�����_�n");
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
		txtArea.setText( "*** CHARLES�d��OK�I�۾� ***" ) ;
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
		txtArea2.setText("����`�b����ۺq XD  9.18.13 Berkeley \n");
		txtArea2.setFont(customFont);
		txtArea2.setHorizontalAlignment(JTextField.CENTER);
	}

	// 9
	public void actionPerformed( ActionEvent event )	
	{
		// 10
		if (event.getSource() == playBtn) {
			audio.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "�ѱ���" ) ;
			txtArea.append( "\n���g�~�ַR�l�ڡ@�@�ߥu�Q���e��\n��M�d�s�M�U���@�@�����Ӥ���^\n�}�M�^�����w���@�����Ѥv�b����\n�~���շR�뱡���@�̶˳̵h�O�ᮬ\n�p�G�A�����߸H�@�A���|���o�ڶ˴d\n��ڲ������\�@�O�ݧڬO���֡@�N���ڧѤF�o�@��\n�ڡ@���ڤ@�M�ѱ����@���ڤ@�]���y�\\n�Ҧ��u�߯u�N�@�����B�����j�@�I�X���R�����^\n���ڤ@�M�ѱ����@���ڤ@�ͤ��˴d\n�N��ڷ|�ܾK�@�N��ڷ|�߸H�@���|�ݨ��ڬy�\");
		}
		else if (event.getSource() == playBtn_1) {
			audio_1.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "���H���q" ) ;
			txtArea.append( 	"\n���n�A�Q�p�@���n�A�R�p�@���ɶ����������u�@�٥h�ڭǪ��^��\n���p���W�r�@�q�����|�A���_�@���A���d�ˡ@�N�ڤߦ���\n\n�����H���h�@�����L����@�Ҧ��ִּd�˩Ҧ��L�h�q�q���ߥh\n�ߤ��Q�������ߪ��檺���|�A�O�p�@���@�A�Ө��@�n��p�ѰO\n\n�ڷ|���h�ڤ��p�ߺw�U���\���@�ٷ|�˰��@�����L�ҿ�\n�N�p�M�ڪ��R�������V�H�@�A�N���q�q���X�ڨ��˪��ߴv\n\n���@�A�Ө��@�ڧ�p�ѰO\n�p�|�ݨ����@��p�ѰO");
		}
		else if (event.getSource() == playBtn_2) {
			audio_2.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "���̪����" ) ;
			txtArea.append("\n�C���ߤW�Y�@�Ӧa��@�`���ӰO�д�����\n�C�Ӳ`�]�Y�@�Ӧa��@�`���۳̲`����q\n\n�o�ӥ@���U�d���ܤơ@�R�⦳�����H�����\n�߭Y���D�F�R����V�@���Ȥ�����¤i�ۦ�\n\n���̪������ڷӫG�@�зŷx�L�ߩ�\n�ݳz�F�H���E���@�ण��h�I�ּ֤��q\n���̪������ڷӫG�@�Цu�ԥ�����\n�Y���@�ѯ୫�{�@�����ּ�����ө]��" );
		}
		else if (event.getSource() == playBtn_3) {
			audio_3.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "�s�p�m������" ) ;
			txtArea.append( "\n�Q�鹳���F�y���@���ڻ��h���i�d�@����çڤߡ@�h�м~\n��M�_������y�@�|�M���T�T��T�@���²M���|�Ƭy\n\n�Ѩӥu���s�H���@����ť���¤H���@�R����Ӧr�@�n���W\n�O�n�ݤ@�ө��ա@�٬O�n�˧@�k��@���h����������\n\n�ݦ����p�m�����@�����Ӫ��~�N\n�i�O�֤S���\��H�@�����d�s\n\n���@�ɡ@�p�m����\n�b�H���w�O���@��W�n�W�C�ѡ@���p�ŬX�P�v");
		}
		else if (event.getSource() == playBtn_4) {
			audio_4.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "�i��" ) ;
			txtArea.append( "\n�ש�@�F�o�ӨM�w�@�O�H��򻡧ڤ��z\n�u�n�A�]�@�˪��֩w\n���@�N�ѲP�������H�A�h�@�ڪ��D�@�����e��\n�ڪ��ߤ@���Ų߻��A�ۤv�@�̩ȧA���M���n���\n\n�R�u���ݭn�i��@�ӭ���y����y\n�u�n�A�@�Ӳ����֩w�@�ڪ��R�N���N�q\n�ڭ̳��ݭn�i��@�h�۫H�|�b�@�_\n�H������گ�Pı�A�@��b�ڤ�߸̡@�A���u��\n\n�p�G�ڪ���j���ʡ@�|���p�߶ˮ`�F�A\n�A�ण��ŬX����\n�����M�ߤӫ�@��`�ȿ��L�A");
		}
		else if (event.getSource() == playBtn_5) {
			audio_5.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "�t�x���@�^" ) ;
			txtArea.append( "\n�Ѧa�y�y�@�L�ȥ^�^�@��_�S�鸨\n�������@�ͦ����Y�@�X�H��ݳz\n\n���аںu�u�@èè�ڱ��`�@�E���צ���\n�d�@�b�M���@�d�@�b�K�@�ܤֹڸ̦��A�l�H\n\n�ڮ��C�K����ѡ@�A�ίu��������\n���뤣���H���@�h�֪��~�ˡ@���t�x���@�^");
		}
		else if (event.getSource() == playBtn_6) {
			audio_6.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "��ë" ) ;
			txtArea.append( "\n���ڭ̺V�Ʊ檺���r�@�h�֬�ë�b�ߤ�\n���j�a�ݤ��쥢�ѡ@�s���\�û��b\n\n���a�y�ѰO�F��ʧr�@�|�u�֤F�L��V\n���t�z�����F�ѵ��@�s�Ӷ������\n\n���w�ߥN���F�s�T�r�@�L�����|�A�`��\n���ɥ����o�h�ˬy�@�s�C�K���}��\n\n���h�a�}�l�h�k�`�r�@�ְּ��d�y�|��\n���@���䤣��·t�@���ֹ���}��\n\n���A���d�s�@���|�S���R\n���֪���û�\n\n���ڭ̺V�Ʊ檺���r�@�h�֬�ë�b�ߤ�\n���j�a�ݤ��쥢�ѡ@�s���\�û��b\n���ڭ̬ݤ��쥢�ѡ@�s���\�û��b");
		}
		else if (event.getSource() == playBtn_7) {
			audio_7.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "�γ�" ) ;
			txtArea.append( "\n[�k]�b�]�Τ���ı�@��߱��󦨺q�@�u�n��γ���t�@�ӹڹ�\n[�k]�ιڤ��Q�V���@���٬O���T�w�@��|���ʤH�۫ߦb�ﭱ���γ�\n�ڮ������W���@�a�ۧƱ�W�h�@��ӬO�ڹڸ̱`�X�{�����ӤH\n[�k]���ӤH���N�O�ڹڸ̨��ҽk���H�@�ڭ̦��P�˪��q��\n[�X]�Τѽu(�Τѽu)�@�Ʀ��R�A���Ϊ��@�֢���֢���\n[�k]�b�γ��۵ۧA���q�@���P�P�I�󦨳̮������]��\n[�k]�b�γ��M�ڷR���H�@�������]��\n[�X]�֩�o�ɨ�@�o�@���@���������@[�k]�R�}�l�ȵ�\n[�k]�b�γ��۵ۧA���q�@�N�x�����]�m���̩t�W����\n[�k]�b�γ��M�ڷR���H�@�̩t�W����\n[�X]�֩�o�ɨ�o�@���@���������@[�k]�R�}�l�ȵ��@[�X]�ڦ��A�Ӭ�\n[�k]���ڷR�A�O�֡@���A�R�ڬO�֡@��|���ʤH�۫���¶�b�ڭǪ�����\n[�k]�O�ڡ�O�p��ʤH�۫���¶�b�ڭǪ�����\n[�k]���ڷR�A�O�֡@���A�R�ڬO�֡@��ӬO�o�γ������R���۰m\n[�k]�O�ڡ�O�p��o�γ������R���۰m�@�b�γ��۵ۧA���q�@�b�γ��M�ڷR���H");
		}
		else if (event.getSource() == playBtn_8) {
			audio_8.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "�x�_���Ѫ�" ) ;
			txtArea.append( "\n���n���¤F�@���n���֤F\n�o�@�ɦA�S���ݩ�ۤv���ڷQ\n�ڨ��L�C�K�@�ڥ����~��\n�p���ڤS�A�^�������a��\n\n�x�_���Ѫ�\n���ڦ~�������e\n�٦��ڭ̥𮧩M�@�ɪ�����\n\n�x�_���Ѫ�\n�`�b�A�ڪ��ߤ�\n�h�֭��B������ڥu�@�M�A��L\n\n���]���ŷx�@�B�]�����X\n�o�@�ɤS�n���R�����x������\n�ڨ��L���m�@�ڨ��L�ɮ�\n�p���ڤS�A�^��ۤv���a��");
		}
		else if (event.getSource() == playBtn_9) {
			audio_9.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "ť��" ) ;
			txtArea.append( "\n�g�H�i�D�ڤ��ѡ@���O�����C��\n�]�]���ۧA�����@�߱��S�p��\n�Ǧ�O���Q���@�Ŧ�O�~�{\n�Ӻ}�y���A�@�g�����ߡ@���b����\n\n�g�H�i�D�ڤ��]�@�A�Q�n�ڤ���\n�ڸ̥~���ڬO�_�@�����A�L�q���\n�ڴ��ۤ@���ߡ@��]�������F����\n����A�����ʤF���@�o�S���a��\n\nť�@�������n���@�Į��۽֤S�Q�ˤF�ߡ@�o�٤��M��\n�@�w���O�ڡ@�ܤ֧ګܧN�R\n�i�O�\���@�N�s�\���]�����۫H\n\nť�@�������n���@�o�������K�]�Ӧh���@�d�_��ѩ�\n�g�ʫH���ڡ@�N��̫���w\n���A�b���}�ڪ��ɭԡ@�O��˪��߱�");
		}
		/*
		else if (event.getSource() == playBtn_10) {
			audio_10.play();
			txtArea.setText( "�z���b���񪺬O: " + "�ܤ��٦��A" ) ;
		}
		else if (event.getSource() == playBtn_11) {
			audio_11.play();
			txtArea.setText( "�z���b���񪺬O: " + "Without You" ) ;
		}
		*/
		/*
		else if (event.getSource() == playBtn_12) {
			audio_12.play();
			txtArea.setText( ">>> �z���b���񪺬O: " + "Can You Feel the Love Tonight" ) ;
		}
		else if (event.getSource() == playBtn_13) {
			audio_13.play();
			txtArea.setText( ">>> �z���b���񪺬O: " + "My Way" ) ;
			txtArea.append( "\nAnd now, the end is here\nAnd so I face the final curtain\nMy friend, I'll say it clear\nI'll state my case, of which I'm certain\nI've lived a life that's full\nI traveled each and ev'ry highway \nAnd more, much more than this, I did it my way\n\nRegrets, I've had a few\nBut then again, too few to mention\nI did what I had to do and saw it through without exemption\nI planned each charted course, each careful step along the byway\nAnd more, much more than this, I did it my way\nYes, there were times, I'm sure you knew\nWhen I bit off more than I could chew\nBut through it all, when there was doubt\nI ate it up and spit it out\nI faced it all and I stood tall and did it my way\n\nI've loved, I've laughed and cried\nI've had my fill, my share of losing\nAnd now, as tears subside, I find it all so amusing\nTo think I did all that\nAnd may I say, not in a shy way,\nOh, no, oh, no, not me, I did it my way\n\nFor what is a man, what has he got?\nIf not himself, then he has naught\nTo say the things he truly feels and not the words of one who kneels\nThe record shows I took the blows and did it my way!\n\nYes, it was my way");
		}
		*/
		/*
		else if (event.getSource() == playBtn_14) {
			audio_14.play();
			txtArea.setText( "�z���b���񪺬O: " + "Yesterday Once More" ) ;
		}
		*/
		/*
		else if (event.getSource() == playBtn_15) {
			audio_15.play();

			txtArea.setText( ">>> �z���b���񪺬O: " + "Rhythm of the Rain" ) ;
			txtArea.append( "\nListen to the rhythm of the falling rain\nTelling me just what a fool I've been\nI wish that it would go and let me cry in vain\nAnd let me be alone again\n\nThe only girl I care about has gone away\nLooking for a brand new start\nBut little does she know\nThat when she left that day\nAlong with her she took my heart\n\nRain please tell me now does that seem fair\nFor her to steal my heart away when she don't care\nI can't love another when my hearts somewhere far away\n\nThe only girl I care about has gone away\nLooking for a brand new start\nBut little does she know that when she left that day\nAlong with her she took my heart\n\nRain won't you tell her that I love her so\nPlease ask the sun to set her heart aglow\nRain in her heart and let the love we knew start to grow\n\nListen to the rhythm of the falling rain\nTelling me just what a fool I've been\nI wish that it would go and let me cry in vain\nAnd let me be alone again\n\nOh, listen to the falling rain\nPitter pater, pitter pater\nOh, oh, oh, listen to the falling rain\nPitter pater, pitter pater");
		}
		else if (event.getSource() == playBtn_16) {
			audio_16.play();
			txtArea.setText( ">>> �z���b���񪺬O: " + "Sailing" ) ;
			txtArea.append( "\nI am sailing, I am sailing,\nHome again cross the sea.\nI am sailing, stormy waters,\nTo be near you, to be free.\n\nI am flying, I am flying,\nLike a bird cross the sky.\nI am flying, passing high clouds,\nTo be with you, to be free.\nCan you hear me, can you hear me\nThro the dark night, far away,\nI am dying, forever trying,\nTo be with you, who can say.\n\nCan you hear me, can you hear me,\nThro the dark night far away.\nI am dying, forever trying,\nTo be with you, who can say.\nWe are sailing, we are sailing,\nHome again cross the sea.\nWe are sailing stormy waters,\nTo be near you, to be free.\n\nOh lord, to be near you, to be free.\nOh lord, to be near you, to be free,\nOh lord.");
		}
		else if (event.getSource() == playBtn_17) {
			audio_17.play();
			txtArea.setText( ">>> �z���b���񪺬O: " + "Where Have All the Flowers Gone" ) ;
		}
		*/
		/*
		else if (event.getSource() == playBtn_18) {
			audio_18.play();
			txtArea.setText( ">>> �z���b���񪺬O: " + "Memory" ) ;
		}
		else if (event.getSource() == playBtn_19) {
			audio_19.play();
			txtArea.setText( ">>> �z���b���񪺬O: " + "Let it Be" ) ;
		}
		*/
		/*
		else if (event.getSource() == playBtn_20) {
			audio_20.play();
			txtArea.setText( ">>> �z���b���񪺬O: " + "Country Road Take Me Home" ) ;
			txtArea.append( "\nAlmost heaven, West Virginia\nBlue Ridge Mountains\nShenandoah River -\nLife is old there\nOlder than the trees\nYounger than the mountains\nGrowin' like a breeze\n\n[*] Country Roads, take me home\nTo the place I belong\nWest Virginia, mountain momma\nTake me home, country roads\n\nAll my memories gathered 'round her\nMiner's lady, stranger to blue water\nDark and dusty, painted on the sky\nMisty taste of moonshine\nTeardrops in my eye\n\nI hear her voice\nIn the mornin' hour she calls me\nThe radio reminds me of my home far away\nAnd drivin' down the road I get a feelin'\nThat I should have been home yesterday, yesterday"); 
		}
		*/
		/*
		else if (event.getSource() == playBtn_21) {
			audio_21.play();
			txtArea.setText( "�z���b���񪺬O: " + "�ڪ��a" ) ;
		}
		else if (event.getSource() == playBtn_22) {
			audio_22.play();
			txtArea.setText( "�z���b���񪺬O: " + "�R�A�@�U�~" ) ;
		}
		else if (event.getSource() == playBtn_23) {
			audio_23.play();
			txtArea.setText( "�z���b���񪺬O: " + "�k�H���a���O�o" ) ;
		}
		else if (event.getSource() == playBtn_24) {
			audio_24.play();
			txtArea.setText( "�z���b���񪺬O: " + "�ڪ����Ӥ��O��" ) ;
		}
		else if (event.getSource() == playBtn_25) {
			audio_25.play();
			txtArea.setText( "�z���b���񪺬O: " + "We Are The World" ) ;
		}
		else if (event.getSource() == playBtn_26) {
			audio_26.play();
			txtArea.setText( "�z���b���񪺬O: " + "Memory" ) ;
		}
		else if (event.getSource() == playBtn_27) {
			audio_27.play();
			txtArea.setText( "�z���b���񪺬O: " + "�W���y" ) ;
		}
		*/
		/*
		else if (event.getSource() == playBtn_28) {
			audio_28.play();
			txtArea.setText( ">>> �z���b���񪺬O: " + "Green Sleeves" ) ;
		}
		*/
		else if (event.getSource() == playBtn_29) {
			audio_29.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "���g�A��" ) ;
			txtArea.append( "\n�n�ᤣ�`�}�@�n�����`�b�@�T��ѯ��ܡ@�\�x�۫�a\n���d���O��@���g�A�ӡ@�ܧ��F�o�M�@�жi�I�p��\n\n�H�ͯ�o�X�^�K�@���w����\n�ӡA�ܧ��o�M�A���a�I\n���d���O��@���g�A��\n\n���۶����|�@�����եɪM�@�����W�P�y�@�c�c���g�h\n���d���O��@���g�A�ӡ@�ܧ��F�o�M�@�жi�I�p��\n\n�H�ͯ�o�X�^�K�@���w����\n�ӡA�ܧ��o�M�A���a�I\n���d���O��@���g�A��");
		}
		else if (event.getSource() == playBtn_30) {
			audio_30.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "��G�N��ڪ���" ) ;
			txtArea.append( "\n�A�ݧڷR�A���h�`�A�ڷR�A���X���C\n�ڪ����]�u�A�ڪ��R�]�u�A��G�N��ڪ��ߡC\n�A�ݧڷR�A���h�`�A�ڷR�A���X���C\n�ڪ��������A�ڪ��R���ܡA��G�N��ڪ��ߡC\n\n�������@�ӧk�A�w�g���ʧڪ��ߡC\n�`�`���@�q���A�s�ګ����p���C\n\n�A�ݧڷR�A���h�`�A�ڷR�A���X���C\n�A�h�Q�@�Q�A�A�h�ݤ@�ݡA��G�N��ڪ��ߡC\n\n�������@�ӧk�A�w�g���ʧڪ��ߡC\n�`�`���@�q���A�s�ګ����p���C\n\n�A�ݧڷR�A���h�`�A�ڷR�A���X���C\n�A�h�Q�@�Q�A�A�h�ݤ@�ݡA��G�N��ڪ��ߡC\n\n�A�h�Q�@�Q�A�A�h�ݤ@�ݡA��G�N��ڪ��ߡC");
		}
		else if (event.getSource() == playBtn_31) {
			audio_31.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "���b���^�W" ) ;
			txtArea.append( "\n�s�����C�s�ʨ����r\n�����q�_���̻٧r��\n�C�C���s���ﶳ�]�r\n�ն������ѻa�a�r��\n\n�s�����C�s�ʨ����r\n���b�^�W�������r��\n�C�C���s���ﶳ�]�r\n���ۤ@�Ӧ������r��\n\n�گ��b���^�W���B��\n���@����i�����\n�A���b���^�W�V�U��\n�O�֦b��A�n�n��\n\n�s�����C�s�ʨ����r\n�����f�N�t�����r��\n�C�C���s���ﶳ�]�r\n�ڭǬ۷R�b���^�@�b���^");
		}
		else if (event.getSource() == playBtn_32) {
			audio_32.play();
			txtArea.setText( ">>>�@�z���b���񪺬O: " + "�W�����_�n" ) ;
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
			txtArea.setText( "*** CHARLES�d��OK�I�۾� ***" ) ;
		}
	}

	public static void main(String[] args)
	{
		// 1
		Sound snd = new Sound();
	}
}
