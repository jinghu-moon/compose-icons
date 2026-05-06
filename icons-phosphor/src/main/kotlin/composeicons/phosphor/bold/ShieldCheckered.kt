package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorBoldIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C36.954 36 28 44.954 28 56v56c0 54.29 26.32 87.22 48.4 105.29 23.71 19.39 47.44 26 48.44 26.29 2.069 .56 4.251 .56 6.32 0 1-.28 24.73-6.9 48.44-26.29C201.68 199.22 228 166.29 228 112v-56C228 44.954 219.046 36 208 36ZM204 112c0 1.34 0 2.68-.06 4h-63.94v-56h64ZM52 60h64v56h-63.94c0-1.32-.06-2.66-.06-4ZM55 140h61v74.29c-8.968-4.376-17.39-9.793-25.09-16.14C72.22 182.61 60.2 163.13 55 140ZM165.1 198.15c-7.703 6.348-16.128 11.765-25.1 16.14v-74.29h61c-5.2 23.13-17.22 42.61-35.91 58.15Z"),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
