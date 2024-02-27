/***********************************************************************
 * Module:  Graph.java
 * Author:  Entier
 * Purpose: Defines the Class Graph
 ***********************************************************************/
package com.kt.shortestpath.graph;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Graph {
   public java.util.List<Edge> edge;
   public java.util.List<Vert> vert;

   public void sortestPathFrom() {
      // TODO: implement
   }

   public double sortestPathTo() {
      // TODO: implement
      return 0;
   }

   public void dfs() {
      // TODO: implement
   }

   public int connectivity() {
      // TODO: implement
      return 0;
   }



   public void addEdge(Edge newEdge) {
      if (newEdge == null)
         return;
      if (this.edge == null)
         this.edge = new java.util.Vector<Edge>();
      if (!this.edge.contains(newEdge))
         this.edge.add(newEdge);
   }

   public void removeEdge(Edge oldEdge) {
      if (oldEdge == null)
         return;
      if (this.edge != null)
         if (this.edge.contains(oldEdge))
            this.edge.remove(oldEdge);
   }

   public void removeAllEdge() {
      if (edge != null)
         edge.clear();
   }
   

   public void addVert(Vert newVert) {
      if (newVert == null)
         return;
      if (this.vert == null)
         this.vert = new java.util.Vector<Vert>();
      if (!this.vert.contains(newVert))
         this.vert.add(newVert);
   }

   public void removeVert(Vert oldVert) {
      if (oldVert == null)
         return;
      if (this.vert != null)
         if (this.vert.contains(oldVert))
            this.vert.remove(oldVert);
   }

   public void removeAllVert() {
      if (vert != null)
         vert.clear();
   }

}