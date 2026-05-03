package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Share2: ImageVector
    get() {
        if (_share2 != null) return _share2!!
        _share2 = radixIcon(
            name = "Share2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 5.500 C 2.000 4.672 2.672 4.000 3.500 4.000 L 4.750 4.000 C 5.026 4.000 5.250 4.224 5.250 4.500 C 5.250 4.776 5.026 5.000 4.750 5.000 L 3.500 5.000 C 3.224 5.000 3.000 5.224 3.000 5.500 L 3.000 11.500 C 3.000 11.776 3.224 12.000 3.500 12.000 L 11.500 12.000 C 11.776 12.000 12.000 11.776 12.000 11.500 L 12.000 5.500 C 12.000 5.224 11.776 5.000 11.500 5.000 L 10.250 5.000 C 9.974 5.000 9.750 4.776 9.750 4.500 C 9.750 4.224 9.974 4.000 10.250 4.000 L 11.500 4.000 C 12.328 4.000 13.000 4.672 13.000 5.500 L 13.000 11.500 C 13.000 12.328 12.328 13.000 11.500 13.000 L 3.500 13.000 C 2.672 13.000 2.000 12.328 2.000 11.500 L 2.000 5.500 ZM 4.932 3.068 C 4.778 2.915 4.759 2.677 4.874 2.502 L 4.932 2.432 L 7.182 0.182 C 7.266 0.097 7.381 0.050 7.500 0.050 C 7.619 0.050 7.734 0.097 7.818 0.182 L 10.068 2.432 C 10.244 2.607 10.244 2.893 10.068 3.068 C 9.893 3.244 9.607 3.244 9.432 3.068 L 8.000 1.637 L 8.000 8.500 C 8.000 8.776 7.776 9.000 7.500 9.000 C 7.224 9.000 7.000 8.776 7.000 8.500 L 7.000 1.637 L 5.568 3.068 L 5.498 3.126 C 5.323 3.242 5.085 3.222 4.932 3.068 Z"),
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
        return _share2!!
    }

private var _share2: ImageVector? = null
