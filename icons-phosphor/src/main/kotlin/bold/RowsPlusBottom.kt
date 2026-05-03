package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RowsPlusBottom: ImageVector
    get() {
        if (_rowsPlusBottom != null) return _rowsPlusBottom!!
        _rowsPlusBottom = phosphorBoldIcon(
            name = "RowsPlusBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 112.000 L 48.000 112.000 C 36.954 112.000 28.000 120.954 28.000 132.000 L 28.000 156.000 C 28.000 167.046 36.954 176.000 48.000 176.000 L 208.000 176.000 C 219.046 176.000 228.000 167.046 228.000 156.000 L 228.000 132.000 C 228.000 120.954 219.046 112.000 208.000 112.000 ZM 204.000 152.000 L 52.000 152.000 L 52.000 136.000 L 204.000 136.000 ZM 208.000 36.000 L 48.000 36.000 C 36.954 36.000 28.000 44.954 28.000 56.000 L 28.000 80.000 C 28.000 91.046 36.954 100.000 48.000 100.000 L 208.000 100.000 C 219.046 100.000 228.000 91.046 228.000 80.000 L 228.000 56.000 C 228.000 44.954 219.046 36.000 208.000 36.000 ZM 204.000 76.000 L 52.000 76.000 L 52.000 60.000 L 204.000 60.000 ZM 160.000 220.000 C 160.000 226.627 154.627 232.000 148.000 232.000 L 140.000 232.000 L 140.000 240.000 C 140.000 246.627 134.627 252.000 128.000 252.000 C 121.373 252.000 116.000 246.627 116.000 240.000 L 116.000 232.000 L 108.000 232.000 C 101.373 232.000 96.000 226.627 96.000 220.000 C 96.000 213.373 101.373 208.000 108.000 208.000 L 116.000 208.000 L 116.000 200.000 C 116.000 193.373 121.373 188.000 128.000 188.000 C 134.627 188.000 140.000 193.373 140.000 200.000 L 140.000 208.000 L 148.000 208.000 C 154.627 208.000 160.000 213.373 160.000 220.000 Z"),
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
        return _rowsPlusBottom!!
    }

private var _rowsPlusBottom: ImageVector? = null
