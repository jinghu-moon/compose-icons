package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) return _numberSquareNine!!
        _numberSquareNine = phosphorBoldIcon(
            name = "NumberSquareNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-152v-152h152ZM108 142.64c4.597 2.645 9.677 4.345 14.94 5l-13.24 22.21c-2.326 3.685-2.47 8.342-.379 12.164 2.092 3.823 6.092 6.211 10.449 6.239 4.358 .028 8.388-2.308 10.529-6.104L162.64 128c8.09-14.011 6.943-31.515-2.906-44.351C149.886 70.813 133.275 65.174 117.647 69.362 102.02 73.549 90.454 86.737 88.342 102.778c-2.112 16.04 5.647 31.773 19.658 39.862ZM114.14 100C118.558 92.345 128.345 89.722 136 94.14c7.655 4.418 10.278 14.205 5.86 21.86h0c-4.534 7.393-14.132 9.828-21.642 5.49C112.708 117.152 110.022 107.621 114.16 100Z"),
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
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
