package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Broadcast: ImageVector
    get() {
        if (_broadcast != null) return _broadcast!!
        _broadcast = phosphorBoldIcon(
            name = "Broadcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 84.000 C 103.699 84.000 84.000 103.699 84.000 128.000 C 84.000 152.301 103.699 172.000 128.000 172.000 C 152.301 172.000 172.000 152.301 172.000 128.000 C 171.972 103.711 152.289 84.028 128.000 84.000 ZM 128.000 148.000 C 116.954 148.000 108.000 139.046 108.000 128.000 C 108.000 116.954 116.954 108.000 128.000 108.000 C 139.046 108.000 148.000 116.954 148.000 128.000 C 148.000 139.046 139.046 148.000 128.000 148.000 ZM 205.390 160.700 C 201.782 169.229 196.788 177.102 190.610 184.000 C 186.192 188.940 178.605 189.363 173.665 184.945 C 168.725 180.527 168.302 172.940 172.720 168.000 C 193.128 145.238 193.128 110.762 172.720 88.000 C 168.302 83.060 168.725 75.473 173.665 71.055 C 178.605 66.637 186.192 67.060 190.610 72.000 C 212.264 96.226 218.019 130.762 205.390 160.700 ZM 83.280 168.000 C 87.698 172.940 87.275 180.527 82.335 184.945 C 77.395 189.363 69.808 188.940 65.390 184.000 C 36.843 152.124 36.843 103.876 65.390 72.000 C 69.808 67.060 77.395 66.637 82.335 71.055 C 87.275 75.473 87.698 83.060 83.280 88.000 C 62.872 110.762 62.872 145.238 83.280 168.000 ZM 252.000 128.000 C 252.039 160.456 239.313 191.625 216.570 214.780 C 213.611 218.014 209.123 219.376 204.865 218.335 C 200.608 217.293 197.257 214.012 196.125 209.777 C 194.993 205.542 196.260 201.027 199.430 198.000 C 237.608 159.142 237.608 96.858 199.430 58.000 C 194.791 53.267 194.867 45.669 199.600 41.030 C 204.333 36.391 211.931 36.467 216.570 41.200 C 239.318 64.360 252.044 95.537 252.000 128.000 ZM 56.570 198.000 C 61.209 202.733 61.133 210.331 56.400 214.970 C 51.667 219.609 44.069 219.533 39.430 214.800 C -7.864 166.612 -7.864 89.428 39.430 41.240 C 44.121 36.881 51.409 36.974 55.988 41.451 C 60.566 45.928 60.823 53.212 56.570 58.000 C 18.392 96.858 18.392 159.142 56.570 198.000 Z"),
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
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
