package com.javatpoint;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Test extends ActionSupport {
    private LinkedList linkedList = new LinkedList<>();

    @Override
    public String execute() throws Exception {
        Integer i = 10;
        String name = "Arun Joshla";

        ValueStack valueStack = ActionContext.getContext().getValueStack();
        linkedList.add(valueStack.peek());
        Map<String,String> map = new TreeMap();
        map.put("one","Number 1");
        map.put("two","Number 2");
        valueStack.push(map);
        linkedList.add(String.valueOf(valueStack.size()));
//        linkedList.add((String) valueStack.peek());
//        while (valueStack.size()!=0){
//            linkedList.add((String) valueStack.pop());
//        }
        linkedList.add("Dragon");
        linkedList.add("Poovizhili");
        linkedList.add("Sai");
        System.out.println(linkedList);
        return SUCCESS;
    }

    public LinkedList<String> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<String> linkedList) {
        this.linkedList = linkedList;
    }
}
