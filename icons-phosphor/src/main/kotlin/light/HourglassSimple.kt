package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) return _hourglassSimple!!
        _hourglassSimple = phosphorLightIcon(
            name = "HourglassSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 209.800 198.000 L 136.680 128.000 L 209.800 58.000 L 209.890 57.910 C 213.900 53.908 215.103 47.884 212.938 42.649 C 210.773 37.414 205.665 34.000 200.000 34.000 L 56.000 34.000 C 50.337 34.000 45.232 37.411 43.065 42.642 C 40.898 47.874 42.096 53.896 46.100 57.900 L 46.190 57.990 L 119.310 127.990 L 46.200 198.000 L 46.110 198.090 C 42.100 202.092 40.897 208.116 43.062 213.351 C 45.227 218.586 50.335 222.000 56.000 222.000 L 200.000 222.000 C 205.663 222.000 210.768 218.589 212.935 213.358 C 215.102 208.126 213.904 202.104 209.900 198.100 ZM 54.160 47.230 C 54.449 46.470 55.187 45.977 56.000 46.000 L 200.000 46.000 C 200.801 45.999 201.525 46.476 201.840 47.212 C 202.156 47.947 202.002 48.800 201.450 49.380 L 128.000 119.690 L 54.560 49.380 C 53.989 48.818 53.829 47.960 54.160 47.230 ZM 201.840 208.770 C 201.551 209.530 200.813 210.023 200.000 210.000 L 56.000 210.000 C 55.199 210.001 54.475 209.524 54.160 208.788 C 53.844 208.053 53.998 207.200 54.550 206.620 L 128.000 136.310 L 201.440 206.620 C 202.011 207.182 202.171 208.040 201.840 208.770 Z"),
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
        return _hourglassSimple!!
    }

private var _hourglassSimple: ImageVector? = null
