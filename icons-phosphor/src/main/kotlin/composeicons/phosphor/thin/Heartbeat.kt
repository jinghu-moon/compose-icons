package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorThinIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 140h-40c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h37.86L84.67 109.78c.742-1.114 1.991-1.784 3.33-1.784 1.339 0 2.588 .67 3.33 1.784l28.67 43 12.67-19c.742-1.113 1.992-1.781 3.33-1.78h24c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-21.86l-14.81 22.22c-.742 1.114-1.991 1.784-3.33 1.784-1.339 0-2.588-.67-3.33-1.784L88 119.21 75.33 138.21c-.74 1.117-1.99 1.789-3.33 1.79ZM178 44c-21.44 0-39.92 10.19-50 27.07C117.92 54.19 99.44 44 78 44 45.983 44.039 20.039 69.983 20 102q0 1.06 0 2.13c.072 2.209 1.921 3.942 4.13 3.87 2.209-.072 3.942-1.921 3.87-4.13 0-.62 0-1.24 0-1.87C28.033 74.399 50.399 52.033 78 52c21.11 0 38.85 11.31 46.3 29.51 .616 1.5 2.078 2.48 3.7 2.48 1.622 0 3.084-.98 3.7-2.48C139.15 63.31 156.89 52 178 52c27.601 .033 49.967 22.399 50 50 0 58-86 109.46-100 117.42C119.53 214.6 84.5 193.81 58.37 165.3c-1.503-1.573-3.987-1.656-5.592-.187-1.605 1.469-1.741 3.951-.308 5.587 30.72 33.52 71.9 55.89 73.63 56.82 1.186 .64 2.614 .64 3.8 0 18.707-10.521 36.355-22.821 52.7-36.73C218 160.47 236 130.59 236 102 235.961 69.983 210.017 44.039 178 44Z"),
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
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
