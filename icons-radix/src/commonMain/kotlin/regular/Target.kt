package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = radixIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.501 0.900 C 11.145 0.900 14.100 3.856 14.100 7.501 C 14.100 11.145 11.145 14.100 7.501 14.100 C 3.856 14.100 0.900 11.145 0.900 7.501 C 0.900 3.855 3.856 0.900 7.501 0.900 ZM 7.501 1.800 C 4.353 1.800 1.800 4.353 1.800 7.501 C 1.801 10.648 4.353 13.200 7.501 13.200 C 10.648 13.200 13.200 10.648 13.200 7.501 C 13.200 4.353 10.648 1.801 7.501 1.800 ZM 7.500 3.075 C 9.943 3.075 11.924 5.056 11.924 7.500 C 11.924 9.943 9.943 11.924 7.500 11.924 C 5.056 11.924 3.075 9.943 3.075 7.500 C 3.075 5.056 5.056 3.075 7.500 3.075 ZM 7.500 3.924 C 5.526 3.925 3.925 5.525 3.924 7.500 C 3.924 9.474 5.525 11.075 7.500 11.075 C 9.474 11.075 11.075 9.474 11.075 7.500 C 11.075 5.525 9.474 3.924 7.500 3.924 ZM 7.500 5.250 C 8.742 5.250 9.749 6.257 9.750 7.500 C 9.750 8.742 8.742 9.750 7.500 9.750 C 6.257 9.749 5.250 8.742 5.250 7.500 C 5.250 6.257 6.257 5.250 7.500 5.250 ZM 7.500 6.050 C 6.699 6.051 6.051 6.699 6.050 7.500 C 6.050 8.300 6.699 8.950 7.500 8.950 C 8.300 8.950 8.950 8.300 8.950 7.500 C 8.950 6.699 8.300 6.050 7.500 6.050 Z"),
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
        return _target!!
    }

private var _target: ImageVector? = null
