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
                pathData = parseSvgPathData("M8.008 14.001c-.005 .083-.007 .165-.007 .249 0 2.382 1.753 4.75 5 4.75 2.373 0 4.527-.655 6-1.553v3.351C17.212 21.564 15.113 22 13.001 22 7.499 22 5.001 18.53 5.001 14.25c0-3.231 2.041-6.001 4.943-7.164C8.54 8.663 8.001 10.341 8.001 10.995L18.001 11c0-3.406-2.548-6-6-6C7.001 5 4 8.988 3.001 10.999 3.291 6.237 7.01 2 12.001 2c5.2 0 9 4.029 9 9v3h-13l.007 .001Z"),
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
