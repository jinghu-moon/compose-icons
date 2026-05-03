package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LockLaminated: ImageVector
    get() {
        if (_lockLaminated != null) return _lockLaminated!!
        _lockLaminated = phosphorFillIcon(
            name = "LockLaminated",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 80.000 L 176.000 80.000 L 176.000 56.000 C 176.000 29.490 154.510 8.000 128.000 8.000 C 101.490 8.000 80.000 29.490 80.000 56.000 L 80.000 80.000 L 48.000 80.000 C 39.163 80.000 32.000 87.163 32.000 96.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 96.000 C 224.000 87.163 216.837 80.000 208.000 80.000 ZM 96.000 56.000 C 96.000 38.327 110.327 24.000 128.000 24.000 C 145.673 24.000 160.000 38.327 160.000 56.000 L 160.000 80.000 L 96.000 80.000 ZM 184.000 192.000 L 72.000 192.000 C 67.582 192.000 64.000 188.418 64.000 184.000 C 64.000 179.582 67.582 176.000 72.000 176.000 L 184.000 176.000 C 188.418 176.000 192.000 179.582 192.000 184.000 C 192.000 188.418 188.418 192.000 184.000 192.000 ZM 184.000 160.000 L 72.000 160.000 C 67.582 160.000 64.000 156.418 64.000 152.000 C 64.000 147.582 67.582 144.000 72.000 144.000 L 184.000 144.000 C 188.418 144.000 192.000 147.582 192.000 152.000 C 192.000 156.418 188.418 160.000 184.000 160.000 ZM 184.000 128.000 L 72.000 128.000 C 67.582 128.000 64.000 124.418 64.000 120.000 C 64.000 115.582 67.582 112.000 72.000 112.000 L 184.000 112.000 C 188.418 112.000 192.000 115.582 192.000 120.000 C 192.000 124.418 188.418 128.000 184.000 128.000 Z"),
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
        return _lockLaminated!!
    }

private var _lockLaminated: ImageVector? = null
