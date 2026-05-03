package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bath: ImageVector
    get() {
        if (_bath != null) return _bath!!
        _bath = tablerFilledIcon(
            name = "Bath",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 2.000 C 11.507 2.000 11.934 2.380 11.993 2.883 L 12.000 3.000 L 12.000 5.250 C 11.999 5.779 11.587 6.216 11.059 6.247 C 10.530 6.278 10.069 5.892 10.007 5.367 L 10.000 5.250 L 10.000 4.000 L 8.000 4.000 C 7.493 4.000 7.066 4.380 7.007 4.883 L 7.000 5.000 L 7.000 11.000 L 20.000 11.000 C 21.047 11.000 21.917 11.806 21.995 12.850 L 22.000 13.000 L 22.000 16.000 C 22.000 17.475 21.362 18.800 20.346 19.715 L 20.832 20.445 C 21.128 20.886 21.028 21.481 20.604 21.801 C 20.181 22.121 19.581 22.054 19.238 21.648 L 19.168 21.555 L 18.618 20.732 C 18.186 20.879 17.736 20.967 17.281 20.992 L 17.000 21.000 L 7.000 21.000 C 6.449 21.001 5.902 20.910 5.381 20.732 L 4.832 21.555 C 4.538 21.996 3.952 22.132 3.494 21.864 C 3.037 21.596 2.868 21.018 3.109 20.546 L 3.168 20.446 L 3.654 19.716 C 2.667 18.829 2.074 17.585 2.007 16.259 L 2.000 16.000 L 2.000 13.000 C 2.000 11.953 2.806 11.083 3.850 11.005 L 4.000 11.000 L 5.000 11.000 L 5.000 5.000 C 5.000 3.411 6.238 2.098 7.824 2.005 L 8.000 2.000 L 11.000 2.000 Z"),
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
        return _bath!!
    }

private var _bath: ImageVector? = null
