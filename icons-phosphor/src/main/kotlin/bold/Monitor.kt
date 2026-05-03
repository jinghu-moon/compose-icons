package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Monitor: ImageVector
    get() {
        if (_monitor != null) return _monitor!!
        _monitor = phosphorBoldIcon(
            name = "Monitor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 36.000 L 48.000 36.000 C 32.536 36.000 20.000 48.536 20.000 64.000 L 20.000 176.000 C 20.000 191.464 32.536 204.000 48.000 204.000 L 208.000 204.000 C 223.464 204.000 236.000 191.464 236.000 176.000 L 236.000 64.000 C 236.000 48.536 223.464 36.000 208.000 36.000 ZM 212.000 176.000 C 212.000 178.209 210.209 180.000 208.000 180.000 L 48.000 180.000 C 45.791 180.000 44.000 178.209 44.000 176.000 L 44.000 64.000 C 44.000 61.791 45.791 60.000 48.000 60.000 L 208.000 60.000 C 210.209 60.000 212.000 61.791 212.000 64.000 ZM 172.000 228.000 C 172.000 234.627 166.627 240.000 160.000 240.000 L 96.000 240.000 C 89.373 240.000 84.000 234.627 84.000 228.000 C 84.000 221.373 89.373 216.000 96.000 216.000 L 160.000 216.000 C 166.627 216.000 172.000 221.373 172.000 228.000 Z"),
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
        return _monitor!!
    }

private var _monitor: ImageVector? = null
