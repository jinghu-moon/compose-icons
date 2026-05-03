package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RowsPlusTop: ImageVector
    get() {
        if (_rowsPlusTop != null) return _rowsPlusTop!!
        _rowsPlusTop = phosphorBoldIcon(
            name = "RowsPlusTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 156.000 L 48.000 156.000 C 36.954 156.000 28.000 164.954 28.000 176.000 L 28.000 200.000 C 28.000 211.046 36.954 220.000 48.000 220.000 L 208.000 220.000 C 219.046 220.000 228.000 211.046 228.000 200.000 L 228.000 176.000 C 228.000 164.954 219.046 156.000 208.000 156.000 ZM 204.000 196.000 L 52.000 196.000 L 52.000 180.000 L 204.000 180.000 ZM 208.000 80.000 L 48.000 80.000 C 36.954 80.000 28.000 88.954 28.000 100.000 L 28.000 124.000 C 28.000 135.046 36.954 144.000 48.000 144.000 L 208.000 144.000 C 219.046 144.000 228.000 135.046 228.000 124.000 L 228.000 100.000 C 228.000 88.954 219.046 80.000 208.000 80.000 ZM 204.000 120.000 L 52.000 120.000 L 52.000 104.000 L 204.000 104.000 ZM 96.000 36.000 C 96.000 29.373 101.373 24.000 108.000 24.000 L 116.000 24.000 L 116.000 16.000 C 116.000 9.373 121.373 4.000 128.000 4.000 C 134.627 4.000 140.000 9.373 140.000 16.000 L 140.000 24.000 L 148.000 24.000 C 154.627 24.000 160.000 29.373 160.000 36.000 C 160.000 42.627 154.627 48.000 148.000 48.000 L 140.000 48.000 L 140.000 56.000 C 140.000 62.627 134.627 68.000 128.000 68.000 C 121.373 68.000 116.000 62.627 116.000 56.000 L 116.000 48.000 L 108.000 48.000 C 101.373 48.000 96.000 42.627 96.000 36.000 Z"),
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
        return _rowsPlusTop!!
    }

private var _rowsPlusTop: ImageVector? = null
