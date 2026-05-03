package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudX: ImageVector
    get() {
        if (_cloudX != null) return _cloudX!!
        _cloudX = phosphorBoldIcon(
            name = "CloudX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 36.000 C 126.166 36.016 95.066 54.584 79.000 84.360 C 54.005 81.778 29.623 93.190 15.595 114.038 C 1.567 134.886 0.179 161.771 11.987 183.952 C 23.794 206.134 46.872 219.996 72.000 220.000 L 160.000 220.000 C 210.810 220.000 252.000 178.810 252.000 128.000 C 252.000 77.190 210.810 36.000 160.000 36.000 ZM 160.000 196.000 L 72.000 196.000 C 47.699 196.503 27.593 177.211 27.090 152.910 C 26.587 128.609 45.879 108.503 70.180 108.000 C 68.723 114.567 67.992 121.274 68.000 128.000 C 68.000 134.627 73.373 140.000 80.000 140.000 C 86.627 140.000 92.000 134.627 92.000 128.000 C 92.000 90.445 122.445 60.000 160.000 60.000 C 197.555 60.000 228.000 90.445 228.000 128.000 C 228.000 165.555 197.555 196.000 160.000 196.000 ZM 192.490 116.490 L 177.000 132.000 L 192.520 147.510 C 197.214 152.204 197.214 159.816 192.520 164.510 C 187.826 169.204 180.214 169.204 175.520 164.510 L 160.000 149.000 L 144.490 164.520 C 139.796 169.214 132.184 169.214 127.490 164.520 C 122.796 159.826 122.796 152.214 127.490 147.520 L 143.000 132.000 L 127.480 116.490 C 122.786 111.796 122.786 104.184 127.480 99.490 C 132.174 94.796 139.786 94.796 144.480 99.490 L 160.000 115.000 L 175.510 99.480 C 180.204 94.786 187.816 94.786 192.510 99.480 C 197.204 104.174 197.204 111.786 192.510 116.480 Z"),
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
        return _cloudX!!
    }

private var _cloudX: ImageVector? = null
