/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Object;

/**
 *
 * @author lln
 */
public class GroupFactory extends AbstractGroupFactory {

    private static GroupFactory groupFactory;

    private GroupFactory() {
        if (groupFactory != null) {
            throw new IllegalStateException();
        }
    }

    public static synchronized GroupFactory getInstance() {
        if (groupFactory == null) {
            groupFactory = new GroupFactory();
        }
        return groupFactory;
    }

    @Override
    public Group getObject() {
        return new Group();
    }

    @Override
    public Group getObject(int groupID, int size, int classID) {
        return new Group(groupID, size, classID);
    }

}
