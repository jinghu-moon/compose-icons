package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LockKey: ImageVector
    get() {
        if (_lockKey != null) return _lockKey!!
        _lockKey = phosphorFillIcon(
            name = "LockKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 80.000 L 176.000 80.000 L 176.000 56.000 C 176.000 29.490 154.510 8.000 128.000 8.000 C 101.490 8.000 80.000 29.490 80.000 56.000 L 80.000 80.000 L 48.000 80.000 C 39.163 80.000 32.000 87.163 32.000 96.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 96.000 C 224.000 87.163 216.837 80.000 208.000 80.000 ZM 136.000 158.630 L 136.000 184.000 C 136.000 188.418 132.418 192.000 128.000 192.000 C 123.582 192.000 120.000 188.418 120.000 184.000 L 120.000 158.630 C 108.980 154.734 102.369 143.465 104.346 131.944 C 106.322 120.424 116.311 112.003 128.000 112.003 C 139.689 112.003 149.678 120.424 151.654 131.944 C 153.631 143.465 147.020 154.734 136.000 158.630 ZM 160.000 80.000 L 96.000 80.000 L 96.000 56.000 C 96.000 38.327 110.327 24.000 128.000 24.000 C 145.673 24.000 160.000 38.327 160.000 56.000 Z"),
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
        return _lockKey!!
    }

private var _lockKey: ImageVector? = null
