package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = phosphorBoldIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 68.000 L 190.060 68.000 C 193.772 62.601 195.835 56.240 196.000 49.690 C 196.299 39.605 192.424 29.844 185.290 22.710 C 178.156 15.575 168.395 11.701 158.310 12.000 C 148.993 12.199 140.182 16.276 134.000 23.250 C 131.745 25.823 129.736 28.602 128.000 31.550 C 126.264 28.602 124.255 25.823 122.000 23.250 C 115.818 16.276 107.007 12.199 97.690 12.000 C 87.605 11.701 77.844 15.575 70.710 22.710 C 63.575 29.844 59.701 39.605 60.000 49.690 C 60.165 56.240 62.228 62.601 65.940 68.000 L 40.000 68.000 C 28.954 68.000 20.000 76.954 20.000 88.000 L 20.000 120.000 C 19.998 129.505 26.687 137.699 36.000 139.600 L 36.000 200.000 C 36.000 211.046 44.954 220.000 56.000 220.000 L 200.000 220.000 C 211.046 220.000 220.000 211.046 220.000 200.000 L 220.000 139.600 C 229.313 137.699 236.002 129.505 236.000 120.000 L 236.000 88.000 C 236.000 76.954 227.046 68.000 216.000 68.000 ZM 212.000 116.000 L 140.000 116.000 L 140.000 92.000 L 212.000 92.000 ZM 152.000 39.170 C 153.789 37.184 156.327 36.035 159.000 36.000 L 159.350 36.000 C 162.769 35.990 166.046 37.368 168.430 39.819 C 170.815 42.269 172.103 45.582 172.000 49.000 C 171.965 51.673 170.816 54.211 168.830 56.000 C 161.930 62.120 150.580 65.260 141.200 66.760 C 142.700 57.420 145.840 46.070 152.000 39.170 ZM 87.700 39.700 C 90.074 37.352 93.271 36.024 96.610 36.000 L 97.000 36.000 C 99.673 36.035 102.211 37.184 104.000 39.170 C 110.120 46.070 113.260 57.410 114.750 66.780 C 105.450 65.270 94.000 62.130 87.170 56.000 C 85.184 54.211 84.035 51.673 84.000 49.000 C 83.911 45.525 85.248 42.164 87.700 39.700 ZM 44.000 92.000 L 116.000 92.000 L 116.000 116.000 L 44.000 116.000 ZM 60.000 140.000 L 116.000 140.000 L 116.000 196.000 L 60.000 196.000 ZM 140.000 196.000 L 140.000 140.000 L 196.000 140.000 L 196.000 196.000 Z"),
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
        return _gift!!
    }

private var _gift: ImageVector? = null
