package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareFive: ImageVector
    get() {
        if (_numberSquareFive != null) return _numberSquareFive!!
        _numberSquareFive = phosphorBoldIcon(
            name = "NumberSquareFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-152v-152h152ZM92.16 126l8-48c.976-5.777 5.981-10.004 11.84-10h40c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-29.83l-2.71 16.23c1.509-.152 3.024-.229 4.54-.23 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40-10.701 .16-21.01-4.025-28.57-11.6-4.639-4.733-4.563-12.331 .17-16.97 4.733-4.639 12.331-4.563 16.97 .17 3.047 2.97 7.178 4.56 11.43 4.4 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-4.252-.16-8.383 1.43-11.43 4.4-3.669 3.752-9.351 4.685-14.028 2.302C93.866 136.319 91.281 131.174 92.16 126Z"),
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
        return _numberSquareFive!!
    }

private var _numberSquareFive: ImageVector? = null
