package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Scan: ImageVector
    get() {
        if (_scan != null) return _scan!!
        _scan = phosphorBoldIcon(
            name = "Scan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 40.000 L 228.000 80.000 C 228.000 86.627 222.627 92.000 216.000 92.000 C 209.373 92.000 204.000 86.627 204.000 80.000 L 204.000 52.000 L 176.000 52.000 C 169.373 52.000 164.000 46.627 164.000 40.000 C 164.000 33.373 169.373 28.000 176.000 28.000 L 216.000 28.000 C 222.627 28.000 228.000 33.373 228.000 40.000 ZM 80.000 204.000 L 52.000 204.000 L 52.000 176.000 C 52.000 169.373 46.627 164.000 40.000 164.000 C 33.373 164.000 28.000 169.373 28.000 176.000 L 28.000 216.000 C 28.000 222.627 33.373 228.000 40.000 228.000 L 80.000 228.000 C 86.627 228.000 92.000 222.627 92.000 216.000 C 92.000 209.373 86.627 204.000 80.000 204.000 ZM 216.000 164.000 C 209.373 164.000 204.000 169.373 204.000 176.000 L 204.000 204.000 L 176.000 204.000 C 169.373 204.000 164.000 209.373 164.000 216.000 C 164.000 222.627 169.373 228.000 176.000 228.000 L 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 L 228.000 176.000 C 228.000 169.373 222.627 164.000 216.000 164.000 ZM 40.000 92.000 C 46.627 92.000 52.000 86.627 52.000 80.000 L 52.000 52.000 L 80.000 52.000 C 86.627 52.000 92.000 46.627 92.000 40.000 C 92.000 33.373 86.627 28.000 80.000 28.000 L 40.000 28.000 C 33.373 28.000 28.000 33.373 28.000 40.000 L 28.000 80.000 C 28.000 86.627 33.373 92.000 40.000 92.000 ZM 84.000 72.000 L 172.000 72.000 C 178.627 72.000 184.000 77.373 184.000 84.000 L 184.000 172.000 C 184.000 178.627 178.627 184.000 172.000 184.000 L 84.000 184.000 C 77.373 184.000 72.000 178.627 72.000 172.000 L 72.000 84.000 C 72.000 77.373 77.373 72.000 84.000 72.000 ZM 96.000 160.000 L 160.000 160.000 L 160.000 96.000 L 96.000 96.000 Z"),
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
        return _scan!!
    }

private var _scan: ImageVector? = null
