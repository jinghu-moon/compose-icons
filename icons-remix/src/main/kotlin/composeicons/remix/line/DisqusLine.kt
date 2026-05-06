package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DisqusLine: ImageVector
    get() {
        if (_disqusLine != null) return _disqusLine!!
        _disqusLine = remixIcon(
            name = "DisqusLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.997 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C9.691 22 7.505 21.216 5.748 19.808l-4.718 .59L2.749 15.812C2.255 14.614 1.997 13.325 1.997 12 1.997 6.477 6.474 2 11.997 2ZM11.997 4C7.579 4 3.997 7.582 3.997 12c0 1.178 .254 2.318 .738 3.362l.176 .38-.848 2.261 2.316-.289 .338 .297C8.168 19.285 10.026 20 11.997 20c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM8.047 7h3.79c3.421 0 5.441 1.956 5.54 4.728l.004 .215v.028c0 2.813-1.962 4.921-5.338 5.025l-.262 .004h-3.733v-10h3.79-3.79ZM11.878 9.458h-1.108v5.085h1.108c1.565 0 2.625-.845 2.704-2.346l.005-.183v-.028c0-1.601-1.081-2.529-2.709-2.529Z"),
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
        return _disqusLine!!
    }

private var _disqusLine: ImageVector? = null
