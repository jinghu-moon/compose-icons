package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = phosphorThinIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.830 98.830 L 138.830 194.830 C 138.080 195.581 137.062 196.003 136.000 196.003 C 134.938 196.003 133.920 195.581 133.170 194.830 L 28.000 89.660 L 28.000 152.000 C 28.000 154.209 26.209 156.000 24.000 156.000 C 21.791 156.000 20.000 154.209 20.000 152.000 L 20.000 80.000 C 20.000 77.791 21.791 76.000 24.000 76.000 L 96.000 76.000 C 98.209 76.000 100.000 77.791 100.000 80.000 C 100.000 82.209 98.209 84.000 96.000 84.000 L 33.660 84.000 L 136.000 186.340 L 229.170 93.170 C 230.733 91.607 233.267 91.607 234.830 93.170 C 236.393 94.733 236.393 97.267 234.830 98.830 Z"),
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
        return _arrowElbowLeft!!
    }

private var _arrowElbowLeft: ImageVector? = null
