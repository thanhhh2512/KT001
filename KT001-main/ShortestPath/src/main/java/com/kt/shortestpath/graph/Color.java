/***********************************************************************
 * Module:  Color.java
 * Author:  Entier
 * Purpose: Defines the Class Color
 ***********************************************************************/
package com.kt.shortestpath.graph;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Color {

   private int r;

   private int g;

   private int b;

   public void updateColor(int r, int g, int b) {
      this.r = r;
      this.g = g;
      this.b = b;
   }

   public void updateColor(Color color) {
      this.r = color.r;
      this.g = color.g;
      this.b = color.b;
   }

}