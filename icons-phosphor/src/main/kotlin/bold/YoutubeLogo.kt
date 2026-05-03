package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) return _youtubeLogo!!
        _youtubeLogo = phosphorBoldIcon(
            name = "YoutubeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 170.490 117.910 L 114.490 81.910 C 110.798 79.536 106.105 79.367 102.252 81.470 C 98.399 83.572 96.001 87.611 96.000 92.000 L 96.000 164.000 C 96.001 168.389 98.399 172.428 102.252 174.530 C 106.105 176.633 110.798 176.464 114.490 174.090 L 170.490 138.090 C 173.921 135.881 175.994 132.080 175.994 128.000 C 175.994 123.920 173.921 120.119 170.490 117.910 ZM 120.000 142.000 L 120.000 114.000 L 141.810 128.000 ZM 238.210 68.500 C 235.969 59.771 229.670 52.650 221.280 49.360 C 186.400 35.910 131.290 36.000 128.000 36.000 C 124.710 36.000 69.600 35.910 34.720 49.380 C 26.330 52.670 20.031 59.791 17.790 68.520 C 15.150 78.720 12.000 97.320 12.000 128.000 C 12.000 158.680 15.150 177.280 17.790 187.480 C 20.031 196.209 26.330 203.330 34.720 206.620 C 68.210 219.550 120.360 220.000 127.370 220.000 L 128.630 220.000 C 135.630 220.000 187.790 219.550 221.280 206.620 C 229.670 203.330 235.969 196.209 238.210 187.480 C 240.850 177.280 244.000 158.680 244.000 128.000 C 244.000 97.320 240.850 78.720 238.210 68.520 ZM 215.000 181.460 C 214.707 182.704 213.838 183.734 212.660 184.230 C 182.780 195.760 132.270 196.000 128.320 196.000 L 127.930 196.000 C 127.400 196.000 74.290 196.170 43.370 184.230 C 42.181 183.741 41.299 182.711 41.000 181.460 C 39.120 174.220 36.000 157.640 36.000 128.000 C 36.000 98.360 39.150 81.780 41.000 74.540 C 41.293 73.296 42.162 72.266 43.340 71.770 C 74.290 59.830 127.390 60.000 127.920 60.000 L 128.070 60.000 C 128.610 60.000 181.710 59.830 212.630 71.770 C 213.819 72.259 214.701 73.289 215.000 74.540 C 216.880 81.780 220.000 98.360 220.000 128.000 C 220.000 157.640 216.850 174.220 215.000 181.460 Z"),
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
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
