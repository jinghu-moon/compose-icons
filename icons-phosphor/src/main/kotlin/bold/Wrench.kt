package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorBoldIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.470 67.500 C 228.992 63.848 225.816 61.154 221.972 60.292 C 218.128 59.429 214.106 60.509 211.210 63.180 L 172.430 99.000 L 159.750 96.280 L 157.000 83.570 L 192.790 44.790 C 195.461 41.894 196.541 37.872 195.678 34.028 C 194.816 30.184 192.122 27.008 188.470 25.530 C 160.701 14.351 128.957 20.499 107.368 41.235 C 85.778 61.972 78.358 93.443 88.410 121.640 L 30.920 174.180 C 30.783 174.299 30.653 174.426 30.530 174.560 C 16.666 188.651 16.758 211.286 30.736 225.264 C 44.714 239.242 67.349 239.334 81.440 225.470 L 81.820 225.080 L 134.360 167.590 C 162.566 177.670 194.061 170.254 214.807 148.649 C 235.553 127.044 241.685 95.274 230.470 67.500 ZM 160.000 148.000 C 151.891 148.024 143.890 146.133 136.650 142.480 C 131.847 140.059 126.019 141.129 122.390 145.100 L 64.310 208.660 C 59.616 213.354 52.004 213.354 47.310 208.660 C 42.616 203.966 42.616 196.354 47.310 191.660 L 110.860 133.590 C 114.831 129.961 115.901 124.133 113.480 119.330 C 109.844 112.092 107.967 104.099 108.000 96.000 C 108.033 67.295 131.295 44.033 160.000 44.000 L 160.890 44.000 L 135.170 71.870 C 132.528 74.737 131.442 78.708 132.260 82.520 L 137.920 108.870 C 138.912 113.484 142.516 117.088 147.130 118.080 L 173.480 123.740 C 177.292 124.558 181.263 123.472 184.130 120.830 L 212.000 95.120 C 212.000 95.420 212.000 95.710 212.000 96.010 C 211.961 124.711 188.701 147.967 160.000 148.000 Z"),
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
        return _wrench!!
    }

private var _wrench: ImageVector? = null
