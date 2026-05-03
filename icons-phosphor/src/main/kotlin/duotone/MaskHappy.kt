package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MaskHappy: ImageVector
    get() {
        if (_maskHappy != null) return _maskHappy!!
        _maskHappy = phosphorDuotoneIcon(
            name = "MaskHappy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 48.000 L 216.000 103.770 C 216.000 174.600 176.600 232.000 128.000 232.000 C 79.400 232.000 40.000 174.600 40.000 103.790 L 40.000 48.000 C 39.997 45.359 41.297 42.887 43.475 41.393 C 45.653 39.899 48.427 39.576 50.890 40.530 C 66.000 46.410 95.110 55.710 128.000 55.710 C 160.890 55.710 190.000 46.410 205.110 40.550 C 207.569 39.597 210.340 39.918 212.517 41.407 C 214.694 42.896 215.997 45.363 216.000 48.000 Z"),
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
                pathData = parseSvgPathData("M 217.000 34.800 C 212.648 31.811 207.098 31.170 202.180 33.090 C 188.150 38.550 159.820 47.710 128.000 47.710 C 96.180 47.710 67.840 38.550 53.790 33.090 C 48.869 31.180 43.322 31.820 38.965 34.801 C 34.608 37.782 32.002 42.721 32.000 48.000 L 32.000 103.770 C 32.000 139.610 41.650 173.420 59.180 198.950 C 77.340 225.410 101.780 239.950 128.000 239.950 C 154.220 239.950 178.660 225.380 196.820 198.950 C 214.350 173.440 224.000 139.630 224.000 103.790 L 224.000 48.000 C 223.990 42.714 221.371 37.773 217.000 34.800 ZM 208.000 103.800 C 208.000 136.440 199.340 167.030 183.630 189.930 C 168.540 211.900 148.790 224.000 128.000 224.000 C 107.210 224.000 87.460 211.900 72.370 189.920 C 56.660 167.000 48.000 136.430 48.000 103.790 L 48.000 48.000 C 63.110 53.870 93.580 63.710 128.000 63.710 C 162.420 63.710 192.900 53.870 208.000 48.000 L 208.000 103.810 ZM 190.000 122.670 C 192.944 125.984 192.644 131.056 189.330 134.000 C 186.016 136.944 180.944 136.644 178.000 133.330 C 175.320 130.330 169.150 128.000 164.000 128.000 C 158.850 128.000 152.640 130.340 150.000 133.330 C 147.054 136.644 141.979 136.941 138.665 133.995 C 135.351 131.049 135.054 125.974 138.000 122.660 C 143.710 116.280 154.140 112.000 164.000 112.000 C 173.860 112.000 184.250 116.280 190.000 122.660 ZM 92.000 128.000 C 86.810 128.000 80.640 130.340 78.000 133.330 C 75.054 136.644 69.979 136.941 66.665 133.995 C 63.351 131.049 63.054 125.974 66.000 122.660 C 71.750 116.280 82.180 112.000 92.000 112.000 C 101.820 112.000 112.250 116.280 118.000 122.660 C 120.946 125.974 120.649 131.049 117.335 133.995 C 114.021 136.941 108.946 136.644 106.000 133.330 C 103.360 130.340 97.190 128.000 92.000 128.000 ZM 168.450 173.190 C 158.399 185.116 143.597 191.999 128.000 191.999 C 112.403 191.999 97.601 185.116 87.550 173.190 C 84.681 169.829 85.079 164.779 88.440 161.910 C 91.801 159.041 96.851 159.439 99.720 162.800 C 106.729 171.168 117.084 176.002 128.000 176.002 C 138.916 176.002 149.271 171.168 156.280 162.800 C 159.149 159.439 164.199 159.041 167.560 161.910 C 170.921 164.779 171.319 169.829 168.450 173.190 Z"),
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
        return _maskHappy!!
    }

private var _maskHappy: ImageVector? = null
