package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = phosphorBoldIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 44.000 L 32.000 44.000 C 20.954 44.000 12.000 52.954 12.000 64.000 L 12.000 88.000 C 11.998 97.505 18.687 105.699 28.000 107.600 L 28.000 192.000 C 28.000 203.046 36.954 212.000 48.000 212.000 L 208.000 212.000 C 219.046 212.000 228.000 203.046 228.000 192.000 L 228.000 107.600 C 237.313 105.699 244.002 97.505 244.000 88.000 L 244.000 64.000 C 244.000 52.954 235.046 44.000 224.000 44.000 ZM 36.000 68.000 L 220.000 68.000 L 220.000 84.000 L 36.000 84.000 ZM 52.000 188.000 L 52.000 108.000 L 204.000 108.000 L 204.000 188.000 ZM 164.000 136.000 C 164.000 142.627 158.627 148.000 152.000 148.000 L 104.000 148.000 C 97.373 148.000 92.000 142.627 92.000 136.000 C 92.000 129.373 97.373 124.000 104.000 124.000 L 152.000 124.000 C 158.627 124.000 164.000 129.373 164.000 136.000 Z"),
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
        return _archive!!
    }

private var _archive: ImageVector? = null
