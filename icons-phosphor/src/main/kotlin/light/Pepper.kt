package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = phosphorLightIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 165.570 42.260 C 162.707 23.718 146.762 10.027 128.000 10.000 C 124.686 10.000 122.000 12.686 122.000 16.000 C 122.000 19.314 124.686 22.000 128.000 22.000 C 140.183 21.999 150.733 30.458 153.380 42.350 C 121.898 45.768 98.034 72.333 98.000 104.000 C 98.000 151.750 71.770 183.680 20.000 198.930 C 13.740 200.755 9.569 206.661 9.942 213.171 C 10.315 219.681 15.133 225.071 21.560 226.170 C 36.504 228.751 51.644 230.033 66.810 230.000 C 107.170 230.000 152.040 221.000 183.000 195.000 C 208.880 173.290 222.000 142.670 222.000 104.000 C 221.967 71.931 197.506 45.169 165.570 42.260 ZM 160.000 54.000 C 181.975 54.027 201.367 68.374 207.820 89.380 L 192.000 97.280 L 162.680 82.620 C 160.993 81.778 159.007 81.778 157.320 82.620 L 128.000 97.280 L 112.190 89.370 C 118.640 68.367 138.029 54.023 160.000 54.000 ZM 175.280 185.820 C 150.150 206.890 95.360 227.000 23.670 214.330 C 22.711 214.222 21.989 213.405 22.000 212.440 C 21.881 211.502 22.504 210.631 23.430 210.440 C 80.060 193.730 110.000 156.920 110.000 104.000 C 110.000 103.240 110.000 102.490 110.060 101.740 L 125.320 109.370 C 127.007 110.212 128.993 110.212 130.680 109.370 L 160.000 94.690 L 189.320 109.350 C 191.007 110.192 192.993 110.192 194.680 109.350 L 209.940 101.720 C 209.940 102.470 210.000 103.220 210.000 103.980 C 210.000 139.000 198.320 166.490 175.280 185.810 Z"),
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
