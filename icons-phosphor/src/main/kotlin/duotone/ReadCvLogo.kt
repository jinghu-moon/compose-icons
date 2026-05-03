package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ReadCvLogo: ImageVector
    get() {
        if (_readCvLogo != null) return _readCvLogo!!
        _readCvLogo = phosphorDuotoneIcon(
            name = "ReadCvLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 215.880 56.390 L 186.130 225.390 C 185.762 227.480 184.578 229.338 182.840 230.555 C 181.101 231.773 178.950 232.249 176.860 231.880 L 46.610 208.880 C 42.262 208.113 39.357 203.969 40.120 199.620 L 69.870 30.620 C 70.238 28.530 71.422 26.672 73.160 25.455 C 74.899 24.237 77.050 23.761 79.140 24.130 L 209.390 47.130 C 213.738 47.897 216.643 52.041 215.880 56.390 Z"),
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
                pathData = parseSvgPathData("M 210.780 39.250 L 80.530 16.250 C 71.829 14.719 63.534 20.530 62.000 29.230 L 32.250 198.230 C 31.515 202.411 32.472 206.713 34.910 210.189 C 37.349 213.664 41.068 216.028 45.250 216.760 L 175.500 239.760 L 175.500 239.760 C 179.683 240.498 183.987 239.542 187.465 237.104 C 190.943 234.665 193.308 230.944 194.040 226.760 L 223.790 57.760 C 225.308 49.056 219.483 40.770 210.780 39.250 ZM 178.260 224.000 L 178.260 224.000 L 48.000 201.000 L 77.750 32.000 L 208.000 55.000 ZM 89.340 58.420 C 90.112 54.072 94.261 51.171 98.610 51.940 L 181.610 66.590 C 185.699 67.306 188.561 71.032 188.199 75.168 C 187.837 79.303 184.372 82.475 180.220 82.470 C 179.751 82.469 179.282 82.429 178.820 82.350 L 95.820 67.690 C 91.472 66.918 88.571 62.769 89.340 58.420 ZM 83.800 89.940 C 84.168 87.850 85.352 85.992 87.090 84.775 C 88.829 83.557 90.980 83.081 93.070 83.450 L 176.070 98.110 C 180.190 98.799 183.086 102.542 182.719 106.703 C 182.353 110.863 178.847 114.042 174.670 114.000 C 174.197 114.001 173.725 113.957 173.260 113.870 L 90.260 99.220 C 85.915 98.439 83.024 94.286 83.800 89.940 ZM 78.250 121.450 C 79.036 117.114 83.181 114.230 87.520 115.000 L 129.000 122.290 C 133.087 123.006 135.949 126.729 135.590 130.863 C 135.230 134.997 131.770 138.170 127.620 138.170 C 127.151 138.170 126.682 138.130 126.220 138.050 L 84.720 130.720 C 80.376 129.944 77.481 125.796 78.250 121.450 Z"),
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
        return _readCvLogo!!
    }

private var _readCvLogo: ImageVector? = null
