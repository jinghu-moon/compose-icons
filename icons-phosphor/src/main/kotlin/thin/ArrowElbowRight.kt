package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowRight: ImageVector
    get() {
        if (_arrowElbowRight != null) return _arrowElbowRight!!
        _arrowElbowRight = phosphorThinIcon(
            name = "ArrowElbowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 80.000 L 236.000 152.000 C 236.000 154.209 234.209 156.000 232.000 156.000 C 229.791 156.000 228.000 154.209 228.000 152.000 L 228.000 89.660 L 122.830 194.830 C 122.080 195.581 121.062 196.003 120.000 196.003 C 118.938 196.003 117.920 195.581 117.170 194.830 L 21.170 98.830 C 19.607 97.267 19.607 94.733 21.170 93.170 C 22.733 91.607 25.267 91.607 26.830 93.170 L 120.000 186.340 L 222.340 84.000 L 160.000 84.000 C 157.791 84.000 156.000 82.209 156.000 80.000 C 156.000 77.791 157.791 76.000 160.000 76.000 L 232.000 76.000 C 234.209 76.000 236.000 77.791 236.000 80.000 Z"),
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
        return _arrowElbowRight!!
    }

private var _arrowElbowRight: ImageVector? = null
