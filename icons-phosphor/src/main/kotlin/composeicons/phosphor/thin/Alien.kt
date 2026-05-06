package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorThinIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C77.213 20.055 36.055 61.213 36 112c0 23.19 12.26 53.33 32.8 80.63C84.58 213.6 108.41 236 128 236c19.59 0 43.42-22.4 59.2-43.37C207.74 165.33 220 135.19 220 112 219.945 61.213 178.787 20.055 128 20ZM180.8 187.82C162.44 212.23 141.71 228 128 228 114.29 228 93.56 212.23 75.2 187.82 56 162.24 44 133.19 44 112 44 65.608 81.608 28 128 28c46.392 0 84 37.608 84 84 0 21.19-11.95 50.24-31.2 75.82ZM116 136C116 116.118 99.882 100 80 100c-6.627 0-12 5.373-12 12 0 19.882 16.118 36 36 36 6.627 0 12-5.373 12-12ZM104 140C88.536 140 76 127.464 76 112c0-2.209 1.791-4 4-4 15.464 0 28 12.536 28 28 0 2.209-1.791 4-4 4ZM176 100c-19.882 0-36 16.118-36 36 0 6.627 5.373 12 12 12 19.882 0 36-16.118 36-36 0-6.627-5.373-12-12-12ZM152 140c-2.209 0-4-1.791-4-4 0-15.464 12.536-28 28-28 2.209 0 4 1.791 4 4 0 15.464-12.536 28-28 28ZM148 184c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4Z"),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
