package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorLightIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.210 165.000 C 230.867 167.877 229.877 171.553 227.000 173.210 C 224.123 174.867 220.447 173.877 218.790 171.000 L 198.790 135.920 C 186.963 144.211 173.758 150.336 159.790 154.010 L 165.960 191.010 C 166.223 192.580 165.852 194.191 164.927 195.487 C 164.002 196.783 162.600 197.658 161.030 197.920 C 160.699 197.971 160.365 197.998 160.030 198.000 C 157.104 197.997 154.608 195.885 154.120 193.000 L 148.000 156.440 C 134.748 158.522 121.252 158.522 108.000 156.440 L 101.920 193.000 C 101.432 195.888 98.929 198.002 96.000 198.000 C 95.665 197.998 95.331 197.971 95.000 197.920 C 93.429 197.656 92.028 196.778 91.106 195.480 C 90.183 194.182 89.814 192.570 90.080 191.000 L 96.250 154.000 C 82.282 150.326 69.077 144.201 57.250 135.910 L 37.210 171.000 C 35.553 173.877 31.877 174.867 29.000 173.210 C 26.123 171.553 25.133 167.877 26.790 165.000 L 47.640 128.520 C 40.222 122.261 33.421 115.306 27.330 107.750 C 25.248 105.171 25.651 101.392 28.230 99.310 C 30.809 97.228 34.588 97.631 36.670 100.210 C 53.540 121.110 83.070 146.000 128.000 146.000 C 172.930 146.000 202.460 121.110 219.330 100.230 C 221.412 97.651 225.191 97.248 227.770 99.330 C 230.349 101.412 230.752 105.191 228.670 107.770 C 222.579 115.326 215.778 122.281 208.360 128.540 Z"),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
