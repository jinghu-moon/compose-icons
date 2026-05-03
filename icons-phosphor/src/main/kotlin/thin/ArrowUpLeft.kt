package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorThinIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 194.830 194.830 C 194.080 195.581 193.062 196.003 192.000 196.003 C 190.938 196.003 189.920 195.581 189.170 194.830 L 68.000 73.660 L 68.000 168.000 C 68.000 170.209 66.209 172.000 64.000 172.000 C 61.791 172.000 60.000 170.209 60.000 168.000 L 60.000 64.000 C 60.000 61.791 61.791 60.000 64.000 60.000 L 168.000 60.000 C 170.209 60.000 172.000 61.791 172.000 64.000 C 172.000 66.209 170.209 68.000 168.000 68.000 L 73.660 68.000 L 194.830 189.170 C 195.581 189.920 196.003 190.938 196.003 192.000 C 196.003 193.062 195.581 194.080 194.830 194.830 Z"),
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
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
