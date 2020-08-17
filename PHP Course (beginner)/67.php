<?php

namespace HexletBasics\Loops\Mutators;

// BEGIN
function filterString($str, $symbol)
{
    return str_replace($symbol, '', $str);
}
// END
