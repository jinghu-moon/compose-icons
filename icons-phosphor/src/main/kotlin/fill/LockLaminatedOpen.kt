package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LockLaminatedOpen: ImageVector
    get() {
        if (_lockLaminatedOpen != null) return _lockLaminatedOpen!!
        _lockLaminatedOpen = phosphorFillIcon(
            name = "LockLaminatedOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 80.000 L 96.000 80.000 L 96.000 56.000 C 96.000 38.327 110.327 24.000 128.000 24.000 C 143.370 24.000 157.200 35.000 160.160 49.590 C 161.075 53.881 165.275 56.635 169.574 55.763 C 173.874 54.891 176.669 50.718 175.840 46.410 C 171.320 24.150 151.200 8.000 128.000 8.000 C 101.502 8.028 80.028 29.502 80.000 56.000 L 80.000 80.000 L 48.000 80.000 C 39.163 80.000 32.000 87.163 32.000 96.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 96.000 C 224.000 87.163 216.837 80.000 208.000 80.000 ZM 184.000 192.000 L 72.000 192.000 C 67.582 192.000 64.000 188.418 64.000 184.000 C 64.000 179.582 67.582 176.000 72.000 176.000 L 184.000 176.000 C 188.418 176.000 192.000 179.582 192.000 184.000 C 192.000 188.418 188.418 192.000 184.000 192.000 ZM 184.000 160.000 L 72.000 160.000 C 67.582 160.000 64.000 156.418 64.000 152.000 C 64.000 147.582 67.582 144.000 72.000 144.000 L 184.000 144.000 C 188.418 144.000 192.000 147.582 192.000 152.000 C 192.000 156.418 188.418 160.000 184.000 160.000 ZM 184.000 128.000 L 72.000 128.000 C 67.582 128.000 64.000 124.418 64.000 120.000 C 64.000 115.582 67.582 112.000 72.000 112.000 L 184.000 112.000 C 188.418 112.000 192.000 115.582 192.000 120.000 C 192.000 124.418 188.418 128.000 184.000 128.000 Z"),
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
        return _lockLaminatedOpen!!
    }

private var _lockLaminatedOpen: ImageVector? = null
