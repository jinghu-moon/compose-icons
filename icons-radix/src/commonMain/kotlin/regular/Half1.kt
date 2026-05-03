package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Half1: ImageVector
    get() {
        if (_half1 != null) return _half1!!
        _half1 = radixIcon(
            name = "Half1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.499 0.877 C 11.157 0.877 14.122 3.842 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 3.842 14.122 0.877 11.156 0.877 7.499 C 0.877 3.842 3.842 0.877 7.499 0.877 ZM 7.000 1.849 C 4.101 2.102 1.827 4.535 1.826 7.499 C 1.826 10.464 4.101 12.895 7.000 13.148 L 7.000 1.849 ZM 8.000 13.148 C 10.899 12.895 13.172 10.463 13.172 7.499 C 13.172 4.535 10.898 2.102 8.000 1.849 L 8.000 13.148 Z"),
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
        return _half1!!
    }

private var _half1: ImageVector? = null
