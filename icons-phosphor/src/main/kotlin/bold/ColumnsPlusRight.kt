package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ColumnsPlusRight: ImageVector
    get() {
        if (_columnsPlusRight != null) return _columnsPlusRight!!
        _columnsPlusRight = phosphorBoldIcon(
            name = "ColumnsPlusRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 80.000 28.000 L 56.000 28.000 C 44.954 28.000 36.000 36.954 36.000 48.000 L 36.000 208.000 C 36.000 219.046 44.954 228.000 56.000 228.000 L 80.000 228.000 C 91.046 228.000 100.000 219.046 100.000 208.000 L 100.000 48.000 C 100.000 36.954 91.046 28.000 80.000 28.000 ZM 76.000 204.000 L 60.000 204.000 L 60.000 52.000 L 76.000 52.000 ZM 156.000 28.000 L 132.000 28.000 C 120.954 28.000 112.000 36.954 112.000 48.000 L 112.000 208.000 C 112.000 219.046 120.954 228.000 132.000 228.000 L 156.000 228.000 C 167.046 228.000 176.000 219.046 176.000 208.000 L 176.000 48.000 C 176.000 36.954 167.046 28.000 156.000 28.000 ZM 152.000 204.000 L 136.000 204.000 L 136.000 52.000 L 152.000 52.000 ZM 252.000 128.000 C 252.000 134.627 246.627 140.000 240.000 140.000 L 232.000 140.000 L 232.000 148.000 C 232.000 154.627 226.627 160.000 220.000 160.000 C 213.373 160.000 208.000 154.627 208.000 148.000 L 208.000 140.000 L 200.000 140.000 C 193.373 140.000 188.000 134.627 188.000 128.000 C 188.000 121.373 193.373 116.000 200.000 116.000 L 208.000 116.000 L 208.000 108.000 C 208.000 101.373 213.373 96.000 220.000 96.000 C 226.627 96.000 232.000 101.373 232.000 108.000 L 232.000 116.000 L 240.000 116.000 C 246.627 116.000 252.000 121.373 252.000 128.000 Z"),
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
        return _columnsPlusRight!!
    }

private var _columnsPlusRight: ImageVector? = null
