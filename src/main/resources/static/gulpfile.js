var gulp = require('gulp');
var watch = require('gulp-watch');
var webpack = require('webpack');
var webpackConfig = require('./webpack.config');

gulp.task('build', function(cb) {
    return webpack(webpackConfig, function(err, stats){
        cb();
    });
});

gulp.task('default', function(){
    gulp.watch("src/js/*.js",['build']);
})
