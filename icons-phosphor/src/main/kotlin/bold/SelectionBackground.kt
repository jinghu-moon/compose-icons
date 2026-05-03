package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorBoldIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 156.000 80.000 L 48.000 80.000 C 36.954 80.000 28.000 88.954 28.000 100.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 156.000 228.000 C 167.046 228.000 176.000 219.046 176.000 208.000 L 176.000 100.000 C 176.000 88.954 167.046 80.000 156.000 80.000 ZM 152.000 204.000 L 52.000 204.000 L 52.000 104.000 L 152.000 104.000 ZM 132.000 40.000 C 132.000 33.373 137.373 28.000 144.000 28.000 L 160.000 28.000 C 166.627 28.000 172.000 33.373 172.000 40.000 C 172.000 46.627 166.627 52.000 160.000 52.000 L 144.000 52.000 C 137.373 52.000 132.000 46.627 132.000 40.000 ZM 228.000 48.000 L 228.000 56.000 C 228.000 62.627 222.627 68.000 216.000 68.000 C 209.373 68.000 204.000 62.627 204.000 56.000 L 204.000 52.000 L 200.000 52.000 C 193.373 52.000 188.000 46.627 188.000 40.000 C 188.000 33.373 193.373 28.000 200.000 28.000 L 208.000 28.000 C 219.046 28.000 228.000 36.954 228.000 48.000 ZM 228.000 96.000 L 228.000 112.000 C 228.000 118.627 222.627 124.000 216.000 124.000 C 209.373 124.000 204.000 118.627 204.000 112.000 L 204.000 96.000 C 204.000 89.373 209.373 84.000 216.000 84.000 C 222.627 84.000 228.000 89.373 228.000 96.000 ZM 228.000 152.000 L 228.000 160.000 C 228.000 171.046 219.046 180.000 208.000 180.000 L 200.000 180.000 C 193.373 180.000 188.000 174.627 188.000 168.000 C 188.000 161.373 193.373 156.000 200.000 156.000 L 204.000 156.000 L 204.000 152.000 C 204.000 145.373 209.373 140.000 216.000 140.000 C 222.627 140.000 228.000 145.373 228.000 152.000 ZM 76.000 56.000 L 76.000 48.000 C 76.000 36.954 84.954 28.000 96.000 28.000 L 104.000 28.000 C 110.627 28.000 116.000 33.373 116.000 40.000 C 116.000 46.627 110.627 52.000 104.000 52.000 L 100.000 52.000 L 100.000 56.000 C 100.000 62.627 94.627 68.000 88.000 68.000 C 81.373 68.000 76.000 62.627 76.000 56.000 Z"),
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
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
