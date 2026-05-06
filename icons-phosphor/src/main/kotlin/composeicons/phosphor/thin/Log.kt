package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Log: ImageVector
    get() {
        if (_log != null) return _log!!
        _log = phosphorThinIcon(
            name = "Log",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 136c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM244 136c0 17.83-4.38 34.66-12.32 47.38C223.36 196.67 212.11 204 200 204h-144C43.89 204 32.64 196.67 24.32 183.38 16.38 170.66 12 153.83 12 136c0-17.83 4.38-34.66 12.32-47.38C32.64 75.33 43.89 68 56 68h38.34L133.17 29.17c.751-.75 1.769-1.171 2.83-1.17h32c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-30.34l-32 32h94.34c12.11 0 23.36 7.33 31.68 20.62C239.62 101.34 244 118.17 244 136ZM179.13 196c-4.255-3.602-7.904-7.863-10.81-12.62-3.701-6.04-6.552-12.561-8.47-19.38h-79.85c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h77.91c-1.277-6.59-1.917-13.287-1.91-20 0-17.83 4.38-34.66 12.32-47.38 2.906-4.757 6.555-9.018 10.81-12.62h-123.13C40.36 76 27 92.72 22.06 116h81.94c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-83.28c-.481 3.982-.721 7.989-.72 12 0 33.08 16.15 60 36 60ZM236 136C236 102.92 219.85 76 200 76c-19.85 0-36 26.92-36 60 0 33.08 16.15 60 36 60 19.85 0 36-26.92 36-60Z"),
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
        return _log!!
    }

private var _log: ImageVector? = null
