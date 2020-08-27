<?php

namespace HexletBasics\Logic\TernaryOperator;

// BEGIN
function convertString($str) 
{
    return $str[0] == strtoupper($str[0]) ? $str : strrev($str);
}
// END
