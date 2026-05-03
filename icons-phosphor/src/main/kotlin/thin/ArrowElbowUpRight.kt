package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowUpRight: ImageVector
    get() {
        if (_arrowElbowUpRight != null) return _arrowElbowUpRight!!
        _arrowElbowUpRight = phosphorThinIcon(
            name = "ArrowElbowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 218.830 82.830 L 170.830 130.830 C 169.267 132.393 166.733 132.393 165.170 130.830 C 163.607 129.267 163.607 126.733 165.170 125.170 L 206.340 84.000 L 76.000 84.000 L 76.000 224.000 C 76.000 226.209 74.209 228.000 72.000 228.000 C 69.791 228.000 68.000 226.209 68.000 224.000 L 68.000 80.000 C 68.000 77.791 69.791 76.000 72.000 76.000 L 206.340 76.000 L 165.170 34.830 C 163.607 33.267 163.607 30.733 165.170 29.170 C 166.733 27.607 169.267 27.607 170.830 29.170 L 218.830 77.170 C 219.581 77.920 220.003 78.938 220.003 80.000 C 220.003 81.062 219.581 82.080 218.830 82.830 Z"),
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
        return _arrowElbowUpRight!!
    }

private var _arrowElbowUpRight: ImageVector? = null
