package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Mobile: ImageVector
    get() {
        if (_mobile != null) return _mobile!!
        _mobile = radixIcon(
            name = "Mobile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.500 1.000 C 11.328 1.000 12.000 1.672 12.000 2.500 L 12.000 12.500 C 12.000 13.328 11.328 14.000 10.500 14.000 L 4.500 14.000 C 3.672 14.000 3.000 13.328 3.000 12.500 L 3.000 2.500 C 3.000 1.672 3.672 1.000 4.500 1.000 L 10.500 1.000 ZM 4.500 2.000 C 4.224 2.000 4.000 2.224 4.000 2.500 L 4.000 12.500 C 4.000 12.776 4.224 13.000 4.500 13.000 L 10.500 13.000 C 10.776 13.000 11.000 12.776 11.000 12.500 L 11.000 2.500 C 11.000 2.224 10.776 2.000 10.500 2.000 L 4.500 2.000 ZM 9.070 11.657 C 9.230 11.690 9.350 11.831 9.350 12.000 C 9.350 12.169 9.230 12.310 9.070 12.343 L 9.000 12.350 L 6.000 12.350 C 5.807 12.350 5.650 12.193 5.650 12.000 C 5.650 11.807 5.807 11.650 6.000 11.650 L 9.000 11.650 L 9.070 11.657 Z"),
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
        return _mobile!!
    }

private var _mobile: ImageVector? = null
