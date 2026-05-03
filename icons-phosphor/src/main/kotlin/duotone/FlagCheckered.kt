package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) return _flagCheckered!!
        _flagCheckered = phosphorDuotoneIcon(
            name = "FlagCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 56.000 L 224.000 116.000 C 204.110 133.230 185.770 134.390 168.000 129.480 L 168.000 69.480 C 185.760 74.390 204.110 73.230 224.000 56.000 ZM 104.000 102.520 L 104.000 42.520 C 86.240 37.610 67.890 38.770 48.000 56.000 L 48.000 116.000 C 67.890 98.780 86.230 97.610 104.000 102.520 L 104.000 162.520 C 125.620 168.520 146.380 183.520 168.000 189.520 L 168.000 129.520 C 146.380 123.520 125.620 108.520 104.000 102.520 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 227.320 48.750 C 224.468 47.455 221.123 47.944 218.760 50.000 C 190.760 74.220 167.040 62.480 139.550 48.870 C 111.070 34.760 78.780 18.790 42.760 50.000 C 41.019 51.509 40.013 53.696 40.000 56.000 L 40.000 224.000 C 40.000 228.418 43.582 232.000 48.000 232.000 C 52.418 232.000 56.000 228.418 56.000 224.000 L 56.000 179.770 C 82.790 158.610 105.870 170.020 132.450 183.180 C 160.940 197.270 193.220 213.240 229.240 182.050 C 230.981 180.541 231.987 178.354 232.000 176.050 L 232.000 56.000 C 231.989 52.877 230.161 50.046 227.320 48.750 ZM 216.000 71.600 L 216.000 112.250 C 202.000 123.310 189.000 125.470 176.000 123.130 L 176.000 79.340 C 189.828 81.500 203.976 78.762 216.000 71.600 ZM 160.000 75.360 L 160.000 118.360 C 153.340 115.690 146.570 112.360 139.550 108.880 C 130.730 104.510 121.550 99.970 112.000 96.700 L 112.000 53.700 C 118.660 56.360 125.430 59.700 132.450 63.180 C 141.270 67.550 150.460 72.090 160.000 75.360 ZM 96.000 48.910 L 96.000 92.690 C 82.171 90.534 68.023 93.275 56.000 100.440 L 56.000 59.780 C 70.000 48.720 83.000 46.570 96.000 48.910 ZM 86.580 152.000 C 75.815 152.019 65.254 154.930 56.000 160.430 L 56.000 119.780 C 70.000 108.720 83.000 106.560 96.000 108.900 L 96.000 152.700 C 92.881 152.241 89.733 152.007 86.580 152.000 ZM 112.000 156.670 L 112.000 113.670 C 118.660 116.330 125.430 119.670 132.450 123.150 C 141.270 127.520 150.450 132.050 160.000 135.320 L 160.000 178.320 C 153.340 175.650 146.570 172.320 139.550 168.840 C 130.730 164.470 121.540 159.940 112.000 156.670 ZM 176.000 183.120 L 176.000 139.320 C 179.119 139.786 182.267 140.027 185.420 140.040 C 196.188 140.007 206.749 137.081 216.000 131.570 L 216.000 172.250 C 202.000 183.310 189.000 185.460 176.000 183.120 Z"),
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
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
