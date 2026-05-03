package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CheckCircled: ImageVector
    get() {
        if (_checkCircled != null) return _checkCircled!!
        _checkCircled = radixIcon(
            name = "CheckCircled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.499 0.877 C 11.157 0.877 14.122 3.842 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 3.842 14.122 0.877 11.156 0.877 7.499 C 0.877 3.842 3.842 0.877 7.499 0.877 ZM 7.499 1.826 C 4.367 1.827 1.827 4.367 1.826 7.499 C 1.826 10.632 4.366 13.172 7.499 13.172 C 10.632 13.172 13.172 10.632 13.172 7.499 C 13.172 4.366 10.632 1.826 7.499 1.826 ZM 9.341 4.962 C 9.500 4.736 9.812 4.682 10.038 4.841 C 10.264 5.000 10.318 5.312 10.159 5.538 L 6.992 10.038 C 6.907 10.159 6.772 10.236 6.624 10.248 C 6.476 10.260 6.331 10.206 6.227 10.101 L 4.644 8.487 L 5.000 8.138 L 5.357 7.787 L 6.520 8.971 L 9.341 4.962 ZM 4.650 7.780 C 4.847 7.587 5.163 7.590 5.357 7.787 L 4.644 8.487 C 4.450 8.290 4.452 7.974 4.650 7.780 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _checkCircled!!
    }

private var _checkCircled: ImageVector? = null
