package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorLightIcon(
            name = "HeartStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.600 58.380 C 199.748 36.572 164.376 36.536 142.480 58.300 L 128.000 71.780 L 113.520 58.300 C 91.636 36.443 56.177 36.466 34.320 58.350 C 12.463 80.234 12.486 115.693 34.370 137.550 L 123.730 228.210 C 124.857 229.352 126.395 229.995 128.000 229.995 C 129.605 229.995 131.143 229.352 132.270 228.210 L 221.600 137.590 C 232.106 127.087 238.009 112.841 238.009 97.985 C 238.009 83.129 232.106 68.883 221.600 58.380 ZM 213.080 129.130 L 128.000 215.450 L 42.890 129.100 C 25.810 111.901 25.858 84.127 42.996 66.986 C 60.134 49.845 87.908 49.793 105.110 66.870 C 105.159 66.922 105.212 66.969 105.270 67.010 L 123.910 84.370 C 126.214 86.517 129.786 86.517 132.090 84.370 L 150.730 67.000 C 150.788 66.959 150.841 66.912 150.890 66.860 C 161.999 55.685 178.235 51.304 193.457 55.373 C 208.679 59.441 220.564 71.339 224.615 86.566 C 228.667 101.793 224.267 118.024 213.080 129.120 Z"),
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
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
