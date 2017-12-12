package com.iterator.whitebox;

/*
 * 迭代子模式(Iterator)
 * 在不暴露集合内部结构的同时，可以让外部客户代码透明地访问其中包含的元素；同时这种“透明遍历”也为同一种
 * 算法在多种集合对象上进行操作提供了可能。
 * 迭代子模式有两种实现方式，分别是白箱聚集与外禀迭代子和黑箱聚集于内禀迭代子。
 * 
 * 白箱聚集与外禀迭代子
 * 如果一个聚集的接口提供了可以用来修改聚集元素的方法，这个接口就是所谓的宽接口。
 * 如果聚集对象为所有对象提供同一个接口，也就是宽接口的话，当然会满足迭代子模式对迭代子对象的要求。但是，
 * 这样会破坏对聚集对象的封装。这种提供宽接口的聚集叫做白箱聚集。
 * 由于聚集自己实现迭代逻辑，并向外部提供适当的接口，使得迭代子可以从外部控制聚集元素的迭代过程。由于迭代
 * 子是在聚集结构之外的，因此这样的迭代子又叫做外禀迭代子（Extrinsic Iterator）。
 * 
 * 实现
 * 一个白箱聚集向外界提供访问自己内部元素的接口，从而使外禀迭代子可以通过聚集的遍历方法实现迭代功能。
 * 因为迭代的逻辑是由聚集对象本身提供的，所以这样的外禀迭代子角色往往仅仅保持迭代的游标位置。
 * 
 * 角色
 * 抽象迭代子(Iterator)角色：此抽象角色定义出遍历元素所需的接口。
 * 具体迭代子(ConcreteIterator)角色：此角色实现了Iterator接口，并保持迭代过程中的游标位置。
 * 聚集(Aggregate)角色：此抽象角色给出创建迭代子(Iterator)对象的接口。
 * 具体聚集(ConcreteAggregate)角色：实现了创建迭代子(Iterator)对象的接口，返回一个合适的具体迭代子实例。
 * 客户端(Client)角色：持有对聚集及其迭代子对象的引用，调用迭代子对象的迭代接口，也有可能通过迭代子操作聚集元素的增加和删除。
 */

public interface Iterator {
	public void first();
	public void next();
	public boolean isDone();
	public Object currentItem();
}
