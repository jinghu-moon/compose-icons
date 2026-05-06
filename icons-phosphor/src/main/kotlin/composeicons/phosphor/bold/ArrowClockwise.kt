package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorBoldIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 56v48c0 6.627-5.373 12-12 12h-48c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h17.1l-19-17.38c-.13-.12-.26-.24-.38-.37C157.479 50.024 120.022 45.019 90.271 62.031 60.52 79.043 45.835 113.863 54.419 147.042 63.003 180.221 92.731 203.551 127 204h1c19.399 .047 38.073-7.372 52.15-20.72 4.819-4.554 12.416-4.339 16.97 .48 4.554 4.819 4.339 12.416-.48 16.97C178.109 218.294 153.532 228.058 128 228h-1.37C81.59 227.365 42.534 196.697 31.236 153.092 19.938 109.488 39.187 63.713 78.251 41.286 117.315 18.859 166.551 25.317 198.51 57.06L220 76.72v-20.72c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
