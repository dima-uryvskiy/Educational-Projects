<?php


class ExampleTest extends PHPUnit_Framework_TestCase
{
    private $calculator;

    protected function setUp()
    {
        $this->calculator = new ExampleTest();
    }

    protected function tearDown()
    {
        $this->calculator = NULL;
    }

    public function testAdd()
    {
        $result = $this->calculator->add(1, 2);
        $this->assertEquals(3, $result);
    }

}
