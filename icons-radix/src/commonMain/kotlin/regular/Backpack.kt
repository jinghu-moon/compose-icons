package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = radixIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 0.000 C 9.552 0.000 10.000 0.448 10.000 1.000 L 10.000 2.000 L 14.000 2.000 C 14.552 2.000 15.000 2.448 15.000 3.000 L 15.000 6.000 C 15.000 6.888 14.613 7.686 14.000 8.234 L 14.000 11.500 C 14.000 12.328 13.328 13.000 12.500 13.000 L 2.500 13.000 C 1.672 13.000 1.000 12.328 1.000 11.500 L 1.000 8.233 C 0.388 7.685 0.000 6.888 0.000 6.000 L 0.000 3.000 C 0.000 2.448 0.448 2.000 1.000 2.000 L 5.000 2.000 L 5.000 1.000 C 5.000 0.448 5.448 0.000 6.000 0.000 L 9.000 0.000 ZM 13.000 8.827 C 12.687 8.938 12.351 9.000 12.000 9.000 L 8.000 9.000 L 8.000 9.500 C 8.000 9.776 7.776 10.000 7.500 10.000 C 7.224 10.000 7.000 9.776 7.000 9.500 L 7.000 9.000 L 3.000 9.000 C 2.649 9.000 2.313 8.938 2.000 8.827 L 2.000 11.500 C 2.000 11.776 2.224 12.000 2.500 12.000 L 12.500 12.000 C 12.776 12.000 13.000 11.776 13.000 11.500 L 13.000 8.827 ZM 1.000 6.000 C 1.000 6.654 1.313 7.235 1.800 7.601 L 1.930 7.689 C 2.239 7.886 2.606 8.000 3.000 8.000 L 7.000 8.000 L 7.000 7.500 C 7.000 7.224 7.224 7.000 7.500 7.000 C 7.776 7.000 8.000 7.224 8.000 7.500 L 8.000 8.000 L 12.000 8.000 C 12.451 8.000 12.866 7.852 13.200 7.601 L 13.374 7.453 C 13.760 7.088 14.000 6.572 14.000 6.000 L 14.000 3.000 L 1.000 3.000 L 1.000 6.000 ZM 6.000 2.000 L 9.000 2.000 L 9.000 1.000 L 6.000 1.000 L 6.000 2.000 Z"),
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
        return _backpack!!
    }

private var _backpack: ImageVector? = null
