package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Mix: ImageVector
    get() {
        if (_mix != null) return _mix!!
        _mix = radixIcon(
            name = "Mix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 1.600 8.824 C 1.600 8.325 2.103 7.997 2.550 8.170 L 2.639 8.212 L 6.572 10.388 L 6.657 10.443 C 7.026 10.719 7.026 11.282 6.657 11.559 L 6.572 11.613 L 2.639 13.789 C 2.173 14.047 1.600 13.710 1.600 13.177 L 1.600 8.824 ZM 13.000 8.300 C 13.387 8.300 13.700 8.614 13.700 9.000 L 13.700 13.000 C 13.700 13.387 13.387 13.700 13.000 13.700 L 9.000 13.700 C 8.614 13.700 8.300 13.387 8.300 13.000 L 8.300 9.000 C 8.300 8.614 8.614 8.300 9.000 8.300 L 13.000 8.300 ZM 2.500 12.836 L 5.820 11.000 L 2.500 9.163 L 2.500 12.836 ZM 9.200 12.800 L 12.800 12.800 L 12.800 9.200 L 9.200 9.200 L 9.200 12.800 ZM 4.000 1.249 C 5.519 1.249 6.751 2.481 6.751 4.000 C 6.751 5.519 5.519 6.751 4.000 6.751 C 2.481 6.751 1.249 5.519 1.249 4.000 C 1.249 2.481 2.481 1.249 4.000 1.249 ZM 12.807 1.557 C 12.983 1.381 13.268 1.381 13.443 1.557 C 13.619 1.733 13.619 2.018 13.443 2.193 L 11.637 4.000 L 13.443 5.807 L 13.501 5.877 C 13.616 6.052 13.597 6.290 13.443 6.443 C 13.290 6.597 13.052 6.616 12.877 6.501 L 12.807 6.443 L 11.000 4.637 L 9.194 6.443 C 9.018 6.619 8.733 6.619 8.557 6.443 C 8.381 6.268 8.381 5.983 8.557 5.807 L 10.363 4.000 L 8.557 2.193 L 8.499 2.123 C 8.384 1.948 8.403 1.711 8.557 1.557 C 8.711 1.403 8.949 1.384 9.123 1.499 L 9.194 1.557 L 11.000 3.363 L 12.807 1.557 ZM 4.000 2.150 C 2.978 2.150 2.150 2.978 2.150 4.000 C 2.150 5.022 2.978 5.851 4.000 5.851 C 5.022 5.851 5.851 5.022 5.851 4.000 C 5.851 2.978 5.022 2.150 4.000 2.150 Z"),
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
        return _mix!!
    }

private var _mix: ImageVector? = null
