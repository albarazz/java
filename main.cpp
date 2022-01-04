/*
 * Soluzioni della verifica 2G
 * 
 * 
 */

/* 
 * File:   main.cpp
 * Author: alessandrobarazzuol
 *
 * Created on 30 novembre 2021, 20:42
 */

#include <iostream>

using namespace std;

int main()
{
/*inizializzo la rand()*/   
srand(time(0));
 
/*dichiaro variabili e costanti*/
const int SIZE=10;
int numeri[SIZE];
int somma=0;
bool primo=true;



/*valorizzo, visualizzo e sommo*/
for(int i=0;i<SIZE;i++)
{
numeri[i]=rand()%26+5;/*questo mi genera numeri 10 numeri casuali dal 5 al 30 */
cout<<numeri[i]<<" ";
somma+=numeri[i];
}



/*verifico se la somma è un numero primo*/
/*provo da due a somma esclusa e se trovo anche un solo divisore, somma non è primo*/
for(int i=2;i<somma;i++)
{
 
           if(somma%i==0)
           {
            primo =false;
            i=somma;
           }
      
}

cout<<"\n"<<somma<<endl;

if(primo==true)
cout<<"\nLa somma è un numero primo\n";

cout<<"\nLa media è "<< (float)somma/SIZE<<endl;

}