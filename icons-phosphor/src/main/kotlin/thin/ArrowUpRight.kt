package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorThinIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 64.000 L 196.000 168.000 C 196.000 170.209 194.209 172.000 192.000 172.000 C 189.791 172.000 188.000 170.209 188.000 168.000 L 188.000 73.660 L 66.830 194.830 C 65.267 196.393 62.733 196.393 61.170 194.830 C 59.607 193.267 59.607 190.733 61.170 189.170 L 182.340 68.000 L 88.000 68.000 C 85.791 68.000 84.000 66.209 84.000 64.000 C 84.000 61.791 85.791 60.000 88.000 60.000 L 192.000 60.000 C 194.209 60.000 196.000 61.791 196.000 64.000 Z"),
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
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
