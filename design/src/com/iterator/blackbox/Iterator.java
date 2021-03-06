package com.iterator.blackbox;
/*
 * 黑箱聚集与内禀迭代子
 * 同时保证聚集对象的封装和迭代子功能的实现的方案。
 * 由于迭代子是聚集的内部类，迭代子可以自由访问聚集的元素，所以迭代子可以自行实现迭代功能并控制对聚集元素的迭代逻辑。
 * 
 */
public interface Iterator {
	public void first();
	public void next();
	public boolean isDone();
	public Object currentItem();
}
/*
 * 迭代子模式优点
 * 迭代子模式简化了聚集的接口。迭代子具备了一个遍历接口，这样聚集的接口就不必具备遍历接口；
 * 每一个聚集对象都可以有一个或多个迭代子对象，每一个迭代子的迭代状态可以是彼此独立的。因此，一个聚集对象可以同时
 *     有几个迭代在进行之中；
 * 由于遍历算法被封装在迭代子角色里面，因此迭代的算法可以独立于聚集角色变化。
 * 
 * 
 * 
 * 
 *
 */