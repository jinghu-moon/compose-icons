package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HourglassSimpleHigh: ImageVector
    get() {
        if (_hourglassSimpleHigh != null) return _hourglassSimpleHigh!!
        _hourglassSimpleHigh = phosphorRegularIcon(
            name = "HourglassSimpleHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 211.180 196.560 L 139.570 128.000 L 211.180 59.440 C 211.221 59.394 211.264 59.351 211.310 59.310 C 215.883 54.734 217.250 47.855 214.775 41.878 C 212.300 35.901 206.469 32.003 200.000 32.000 L 56.000 32.000 C 49.533 32.007 43.706 35.907 41.233 41.883 C 38.760 47.859 40.128 54.735 44.700 59.310 L 44.820 59.440 L 116.430 128.000 L 44.820 196.560 L 44.700 196.690 C 40.128 201.265 38.760 208.141 41.233 214.117 C 43.706 220.093 49.533 223.993 56.000 224.000 L 200.000 224.000 C 206.471 224.001 212.305 220.104 214.783 214.127 C 217.261 208.149 215.894 201.267 211.320 196.690 C 211.271 196.650 211.224 196.606 211.180 196.560 ZM 56.000 48.000 L 56.000 48.000 L 56.000 48.000 ZM 89.430 80.000 L 166.570 80.000 L 128.000 116.920 ZM 200.000 48.000 L 183.300 64.000 L 72.720 64.000 L 56.000 48.000 ZM 56.000 208.000 L 128.000 139.080 L 200.000 208.000 Z"),
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
        return _hourglassSimpleHigh!!
    }

private var _hourglassSimpleHigh: ImageVector? = null
