package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorLightIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 122.000 L 222.000 122.000 L 222.000 48.000 C 221.999 43.850 220.156 39.915 216.970 37.256 C 213.784 34.597 209.583 33.489 205.500 34.230 L 45.500 63.320 C 38.843 64.528 34.002 70.324 34.000 77.090 L 34.000 122.000 L 16.000 122.000 C 12.686 122.000 10.000 124.686 10.000 128.000 C 10.000 131.314 12.686 134.000 16.000 134.000 L 34.000 134.000 L 34.000 178.910 C 34.002 185.676 38.843 191.472 45.500 192.680 L 205.500 221.770 C 206.325 221.920 207.162 221.997 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 134.000 L 240.000 134.000 C 243.314 134.000 246.000 131.314 246.000 128.000 C 246.000 124.686 243.314 122.000 240.000 122.000 ZM 46.000 77.090 C 45.984 76.112 46.678 75.266 47.640 75.090 L 207.640 45.990 L 208.010 45.990 C 209.115 45.990 210.010 46.885 210.010 47.990 L 210.010 121.990 L 46.000 121.990 ZM 210.000 208.000 C 209.998 208.591 209.734 209.152 209.280 209.530 C 208.826 209.913 208.225 210.074 207.640 209.970 L 47.640 180.870 C 46.678 180.694 45.984 179.848 46.000 178.870 L 46.000 134.000 L 210.000 134.000 Z"),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
