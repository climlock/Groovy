package com.mishanya.lessonString

/**
 *  " "
 *  ' '
 *  """ """
 *  ''' '''
 *  / /
 *  $/ /$
 *
 */

//def name = "Ivan\"\"''"

def name = "Ivan"
def value = 'Hello "Hi!"'

def stringValue = "Hello $name"
println(stringValue)

def value2 = """
    SELECT *
    FROM
    table where name = ${getWithPrefix(name)}
"""
println value2

def value3 = '''
    SELECT *
    FROM
    table where name = $name
'''
println value3

def value4 = /Hello world $name/
println value4
def value5 = $/Hello world $name/$
println value5

println name[2]
println name[-1]
println name[1..2]

def getWithPrefix(String name) {
    "prefix-" + name
}