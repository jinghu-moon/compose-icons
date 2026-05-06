package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RainyLine: ImageVector
    get() {
        if (_rainyLine != null) return _rainyLine!!
        _rainyLine = remixIcon(
            name = "RainyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 18v-2h1c2.209 0 4-1.791 4-4C21 9.791 19.209 8 17 8c-.794 0-1.535 .232-2.157 .631C14.224 5.977 11.843 4 9 4 5.686 4 3 6.686 3 10c0 2.973 2.162 5.441 5 5.917v2.021C4.054 17.446 1 14.08 1 10 1 5.582 4.582 2 9 2c2.997 0 5.609 1.648 6.979 4.087C16.311 6.03 16.652 6 17 6c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-1ZM10.232 18.732 12 16.965l1.768 1.768c.976 .976 .976 2.559 0 3.536-.976 .976-2.559 .976-3.536 0-.976-.976-.976-2.559 0-3.536Z"),
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
        return _rainyLine!!
    }

private var _rainyLine: ImageVector? = null
