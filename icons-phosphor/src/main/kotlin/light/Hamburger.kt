package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = phosphorLightIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 48.070 102.000 L 207.930 102.000 C 212.185 102.026 216.220 100.116 218.897 96.808 C 221.574 93.501 222.602 89.156 221.690 85.000 C 214.450 50.830 175.050 26.000 128.000 26.000 C 80.950 26.000 41.550 50.830 34.310 85.000 C 33.398 89.156 34.426 93.501 37.103 96.808 C 39.780 100.116 43.815 102.026 48.070 102.000 ZM 46.070 87.520 C 52.000 59.290 87.250 38.000 128.000 38.000 C 168.750 38.000 204.000 59.290 210.000 87.520 C 210.150 88.127 210.008 88.770 209.615 89.256 C 209.223 89.743 208.625 90.018 208.000 90.000 L 48.070 90.000 C 47.445 90.018 46.847 89.743 46.455 89.256 C 46.062 88.770 45.920 88.127 46.070 87.520 ZM 230.000 154.360 L 188.100 169.580 L 150.230 154.430 C 148.799 153.857 147.201 153.857 145.770 154.430 L 108.000 169.540 L 70.230 154.430 C 68.860 153.881 67.337 153.856 65.950 154.360 L 21.950 170.360 C 19.211 171.354 17.583 174.172 18.088 177.041 C 18.593 179.910 21.087 182.001 24.000 182.000 C 24.699 181.998 25.392 181.876 26.050 181.640 L 42.050 175.840 L 42.050 184.000 C 42.050 204.987 59.063 222.000 80.050 222.000 L 176.050 222.000 C 197.037 222.000 214.050 204.987 214.050 184.000 L 214.050 172.930 L 234.100 165.640 C 237.215 164.508 238.822 161.065 237.690 157.950 C 236.558 154.835 233.115 153.228 230.000 154.360 ZM 202.000 184.000 C 202.000 198.359 190.359 210.000 176.000 210.000 L 80.000 210.000 C 65.641 210.000 54.000 198.359 54.000 184.000 L 54.000 171.480 L 67.900 166.420 L 105.770 181.570 C 107.201 182.143 108.799 182.143 110.230 181.570 L 148.000 166.460 L 185.770 181.570 C 187.140 182.119 188.663 182.144 190.050 181.640 L 202.000 177.290 ZM 18.000 128.000 C 18.000 124.686 20.686 122.000 24.000 122.000 L 232.000 122.000 C 235.314 122.000 238.000 124.686 238.000 128.000 C 238.000 131.314 235.314 134.000 232.000 134.000 L 24.000 134.000 C 20.686 134.000 18.000 131.314 18.000 128.000 Z"),
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
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
