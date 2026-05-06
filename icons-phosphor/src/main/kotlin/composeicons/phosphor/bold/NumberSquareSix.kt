package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareSix: ImageVector
    get() {
        if (_numberSquareSix != null) return _numberSquareSix!!
        _numberSquareSix = phosphorBoldIcon(
            name = "NumberSquareSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-152v-152h152ZM128 188c21.081-.035 38.516-16.426 39.853-37.465 1.336-21.039-13.885-39.503-34.793-42.205L146.3 86.15c2.326-3.685 2.47-8.342 .379-12.165-2.092-3.823-6.092-6.211-10.449-6.239-4.358-.028-8.388 2.308-10.529 6.104l-32.24 54c-7.213 12.37-7.264 27.651-.134 40.069 7.13 12.417 20.355 20.076 34.674 20.081ZM128 132c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16Z"),
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
        return _numberSquareSix!!
    }

private var _numberSquareSix: ImageVector? = null
