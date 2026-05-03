package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorRegularIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 64.000 C 120.000 68.418 116.418 72.000 112.000 72.000 L 96.000 72.000 C 91.582 72.000 88.000 68.418 88.000 64.000 C 88.000 59.582 91.582 56.000 96.000 56.000 L 112.000 56.000 C 116.418 56.000 120.000 59.582 120.000 64.000 ZM 172.320 197.140 L 175.840 221.740 C 176.495 226.331 175.126 230.981 172.087 234.484 C 169.048 237.988 164.638 240.000 160.000 240.000 L 96.000 240.000 C 91.362 240.000 86.952 237.988 83.913 234.484 C 80.874 230.981 79.505 226.331 80.160 221.740 L 83.680 197.140 C 51.942 180.599 32.027 147.790 32.000 112.000 C 32.000 107.582 35.582 104.000 40.000 104.000 L 56.000 104.000 L 56.000 40.000 C 56.000 31.163 63.163 24.000 72.000 24.000 L 184.000 24.000 C 192.837 24.000 200.000 31.163 200.000 40.000 L 200.000 104.000 L 216.000 104.000 C 220.418 104.000 224.000 107.582 224.000 112.000 C 223.973 147.790 204.058 180.599 172.320 197.140 ZM 72.000 104.000 L 184.000 104.000 L 184.000 40.000 L 72.000 40.000 ZM 157.070 203.500 C 138.154 209.500 117.846 209.500 98.930 203.500 L 96.000 224.000 L 160.000 224.000 ZM 207.600 120.000 L 48.400 120.000 C 52.504 160.883 86.911 192.010 128.000 192.010 C 169.089 192.010 203.496 160.883 207.600 120.000 Z"),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
