package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Crosshair1: ImageVector
    get() {
        if (_crosshair1 != null) return _crosshair1!!
        _crosshair1 = radixIcon(
            name = "Crosshair1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.502 0.877 C 11.161 0.877 14.127 3.843 14.127 7.502 C 14.127 11.161 11.161 14.127 7.502 14.127 C 3.843 14.127 0.877 11.161 0.877 7.502 C 0.877 3.843 3.843 0.877 7.502 0.877 ZM 8.000 4.500 C 8.000 4.776 7.776 5.000 7.500 5.000 C 7.224 5.000 7.000 4.776 7.000 4.500 L 7.000 1.850 C 4.267 2.090 2.090 4.267 1.850 7.000 L 4.500 7.000 C 4.776 7.000 5.000 7.224 5.000 7.500 C 5.000 7.776 4.776 8.000 4.500 8.000 L 1.850 8.000 C 2.088 10.735 4.265 12.913 7.000 13.153 L 7.000 10.500 C 7.000 10.224 7.224 10.000 7.500 10.000 C 7.776 10.000 8.000 10.224 8.000 10.500 L 8.000 13.153 C 10.737 12.915 12.916 10.737 13.154 8.000 L 10.500 8.000 C 10.224 8.000 10.000 7.776 10.000 7.500 C 10.000 7.224 10.224 7.000 10.500 7.000 L 13.153 7.000 C 12.913 4.265 10.736 2.087 8.000 1.849 L 8.000 4.500 Z"),
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
        return _crosshair1!!
    }

private var _crosshair1: ImageVector? = null
