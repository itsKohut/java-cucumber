#
# Copyright (C) 2021, Gherkin By Example and/or its contributors. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
# 
# This software is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# This code is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this code.  If not, see <https://www.gnu.org/licenses/>.
#	
# Please visit Gherkin By Example at https://github.com/gherkin-by-example 
# if you need additional information or have any questions.
@domain
Feature: GreaterNumber

Narrative:

In order to avoid silly mistakes
As a math novice
I want to be told the greater number between three numbers

Scenario Outline: calculate average of three numbers

  Given first number is <a>
  And second number is <b>
  And third number is <c>
  When GreaterNumber is calculated
  Then result should be <greaterNumber>

Examples:
|  a |  b |  c  | greaterNumber |
| 1 | 2 | 3 | 3 |
| 3 | 4 | 5 | 5 |
| -1 | -2 | -3 | -1 |