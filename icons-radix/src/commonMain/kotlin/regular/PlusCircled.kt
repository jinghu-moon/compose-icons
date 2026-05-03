package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PlusCircled: ImageVector
    get() {
        if (_plusCircled != null) return _plusCircled!!
        _plusCircled = radixIcon(
            name = "PlusCircled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.499 0.877 C 11.157 0.877 14.122 3.842 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 3.842 14.122 0.877 11.156 0.877 7.499 C 0.877 3.842 3.842 0.877 7.499 0.877 ZM 7.499 1.826 C 4.367 1.827 1.827 4.367 1.826 7.499 C 1.826 10.632 4.366 13.171 7.499 13.172 C 10.632 13.172 13.172 10.632 13.172 7.499 C 13.172 4.366 10.632 1.826 7.499 1.826 ZM 7.500 4.000 C 7.776 4.000 8.000 4.224 8.000 4.500 L 8.000 7.000 L 10.500 7.000 C 10.776 7.000 11.000 7.224 11.000 7.500 C 11.000 7.776 10.776 8.000 10.500 8.000 L 8.000 8.000 L 8.000 10.500 C 8.000 10.776 7.776 11.000 7.500 11.000 C 7.224 11.000 7.000 10.776 7.000 10.500 L 7.000 8.000 L 4.500 8.000 C 4.224 8.000 4.000 7.776 4.000 7.500 C 4.000 7.224 4.224 7.000 4.500 7.000 L 7.000 7.000 L 7.000 4.500 C 7.000 4.224 7.224 4.000 7.500 4.000 Z"),
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
        return _plusCircled!!
    }

private var _plusCircled: ImageVector? = null
