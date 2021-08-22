#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

typedef struct
{
    int x, y;
    int w, h;
    int l;
    int e;
} 

Poligono;

void print (Poligono* p){
	if (p->e==0)
	{
	printf(
		"Tamanho (%d,%d) / Pos (%d, %d) / Numero de Lados (%d) / Poligono Regular\n",
		p->w, p->h, p->x, p->y, p->l
	);
	}
	if (p->e==1)
	{
		printf(
		"Tamanho (%d,%d) / Pos (%d, %d) / Numero de Lados (%d) / Poligono Estrela\n",
		p->w, p->h, p->x, p->y, p->l
	);	
	}
}

int main (){
	Poligono p1 = {2,2, 25,25, 10, 1};
	Poligono p2 = {1,1,15,15,5,0};
	print(&p1);
	print(&p2);
	return 0;
}
