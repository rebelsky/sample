package edu.grinnell.rebelsky.sample;

import java.io.PrintWriter;

public class Main
{

  public static void main(String[] args)
  {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.println("Hello, Smaple");
    pen.close();
  } // main

} // class Main
