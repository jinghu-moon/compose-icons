package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ReadCvLogo: ImageVector
    get() {
        if (_readCvLogo != null) return _readCvLogo!!
        _readCvLogo = phosphorFillIcon(
            name = "ReadCvLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.780 39.250 L 80.530 16.250 C 71.829 14.719 63.534 20.530 62.000 29.230 L 32.250 198.230 C 31.515 202.411 32.472 206.713 34.910 210.189 C 37.349 213.664 41.068 216.028 45.250 216.760 L 175.500 239.760 C 179.683 240.498 183.987 239.542 187.465 237.104 C 190.943 234.665 193.308 230.944 194.040 226.760 L 223.790 57.760 C 225.308 49.056 219.483 40.770 210.780 39.250 ZM 135.500 131.560 C 134.826 135.380 131.509 138.166 127.630 138.170 C 127.161 138.170 126.692 138.130 126.230 138.050 L 84.730 130.720 C 80.637 129.713 78.027 125.704 78.764 121.554 C 79.500 117.403 83.331 114.537 87.520 115.000 L 129.000 122.290 C 131.092 122.656 132.953 123.839 134.172 125.577 C 135.391 127.316 135.869 129.469 135.500 131.560 ZM 182.500 107.380 C 181.827 111.196 178.515 113.981 174.640 113.990 C 174.167 113.991 173.695 113.947 173.230 113.860 L 90.230 99.210 C 85.878 98.440 82.975 94.287 83.745 89.935 C 84.515 85.583 88.668 82.680 93.020 83.450 L 176.020 98.110 C 178.114 98.474 179.977 99.655 181.198 101.394 C 182.420 103.134 182.899 105.287 182.530 107.380 ZM 188.050 75.860 C 187.376 79.680 184.059 82.466 180.180 82.470 C 179.711 82.469 179.242 82.429 178.780 82.350 L 95.780 67.690 C 92.898 67.266 90.475 65.309 89.453 62.582 C 88.431 59.854 88.973 56.787 90.867 54.574 C 92.760 52.361 95.707 51.352 98.560 51.940 L 181.560 66.590 C 183.656 66.951 185.521 68.132 186.745 69.871 C 187.968 71.611 188.448 73.766 188.080 75.860 Z"),
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
        return _readCvLogo!!
    }

private var _readCvLogo: ImageVector? = null
