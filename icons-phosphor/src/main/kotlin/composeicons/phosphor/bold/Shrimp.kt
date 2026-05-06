package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Shrimp: ImageVector
    get() {
        if (_shrimp != null) return _shrimp!!
        _shrimp = phosphorBoldIcon(
            name = "Shrimp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 60C244 42.327 229.673 28 212 28h-84c-2.209 0-4-1.791-4-4 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 15.464 12.536 28 28 28h84c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-115.1C50.43 68 12.34 105.4 12 151.37c-.168 22.387 8.608 43.915 24.379 59.805C52.15 227.064 73.612 236.001 96 236h56c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-28v-16h44c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c38.884-.049 71.477-29.403 75.58-68.07C237.71 82.283 243.992 71.598 244 60ZM96.9 92h3.1v42.34c-4.916 2-9.262 5.185-12.65 9.27l-44-20C54.117 104.113 74.627 92.006 96.9 92ZM36 151.54c0-1.61 .11-3.21 .25-4.79l43.87 19.94c.117 1.444 .337 2.878 .66 4.29L51.31 192C41.314 180.91 35.85 166.469 36 151.54ZM96 212c-8.343 .012-16.597-1.722-24.23-5.09L94.43 190.73c1.757 1.155 3.623 2.136 5.57 2.93v18.34ZM152 132h-28v-40h78.6c-5.587 23.43-26.513 39.972-50.6 40Z"),
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
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
