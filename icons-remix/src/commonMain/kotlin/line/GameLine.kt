package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GameLine: ImageVector
    get() {
        if (_gameLine != null) return _gameLine!!
        _gameLine = remixIcon(
            name = "GameLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 15.122 2.000 17.909 3.430 19.743 5.671 L 13.414 12.000 L 19.743 18.329 C 17.909 20.570 15.122 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 13.723 20.000 15.355 19.453 16.697 18.477 L 16.905 18.320 L 10.586 12.000 L 16.905 5.679 L 16.697 5.523 C 15.434 4.604 13.914 4.066 12.303 4.006 L 12.000 4.000 ZM 12.000 5.000 C 12.828 5.000 13.500 5.672 13.500 6.500 C 13.500 7.328 12.828 8.000 12.000 8.000 C 11.172 8.000 10.500 7.328 10.500 6.500 C 10.500 5.672 11.172 5.000 12.000 5.000 Z"),
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
        return _gameLine!!
    }

private var _gameLine: ImageVector? = null
