package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) return _cloudCheck!!
        _cloudCheck = phosphorBoldIcon(
            name = "CloudCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 36.000 C 126.166 36.016 95.066 54.584 79.000 84.360 C 54.005 81.778 29.623 93.190 15.595 114.038 C 1.567 134.886 0.179 161.771 11.987 183.952 C 23.794 206.134 46.872 219.996 72.000 220.000 L 160.000 220.000 C 210.810 220.000 252.000 178.810 252.000 128.000 C 252.000 77.190 210.810 36.000 160.000 36.000 ZM 160.000 196.000 L 72.000 196.000 C 47.699 196.503 27.593 177.211 27.090 152.910 C 26.587 128.609 45.879 108.503 70.180 108.000 C 68.723 114.567 67.992 121.274 68.000 128.000 C 68.000 134.627 73.373 140.000 80.000 140.000 C 86.627 140.000 92.000 134.627 92.000 128.000 C 92.000 90.445 122.445 60.000 160.000 60.000 C 197.555 60.000 228.000 90.445 228.000 128.000 C 228.000 165.555 197.555 196.000 160.000 196.000 ZM 200.490 103.510 C 202.749 105.762 204.019 108.820 204.019 112.010 C 204.019 115.200 202.749 118.258 200.490 120.510 L 152.490 168.510 C 150.238 170.769 147.180 172.039 143.990 172.039 C 140.800 172.039 137.742 170.769 135.490 168.510 L 111.490 144.510 C 106.796 139.816 106.796 132.204 111.490 127.510 C 116.184 122.816 123.796 122.816 128.490 127.510 L 144.000 143.000 L 183.510 103.480 C 185.765 101.231 188.821 99.970 192.006 99.976 C 195.191 99.981 198.243 101.253 200.490 103.510 Z"),
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
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
