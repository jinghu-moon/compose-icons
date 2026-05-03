package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorRegularIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 96.000 L 224.000 208.000 C 224.000 212.418 220.418 216.000 216.000 216.000 C 211.582 216.000 208.000 212.418 208.000 208.000 L 208.000 96.000 C 207.967 65.086 182.914 40.033 152.000 40.000 L 104.000 40.000 C 73.086 40.033 48.033 65.086 48.000 96.000 L 48.000 208.000 C 48.000 212.418 44.418 216.000 40.000 216.000 C 35.582 216.000 32.000 212.418 32.000 208.000 L 32.000 96.000 C 32.044 56.254 64.254 24.044 104.000 24.000 L 152.000 24.000 C 191.746 24.044 223.956 56.254 224.000 96.000 ZM 184.000 96.000 L 184.000 168.000 C 183.998 179.438 175.925 189.285 164.710 191.530 L 167.160 196.420 C 169.137 200.374 167.534 205.183 163.580 207.160 C 159.626 209.137 154.817 207.534 152.840 203.580 L 147.060 192.000 L 108.940 192.000 L 103.160 203.580 C 101.183 207.534 96.374 209.137 92.420 207.160 C 88.466 205.183 86.863 200.374 88.840 196.420 L 91.290 191.530 C 80.075 189.285 72.002 179.438 72.000 168.000 L 72.000 96.000 C 72.000 82.745 82.745 72.000 96.000 72.000 L 160.000 72.000 C 173.255 72.000 184.000 82.745 184.000 96.000 ZM 88.000 96.000 L 88.000 144.000 L 168.000 144.000 L 168.000 96.000 C 168.000 91.582 164.418 88.000 160.000 88.000 L 96.000 88.000 C 91.582 88.000 88.000 91.582 88.000 96.000 ZM 120.000 160.000 L 120.000 176.000 L 136.000 176.000 L 136.000 160.000 ZM 96.000 176.000 L 104.000 176.000 L 104.000 160.000 L 88.000 160.000 L 88.000 168.000 C 88.000 172.418 91.582 176.000 96.000 176.000 ZM 168.000 168.000 L 168.000 160.000 L 152.000 160.000 L 152.000 176.000 L 160.000 176.000 C 164.418 176.000 168.000 172.418 168.000 168.000 Z"),
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
        return _subway!!
    }

private var _subway: ImageVector? = null
