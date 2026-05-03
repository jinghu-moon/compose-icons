package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = tablerFilledIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 5.000 C 4.000 4.731 4.108 4.474 4.300 4.286 C 6.562 2.069 10.158 1.992 12.513 4.110 L 12.864 4.438 C 14.373 5.760 16.627 5.760 18.136 4.438 L 18.385 4.211 C 18.995 3.728 19.912 4.114 19.995 4.887 L 20.000 5.000 L 20.000 14.000 C 20.000 14.269 19.892 14.526 19.700 14.714 C 17.438 16.931 13.842 17.008 11.487 14.890 L 11.136 14.562 C 9.678 13.284 7.513 13.236 6.000 14.448 L 6.000 21.000 C 5.999 21.529 5.587 21.966 5.059 21.997 C 4.530 22.028 4.069 21.642 4.007 21.117 L 4.000 21.000 L 4.000 5.000 Z"),
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
        return _flag!!
    }

private var _flag: ImageVector? = null
