package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) return _numberSquareZero!!
        _numberSquareZero = phosphorBoldIcon(
            name = "NumberSquareZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 188c28.26 0 48-24.67 48-60C176 92.67 156.26 68 128 68 99.74 68 80 92.67 80 128c0 35.33 19.74 60 48 60ZM128 92c23.33 0 24 32.32 24 36 0 3.68-.67 36-24 36-23.33 0-24-32.32-24-36 0-3.68 .67-36 24-36ZM208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-152v-152h152Z"),
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
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
