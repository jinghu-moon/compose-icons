package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.PieChart: ImageVector
    get() {
        if (_pieChart != null) return _pieChart!!
        _pieChart = radixIcon(
            name = "PieChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.500 0.850 C 11.173 0.850 14.150 3.828 14.150 7.500 C 14.150 11.173 11.173 14.151 7.500 14.151 C 3.828 14.151 0.850 11.173 0.850 7.500 C 0.850 3.828 3.828 0.850 7.500 0.850 ZM 7.500 1.850 C 4.380 1.850 1.850 4.380 1.850 7.500 C 1.850 10.621 4.380 13.151 7.500 13.151 C 10.621 13.151 13.150 10.621 13.150 7.500 C 13.150 4.380 10.621 1.850 7.500 1.850 ZM 7.500 3.100 C 9.930 3.100 11.901 5.070 11.901 7.500 C 11.901 7.669 11.890 7.836 11.872 8.000 L 7.000 8.000 L 7.000 3.128 C 7.164 3.110 7.331 3.100 7.500 3.100 Z"),
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
        return _pieChart!!
    }

private var _pieChart: ImageVector? = null
