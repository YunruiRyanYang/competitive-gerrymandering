#include <iostream>
#include <vector>
using namespace std;

vector<vector<int>> pentomino_pieces(){
    return {{(0, 0), (1, 0), (2, 0), (3, 0), (4, 0)},
    {(0, 0), (1, 0), (2, 0), (3, 0), (3, 1)},
    {(0, 0), (0, 1), (1, 0), (2, 0), (3, 0)},
    {(0, 0), (0, 1), (0, 2), (1, 2), (0, 3)}, 
    {(0, 0), (0, 1), (1, 1), (0, 2), (0, 3)}, 
    {(0, 0), (0, 1), (1, 0), (0, 2), (2, 0)}, 
    {(0, 0), (1, 0), (2, 0), (1, 1), (2, 1)}, 
    {(0, 0), (1, 0), (2, 0), (0, 1), (1, 1)}, 
    {(0, 0), (0, 1), (0, 2), (0, 3), (0, 4)}, 
    {(0, 0), (1, 0), (0, 1), (0, 2), (0, 3)}, 
    {(0, 0), (0, 1), (0, 2), (0, 3), (1, 3)}, 
    {(0, 0), (1, 0), (0, 1), (0, 2), (1, 2)}, 
    {(0, 0), (0, 1), (0, 2), (1, 2), (0, 3)}, 
    {(0, 0), (0, 1), (0, 2), (-1, 2), (0, 3)}, 
    {(0, 0), (0, 1), (1, 1), (0, 2), (0, 3)}, 
    {(0, 0), (0, 1), (-1, 1), (0, 2), (0, 3)}, 
    {(0, 0), (1, 0), (2, 0), (3, 0), (2, -1)}, 
    {(0, 0), (1, 0), (1, -1), (2, 0), (3, 0)}, 
    {(0, 0), (1, 0), (0, 1), (1, 1), (0, 2)}, 
    {(0, 0), (1, 0), (0, 1), (1, 1), (1, 2)}, 
    {(0, 0), (0, 1), (1, 1), (2, 1), (2, 0)}, 
    {(0, 0), (1, 0), (1, 1), (1, 2), (0, 2)}, 
    {(0, 0), (1, 0), (1, 1), (2, 1), (2, 2)}, 
    {(0, 0), (1, 0), (0, 1), (-1, 1), (-1, 2)}, 
    {(0, 0), (0, 1), (1, 1), (1, 2), (2, 2)}, 
    {(0, 0), (0, 1), (-1, 1), (-1, 2), (-2, 2)}, 
    {(0, 0), (0, 1), (-1, 1), (0, 2), (1, 2)}, 
    {(0, 0), (0, 1), (1, 1), (0, 2), (-1, 2)}, 
    {(0, 0), (1, 0), (2, 0), (1, 1), (2, -1)}, 
    {(0, 0), (0, 1), (1, 1), (2, 1), (1, 2)}, 
    {(0, 0), (0, 1), (1, 1), (2, 1), (2, 2)}, 
    {(0, 0), (0, 1), (-1, 1), (-2, 1), (-2, 2)}, 
    {(0, 0), (1, 0), (2, 0), (2, 1), (2, -1)}, 
    {(0, 0), (0, 1), (0, 2), (1, 2), (2, 2)}, 
    {(0, 0), (0, 1), (0, 2), (-1, 2), (1, 2)}, 
    {(0, 0), (1, 0), (2, 0), (1, 1), (1, 2)}, 
    {(0, 0), (0, 1), (-1, 1), (1, 1), (1, 2)}, 
    {(0, 0), (0, 1), (1, 1), (1, 2), (1, 3)}, 
    {(0, 0), (0, 1), (-1, 1), (-1, 2), (-1, 3)}, 
    {(0, 0), (1, 0), (1, -1), (2, -1), (3, -1)}, 
    {(0, 0), (1, 0), (2, 0), (2, 1), (3, 1)}, 
    {(0, 0), (1, 0), (2, 0), (2, -1), (3, -1)}, 
    {(0, 0), (1, 0), (1, 1), (2, 1), (3, 1)}, 
    {(0, 0), (0, 1), (0, 2), (-1, 2), (-1, 3)}, 
    {(0, 0), (0, 1), (0, 2), (1, 2), (1, 3)}, 
    {(0, 0), (1, 0), (0, 1), (0, 2), (-1, 2)}, 
    {(0, 0), (1, 0), (1, 1), (1, 2), (2, 2)}, 
    {(0, 0), (1, 0), (1, 1), (2, 1), (1, 2)}, 
    {(0, 0), (1, 0), (0, 1), (0, 2), (-1, 1)}, 
    {(0, 0), (0, 1), (1, 0), (2, 0), (1, -1)}, 
    {(0, 0), (1, 0), (1, -1), (2, 0), (2, 1)}, 
    {(0, 0), (0, 1), (0, 2), (0, 3), (-1, 3)}, 
    {(0, 0), (1, 0), (1, 1), (1, 2), (1, 3)}, 
    {(0, 0), (0, 1), (1, 1), (2, 1), (3, 1)}, 
    {(0, 0), (1, 0), (2, 0), (3, 0), (3, -1)}, 
    {(0, 0), (1, 0), (2, 0), (-1, 0), (-1, 1)}, 
    {(0, 0), (1, 0), (2, 0), (1, -1), (2, -1)}, 
    {(0, 0), (0, 1), (1, 1), (0, 2), (1, 2)}, 
    {(0, 0), (0, 1), (-1, 1), (0, 2), (-1, 2)}, 
    {(0, 0), (0, 1), (0,2 ), (1, 2), (2, 2)}, 
    {(0, 0), (0, 1), (0, 2), (-1, 2), (-2, 2)}, 
    {(0, 0), (1, 0), (2, 0), (2, 1), (2, 2)}, 
    {(0, 0), (0, 1), (0, 2), (1, 0), (2, 0)}};
}
