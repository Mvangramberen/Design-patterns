/**
 * Created by Mickaël on 30/08/2017.
 */

function Sorter(algorithm, arr) {

   // Constructor
    this.algorithm = algorithm;
    this.arr = arr;

    // Setter voor sorteer algorithme
    this.setSort = function(newAlgorithm){
        this.algorithm = newAlgorithm;
    };

    // Sorteer algorithme aanspreken, STRATEGY PATTERN!
    this.sort = function() {
        return this.algorithm(this.arr);
    };
};

// Normale Bubbelsort
var bubbleStrategy = function(list){

    var comparisons = 0,
        swaps = 0,
        endIndex = 0,
        len = list.length - 1,
        hasSwap = true;

    for (var i = 0; i < len; i++) {

        hasSwap = false;

        for (var j = 0, swapping, endIndex = len - i; j < endIndex; j++) {
            comparisons++;

            if (list[j] > list[j + 1]) {

                swapping = list[j];

                list[j] = list[j + 1];
                list[j + 1] = swapping;

                swaps++;
                hasSwap = true;
            };
        };

        if (!hasSwap) {
            break;
        }
    }
    return list;
};

var noStrategy = function(list){
    return null;
};

//var arr = ["b", "a", "z", "c", "d", "x", "e"];
var arr = [12, 2, 7, 99, 101, 1, 3];
var bubbleSorter = new Sorter(bubbleStrategy, arr);
console.log(bubbleSorter.sort());

bubbleSorter.setSort(noStrategy);
console.log(bubbleSorter.sort());

