package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShiningLine: ImageVector
    get() {
        if (_shiningLine != null) return _shiningLine!!
        _shiningLine = remixIcon(
            name = "ShiningLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1 11C6.523 11 11 6.523 11 1h2c0 5.523 4.477 10 10 10v2C17.477 13 13 17.477 13 23h-2C11 17.477 6.523 13 1 13v-2ZM5.803 12c2.766 1.209 4.987 3.431 6.197 6.197C13.209 15.431 15.431 13.209 18.197 12 15.431 10.791 13.209 8.569 12 5.803 10.791 8.569 8.569 10.791 5.803 12Z"),
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
        return _shiningLine!!
    }

private var _shiningLine: ImageVector? = null
