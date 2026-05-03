package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ColumnsPlusLeft: ImageVector
    get() {
        if (_columnsPlusLeft != null) return _columnsPlusLeft!!
        _columnsPlusLeft = phosphorBoldIcon(
            name = "ColumnsPlusLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 124.000 28.000 L 100.000 28.000 C 88.954 28.000 80.000 36.954 80.000 48.000 L 80.000 208.000 C 80.000 219.046 88.954 228.000 100.000 228.000 L 124.000 228.000 C 135.046 228.000 144.000 219.046 144.000 208.000 L 144.000 48.000 C 144.000 36.954 135.046 28.000 124.000 28.000 ZM 120.000 204.000 L 104.000 204.000 L 104.000 52.000 L 120.000 52.000 ZM 200.000 28.000 L 176.000 28.000 C 164.954 28.000 156.000 36.954 156.000 48.000 L 156.000 208.000 C 156.000 219.046 164.954 228.000 176.000 228.000 L 200.000 228.000 C 211.046 228.000 220.000 219.046 220.000 208.000 L 220.000 48.000 C 220.000 36.954 211.046 28.000 200.000 28.000 ZM 196.000 204.000 L 180.000 204.000 L 180.000 52.000 L 196.000 52.000 ZM 68.000 128.000 C 68.000 134.627 62.627 140.000 56.000 140.000 L 48.000 140.000 L 48.000 148.000 C 48.000 154.627 42.627 160.000 36.000 160.000 C 29.373 160.000 24.000 154.627 24.000 148.000 L 24.000 140.000 L 16.000 140.000 C 9.373 140.000 4.000 134.627 4.000 128.000 C 4.000 121.373 9.373 116.000 16.000 116.000 L 24.000 116.000 L 24.000 108.000 C 24.000 101.373 29.373 96.000 36.000 96.000 C 42.627 96.000 48.000 101.373 48.000 108.000 L 48.000 116.000 L 56.000 116.000 C 62.627 116.000 68.000 121.373 68.000 128.000 Z"),
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
        return _columnsPlusLeft!!
    }

private var _columnsPlusLeft: ImageVector? = null
