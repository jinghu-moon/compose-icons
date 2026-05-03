package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Input: ImageVector
    get() {
        if (_input != null) return _input!!
        _input = radixIcon(
            name = "Input",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.500 1.000 C 10.776 1.000 11.000 1.224 11.000 1.500 C 11.000 1.776 10.776 2.000 10.500 2.000 C 9.873 2.000 9.543 2.201 9.345 2.479 C 9.122 2.790 9.000 3.288 9.000 4.000 L 9.000 11.000 C 9.000 11.712 9.122 12.210 9.345 12.521 C 9.543 12.799 9.873 13.000 10.500 13.000 C 10.776 13.000 11.000 13.224 11.000 13.500 C 11.000 13.776 10.776 14.000 10.500 14.000 C 9.627 14.000 8.957 13.701 8.530 13.104 C 8.519 13.088 8.511 13.071 8.500 13.055 C 8.489 13.071 8.481 13.088 8.470 13.104 C 8.043 13.701 7.373 14.000 6.500 14.000 C 6.224 14.000 6.000 13.776 6.000 13.500 C 6.000 13.224 6.224 13.000 6.500 13.000 C 7.127 13.000 7.457 12.799 7.655 12.521 C 7.878 12.210 8.000 11.712 8.000 11.000 L 8.000 4.000 C 8.000 3.288 7.878 2.790 7.655 2.479 C 7.457 2.201 7.127 2.000 6.500 2.000 C 6.224 2.000 6.000 1.776 6.000 1.500 C 6.000 1.224 6.224 1.000 6.500 1.000 C 7.373 1.000 8.043 1.299 8.470 1.896 C 8.481 1.912 8.489 1.929 8.500 1.944 C 8.511 1.929 8.519 1.912 8.530 1.896 C 8.957 1.299 9.627 1.000 10.500 1.000 ZM 6.000 5.000 L 1.000 5.000 L 1.000 10.000 L 6.000 10.000 L 6.000 11.000 L 1.000 11.000 L 0.897 10.995 C 0.427 10.947 0.053 10.573 0.005 10.102 L 0.000 10.000 L 0.000 5.000 C 0.000 4.482 0.393 4.056 0.897 4.005 L 1.000 4.000 L 6.000 4.000 L 6.000 5.000 ZM 14.102 4.005 C 14.607 4.056 15.000 4.482 15.000 5.000 L 15.000 10.000 L 14.995 10.102 C 14.947 10.573 14.573 10.947 14.102 10.995 L 14.000 11.000 L 11.000 11.000 L 11.000 10.000 L 14.000 10.000 L 14.000 5.000 L 11.000 5.000 L 11.000 4.000 L 14.000 4.000 L 14.102 4.005 Z"),
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
        return _input!!
    }

private var _input: ImageVector? = null
