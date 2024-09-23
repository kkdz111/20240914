包rdtygy；

导入java.awt.BorderLayout；
导入java.awt.Color；
导入java.awt.Graphics；
导入java.awt.GridLayout；
导入java.awt.event.MouseEvent；
导入java.awt.event.MouseListener;

输入javax.swing.JButton；
导入javax.swing.JFrame；
导入javax.swing.JPanel；

公共类别 rerft {

	/**
	 * @参数参数
	 */
	公共静态void main（String [] args）{
		// TODO 自动生成的方法存根
        新的myDrawLine（）；
	}

}
类 myDrawLine 扩展 JFrame 实现 MouseListener
{   
	JPanel jp1 =new JPanel();
	JPanel jp2 =new JPanel();
	JButton jbtn1 =new JButton("红色");
	JButton jbtn2 =new JButton("绿色");
	JButton jbtn3 =new JButton("蓝色");
	整数x1，y1，x2，y2；
	叉烧；
	我的线条()
	{
		super("邵子洋的画线程序");
		设置尺寸（500,400）；
		设置位置（46​​​​​​0,200）；
		设置可见（真）；
		设置默认关闭操作（EXIT_ON_CLOSE）；
		jp2.设置布局（新的GridLayout（1,3,5,5））；
		jp2.添加（jbtn1）；
		jp2.添加（jbtn2）；
		jp2.添加（jbtn3）；
		添加（jp1）；
		添加（jp2，BorderLayout.SOUTH）；
		jbtn1.添加监听鼠标器（这个）；
		jbtn2.添加监听鼠标器（这个）；
		jbtn3.添加监听鼠标器（这个）；
		jp1.添加鼠标监听器（this）；
		jp2.添加鼠标监听器（this）；
		
	}
	@Override
	公共鼠标点击（鼠标事件 e）{
		// TODO 自动生成的方法存根
		如果（e.getSource（）==jbtn1）
		{
		  yanse='r';
		 
	}
		如果（e.getSource（）==jbtn2）
		{
		  yanse='G';
		
	}
		如果（e.getSource（）==jbtn3）
		{
		  yanse='B';
		
	}
	}
	
	@Override
	公共无效mouseEntered（MouseEvent e）{e）{
		// TODO 自动生成的方法存根// TODO 自动生成的方法存根
		如果（e.getSource（）==jbtn1）jbtn1）
		{
		jbtn1.设置前景（颜色.红色）；
		
	}}
		如果（e.getSource（）==jbtn2）jbtn2）
		{
		 jbtn2.设置前台（颜色.绿色）；
		 
		}}
		如果（e.getSource（）==jbtn3）jbtn3）
		{
		 jbtn3.设置前台（颜色.蓝色）；
	 }}
	}}
	@Override
	公共无效mouseExited（MouseEvent e）{e）{
		// TODO 自动生成的方法存根// TODO 自动生成的方法存根
		jbtn1.设置前台（颜色.黑色）；
		jbtn1.设置前台（颜色.黑色）；
		jbtn1.设置前台（颜色.黑色）；
	}}
	@Override
	公共鼠标鼠标（鼠标事件 e）{{
		// TODO 自动生成的方法存根// TODO 自动生成的方法存根
		x1=e.获取X()；X()；
		y1=e.获取Y();Y();
		//System.out.println(x1+","+y1);//System.out.println(x1+","+y1);
		
	}}
	@Override
	公共鼠标释放（鼠标事件 e）{{
		// TODO 自动生成的方法存根// TODO 自动生成的方法存根
		x2=e.获取X()；X()；
		y2=e.获取Y();Y();
		图形g = jp1.getGraphics();getGraphics();
		如果 (yanse=='r')(yanse=='r')
		{{
			g.设置颜色（颜色.红色）；
		
			g.设置颜色（颜色.绿色）；
		
			g.设置颜色（颜色.蓝色）；
		}}
		g.势弱线（x1，y1，x2，y2）；x2，y2）；
	}}
    }
