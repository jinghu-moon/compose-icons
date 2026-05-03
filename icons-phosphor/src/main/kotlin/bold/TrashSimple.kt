package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrashSimple: ImageVector
    get() {
        if (_trashSimple != null) return _trashSimple!!
        _trashSimple = phosphorBoldIcon(
            name = "TrashSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 48.000 L 40.000 48.000 C 33.373 48.000 28.000 53.373 28.000 60.000 C 28.000 66.627 33.373 72.000 40.000 72.000 L 44.000 72.000 L 44.000 208.000 C 44.000 219.046 52.954 228.000 64.000 228.000 L 192.000 228.000 C 203.046 228.000 212.000 219.046 212.000 208.000 L 212.000 72.000 L 216.000 72.000 C 222.627 72.000 228.000 66.627 228.000 60.000 C 228.000 53.373 222.627 48.000 216.000 48.000 ZM 188.000 204.000 L 68.000 204.000 L 68.000 72.000 L 188.000 72.000 ZM 76.000 20.000 C 76.000 13.373 81.373 8.000 88.000 8.000 L 168.000 8.000 C 174.627 8.000 180.000 13.373 180.000 20.000 C 180.000 26.627 174.627 32.000 168.000 32.000 L 88.000 32.000 C 81.373 32.000 76.000 26.627 76.000 20.000 Z"),
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
        return _trashSimple!!
    }

private var _trashSimple: ImageVector? = null
