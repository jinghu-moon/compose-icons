package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ghost2: ImageVector
    get() {
        if (_ghost2 != null) return _ghost2!!
        _ghost2 = tablerFilledIcon(
            name = "Ghost2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.999 L 12.041 2.001 L 12.249 2.004 C 16.472 2.136 19.864 5.528 19.996 9.751 L 19.999 9.999 L 20.176 10.005 C 21.694 10.094 22.906 11.306 22.995 12.824 L 23.000 13.000 C 23.000 14.657 21.657 16.000 20.000 16.000 L 19.999 17.696 L 21.832 20.446 C 22.025 20.736 22.053 21.106 21.906 21.422 C 21.759 21.738 21.458 21.955 21.112 21.994 L 21.000 22.000 L 11.000 22.000 C 7.555 22.002 4.673 19.510 4.099 16.176 L 4.071 15.998 L 4.000 15.999 C 2.411 15.999 1.098 14.761 1.005 13.175 L 1.000 13.000 C 1.000 11.343 2.343 10.000 4.000 10.000 L 4.004 9.750 C 4.139 5.431 7.679 2.000 12.000 2.000 ZM 12.000 12.000 C 10.895 12.000 10.000 12.895 10.000 14.000 C 10.000 14.552 10.448 15.000 11.000 15.000 L 13.000 15.000 C 13.552 15.000 14.000 14.552 14.000 14.000 C 14.000 12.895 13.105 12.000 12.000 12.000 ZM 10.010 8.000 L 9.883 8.007 C 9.358 8.069 8.972 8.530 9.003 9.059 C 9.034 9.587 9.471 9.999 10.000 10.000 L 10.127 9.993 C 10.652 9.931 11.038 9.470 11.007 8.941 C 10.976 8.413 10.539 8.001 10.010 8.000 ZM 14.010 8.000 L 13.883 8.007 C 13.358 8.069 12.972 8.530 13.003 9.059 C 13.034 9.587 13.471 9.999 14.000 10.000 L 14.127 9.993 C 14.652 9.931 15.038 9.470 15.007 8.941 C 14.976 8.413 14.539 8.001 14.010 8.000 Z"),
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
        return _ghost2!!
    }

private var _ghost2: ImageVector? = null
