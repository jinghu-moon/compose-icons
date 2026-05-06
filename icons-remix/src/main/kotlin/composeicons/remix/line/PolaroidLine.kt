package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PolaroidLine: ImageVector
    get() {
        if (_polaroidLine != null) return _polaroidLine!!
        _polaroidLine = remixIcon(
            name = "PolaroidLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 6h-2v-1h-14v14h14v-1h2v2c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v2ZM6 6h2v3h-2v-3ZM15 16c2.209 0 4-1.791 4-4C19 9.791 17.209 8 15 8c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM15 18C11.686 18 9 15.314 9 12 9 8.686 11.686 6 15 6c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM15 14c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _polaroidLine!!
    }

private var _polaroidLine: ImageVector? = null
