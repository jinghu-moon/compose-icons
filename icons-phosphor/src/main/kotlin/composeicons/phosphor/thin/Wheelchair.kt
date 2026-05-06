package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorThinIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251.79 190.73c-.703-2.092-2.967-3.22-5.06-2.52l-20.7 6.9L195.58 134.21c-.678-1.355-2.064-2.211-3.58-2.21h-84v-31.85c1.32-.09 2.65-.15 4-.15h56c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-56c-1.34 0-2.68 0-4 .13v-16.42c14.535-2.098 24.98-15.07 23.928-29.718C130.876 31.344 118.686 19.997 104 19.997c-14.686 0-26.876 11.347-27.928 25.995C75.02 60.64 85.465 73.612 100 75.71v17.37C65.365 99.327 41.221 130.969 44.338 166.024 47.456 201.079 76.807 227.963 112 228c31.72 0 60.27-21.45 67.87-51 .458-2.101-.826-4.188-2.907-4.726-2.082-.538-4.216 .666-4.833 2.726-6.71 26.08-32 45-60.13 45C81.194 220.006 55.389 196.681 52.293 166.03 49.197 135.38 69.815 107.366 100 101.21v34.79c0 2.209 1.791 4 4 4h85.53l30.89 61.79c.678 1.355 2.064 2.211 3.58 2.21 .429-.001 .854-.072 1.26-.21l24-8c1.007-.335 1.839-1.057 2.313-2.006 .474-.949 .553-2.048 .217-3.054ZM84 48C84 36.954 92.954 28 104 28c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C92.954 68 84 59.046 84 48Z"),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
