package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FilmReel: ImageVector
    get() {
        if (_filmReel != null) return _filmReel!!
        _filmReel = phosphorThinIcon(
            name = "FilmReel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 220h-64.82c47.231-20.12 71.553-72.736 56.281-121.749C208.188 49.237 158.282 19.751 107.982 30.022 57.683 40.292 23.331 86.983 28.495 138.06 33.66 189.137 76.662 228.006 128 228h104c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM36 128C36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92 0 50.81-41.19 92-92 92C77.213 219.945 36.055 178.787 36 128ZM128 100c11.046 0 20-8.954 20-20C148 68.954 139.046 60 128 60c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20ZM128 68c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM148 176c0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20ZM116 176c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM176 148c11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20ZM176 116c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM80 108c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20ZM80 140c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _filmReel!!
    }

private var _filmReel: ImageVector? = null
