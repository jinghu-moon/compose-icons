package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LapTimer: ImageVector
    get() {
        if (_lapTimer != null) return _lapTimer!!
        _lapTimer = radixIcon(
            name = "LapTimer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 0.000 C 9.276 0.000 9.500 0.224 9.500 0.500 C 9.500 0.776 9.276 1.000 9.000 1.000 L 8.000 1.000 L 8.000 2.121 C 9.099 2.206 10.119 2.568 10.992 3.138 C 11.011 3.110 11.033 3.083 11.058 3.058 L 12.058 2.058 L 12.157 1.978 C 12.399 1.818 12.729 1.844 12.943 2.058 C 13.156 2.271 13.183 2.601 13.023 2.844 L 12.943 2.942 L 11.966 3.918 C 13.158 5.080 13.900 6.703 13.900 8.500 C 13.900 12.034 11.035 14.899 7.500 14.899 C 3.966 14.899 1.100 12.034 1.100 8.500 C 1.100 5.134 3.700 2.376 7.000 2.121 L 7.000 1.000 L 6.000 1.000 C 5.724 1.000 5.500 0.776 5.500 0.500 C 5.500 0.224 5.724 0.000 6.000 0.000 L 9.000 0.000 ZM 7.500 3.100 C 4.518 3.100 2.100 5.518 2.100 8.500 C 2.100 11.482 4.518 13.899 7.500 13.899 C 10.482 13.899 12.900 11.482 12.900 8.500 C 12.900 5.518 10.482 3.100 7.500 3.100 ZM 7.500 8.500 L 10.612 11.611 C 9.816 12.408 8.715 12.899 7.500 12.899 C 5.070 12.899 3.100 10.930 3.100 8.500 C 3.100 6.070 5.070 4.100 7.500 4.100 L 7.500 8.500 Z"),
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
        return _lapTimer!!
    }

private var _lapTimer: ImageVector? = null
