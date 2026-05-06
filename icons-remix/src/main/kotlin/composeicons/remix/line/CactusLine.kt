package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CactusLine: ImageVector
    get() {
        if (_cactusLine != null) return _cactusLine!!
        _cactusLine = remixIcon(
            name = "CactusLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.998 2c2.209 0 4 1.791 4 4v9h1c.55 0 1-.45 1-1v-6c0-.552 .448-1 1-1 .552 0 1 .448 1 1v6c0 1.66-1.34 3-3 3h-1v3h2v2h-12v-2h2v-6h-1C5.341 14 3.998 12.657 3.998 11v-2c0-.552 .448-1 1-1 .552 0 1 .448 1 1v2c0 .55 .45 1 1 1h1v-6c0-2.209 1.791-4 4-4ZM11.998 4C10.894 4 9.998 4.895 9.998 6v14h4v-14c0-1.105-.895-2-2-2Z"),
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
        return _cactusLine!!
    }

private var _cactusLine: ImageVector? = null
