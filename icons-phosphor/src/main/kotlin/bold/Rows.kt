package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rows: ImageVector
    get() {
        if (_rows != null) return _rows!!
        _rows = phosphorBoldIcon(
            name = "Rows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 136.000 L 48.000 136.000 C 36.954 136.000 28.000 144.954 28.000 156.000 L 28.000 192.000 C 28.000 203.046 36.954 212.000 48.000 212.000 L 208.000 212.000 C 219.046 212.000 228.000 203.046 228.000 192.000 L 228.000 156.000 C 228.000 144.954 219.046 136.000 208.000 136.000 ZM 204.000 188.000 L 52.000 188.000 L 52.000 160.000 L 204.000 160.000 ZM 208.000 44.000 L 48.000 44.000 C 36.954 44.000 28.000 52.954 28.000 64.000 L 28.000 100.000 C 28.000 111.046 36.954 120.000 48.000 120.000 L 208.000 120.000 C 219.046 120.000 228.000 111.046 228.000 100.000 L 228.000 64.000 C 228.000 52.954 219.046 44.000 208.000 44.000 ZM 204.000 96.000 L 52.000 96.000 L 52.000 68.000 L 204.000 68.000 Z"),
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
        return _rows!!
    }

private var _rows: ImageVector? = null
