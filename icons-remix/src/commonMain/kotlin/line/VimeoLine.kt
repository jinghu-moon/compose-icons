package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VimeoLine: ImageVector
    get() {
        if (_vimeoLine != null) return _vimeoLine!!
        _vimeoLine = remixIcon(
            name = "VimeoLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.994 3.004 C 20.427 3.004 21.999 4.516 21.999 7.500 C 21.999 9.220 21.001 11.440 20.167 12.735 C 17.378 17.068 13.934 21.475 10.524 21.475 C 6.818 21.475 5.855 14.644 5.432 13.043 C 5.010 11.442 4.899 10.834 4.262 9.810 C 3.945 10.029 3.501 10.339 2.932 10.739 C 2.708 10.897 2.400 10.845 2.239 10.623 L 0.926 8.807 C 0.790 8.620 0.801 8.363 0.953 8.188 C 3.780 4.914 6.129 3.278 8.001 3.278 C 10.393 3.278 11.125 6.093 11.325 7.500 C 11.625 9.617 12.016 12.238 12.570 13.372 C 13.126 12.580 14.750 10.484 14.536 9.381 C 14.442 8.895 13.219 9.565 12.649 9.460 C 12.224 9.381 11.844 9.058 11.844 8.434 C 11.844 7.124 13.695 3.004 17.994 3.004 ZM 18.001 5.004 C 15.807 5.004 14.750 6.537 14.348 7.212 C 15.598 7.258 16.317 8.030 16.482 9.015 C 16.870 11.344 14.565 13.936 14.142 14.580 C 13.747 15.183 11.081 17.908 9.892 11.220 C 9.780 10.591 9.525 9.057 9.227 7.034 C 9.057 5.883 8.355 5.271 7.998 5.271 C 7.155 5.271 6.077 5.920 4.142 7.786 C 6.047 7.671 6.687 10.062 7.059 11.419 C 7.874 14.403 8.629 19.475 10.679 19.475 C 12.405 19.475 15.117 16.829 18.048 12.436 C 18.257 12.123 20.014 9.411 20.014 7.399 C 20.014 5.004 18.545 5.004 18.001 5.004 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _vimeoLine!!
    }

private var _vimeoLine: ImageVector? = null
