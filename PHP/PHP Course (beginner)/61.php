<?php

namespace HexletBasics\Loops\WhileLoop;

function printNumbers($firstNumber)
{ 
    while($firstNumber > 0) {
        print_r($firstNumber . "\n");
        $firstNumber -= 1;
    }
    
    print_r('finished!');
}
