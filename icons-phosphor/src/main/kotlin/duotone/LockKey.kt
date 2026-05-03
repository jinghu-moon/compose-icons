package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LockKey: ImageVector
    get() {
        if (_lockKey != null) return _lockKey!!
        _lockKey = phosphorDuotoneIcon(
            name = "LockKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 88.000 L 48.000 88.000 C 43.582 88.000 40.000 91.582 40.000 96.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 208.000 216.000 C 212.418 216.000 216.000 212.418 216.000 208.000 L 216.000 96.000 C 216.000 91.582 212.418 88.000 208.000 88.000 ZM 128.000 160.000 C 116.954 160.000 108.000 151.046 108.000 140.000 C 108.000 128.954 116.954 120.000 128.000 120.000 C 139.046 120.000 148.000 128.954 148.000 140.000 C 148.000 151.046 139.046 160.000 128.000 160.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 208.000 80.000 L 176.000 80.000 L 176.000 56.000 C 176.000 29.490 154.510 8.000 128.000 8.000 C 101.490 8.000 80.000 29.490 80.000 56.000 L 80.000 80.000 L 48.000 80.000 C 39.163 80.000 32.000 87.163 32.000 96.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 96.000 C 224.000 87.163 216.837 80.000 208.000 80.000 ZM 96.000 56.000 C 96.000 38.327 110.327 24.000 128.000 24.000 C 145.673 24.000 160.000 38.327 160.000 56.000 L 160.000 80.000 L 96.000 80.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 96.000 L 208.000 96.000 L 208.000 208.000 ZM 128.000 112.000 C 114.101 112.005 102.309 122.204 100.303 135.957 C 98.296 149.711 106.682 162.854 120.000 166.830 L 120.000 184.000 C 120.000 188.418 123.582 192.000 128.000 192.000 C 132.418 192.000 136.000 188.418 136.000 184.000 L 136.000 166.830 C 149.318 162.854 157.704 149.711 155.697 135.957 C 153.691 122.204 141.899 112.005 128.000 112.000 ZM 128.000 152.000 C 121.373 152.000 116.000 146.627 116.000 140.000 C 116.000 133.373 121.373 128.000 128.000 128.000 C 134.627 128.000 140.000 133.373 140.000 140.000 C 140.000 146.627 134.627 152.000 128.000 152.000 Z"),
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
