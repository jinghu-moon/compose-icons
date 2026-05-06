package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GeminiLine: ImageVector
    get() {
        if (_geminiLine != null) return _geminiLine!!
        _geminiLine = remixIcon(
            name = "GeminiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.124 1.091h1.751l.052 .854c.296 4.905 4.222 8.832 9.128 9.128l.854 .051v1.751l-.854 .052c-4.905 .296-8.832 4.223-9.128 9.128l-.052 .854h-1.751l-.052-.854C10.777 17.15 6.85 13.223 1.945 12.927l-.854-.052v-1.751l.854-.051c4.905-.296 8.832-4.222 9.128-9.128l.052-.854ZM12 5.85C10.83 8.615 8.615 10.83 5.85 12c2.765 1.17 4.98 3.385 6.15 6.15 1.17-2.765 3.385-4.98 6.15-6.15C15.385 10.83 13.17 8.615 12 5.85Z"),
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
        return _geminiLine!!
    }

private var _geminiLine: ImageVector? = null
