package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorThinIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M183.05 60h-111.05C53.407 59.998 35.625 67.61 22.791 81.063 9.958 94.517 3.192 112.638 4.07 131.21c1.6 34.66 30 63.08 64.65 64.71 14.77 .72 30-5.64 46.63-19.38 7.357-6.078 17.993-6.078 25.35 0C150.79 184.92 166.25 196 184 196c18.192 .002 35.626-7.286 48.404-20.234C245.183 162.818 252.241 145.29 252 127.1 251.51 90.1 220.58 60 183.05 60ZM226.7 170.15C215.454 181.612 200.057 188.048 184 188c-15.17 0-29.07-10-38.2-17.58-10.313-8.535-25.237-8.535-35.55 0-15 12.41-28.45 18.14-41.15 17.55C38.307 186.292 13.73 161.675 12.1 130.88 11.312 114.491 17.271 98.495 28.587 86.616 39.904 74.736 55.593 68.008 72 68h111.05c33.18 0 60.52 26.56 60.94 59.2 .261 16.062-5.973 31.549-17.29 42.95ZM180 96c0 2.209-1.791 4-4 4h-96c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h96c2.209 0 4 1.791 4 4Z"),
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
        return _visor!!
    }

private var _visor: ImageVector? = null
