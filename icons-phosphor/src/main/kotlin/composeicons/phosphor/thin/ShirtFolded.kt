package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorThinIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 44h-22.34L162.83 29.17h0C162.079 28.42 161.061 27.999 160 28h-64c-1.061-.001-2.079 .42-2.83 1.17h0L78.34 44h-22.34C49.373 44 44 49.373 44 56v152c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-152c0-6.627-5.373-12-12-12ZM128 72.79 103.47 36h49.06ZM160.62 38.28 172 49.66v54.34c.004 1.554-.893 2.97-2.3 3.63-1.383 .667-3.027 .468-4.21-.51L133.29 79.3ZM84 49.66 95.38 38.28l27.33 41L90.54 107.08c-1.194 .981-2.846 1.187-4.244 .529C84.898 106.95 84.004 105.545 84 104ZM52 208v-152c0-2.209 1.791-4 4-4h20v52c-.029 4.665 2.674 8.916 6.91 10.87 1.594 .743 3.331 1.128 5.09 1.13 2.8-.003 5.51-.994 7.65-2.8h.06L124 88.74v123.26h-68c-2.209 0-4-1.791-4-4ZM204 208c0 2.209-1.791 4-4 4h-68v-123.26l28.32 24.46c2.149 1.811 4.87 2.803 7.68 2.8 1.77-.004 3.518-.396 5.12-1.15 4.218-1.96 6.906-6.199 6.88-10.85v-52h20c2.209 0 4 1.791 4 4Z"),
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
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
