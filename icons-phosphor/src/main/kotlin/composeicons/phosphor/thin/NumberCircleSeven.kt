package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleSeven: ImageVector
    get() {
        if (_numberCircleSeven != null) return _numberCircleSeven!!
        _numberCircleSeven = phosphorThinIcon(
            name = "NumberCircleSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM155.28 85.71c.747 1.069 .926 2.435 .48 3.66l-32 88c-.576 1.58-2.078 2.631-3.76 2.63-.467-.002-.93-.083-1.37-.24-.998-.363-1.81-1.107-2.258-2.07-.448-.962-.496-2.063-.132-3.06L146.29 92h-42.29c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c1.307-0 2.532 .638 3.28 1.71Z"),
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
        return _numberCircleSeven!!
    }

private var _numberCircleSeven: ImageVector? = null
