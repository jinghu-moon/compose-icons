package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CopySimple: ImageVector
    get() {
        if (_copySimple != null) return _copySimple!!
        _copySimple = phosphorBoldIcon(
            name = "CopySimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 64.000 L 40.000 64.000 C 33.373 64.000 28.000 69.373 28.000 76.000 L 28.000 216.000 C 28.000 222.627 33.373 228.000 40.000 228.000 L 180.000 228.000 C 186.627 228.000 192.000 222.627 192.000 216.000 L 192.000 76.000 C 192.000 69.373 186.627 64.000 180.000 64.000 ZM 168.000 204.000 L 52.000 204.000 L 52.000 88.000 L 168.000 88.000 ZM 228.000 40.000 L 228.000 180.000 C 228.000 186.627 222.627 192.000 216.000 192.000 C 209.373 192.000 204.000 186.627 204.000 180.000 L 204.000 52.000 L 76.000 52.000 C 69.373 52.000 64.000 46.627 64.000 40.000 C 64.000 33.373 69.373 28.000 76.000 28.000 L 216.000 28.000 C 222.627 28.000 228.000 33.373 228.000 40.000 Z"),
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
        return _copySimple!!
    }

private var _copySimple: ImageVector? = null
