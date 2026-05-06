package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareSeven: ImageVector
    get() {
        if (_numberSquareSeven != null) return _numberSquareSeven!!
        _numberSquareSeven = phosphorThinIcon(
            name = "NumberSquareSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM212 208c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM155.28 85.71c.747 1.069 .926 2.435 .48 3.66l-32 88c-.576 1.58-2.078 2.631-3.76 2.63-.467-.002-.93-.083-1.37-.24-.998-.363-1.81-1.107-2.258-2.07-.448-.962-.496-2.063-.132-3.06L146.29 92h-42.29c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c1.307-0 2.532 .638 3.28 1.71Z"),
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
        return _numberSquareSeven!!
    }

private var _numberSquareSeven: ImageVector? = null
