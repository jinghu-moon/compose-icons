package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareOne: ImageVector
    get() {
        if (_numberSquareOne != null) return _numberSquareOne!!
        _numberSquareOne = phosphorBoldIcon(
            name = "NumberSquareOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-152v-152h152ZM98 102.66c-1.77-2.651-2.413-5.897-1.786-9.023 .627-3.126 2.471-5.873 5.126-7.637l24-16c3.685-2.458 8.424-2.687 12.328-.595 3.904 2.092 6.338 6.165 6.332 10.595v96c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-73.58L114.66 106c-2.651 1.77-5.897 2.413-9.023 1.786-3.126-.627-5.873-2.471-7.637-5.126Z"),
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
        return _numberSquareOne!!
    }

private var _numberSquareOne: ImageVector? = null
