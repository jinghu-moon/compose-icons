package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) return _pushPinSlash!!
        _pushPinSlash = phosphorDuotoneIcon(
            name = "PushPinSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 229.660 98.340 L 172.390 155.800 C 183.850 178.730 170.670 201.660 162.280 212.800 C 160.884 214.632 158.766 215.774 156.468 215.933 C 154.170 216.092 151.915 215.253 150.280 213.630 L 42.340 105.760 C 40.729 104.151 39.880 101.931 40.006 99.657 C 40.132 97.384 41.221 95.271 43.000 93.850 C 72.650 69.930 100.400 83.850 100.400 83.850 L 157.670 26.390 C 160.794 23.268 165.856 23.268 168.980 26.390 L 229.660 87.000 C 231.168 88.501 232.016 90.542 232.016 92.670 C 232.016 94.798 231.168 96.839 229.660 98.340 Z"),
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
                pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 67.370 73.200 C 56.575 75.615 46.509 80.561 38.000 87.630 C 34.459 90.477 32.296 94.695 32.050 99.232 C 31.804 103.769 33.498 108.197 36.710 111.410 L 85.000 159.710 L 42.340 202.340 C 39.214 205.466 39.214 210.534 42.340 213.660 C 45.466 216.786 50.534 216.786 53.660 213.660 L 96.290 171.000 L 144.580 219.290 C 147.578 222.301 151.651 223.995 155.900 224.000 C 156.280 224.000 156.650 224.000 157.030 224.000 C 161.645 223.680 165.893 221.370 168.670 217.670 C 173.396 211.446 177.289 204.632 180.250 197.400 L 202.090 221.400 C 204.002 223.555 206.925 224.516 209.743 223.915 C 212.560 223.314 214.837 221.245 215.704 218.498 C 216.571 215.750 215.893 212.749 213.930 210.640 ZM 155.900 208.000 L 48.000 100.080 C 58.230 91.830 69.200 87.720 80.660 87.810 L 167.820 183.690 C 165.590 193.560 160.240 202.230 155.900 208.000 ZM 235.320 104.000 L 190.680 148.790 C 187.560 151.919 182.494 151.925 179.365 148.805 C 176.236 145.685 176.230 140.619 179.350 137.490 L 224.000 92.700 L 163.320 32.000 L 122.100 73.350 C 118.960 76.344 114.006 76.290 110.932 73.227 C 107.859 70.165 107.787 65.211 110.770 62.060 L 152.000 20.700 C 155.001 17.699 159.071 16.012 163.315 16.012 C 167.559 16.012 171.629 17.699 174.630 20.700 L 235.320 81.380 C 241.563 87.628 241.563 97.752 235.320 104.000 Z"),
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
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
