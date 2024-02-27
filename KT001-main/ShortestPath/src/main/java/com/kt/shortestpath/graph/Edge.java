/***********************************************************************
 * Module:  Edge.java
 * Author:  Entier
 * Purpose: Defines the Class Edge
 ***********************************************************************/
package com.kt.shortestpath.graph;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Edge {

   private double weight;

   public Vert endVert;

   public Vert beginVert;

   public Color color;
   


}