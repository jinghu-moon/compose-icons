package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Table: ImageVector
    get() {
        if (_table != null) return _table!!
        _table = phosphorThinIcon(
            name = "Table",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 52.000 L 32.000 52.000 C 29.791 52.000 28.000 53.791 28.000 56.000 L 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 L 228.000 56.000 C 228.000 53.791 226.209 52.000 224.000 52.000 ZM 36.000 108.000 L 84.000 108.000 L 84.000 148.000 L 36.000 148.000 ZM 92.000 108.000 L 220.000 108.000 L 220.000 148.000 L 92.000 148.000 ZM 220.000 60.000 L 220.000 100.000 L 36.000 100.000 L 36.000 60.000 ZM 36.000 192.000 L 36.000 156.000 L 84.000 156.000 L 84.000 196.000 L 40.000 196.000 C 37.791 196.000 36.000 194.209 36.000 192.000 ZM 216.000 196.000 L 92.000 196.000 L 92.000 156.000 L 220.000 156.000 L 220.000 192.000 C 220.000 194.209 218.209 196.000 216.000 196.000 Z"),
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
        return _table!!
    }

private var _table: ImageVector? = null
