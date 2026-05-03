package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = phosphorLightIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.100 51.710 C 226.090 45.270 218.640 42.000 209.000 42.000 C 192.670 42.000 171.590 53.060 152.600 71.590 C 145.596 78.332 139.358 85.828 134.000 93.940 L 134.000 56.000 C 134.000 52.686 131.314 50.000 128.000 50.000 C 124.686 50.000 122.000 52.686 122.000 56.000 L 122.000 93.940 C 116.661 85.831 110.443 78.335 103.460 71.590 C 84.490 53.060 63.400 42.000 47.070 42.000 C 37.380 42.000 29.930 45.270 24.920 51.710 C 19.390 58.820 17.210 69.400 18.260 84.050 C 19.170 96.780 22.380 110.580 25.070 121.180 C 31.350 145.920 45.840 154.180 56.850 156.860 C 44.490 176.508 50.397 202.455 70.045 214.815 C 89.693 227.175 115.640 221.268 128.000 201.620 C 140.360 221.270 166.310 227.180 185.960 214.820 C 205.610 202.460 211.520 176.510 199.160 156.860 C 210.160 154.230 224.660 145.920 230.940 121.180 C 237.550 95.210 242.720 66.650 231.100 51.710 ZM 92.000 210.000 C 76.183 209.774 63.236 197.351 62.357 181.557 C 61.478 165.763 72.966 151.980 88.660 150.000 C 91.974 149.638 94.367 146.659 94.005 143.345 C 93.643 140.031 90.664 137.638 87.350 138.000 C 80.000 138.822 73.001 141.583 67.070 146.000 C 58.070 146.310 42.950 142.840 36.700 118.240 C 33.450 105.430 24.810 71.410 34.390 59.090 C 37.050 55.660 41.200 54.000 47.070 54.000 C 59.950 54.000 78.790 64.280 95.070 80.180 C 111.690 96.390 122.000 114.590 122.000 127.670 L 122.000 180.000 C 122.000 196.569 108.569 210.000 92.000 210.000 ZM 219.310 118.230 C 213.070 142.830 198.000 146.290 189.000 146.000 C 183.071 141.579 176.071 138.817 168.720 138.000 C 165.406 137.624 162.416 140.006 162.040 143.320 C 161.664 146.634 164.046 149.624 167.360 150.000 C 183.464 151.748 195.298 165.924 194.143 182.081 C 192.988 198.238 179.257 210.586 163.069 210.026 C 146.880 209.466 134.035 196.198 134.000 180.000 L 134.000 127.670 C 134.000 114.590 144.320 96.390 160.930 80.180 C 177.230 64.280 196.070 54.000 209.000 54.000 C 214.870 54.000 219.000 55.660 221.680 59.080 C 231.210 71.400 222.570 105.420 219.320 118.230 Z"),
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
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
