package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FilePpt: ImageVector
    get() {
        if (_filePpt != null) return _filePpt!!
        _filePpt = phosphorRegularIcon(
            name = "FilePpt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 152.000 C 224.000 156.418 220.418 160.000 216.000 160.000 L 204.000 160.000 L 204.000 208.000 C 204.000 212.418 200.418 216.000 196.000 216.000 C 191.582 216.000 188.000 212.418 188.000 208.000 L 188.000 160.000 L 176.000 160.000 C 171.582 160.000 168.000 156.418 168.000 152.000 C 168.000 147.582 171.582 144.000 176.000 144.000 L 216.000 144.000 C 220.418 144.000 224.000 147.582 224.000 152.000 ZM 92.000 172.000 C 92.000 187.464 79.464 200.000 64.000 200.000 L 56.000 200.000 L 56.000 208.000 C 56.000 212.418 52.418 216.000 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 152.000 C 40.000 147.582 43.582 144.000 48.000 144.000 L 64.000 144.000 C 79.464 144.000 92.000 156.536 92.000 172.000 ZM 76.000 172.000 C 76.000 165.373 70.627 160.000 64.000 160.000 L 56.000 160.000 L 56.000 184.000 L 64.000 184.000 C 70.627 184.000 76.000 178.627 76.000 172.000 ZM 160.000 172.000 C 160.000 187.464 147.464 200.000 132.000 200.000 L 124.000 200.000 L 124.000 208.000 C 124.000 212.418 120.418 216.000 116.000 216.000 C 111.582 216.000 108.000 212.418 108.000 208.000 L 108.000 152.000 C 108.000 147.582 111.582 144.000 116.000 144.000 L 132.000 144.000 C 147.464 144.000 160.000 156.536 160.000 172.000 ZM 144.000 172.000 C 144.000 165.373 138.627 160.000 132.000 160.000 L 124.000 160.000 L 124.000 184.000 L 132.000 184.000 C 138.627 184.000 144.000 178.627 144.000 172.000 ZM 40.000 112.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 152.000 24.000 C 154.122 23.998 156.158 24.840 157.660 26.340 L 213.660 82.340 C 215.160 83.842 216.002 85.878 216.000 88.000 L 216.000 112.000 C 216.000 116.418 212.418 120.000 208.000 120.000 C 203.582 120.000 200.000 116.418 200.000 112.000 L 200.000 96.000 L 152.000 96.000 C 147.582 96.000 144.000 92.418 144.000 88.000 L 144.000 40.000 L 56.000 40.000 L 56.000 112.000 C 56.000 116.418 52.418 120.000 48.000 120.000 C 43.582 120.000 40.000 116.418 40.000 112.000 ZM 160.000 80.000 L 188.690 80.000 L 160.000 51.310 Z"),
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
        return _filePpt!!
    }

private var _filePpt: ImageVector? = null
