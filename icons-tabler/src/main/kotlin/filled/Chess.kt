package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Chess: ImageVector
    get() {
        if (_chess != null) return _chess!!
        _chess = tablerFilledIcon(
            name = "Chess",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 14.209 2.000 16.000 3.791 16.000 6.000 C 15.993 6.690 15.844 7.371 15.562 8.001 L 16.000 8.000 C 16.529 8.001 16.966 8.413 16.997 8.941 C 17.028 9.470 16.642 9.931 16.117 9.993 L 16.000 10.000 L 14.737 10.000 L 15.977 15.790 C 16.092 16.322 15.760 16.849 15.230 16.974 L 15.117 16.994 L 15.000 17.000 L 9.000 17.000 C 8.719 17.000 8.450 16.882 8.261 16.674 C 8.071 16.466 7.978 16.187 8.004 15.907 L 8.022 15.790 L 9.262 10.000 L 8.000 10.000 C 7.471 9.999 7.034 9.587 7.003 9.059 C 6.972 8.530 7.358 8.069 7.883 8.007 L 8.000 8.000 L 8.438 8.000 C 8.223 7.516 8.084 7.001 8.026 6.475 L 8.006 6.216 L 8.000 6.000 C 8.000 3.791 9.791 2.000 12.000 2.000 Z"),
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
        pathData = parseSvgPathData("M 18.000 18.000 L 6.000 18.000 C 5.448 18.000 5.000 18.448 5.000 19.000 C 5.000 20.105 5.895 21.000 7.000 21.000 L 17.000 21.000 C 18.015 21.000 18.869 20.240 18.987 19.232 L 18.998 19.058 C 19.014 18.783 18.916 18.514 18.727 18.314 C 18.538 18.114 18.275 18.000 18.000 18.000 Z"),
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
        return _chess!!
    }

private var _chess: ImageVector? = null
