package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Crosshair2: ImageVector
    get() {
        if (_crosshair2 != null) return _crosshair2!!
        _crosshair2 = radixIcon(
            name = "Crosshair2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 0.000 C 7.776 0.000 8.000 0.224 8.000 0.500 L 8.000 1.808 C 10.692 2.094 12.815 4.280 13.005 7.000 L 14.500 7.000 C 14.776 7.000 15.000 7.224 15.000 7.500 C 15.000 7.776 14.776 8.000 14.500 8.000 L 12.987 8.000 C 12.708 10.624 10.624 12.708 8.000 12.987 L 8.000 14.500 C 8.000 14.776 7.776 15.000 7.500 15.000 C 7.224 15.000 7.000 14.776 7.000 14.500 L 7.000 13.004 C 4.280 12.814 2.095 10.692 1.809 8.000 L 0.500 8.000 C 0.224 8.000 0.000 7.776 0.000 7.500 C 0.000 7.224 0.224 7.000 0.500 7.000 L 1.791 7.000 C 1.986 4.212 4.212 1.986 7.000 1.791 L 7.000 0.500 C 7.000 0.224 7.224 0.000 7.500 0.000 ZM 7.000 2.742 C 4.737 2.933 2.934 4.737 2.743 7.000 L 5.500 7.000 C 5.776 7.000 6.000 7.224 6.000 7.500 C 6.000 7.776 5.776 8.000 5.500 8.000 L 2.765 8.000 C 3.044 10.167 4.805 11.867 7.000 12.052 L 7.000 9.500 C 7.000 9.224 7.224 9.000 7.500 9.000 C 7.776 9.000 8.000 9.224 8.000 9.500 L 8.000 12.030 C 10.099 11.760 11.760 10.099 12.030 8.000 L 9.500 8.000 C 9.224 8.000 9.000 7.776 9.000 7.500 C 9.000 7.224 9.224 7.000 9.500 7.000 L 12.052 7.000 C 11.867 4.805 10.167 3.044 8.000 2.765 L 8.000 5.500 C 8.000 5.776 7.776 6.000 7.500 6.000 C 7.224 6.000 7.000 5.776 7.000 5.500 L 7.000 2.742 Z"),
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
        return _crosshair2!!
    }

private var _crosshair2: ImageVector? = null
