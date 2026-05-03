package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileScissors: ImageVector
    get() {
        if (_fileScissors != null) return _fileScissors!!
        _fileScissors = tablerFilledIcon(
            name = "FileScissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 9.707 11.293 C 9.456 11.033 9.084 10.929 8.734 11.020 C 8.385 11.112 8.112 11.385 8.020 11.734 C 7.929 12.084 8.033 12.456 8.293 12.707 L 10.585 15.000 L 9.517 16.067 C 8.942 15.914 8.328 16.025 7.842 16.370 C 7.357 16.714 7.050 17.257 7.005 17.851 L 7.000 18.000 C 7.001 18.776 7.451 19.482 8.155 19.810 C 8.859 20.138 9.689 20.029 10.284 19.531 C 10.879 19.032 11.132 18.234 10.933 17.484 L 12.000 16.415 L 13.067 17.483 C 13.035 17.603 13.014 17.727 13.005 17.851 L 13.000 18.000 C 13.000 18.857 13.546 19.618 14.357 19.893 C 15.168 20.168 16.065 19.897 16.586 19.217 C 17.108 18.538 17.139 17.602 16.664 16.889 C 16.188 16.177 15.312 15.846 14.484 16.067 L 13.415 15.000 L 15.707 12.707 C 16.086 12.315 16.081 11.691 15.695 11.305 C 15.309 10.919 14.685 10.914 14.293 11.293 L 12.000 13.585 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 19.000 7.000 L 15.000 7.000 L 14.999 2.999 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _fileScissors!!
    }

private var _fileScissors: ImageVector? = null
