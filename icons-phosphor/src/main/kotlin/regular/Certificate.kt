package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Certificate: ImageVector
    get() {
        if (_certificate != null) return _certificate!!
        _certificate = phosphorRegularIcon(
            name = "Certificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 136.000 C 128.000 140.418 124.418 144.000 120.000 144.000 L 72.000 144.000 C 67.582 144.000 64.000 140.418 64.000 136.000 C 64.000 131.582 67.582 128.000 72.000 128.000 L 120.000 128.000 C 124.418 128.000 128.000 131.582 128.000 136.000 ZM 120.000 96.000 L 72.000 96.000 C 67.582 96.000 64.000 99.582 64.000 104.000 C 64.000 108.418 67.582 112.000 72.000 112.000 L 120.000 112.000 C 124.418 112.000 128.000 108.418 128.000 104.000 C 128.000 99.582 124.418 96.000 120.000 96.000 ZM 232.000 161.470 L 232.000 224.000 C 232.026 226.871 230.511 229.536 228.031 230.982 C 225.551 232.429 222.486 232.436 220.000 231.000 L 196.000 217.260 L 172.000 231.000 C 169.514 232.436 166.449 232.429 163.969 230.982 C 161.489 229.536 159.974 226.871 160.000 224.000 L 160.000 200.000 L 40.000 200.000 C 31.163 200.000 24.000 192.837 24.000 184.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 L 232.000 86.530 C 242.219 96.316 247.998 109.851 247.998 124.000 C 247.998 138.149 242.219 151.684 232.000 161.470 ZM 160.000 184.000 L 160.000 161.470 C 142.015 144.125 138.909 116.442 152.602 95.542 C 166.295 74.643 192.917 66.437 216.000 76.000 L 216.000 56.000 L 40.000 56.000 L 40.000 184.000 ZM 216.000 172.000 C 203.203 177.347 188.797 177.347 176.000 172.000 L 176.000 210.220 L 192.000 201.060 C 194.460 199.654 197.480 199.654 199.940 201.060 L 215.940 210.220 ZM 232.000 124.000 C 232.000 104.118 215.882 88.000 196.000 88.000 C 176.118 88.000 160.000 104.118 160.000 124.000 C 160.000 143.882 176.118 160.000 196.000 160.000 C 215.882 160.000 232.000 143.882 232.000 124.000 Z"),
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
        return _certificate!!
    }

private var _certificate: ImageVector? = null
