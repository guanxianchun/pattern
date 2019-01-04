package com.martin.pattern.struct.observer;

import com.martin.pattern.struct.observer.mouse.IMouse;
import com.martin.pattern.struct.observer.mouse.MouseCallback;
import com.martin.pattern.struct.observer.mouse.MouseEventType;
import com.martin.pattern.struct.observer.mouse.impl.Mouse;
import com.martin.pattern.struct.observer.subject.ISubject;
import com.martin.pattern.struct.observer.subject.Observer;
import com.martin.pattern.struct.observer.subject.SubjectEventType;
import com.martin.pattern.struct.observer.subject.impl.SubJect;

/**
 * 观察者模式测试类
 * 
 * @author 管贤春
 * @时间 2019年1月2日 下午1:23:37
 * @Email psyche19830113@163.com
 * @Description
 */

public class ObserverTest {

	public static void main(String[] args) throws Exception {
		// 观察者
		Observer observer = new Observer();

		// 事件源对象
		// SubJect subJect = new SubJect();
		// 改成由容器创建对象
		ISubject subJect = (ISubject) new BeanFactory().getBean(SubJect.class);
		// 添加事件监听器
		subJect.addListener(SubjectEventType.ON_ADD, observer, "advice");
		subJect.addListener(SubjectEventType.ON_QUERY, observer, "advice");
		subJect.addListener(SubjectEventType.ON_REMOVE, observer, "advice");
		subJect.addListener(SubjectEventType.ON_UPDATE, observer, "advice");
		// 在事件源上执行相应的操作
		subJect.add();
		subJect.remove();
		subJect.query();
		subJect.update();

		testMouse();
	}

	public static void testMouse() throws Exception {
		// 创建回调对象及回调方法
		MouseCallback target = new MouseCallback();
		//
		// Mouse mouse = new Mouse();
		// 换成从容器中获取对象
		IMouse mouse = (IMouse) new BeanFactory().getBean(Mouse.class);
		mouse.addListener(MouseEventType.ON_CLICKED, target, "onClick");
		mouse.click();
		//没有添加事件，则不会输出事件触发打印日志
		mouse.release();
	}
}
