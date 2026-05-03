package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) return _hourglassSimple!!
        _hourglassSimple = phosphorDuotoneIcon(
            name = "HourglassSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 205.640 53.660 L 128.000 128.000 L 50.360 53.660 C 48.072 51.374 47.385 47.936 48.619 44.947 C 49.853 41.958 52.766 40.006 56.000 40.000 L 200.000 40.000 C 203.234 40.006 206.147 41.958 207.381 44.947 C 208.615 47.936 207.928 51.374 205.640 53.660 ZM 128.000 128.000 L 50.360 202.340 C 48.072 204.626 47.385 208.064 48.619 211.053 C 49.853 214.042 52.766 215.994 56.000 216.000 L 200.000 216.000 C 203.238 216.003 206.158 214.053 207.397 211.062 C 208.636 208.071 207.951 204.628 205.660 202.340 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 211.180 196.560 L 139.570 128.000 L 211.180 59.440 C 211.221 59.394 211.264 59.351 211.310 59.310 C 215.883 54.734 217.250 47.855 214.775 41.878 C 212.300 35.901 206.469 32.003 200.000 32.000 L 56.000 32.000 C 49.531 32.003 43.700 35.901 41.225 41.878 C 38.750 47.855 40.117 54.734 44.690 59.310 C 44.736 59.351 44.779 59.394 44.820 59.440 L 116.430 128.000 L 44.820 196.560 C 44.779 196.606 44.736 196.649 44.690 196.690 C 40.117 201.266 38.750 208.145 41.225 214.122 C 43.700 220.099 49.531 223.997 56.000 224.000 L 200.000 224.000 C 206.471 224.001 212.305 220.104 214.783 214.127 C 217.261 208.149 215.894 201.267 211.320 196.690 C 211.271 196.650 211.224 196.606 211.180 196.560 ZM 56.000 48.000 L 56.000 48.000 L 56.000 48.000 ZM 200.000 48.000 L 128.000 116.920 L 56.000 48.000 ZM 56.000 208.000 L 128.000 139.080 L 200.000 208.000 Z"),
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
