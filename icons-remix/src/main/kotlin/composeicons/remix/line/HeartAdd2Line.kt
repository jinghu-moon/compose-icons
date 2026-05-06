package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HeartAdd2Line: ImageVector
    get() {
        if (_heartAdd2Line != null) return _heartAdd2Line!!
        _heartAdd2Line = remixIcon(
            name = "HeartAdd2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 9C4 6.492 5.714 5 7.5 5 9.406 5 10.754 6.582 12 7.828 13.246 6.582 14.594 5 16.5 5 18.316 5 20 6.484 20 9c0 1.122-.236 2.15-.649 3.102l1.835 .796C21.701 11.711 22 10.413 22 9 22 5.496 19.534 3 16.5 3 14.59 3 13.146 3.985 12 5.028 10.854 3.985 9.41 3 7.5 3 4.504 3 2 5.496 2 9c0 3.02 1.362 5.47 3.203 7.445 1.83 1.962 4.182 3.51 6.288 4.753l1.017-1.722C10.441 18.256 8.293 16.826 6.666 15.081 5.051 13.349 4 11.363 4 9ZM19 17v-3h-2v3h-3v2h2.999L17 22h2l-.001-3h3.001v-2h-3Z"),
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
        return _heartAdd2Line!!
    }

private var _heartAdd2Line: ImageVector? = null
