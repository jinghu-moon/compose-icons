package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = phosphorFillIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 48.000 L 120.000 208.000 C 120.000 216.837 112.837 224.000 104.000 224.000 L 64.000 224.000 C 55.163 224.000 48.000 216.837 48.000 208.000 L 48.000 48.000 C 48.000 39.163 55.163 32.000 64.000 32.000 L 104.000 32.000 C 112.837 32.000 120.000 39.163 120.000 48.000 ZM 192.000 32.000 L 152.000 32.000 C 143.163 32.000 136.000 39.163 136.000 48.000 L 136.000 208.000 C 136.000 216.837 143.163 224.000 152.000 224.000 L 192.000 224.000 C 200.837 224.000 208.000 216.837 208.000 208.000 L 208.000 48.000 C 208.000 39.163 200.837 32.000 192.000 32.000 Z"),
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
