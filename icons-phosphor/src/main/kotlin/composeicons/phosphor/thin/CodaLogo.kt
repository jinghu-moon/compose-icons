package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorThinIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 84c8.378-.067 16.599 2.268 23.69 6.73 2.461 1.574 5.584 1.681 8.148 .28C210.401 89.608 211.996 86.921 212 84v-36c0-6.627-5.373-12-12-12h-144C49.373 36 44 41.373 44 48v160c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-36c-.003-2.915-1.592-5.598-4.146-7.002-2.555-1.404-5.671-1.308-8.134 .252-8 5.14-14.82 7.09-23.56 6.74h-.16c-24.301 0-44-19.699-44-44 0-24.301 19.699-44 44-44ZM124 128c.027 28.676 23.244 51.928 51.92 52 10.35 .4 18.76-2 28.08-8v36c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4v36C187.938 73.924 167.678 73.342 151.064 82.48 134.45 91.617 124.092 109.04 124 128Z"),
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
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
