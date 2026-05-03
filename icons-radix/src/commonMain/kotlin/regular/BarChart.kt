package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.BarChart: ImageVector
    get() {
        if (_barChart != null) return _barChart!!
        _barChart = radixIcon(
            name = "BarChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 1.500 5.000 C 1.776 5.000 2.000 5.224 2.000 5.500 L 2.000 13.500 C 2.000 13.776 1.776 14.000 1.500 14.000 C 1.224 14.000 1.000 13.776 1.000 13.500 L 1.000 5.500 C 1.000 5.224 1.224 5.000 1.500 5.000 ZM 3.500 7.000 C 3.776 7.000 4.000 7.224 4.000 7.500 L 4.000 13.500 C 4.000 13.776 3.776 14.000 3.500 14.000 C 3.224 14.000 3.000 13.776 3.000 13.500 L 3.000 7.500 C 3.000 7.224 3.224 7.000 3.500 7.000 ZM 5.500 4.000 C 5.776 4.000 6.000 4.224 6.000 4.500 L 6.000 13.500 C 6.000 13.776 5.776 14.000 5.500 14.000 C 5.224 14.000 5.000 13.776 5.000 13.500 L 5.000 4.500 C 5.000 4.224 5.224 4.000 5.500 4.000 ZM 7.500 5.000 C 7.776 5.000 8.000 5.224 8.000 5.500 L 8.000 13.500 C 8.000 13.776 7.776 14.000 7.500 14.000 C 7.224 14.000 7.000 13.776 7.000 13.500 L 7.000 5.500 C 7.000 5.224 7.224 5.000 7.500 5.000 ZM 9.500 3.000 C 9.776 3.000 10.000 3.224 10.000 3.500 L 10.000 13.500 C 10.000 13.776 9.776 14.000 9.500 14.000 C 9.224 14.000 9.000 13.776 9.000 13.500 L 9.000 3.500 C 9.000 3.224 9.224 3.000 9.500 3.000 ZM 11.500 1.000 C 11.776 1.000 12.000 1.224 12.000 1.500 L 12.000 13.500 C 12.000 13.776 11.776 14.000 11.500 14.000 C 11.224 14.000 11.000 13.776 11.000 13.500 L 11.000 1.500 C 11.000 1.224 11.224 1.000 11.500 1.000 ZM 13.500 3.000 C 13.776 3.000 14.000 3.224 14.000 3.500 L 14.000 13.500 C 14.000 13.776 13.776 14.000 13.500 14.000 C 13.224 14.000 13.000 13.776 13.000 13.500 L 13.000 3.500 C 13.000 3.224 13.224 3.000 13.500 3.000 Z"),
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
        return _barChart!!
    }

private var _barChart: ImageVector? = null
