package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LockKeyOpen: ImageVector
    get() {
        if (_lockKeyOpen != null) return _lockKeyOpen!!
        _lockKeyOpen = phosphorRegularIcon(
            name = "LockKeyOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 80.000 L 96.000 80.000 L 96.000 56.000 C 96.000 38.327 110.327 24.000 128.000 24.000 C 143.370 24.000 157.200 35.000 160.160 49.590 C 161.075 53.881 165.275 56.635 169.574 55.763 C 173.874 54.891 176.669 50.718 175.840 46.410 C 171.320 24.150 151.200 8.000 128.000 8.000 C 101.502 8.028 80.028 29.502 80.000 56.000 L 80.000 80.000 L 48.000 80.000 C 39.163 80.000 32.000 87.163 32.000 96.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 96.000 C 224.000 87.163 216.837 80.000 208.000 80.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 96.000 L 208.000 96.000 L 208.000 208.000 ZM 128.000 112.000 C 114.101 112.005 102.309 122.204 100.303 135.957 C 98.296 149.711 106.682 162.854 120.000 166.830 L 120.000 184.000 C 120.000 188.418 123.582 192.000 128.000 192.000 C 132.418 192.000 136.000 188.418 136.000 184.000 L 136.000 166.830 C 149.318 162.854 157.704 149.711 155.697 135.957 C 153.691 122.204 141.899 112.005 128.000 112.000 ZM 128.000 152.000 C 121.373 152.000 116.000 146.627 116.000 140.000 C 116.000 133.373 121.373 128.000 128.000 128.000 C 134.627 128.000 140.000 133.373 140.000 140.000 C 140.000 146.627 134.627 152.000 128.000 152.000 Z"),
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
        return _lockKeyOpen!!
    }

private var _lockKeyOpen: ImageVector? = null
