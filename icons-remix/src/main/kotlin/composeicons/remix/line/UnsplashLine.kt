package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UnsplashLine: ImageVector
    get() {
        if (_unsplashLine != null) return _unsplashLine!!
        _unsplashLine = remixIcon(
            name = "UnsplashLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.001 10v4h3.999l.001-4h7l-.001 4 .001 7h-18v-11h7ZM8.001 12h-3v7h14v-3l-0-4h-3l-.001 4h-7.999v-4ZM16.001 3v6h-8v-6h8ZM14.001 5h-4v2h4v-2Z"),
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
        return _unsplashLine!!
    }

private var _unsplashLine: ImageVector? = null
