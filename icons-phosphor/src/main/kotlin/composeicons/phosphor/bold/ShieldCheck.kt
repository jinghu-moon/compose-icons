package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) return _shieldCheck!!
        _shieldCheck = phosphorBoldIcon(
            name = "ShieldCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C36.954 36 28 44.954 28 56v56c0 54.29 26.32 87.22 48.4 105.29 23.71 19.39 47.44 26 48.44 26.29 2.069 .56 4.251 .56 6.32 0 1-.28 24.73-6.9 48.44-26.29C201.68 199.22 228 166.29 228 112v-56C228 44.954 219.046 36 208 36ZM204 112c0 35.71-13.09 64.69-38.91 86.15-11.067 9.132-23.61 16.312-37.09 21.23C114.519 214.464 101.976 207.285 90.91 198.15 65.09 176.69 52 147.71 52 112v-52h152ZM79.51 144.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L112 143 159.51 95.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-56 56c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529Z"),
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
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
