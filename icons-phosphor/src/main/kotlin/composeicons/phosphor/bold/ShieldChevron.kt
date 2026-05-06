package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) return _shieldChevron!!
        _shieldChevron = phosphorBoldIcon(
            name = "ShieldChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C36.954 36 28 44.954 28 56v56c0 54.29 26.32 87.22 48.4 105.29 23.71 19.39 47.44 26 48.44 26.29 2.069 .56 4.251 .56 6.32 0 1-.28 24.73-6.9 48.44-26.29C201.68 199.22 228 166.29 228 112v-56C228 44.954 219.046 36 208 36ZM52 60h152v52c.156 14.185-2.214 28.285-7 41.64L134.89 110.17c-4.131-2.891-9.629-2.891-13.76 0L59 153.64C54.214 140.285 51.844 126.185 52 112ZM165.09 198.15c-11.067 9.132-23.61 16.312-37.09 21.23C114.519 214.464 101.976 207.285 90.91 198.15 82.883 191.546 75.841 183.828 70 175.23l58-40.58 58 40.58c-5.841 8.598-12.883 16.316-20.91 22.92Z"),
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
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
