package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) return _hourglassSimple!!
        _hourglassSimple = phosphorFillIcon(
            name = "HourglassSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 211.310 196.690 C 215.883 201.266 217.250 208.145 214.775 214.122 C 212.300 220.099 206.469 223.997 200.000 224.000 L 56.000 224.000 C 49.529 224.001 43.695 220.104 41.217 214.127 C 38.739 208.149 40.106 201.267 44.680 196.690 C 44.726 196.649 44.769 196.606 44.810 196.560 L 116.430 128.000 L 44.820 59.440 C 44.779 59.394 44.736 59.351 44.690 59.310 C 40.117 54.734 38.750 47.855 41.225 41.878 C 43.700 35.901 49.531 32.003 56.000 32.000 L 200.000 32.000 C 206.471 31.999 212.305 35.896 214.783 41.873 C 217.261 47.851 215.894 54.733 211.320 59.310 C 211.274 59.351 211.231 59.394 211.190 59.440 L 139.570 128.000 L 211.180 196.560 C 211.221 196.606 211.264 196.649 211.310 196.690 Z"),
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
        return _hourglassSimple!!
    }

private var _hourglassSimple: ImageVector? = null
