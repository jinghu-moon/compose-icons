package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Certificate: ImageVector
    get() {
        if (_certificate != null) return _certificate!!
        _certificate = phosphorFillIcon(
            name = "Certificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 86.530 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 184.000 C 24.000 192.837 31.163 200.000 40.000 200.000 L 160.000 200.000 L 160.000 224.000 C 159.974 226.871 161.489 229.536 163.969 230.982 C 166.449 232.429 169.514 232.436 172.000 231.000 L 196.000 217.260 L 220.000 231.000 C 222.486 232.436 225.551 232.429 228.031 230.982 C 230.511 229.536 232.026 226.871 232.000 224.000 L 232.000 161.470 C 242.219 151.684 247.998 138.149 247.998 124.000 C 247.998 109.851 242.219 96.316 232.000 86.530 ZM 128.000 144.000 L 72.000 144.000 C 67.582 144.000 64.000 140.418 64.000 136.000 C 64.000 131.582 67.582 128.000 72.000 128.000 L 128.000 128.000 C 132.418 128.000 136.000 131.582 136.000 136.000 C 136.000 140.418 132.418 144.000 128.000 144.000 ZM 128.000 112.000 L 72.000 112.000 C 67.582 112.000 64.000 108.418 64.000 104.000 C 64.000 99.582 67.582 96.000 72.000 96.000 L 128.000 96.000 C 132.418 96.000 136.000 99.582 136.000 104.000 C 136.000 108.418 132.418 112.000 128.000 112.000 ZM 216.000 210.210 L 200.000 201.050 C 197.540 199.644 194.520 199.644 192.060 201.050 L 176.060 210.210 L 176.060 172.000 C 188.857 177.347 203.263 177.347 216.060 172.000 ZM 196.000 160.000 C 176.118 160.000 160.000 143.882 160.000 124.000 C 160.000 104.118 176.118 88.000 196.000 88.000 C 215.882 88.000 232.000 104.118 232.000 124.000 C 232.000 143.882 215.882 160.000 196.000 160.000 Z"),
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
        return _certificate!!
    }

private var _certificate: ImageVector? = null
