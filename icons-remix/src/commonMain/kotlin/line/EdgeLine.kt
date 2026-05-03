package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EdgeLine: ImageVector
    get() {
        if (_edgeLine != null) return _edgeLine!!
        _edgeLine = remixIcon(
            name = "EdgeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.008 14.001 C 8.003 14.084 8.001 14.167 8.001 14.250 C 8.001 16.632 9.754 19.000 13.001 19.000 C 15.374 19.000 17.528 18.345 19.001 17.447 L 19.001 20.797 C 17.212 21.564 15.113 22.000 13.001 22.000 C 7.499 22.000 5.001 18.530 5.001 14.250 C 5.001 11.019 7.042 8.249 9.944 7.086 C 8.540 8.663 8.001 10.341 8.001 10.995 L 18.001 11.000 C 18.001 7.594 15.453 5.000 12.001 5.000 C 7.001 5.000 4.000 8.988 3.001 10.999 C 3.291 6.237 7.010 2.000 12.001 2.000 C 17.201 2.000 21.001 6.029 21.001 11.000 L 21.001 14.000 L 8.001 14.000 L 8.008 14.001 Z"),
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
        return _edgeLine!!
    }

private var _edgeLine: ImageVector? = null
