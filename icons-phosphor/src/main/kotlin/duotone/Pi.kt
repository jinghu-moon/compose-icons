package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorDuotoneIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 196.000 200.000 L 88.000 200.000 L 88.000 64.000 L 168.000 64.000 L 168.000 172.000 C 168.000 187.464 180.536 200.000 196.000 200.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 232.000 172.000 C 232.000 191.882 215.882 208.000 196.000 208.000 C 176.118 208.000 160.000 191.882 160.000 172.000 L 160.000 72.000 L 96.000 72.000 L 96.000 200.000 C 96.000 204.418 92.418 208.000 88.000 208.000 C 83.582 208.000 80.000 204.418 80.000 200.000 L 80.000 72.000 L 72.000 72.000 C 49.909 72.000 32.000 89.909 32.000 112.000 C 32.000 116.418 28.418 120.000 24.000 120.000 C 19.582 120.000 16.000 116.418 16.000 112.000 C 16.033 81.086 41.086 56.033 72.000 56.000 L 224.000 56.000 C 228.418 56.000 232.000 59.582 232.000 64.000 C 232.000 68.418 228.418 72.000 224.000 72.000 L 176.000 72.000 L 176.000 172.000 C 176.000 183.046 184.954 192.000 196.000 192.000 C 207.046 192.000 216.000 183.046 216.000 172.000 C 216.000 167.582 219.582 164.000 224.000 164.000 C 228.418 164.000 232.000 167.582 232.000 172.000 Z"),
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
        return _pi!!
    }

private var _pi: ImageVector? = null
