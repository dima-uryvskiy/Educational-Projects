<?php

namespace HexletBasics\Conditionals\IfElse;

// BEGIN
function normalizeUrl($url)
{
    if (strpos($url, 'http://') !== false) {
        return 'https://' . substr($url, 7);
    } else {
        return 'https://' . $url;
    }
}
// END
