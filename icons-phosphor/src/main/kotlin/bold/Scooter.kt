package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorBoldIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 132.000 L 211.320 132.000 L 179.380 36.210 C 177.749 31.309 173.165 28.002 168.000 28.000 L 136.000 28.000 C 129.373 28.000 124.000 33.373 124.000 40.000 C 124.000 46.627 129.373 52.000 136.000 52.000 L 159.350 52.000 L 174.180 96.490 L 114.590 164.000 L 83.200 164.000 C 79.268 144.662 61.820 131.081 42.108 132.016 C 22.396 132.950 6.311 148.121 4.226 167.744 C 2.141 187.368 14.679 205.580 33.754 210.636 C 52.830 215.691 72.742 206.080 80.650 188.000 L 120.000 188.000 C 123.444 188.001 126.722 186.522 129.000 183.940 L 183.000 122.810 L 188.600 139.620 C 172.664 151.179 167.507 172.615 176.443 190.157 C 185.379 207.698 205.751 216.130 224.470 210.034 C 243.190 203.938 254.690 185.128 251.584 165.688 C 248.477 146.248 231.687 131.958 212.000 132.000 ZM 44.000 188.000 C 35.163 188.000 28.000 180.837 28.000 172.000 C 28.000 163.163 35.163 156.000 44.000 156.000 C 52.837 156.000 60.000 163.163 60.000 172.000 C 60.000 180.837 52.837 188.000 44.000 188.000 ZM 212.000 188.000 C 203.163 188.000 196.000 180.837 196.000 172.000 C 196.000 163.163 203.163 156.000 212.000 156.000 C 220.837 156.000 228.000 163.163 228.000 172.000 C 228.000 180.837 220.837 188.000 212.000 188.000 Z"),
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
        return _scooter!!
    }

private var _scooter: ImageVector? = null
