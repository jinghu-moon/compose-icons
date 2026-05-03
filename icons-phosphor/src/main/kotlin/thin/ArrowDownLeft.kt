package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorThinIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 194.830 66.830 L 73.660 188.000 L 168.000 188.000 C 170.209 188.000 172.000 189.791 172.000 192.000 C 172.000 194.209 170.209 196.000 168.000 196.000 L 64.000 196.000 C 61.791 196.000 60.000 194.209 60.000 192.000 L 60.000 88.000 C 60.000 85.791 61.791 84.000 64.000 84.000 C 66.209 84.000 68.000 85.791 68.000 88.000 L 68.000 182.340 L 189.170 61.170 C 190.733 59.607 193.267 59.607 194.830 61.170 C 196.393 62.733 196.393 65.267 194.830 66.830 Z"),
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
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
