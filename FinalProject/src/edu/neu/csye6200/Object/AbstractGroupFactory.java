/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.Object;


public abstract class AbstractGroupFactory {

    public abstract Group getObject();

    public abstract AbstractGroup getObject(int groupID, int size, int classID);
}
