package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorFillIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 127.920 150.000 C 128.726 160.026 123.194 169.491 114.063 173.710 C 104.932 177.929 94.139 176.006 87.027 168.893 C 79.914 161.781 77.991 150.988 82.210 141.857 C 86.429 132.726 95.894 127.194 105.920 128.000 C 117.657 128.943 126.977 138.263 127.920 150.000 ZM 216.000 40.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 200.000 24.000 C 208.837 24.000 216.000 31.163 216.000 40.000 ZM 192.000 72.000 C 192.000 67.582 188.418 64.000 184.000 64.000 L 156.270 64.000 C 151.979 63.932 148.367 67.195 148.000 71.470 C 147.853 73.682 148.631 75.856 150.147 77.473 C 151.664 79.090 153.783 80.005 156.000 80.000 L 164.690 80.000 L 148.000 96.690 L 137.660 86.340 C 136.129 84.808 134.042 83.963 131.877 83.997 C 129.711 84.031 127.652 84.941 126.170 86.520 C 123.238 89.808 123.419 94.822 126.580 97.890 L 136.690 108.000 L 126.000 118.640 C 108.865 107.335 85.954 110.836 72.977 126.743 C 60.001 142.649 61.172 165.797 75.688 180.312 C 90.203 194.828 113.351 195.999 129.257 183.023 C 145.164 170.046 148.665 147.135 137.360 130.000 L 148.000 119.310 L 158.340 129.660 C 159.912 131.231 162.067 132.078 164.289 131.996 C 166.510 131.914 168.597 130.912 170.050 129.230 C 172.771 125.938 172.510 121.109 169.450 118.130 L 159.310 108.000 L 176.000 91.310 L 176.000 99.730 C 175.947 104.011 179.205 107.609 183.470 107.980 C 185.682 108.127 187.856 107.349 189.473 105.833 C 191.090 104.316 192.005 102.197 192.000 99.980 Z"),
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
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
