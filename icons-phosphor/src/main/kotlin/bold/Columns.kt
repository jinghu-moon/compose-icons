package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = phosphorBoldIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 28.000 L 64.000 28.000 C 52.954 28.000 44.000 36.954 44.000 48.000 L 44.000 208.000 C 44.000 219.046 52.954 228.000 64.000 228.000 L 100.000 228.000 C 111.046 228.000 120.000 219.046 120.000 208.000 L 120.000 48.000 C 120.000 36.954 111.046 28.000 100.000 28.000 ZM 96.000 204.000 L 68.000 204.000 L 68.000 52.000 L 96.000 52.000 ZM 192.000 28.000 L 156.000 28.000 C 144.954 28.000 136.000 36.954 136.000 48.000 L 136.000 208.000 C 136.000 219.046 144.954 228.000 156.000 228.000 L 192.000 228.000 C 203.046 228.000 212.000 219.046 212.000 208.000 L 212.000 48.000 C 212.000 36.954 203.046 28.000 192.000 28.000 ZM 188.000 204.000 L 160.000 204.000 L 160.000 52.000 L 188.000 52.000 Z"),
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
        return _columns!!
    }

private var _columns: ImageVector? = null
