package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) return _sneakerMove!!
        _sneakerMove = phosphorBoldIcon(
            name = "SneakerMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.940 163.060 L 204.320 148.750 C 189.376 141.335 179.946 126.072 180.000 109.390 L 180.000 80.000 C 180.000 73.373 174.627 68.000 168.000 68.000 C 143.711 67.972 124.028 48.289 124.000 24.000 C 123.999 19.444 121.418 15.281 117.338 13.255 C 113.257 11.228 108.381 11.687 104.750 14.440 L 27.750 72.850 L 27.450 73.080 C 23.043 76.646 20.356 81.916 20.059 87.578 C 19.761 93.239 21.881 98.761 25.890 102.770 L 139.570 216.490 C 141.822 218.740 144.876 220.003 148.060 220.000 L 224.000 220.000 C 235.046 220.000 244.000 211.046 244.000 200.000 L 244.000 180.940 C 244.024 173.359 239.734 166.424 232.940 163.060 ZM 220.000 196.000 L 153.000 196.000 L 46.080 89.050 L 58.940 79.290 L 100.140 120.490 C 104.834 125.184 112.446 125.184 117.140 120.490 C 121.834 115.796 121.834 108.184 117.140 103.490 L 78.250 64.650 L 103.490 45.510 C 111.405 69.092 131.525 86.499 156.000 90.940 L 156.000 109.390 C 155.911 135.172 170.490 158.760 193.590 170.210 L 220.000 183.420 ZM 55.490 184.000 L 32.000 184.000 C 25.373 184.000 20.000 178.627 20.000 172.000 C 20.000 165.373 25.373 160.000 32.000 160.000 L 55.490 160.000 C 62.117 160.000 67.490 165.373 67.490 172.000 C 67.490 178.627 62.117 184.000 55.490 184.000 ZM 103.490 208.000 C 103.490 214.627 98.117 220.000 91.490 220.000 L 48.000 220.000 C 41.373 220.000 36.000 214.627 36.000 208.000 C 36.000 201.373 41.373 196.000 48.000 196.000 L 91.490 196.000 C 98.117 196.000 103.490 201.373 103.490 208.000 Z"),
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
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
