/***********************************************************************
 * Module:  Vert.java
 * Author:  Entier
 * Purpose: Defines the Class Vert
 ***********************************************************************/
package com.kt.shortestpath.graph;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Vert {

   private String label;

   private boolean visited;

   public Position position;

   public Color color;

}