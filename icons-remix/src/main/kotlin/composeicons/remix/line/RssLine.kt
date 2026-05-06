package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RssLine: ImageVector
    get() {
        if (_rssLine != null) return _rssLine!!
        _rssLine = remixIcon(
            name = "RssLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 17c2.209 0 4 1.791 4 4h-4v-4ZM3 10c6.075 0 11 4.925 11 11h-2C12 16.029 7.971 12 3 12v-2ZM3 3c9.941 0 18 8.059 18 18h-2C19 12.163 11.837 5 3 5v-2Z"),
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
        return _rssLine!!
    }

private var _rssLine: ImageVector? = null
