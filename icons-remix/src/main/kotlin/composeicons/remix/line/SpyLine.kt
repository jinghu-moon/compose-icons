package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpyLine: ImageVector
    get() {
        if (_spyLine != null) return _spyLine!!
        _spyLine = remixIcon(
            name = "SpyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 13c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4h-2c0 2.209-1.791 4-4 4C4.791 21 3 19.209 3 17 3 14.791 4.791 13 7 13c1.481 0 2.773 .804 3.465 2h3.07C14.227 13.804 15.519 13 17 13ZM7 15c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 15.895 8.105 15 7 15ZM17 15c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2ZM16 3c2.209 0 4 1.791 4 4v3h2v2h-20v-2h2v-3C4 4.791 5.791 3 8 3h8ZM16 5h-8C6.946 5 6 5.95 6 7v3h12v-3C18 5.946 17.05 5 16 5Z"),
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
        return _spyLine!!
    }

private var _spyLine: ImageVector? = null
