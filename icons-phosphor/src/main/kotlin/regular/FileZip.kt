package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileZip: ImageVector
    get() {
        if (_fileZip != null) return _fileZip!!
        _fileZip = phosphorRegularIcon(
            name = "FileZip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 144.000 L 168.000 144.000 C 163.582 144.000 160.000 147.582 160.000 152.000 L 160.000 208.000 C 160.000 212.418 163.582 216.000 168.000 216.000 C 172.418 216.000 176.000 212.418 176.000 208.000 L 176.000 200.000 L 184.000 200.000 C 199.464 200.000 212.000 187.464 212.000 172.000 C 212.000 156.536 199.464 144.000 184.000 144.000 ZM 184.000 184.000 L 176.000 184.000 L 176.000 160.000 L 184.000 160.000 C 190.627 160.000 196.000 165.373 196.000 172.000 C 196.000 178.627 190.627 184.000 184.000 184.000 ZM 136.000 152.000 L 136.000 208.000 C 136.000 212.418 132.418 216.000 128.000 216.000 C 123.582 216.000 120.000 212.418 120.000 208.000 L 120.000 152.000 C 120.000 147.582 123.582 144.000 128.000 144.000 C 132.418 144.000 136.000 147.582 136.000 152.000 ZM 96.000 208.000 C 96.000 212.418 92.418 216.000 88.000 216.000 L 56.000 216.000 C 53.129 216.026 50.464 214.511 49.018 212.031 C 47.571 209.551 47.564 206.486 49.000 204.000 L 74.160 160.000 L 56.000 160.000 C 51.582 160.000 48.000 156.418 48.000 152.000 C 48.000 147.582 51.582 144.000 56.000 144.000 L 88.000 144.000 C 90.871 143.974 93.536 145.489 94.982 147.969 C 96.429 150.449 96.436 153.514 95.000 156.000 L 69.790 200.000 L 88.000 200.000 C 92.418 200.000 96.000 203.582 96.000 208.000 ZM 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 112.000 C 40.000 116.418 43.582 120.000 48.000 120.000 C 52.418 120.000 56.000 116.418 56.000 112.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 112.000 C 200.000 116.418 203.582 120.000 208.000 120.000 C 212.418 120.000 216.000 116.418 216.000 112.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 80.000 L 160.000 51.310 L 188.690 80.000 Z"),
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
        return _fileZip!!
    }

private var _fileZip: ImageVector? = null
