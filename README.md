# clojurescript-test

This repo is a demonstration of testing in ClojureScript. It uses
`cljs.test` (standard with ClojureScript),
[Doo](https://github.com/bensu/doo), and
[Karma](http://karma-runner.github.io/).

Code to accompany the
[ClojureScript testing article](http://www.lispcast.com/testing-clojurescript)
on [LispCast.com](http://www.lispcast.com/).

## Overview

`cljs-src/lab_notebook/core.cljs` contains some code that we're going
to test. One function (`delete`) is a pure function. The other
(`ajax-get`) is an asynchronous effect.

`cljs-test/lab_notebook/core_test.cljs` contains two tests, one test
for each function in core.

`cljs-test/lab_notebook/browser.cljs` is the test runner which tells
Doo which tests to run when you want to run the browser test. You can
set up other, similar tests for when you want to run in PhantomJS,
Node, etc.

in `project.clj`, there is a ClojureScript build called
`:browser-test` which tells Doo what source files are involved and
points directly to the browser test file we defined as the `:main`
file.

## Setup

Within this directory, run this command to install
[Karma](http://karma-runner.github.io/). You can edit it to customize
the
[launchers](https://karma-runner.github.io/latest/config/browsers.html)
you want:

```bash
> npm install karma karma-chrome-launcher karma-safari-launcher karma-cljs-test --save-dev
```

## Running

Within this directory, let's run the tests (using an auto-tester):

```bash
> lein doo chrome browser-test
```

Touch/resave one of the files under test and watch it run the
tests. Every time you save, the tests will run.

## License

[![CC0](http://i.creativecommons.org/p/zero/1.0/88x31.png)](http://creativecommons.org/publicdomain/zero/1.0/)

To the extent possible under law, the person who associated CC0 with
this work has waived all copyright and related or neighboring rights
to the code in this repository.

See the `LICENSE` file for more information.
