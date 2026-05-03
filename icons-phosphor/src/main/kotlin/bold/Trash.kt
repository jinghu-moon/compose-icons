package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = phosphorBoldIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 48.000 L 180.000 48.000 L 180.000 36.000 C 180.000 20.536 167.464 8.000 152.000 8.000 L 104.000 8.000 C 88.536 8.000 76.000 20.536 76.000 36.000 L 76.000 48.000 L 40.000 48.000 C 33.373 48.000 28.000 53.373 28.000 60.000 C 28.000 66.627 33.373 72.000 40.000 72.000 L 44.000 72.000 L 44.000 208.000 C 44.000 219.046 52.954 228.000 64.000 228.000 L 192.000 228.000 C 203.046 228.000 212.000 219.046 212.000 208.000 L 212.000 72.000 L 216.000 72.000 C 222.627 72.000 228.000 66.627 228.000 60.000 C 228.000 53.373 222.627 48.000 216.000 48.000 ZM 100.000 36.000 C 100.000 33.791 101.791 32.000 104.000 32.000 L 152.000 32.000 C 154.209 32.000 156.000 33.791 156.000 36.000 L 156.000 48.000 L 100.000 48.000 ZM 188.000 204.000 L 68.000 204.000 L 68.000 72.000 L 188.000 72.000 ZM 116.000 104.000 L 116.000 168.000 C 116.000 174.627 110.627 180.000 104.000 180.000 C 97.373 180.000 92.000 174.627 92.000 168.000 L 92.000 104.000 C 92.000 97.373 97.373 92.000 104.000 92.000 C 110.627 92.000 116.000 97.373 116.000 104.000 ZM 164.000 104.000 L 164.000 168.000 C 164.000 174.627 158.627 180.000 152.000 180.000 C 145.373 180.000 140.000 174.627 140.000 168.000 L 140.000 104.000 C 140.000 97.373 145.373 92.000 152.000 92.000 C 158.627 92.000 164.000 97.373 164.000 104.000 Z"),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
