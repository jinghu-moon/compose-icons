package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Desktop: ImageVector
    get() {
        if (_desktop != null) return _desktop!!
        _desktop = radixIcon(
            name = "Desktop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.878 2.007 C 14.508 2.071 15.000 2.603 15.000 3.250 L 15.000 10.750 C 15.000 11.440 14.440 12.000 13.750 12.000 L 9.927 12.000 L 10.170 13.299 L 10.180 13.424 C 10.168 13.710 9.931 13.950 9.630 13.950 L 5.370 13.950 C 5.026 13.950 4.767 13.637 4.830 13.299 L 5.073 12.000 L 1.250 12.000 C 0.560 12.000 0.000 11.440 0.000 10.750 L 0.000 3.250 C 0.000 2.560 0.560 2.000 1.250 2.000 L 13.750 2.000 L 13.878 2.007 ZM 5.989 12.000 L 5.793 13.050 L 9.207 13.050 L 9.011 12.000 L 5.989 12.000 ZM 1.250 3.000 C 1.112 3.000 1.000 3.112 1.000 3.250 L 1.000 10.750 C 1.000 10.888 1.112 11.000 1.250 11.000 L 13.750 11.000 C 13.888 11.000 14.000 10.888 14.000 10.750 L 14.000 3.250 C 14.000 3.129 13.915 3.028 13.801 3.005 L 13.750 3.000 L 1.250 3.000 Z"),
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
        return _desktop!!
    }

private var _desktop: ImageVector? = null
