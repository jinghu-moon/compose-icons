package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Desk: ImageVector
    get() {
        if (_desk != null) return _desk!!
        _desk = phosphorBoldIcon(
            name = "Desk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 60.000 L 12.000 60.000 C 5.373 60.000 0.000 65.373 0.000 72.000 C 0.000 78.627 5.373 84.000 12.000 84.000 L 16.000 84.000 L 16.000 192.000 C 16.000 198.627 21.373 204.000 28.000 204.000 C 34.627 204.000 40.000 198.627 40.000 192.000 L 40.000 156.000 L 216.000 156.000 L 216.000 192.000 C 216.000 198.627 221.373 204.000 228.000 204.000 C 234.627 204.000 240.000 198.627 240.000 192.000 L 240.000 84.000 L 244.000 84.000 C 250.627 84.000 256.000 78.627 256.000 72.000 C 256.000 65.373 250.627 60.000 244.000 60.000 ZM 40.000 84.000 L 116.000 84.000 L 116.000 132.000 L 40.000 132.000 ZM 216.000 132.000 L 140.000 132.000 L 140.000 84.000 L 216.000 84.000 ZM 100.000 108.000 C 100.000 114.627 94.627 120.000 88.000 120.000 L 68.000 120.000 C 61.373 120.000 56.000 114.627 56.000 108.000 C 56.000 101.373 61.373 96.000 68.000 96.000 L 88.000 96.000 C 94.627 96.000 100.000 101.373 100.000 108.000 ZM 156.000 108.000 C 156.000 101.373 161.373 96.000 168.000 96.000 L 188.000 96.000 C 194.627 96.000 200.000 101.373 200.000 108.000 C 200.000 114.627 194.627 120.000 188.000 120.000 L 168.000 120.000 C 161.373 120.000 156.000 114.627 156.000 108.000 Z"),
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
        return _desk!!
    }

private var _desk: ImageVector? = null
