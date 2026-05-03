package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = phosphorThinIcon(
            name = "ArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 88.000 L 196.000 192.000 C 196.000 194.209 194.209 196.000 192.000 196.000 L 88.000 196.000 C 85.791 196.000 84.000 194.209 84.000 192.000 C 84.000 189.791 85.791 188.000 88.000 188.000 L 182.340 188.000 L 61.170 66.830 C 59.607 65.267 59.607 62.733 61.170 61.170 C 62.733 59.607 65.267 59.607 66.830 61.170 L 188.000 182.340 L 188.000 88.000 C 188.000 85.791 189.791 84.000 192.000 84.000 C 194.209 84.000 196.000 85.791 196.000 88.000 Z"),
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
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
