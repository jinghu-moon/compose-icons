package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CellSignalNone: ImageVector
    get() {
        if (_cellSignalNone != null) return _cellSignalNone!!
        _cellSignalNone = phosphorThinIcon(
            name = "CellSignalNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 44.000 192.000 L 44.000 200.000 C 44.000 202.209 42.209 204.000 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 192.000 C 36.000 189.791 37.791 188.000 40.000 188.000 C 42.209 188.000 44.000 189.791 44.000 192.000 Z"),
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
        return _cellSignalNone!!
    }

private var _cellSignalNone: ImageVector? = null
