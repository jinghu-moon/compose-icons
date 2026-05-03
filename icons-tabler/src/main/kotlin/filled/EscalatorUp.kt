package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = tablerFilledIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.500 6.000 C 21.433 6.000 23.000 7.567 23.000 9.500 C 23.000 11.433 21.433 13.000 19.500 13.000 L 18.414 13.000 L 10.294 21.121 C 9.780 21.635 9.096 21.945 8.370 21.993 L 8.172 22.000 L 4.500 22.000 C 2.567 22.000 1.000 20.433 1.000 18.500 C 1.000 16.567 2.567 15.000 4.500 15.000 L 6.584 15.000 L 14.707 6.879 C 15.221 6.365 15.905 6.055 16.630 6.007 L 16.828 6.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 19.500 8.000 L 16.828 8.000 C 16.563 8.000 16.308 8.105 16.121 8.293 L 7.707 16.707 C 7.520 16.895 7.265 17.000 7.000 17.000 L 4.500 17.000 C 3.672 17.000 3.000 17.672 3.000 18.500 C 3.000 19.328 3.672 20.000 4.500 20.000 L 8.172 20.000 C 8.437 20.000 8.692 19.895 8.879 19.707 L 17.293 11.293 C 17.480 11.105 17.735 11.000 18.000 11.000 L 19.500 11.000 C 20.328 11.000 21.000 10.328 21.000 9.500 C 21.000 8.672 20.328 8.000 19.500 8.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 5.852 2.011 L 5.910 2.004 L 6.000 2.000 L 6.075 2.003 L 6.201 2.020 L 6.312 2.050 L 6.423 2.094 L 6.521 2.146 L 6.625 2.220 L 6.707 2.293 L 9.707 5.293 C 9.967 5.544 10.071 5.916 9.980 6.266 C 9.888 6.615 9.615 6.888 9.266 6.980 C 8.916 7.071 8.544 6.967 8.293 6.707 L 7.000 5.415 L 7.000 10.000 C 7.000 10.552 6.552 11.000 6.000 11.000 C 5.448 11.000 5.000 10.552 5.000 10.000 L 5.000 5.415 L 3.707 6.707 C 3.351 7.063 2.785 7.099 2.387 6.790 L 2.293 6.707 C 1.903 6.317 1.903 5.683 2.293 5.293 L 5.293 2.293 Q 5.346 2.239 5.405 2.196 L 5.515 2.125 L 5.629 2.071 L 5.734 2.036 Z"),
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
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
