package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Vibrate: ImageVector
    get() {
        if (_vibrate != null) return _vibrate!!
        _vibrate = phosphorBoldIcon(
            name = "Vibrate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 28.000 L 92.000 28.000 C 76.536 28.000 64.000 40.536 64.000 56.000 L 64.000 200.000 C 64.000 215.464 76.536 228.000 92.000 228.000 L 164.000 228.000 C 179.464 228.000 192.000 215.464 192.000 200.000 L 192.000 56.000 C 192.000 40.536 179.464 28.000 164.000 28.000 ZM 168.000 200.000 C 168.000 202.209 166.209 204.000 164.000 204.000 L 92.000 204.000 C 89.791 204.000 88.000 202.209 88.000 200.000 L 88.000 56.000 C 88.000 53.791 89.791 52.000 92.000 52.000 L 164.000 52.000 C 166.209 52.000 168.000 53.791 168.000 56.000 ZM 232.000 100.000 L 232.000 156.000 C 232.000 162.627 226.627 168.000 220.000 168.000 C 213.373 168.000 208.000 162.627 208.000 156.000 L 208.000 100.000 C 208.000 93.373 213.373 88.000 220.000 88.000 C 226.627 88.000 232.000 93.373 232.000 100.000 ZM 48.000 100.000 L 48.000 156.000 C 48.000 162.627 42.627 168.000 36.000 168.000 C 29.373 168.000 24.000 162.627 24.000 156.000 L 24.000 100.000 C 24.000 93.373 29.373 88.000 36.000 88.000 C 42.627 88.000 48.000 93.373 48.000 100.000 Z"),
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
        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
