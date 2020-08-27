<?php

namespace HexletBasics\Loops\ReverseString;

// BEGIN
function mysubstr($str, $wordCount) 
{
    $i = 0;
    $newStr = '';

    while($i <= $wordCount - 1) {
        $newStr .= $str[$i];
        $i += 1;
    }

    return $newStr;
}
// END
