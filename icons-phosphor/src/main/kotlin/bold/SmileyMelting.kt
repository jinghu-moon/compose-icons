package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileyMelting: ImageVector
    get() {
        if (_smileyMelting != null) return _smileyMelting!!
        _smileyMelting = phosphorBoldIcon(
            name = "SmileyMelting",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 136.000 C 180.000 144.837 172.837 152.000 164.000 152.000 C 155.163 152.000 148.000 144.837 148.000 136.000 C 148.000 127.163 155.163 120.000 164.000 120.000 C 172.837 120.000 180.000 127.163 180.000 136.000 ZM 136.000 92.000 C 136.000 83.163 128.837 76.000 120.000 76.000 C 111.163 76.000 104.000 83.163 104.000 92.000 C 104.000 100.837 111.163 108.000 120.000 108.000 C 128.837 108.000 136.000 100.837 136.000 92.000 ZM 203.830 51.100 C 162.298 10.143 95.748 9.565 53.510 49.795 C 11.273 90.025 8.612 156.524 47.500 200.000 C 51.918 204.940 59.505 205.363 64.445 200.945 C 69.385 196.527 69.808 188.940 65.390 184.000 C 35.271 150.325 37.182 98.859 69.715 67.511 C 102.249 36.163 153.751 36.163 186.285 67.511 C 218.818 98.859 220.729 150.325 190.610 184.000 C 186.192 188.940 186.615 196.527 191.555 200.945 C 196.495 205.363 204.082 204.940 208.500 200.000 C 246.902 157.064 244.847 91.545 203.830 51.100 ZM 140.000 164.000 L 136.000 164.000 C 116.190 164.000 92.000 147.390 92.000 128.000 C 92.001 125.990 92.168 123.983 92.500 122.000 C 93.605 115.464 89.201 109.270 82.665 108.165 C 76.129 107.060 69.935 111.464 68.830 118.000 C 68.278 121.305 68.000 124.649 68.000 128.000 C 68.000 144.100 76.000 159.460 90.490 171.250 C 103.580 181.900 120.170 188.000 136.000 188.000 L 140.000 188.000 C 144.418 188.000 148.000 191.582 148.000 196.000 C 148.000 200.418 144.418 204.000 140.000 204.000 L 100.000 204.000 C 82.327 204.000 68.000 218.327 68.000 236.000 C 68.000 242.627 73.373 248.000 80.000 248.000 C 86.627 248.000 92.000 242.627 92.000 236.000 C 92.000 231.582 95.582 228.000 100.000 228.000 L 140.000 228.000 C 157.673 228.000 172.000 213.673 172.000 196.000 C 172.000 178.327 157.673 164.000 140.000 164.000 Z"),
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
        return _smileyMelting!!
    }

private var _smileyMelting: ImageVector? = null
