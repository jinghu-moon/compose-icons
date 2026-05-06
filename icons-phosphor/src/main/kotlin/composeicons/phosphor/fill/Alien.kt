package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorFillIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 16C75.006 16.061 32.061 59.006 32 112c0 24 12.56 55.06 33.61 83 21.18 28.15 44.5 45 62.39 45 17.89 0 41.21-16.81 62.39-45C211.44 167 224 136 224 112 223.939 59.006 180.994 16.061 128 16ZM64 116c0-6.627 5.373-12 12-12 19.882 0 36 16.118 36 36 0 6.627-5.373 12-12 12C80.118 152 64 135.882 64 116ZM144 200h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM156 152c-6.627 0-12-5.373-12-12 0-19.882 16.118-36 36-36 6.627 0 12 5.373 12 12 0 19.882-16.118 36-36 36Z"),
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
