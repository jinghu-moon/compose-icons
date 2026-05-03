package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Images: ImageVector
    get() {
        if (_images != null) return _images!!
        _images = phosphorThinIcon(
            name = "Images",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 44.000 L 72.000 44.000 C 65.373 44.000 60.000 49.373 60.000 56.000 L 60.000 76.000 L 40.000 76.000 C 33.373 76.000 28.000 81.373 28.000 88.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 184.000 212.000 C 190.627 212.000 196.000 206.627 196.000 200.000 L 196.000 180.000 L 216.000 180.000 C 222.627 180.000 228.000 174.627 228.000 168.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 68.000 56.000 C 68.000 53.791 69.791 52.000 72.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 L 220.000 128.400 L 203.110 111.510 C 200.858 109.251 197.800 107.981 194.610 107.981 C 191.420 107.981 188.362 109.251 186.110 111.510 L 163.280 134.340 L 116.490 87.510 C 114.238 85.251 111.180 83.981 107.990 83.981 C 104.800 83.981 101.742 85.251 99.490 87.510 L 68.000 119.000 ZM 188.000 200.000 C 188.000 202.209 186.209 204.000 184.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 88.000 C 36.000 85.791 37.791 84.000 40.000 84.000 L 60.000 84.000 L 60.000 168.000 C 60.000 174.627 65.373 180.000 72.000 180.000 L 188.000 180.000 ZM 216.000 172.000 L 72.000 172.000 C 69.791 172.000 68.000 170.209 68.000 168.000 L 68.000 130.340 L 105.170 93.170 C 105.920 92.419 106.938 91.997 108.000 91.997 C 109.062 91.997 110.080 92.419 110.830 93.170 L 160.490 142.830 C 162.051 144.388 164.579 144.388 166.140 142.830 L 191.800 117.170 C 192.550 116.419 193.568 115.997 194.630 115.997 C 195.692 115.997 196.710 116.419 197.460 117.170 L 220.000 139.710 L 220.000 168.000 C 220.000 170.209 218.209 172.000 216.000 172.000 ZM 164.000 84.000 C 164.000 79.582 167.582 76.000 172.000 76.000 C 176.418 76.000 180.000 79.582 180.000 84.000 C 180.000 88.418 176.418 92.000 172.000 92.000 C 167.582 92.000 164.000 88.418 164.000 84.000 Z"),
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
        return _images!!
    }

private var _images: ImageVector? = null
