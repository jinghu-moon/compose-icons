package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LockKey: ImageVector
    get() {
        if (_lockKey != null) return _lockKey!!
        _lockKey = phosphorBoldIcon(
            name = "LockKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 76.000 L 180.000 76.000 L 180.000 56.000 C 180.000 27.281 156.719 4.000 128.000 4.000 C 99.281 4.000 76.000 27.281 76.000 56.000 L 76.000 76.000 L 48.000 76.000 C 36.954 76.000 28.000 84.954 28.000 96.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 96.000 C 228.000 84.954 219.046 76.000 208.000 76.000 ZM 100.000 56.000 C 100.000 40.536 112.536 28.000 128.000 28.000 C 143.464 28.000 156.000 40.536 156.000 56.000 L 156.000 76.000 L 100.000 76.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 100.000 L 204.000 100.000 ZM 128.000 112.000 C 112.688 112.006 99.526 122.857 96.601 137.887 C 93.676 152.917 101.808 167.912 116.000 173.660 L 116.000 180.000 C 116.000 186.627 121.373 192.000 128.000 192.000 C 134.627 192.000 140.000 186.627 140.000 180.000 L 140.000 173.660 C 154.192 167.912 162.324 152.917 159.399 137.887 C 156.474 122.857 143.312 112.006 128.000 112.000 ZM 128.000 136.000 C 132.418 136.000 136.000 139.582 136.000 144.000 C 136.000 148.418 132.418 152.000 128.000 152.000 C 123.582 152.000 120.000 148.418 120.000 144.000 C 120.000 139.582 123.582 136.000 128.000 136.000 Z"),
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
