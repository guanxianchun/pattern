package com.martin.pattern.struct.observer;

import java.lang.reflect.Method;

import com.martin.pattern.struct.observer.core.Event;
import com.martin.pattern.struct.observer.mouse.Mouse;
import com.martin.pattern.struct.observer.mouse.MouseCallback;
import com.martin.pattern.struct.observer.mouse.MouseEventType;
import com.martin.pattern.struct.observer.subject.EventType;
import com.martin.pattern.struct.observer.subject.Observer;
import com.martin.pattern.struct.observer.subject.SubJect;

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
		//观察者
		Observer observer = new Observer();
		Method callback = observer.getClass().getDeclaredMethod("advice", new Class<?>[]{Event.class});
		
		//事件源对象
		SubJect subJect = new SubJect();
		//添加事件监听器
		subJect.addListener(EventType.ON_ADD, observer, callback);
		subJect.addListener(EventType.ON_QUERY, observer, callback);
		subJect.addListener(EventType.ON_REMOVE, observer, callback);
		subJect.addListener(EventType.ON_UPDATE, observer, callback);
		//在事件源上执行相应的操作
		subJect.add();
		subJect.remove();
		subJect.query();
		subJect.update();
		
		testMouse();
	}
	
	public static void testMouse() throws Exception {
		//创建回调对象及回调方法
		MouseCallback target = new MouseCallback();
		Method callback = MouseCallback.class.getDeclaredMethod("onClick", new Class<?>[]{Event.class});
		
		Mouse mouse = new Mouse();
		mouse.addListener(MouseEventType.ON_CLICK, target, callback);
		mouse.click();
	}
}
