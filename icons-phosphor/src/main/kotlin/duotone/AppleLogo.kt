package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) return _appleLogo!!
        _appleLogo = phosphorDuotoneIcon(
            name = "AppleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 73.520 ZM 216.000 172.780 C 199.210 161.250 192.000 141.910 192.000 120.000 C 192.000 101.700 203.680 85.190 216.000 73.520 C 204.530 62.660 185.000 56.000 168.000 56.000 C 153.460 55.966 139.345 60.906 128.000 70.000 L 128.000 70.000 C 116.891 61.093 103.118 56.164 88.880 56.000 C 52.000 55.500 23.060 86.300 24.000 123.190 C 24.811 155.133 38.368 185.424 61.650 207.310 C 67.592 212.898 75.443 216.007 83.600 216.000 L 171.300 216.000 C 180.104 216.036 188.529 212.414 194.560 206.000 C 210.410 189.000 216.000 172.800 216.000 172.800 Z"),
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
                pathData = parseSvgPathData("M 223.300 169.590 C 222.700 168.219 221.731 167.042 220.500 166.190 C 203.530 154.530 200.000 134.640 200.000 120.000 C 200.000 102.330 213.470 86.940 221.500 79.330 C 223.096 77.819 224.001 75.718 224.001 73.520 C 224.001 71.322 223.096 69.221 221.500 67.710 C 208.820 55.740 187.820 48.000 168.000 48.000 C 153.763 48.013 139.846 52.233 128.000 60.130 C 99.496 41.016 61.435 44.830 37.290 69.220 C 23.152 83.654 15.470 103.203 16.000 123.400 C 16.793 157.485 31.258 189.821 56.140 213.130 C 63.558 220.139 73.385 224.030 83.590 224.000 L 171.270 224.000 C 182.298 224.021 192.841 219.470 200.390 211.430 C 207.308 203.985 213.292 195.724 218.210 186.830 C 225.230 174.000 224.330 172.000 223.300 169.590 ZM 188.670 200.530 C 184.156 205.323 177.855 208.029 171.270 208.000 L 83.590 208.000 C 77.478 208.020 71.592 205.689 67.150 201.490 C 45.375 181.104 32.709 152.820 32.000 123.000 C 31.558 107.153 37.567 91.805 48.650 80.470 C 59.004 69.892 73.197 63.951 88.000 64.000 L 88.780 64.000 C 101.243 64.131 113.298 68.457 123.000 76.280 C 125.923 78.620 130.077 78.620 133.000 76.280 C 142.909 68.286 155.269 63.949 168.000 64.000 C 180.713 64.148 193.150 67.723 204.000 74.350 C 191.000 88.870 184.000 104.820 184.000 120.000 C 184.000 143.770 191.640 162.730 206.180 175.300 C 201.605 184.519 195.706 193.019 188.670 200.530 ZM 128.230 30.000 C 132.794 12.325 148.745 -0.018 167.000 0.000 L 168.000 0.000 C 172.418 0.000 176.000 3.582 176.000 8.000 C 176.000 12.418 172.418 16.000 168.000 16.000 L 167.000 16.000 C 156.055 15.999 146.496 23.403 143.760 34.000 C 142.655 38.280 138.290 40.855 134.010 39.750 C 129.730 38.645 127.155 34.280 128.260 30.000 Z"),
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
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
