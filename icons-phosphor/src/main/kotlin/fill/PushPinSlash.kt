package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) return _pushPinSlash!!
        _pushPinSlash = phosphorFillIcon(
            name = "PushPinSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.330 104.000 L 187.710 151.780 C 186.936 152.554 185.879 152.977 184.785 152.950 C 183.691 152.924 182.656 152.450 181.920 151.640 L 108.000 70.270 C 106.569 68.692 106.626 66.269 108.130 64.760 L 152.000 20.700 C 155.001 17.699 159.071 16.012 163.315 16.012 C 167.559 16.012 171.629 17.699 174.630 20.700 L 235.320 81.380 C 241.566 87.625 241.571 97.750 235.330 104.000 ZM 53.920 34.620 C 52.371 32.924 50.169 31.976 47.873 32.016 C 45.576 32.056 43.408 33.081 41.920 34.830 C 39.339 38.002 39.497 42.593 42.290 45.580 L 67.320 73.150 C 58.260 75.090 48.200 79.370 38.000 87.630 C 34.459 90.477 32.296 94.695 32.050 99.232 C 31.804 103.769 33.498 108.197 36.710 111.410 L 85.000 159.710 L 42.550 202.140 C 39.482 205.112 39.220 209.945 41.950 213.230 C 43.403 214.912 45.490 215.914 47.711 215.996 C 49.933 216.078 52.088 215.231 53.660 213.660 L 96.290 171.000 L 144.580 219.290 C 147.578 222.301 151.651 223.995 155.900 224.000 C 156.280 224.000 156.650 224.000 157.030 224.000 C 161.645 223.680 165.893 221.370 168.670 217.670 C 173.423 211.479 177.336 204.687 180.310 197.470 L 202.080 221.420 C 203.992 223.575 206.915 224.536 209.733 223.935 C 212.550 223.334 214.827 221.265 215.694 218.518 C 216.561 215.770 215.883 212.769 213.920 210.660 Z"),
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
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
