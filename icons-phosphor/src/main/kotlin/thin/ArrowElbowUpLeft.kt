package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowUpLeft: ImageVector
    get() {
        if (_arrowElbowUpLeft != null) return _arrowElbowUpLeft!!
        _arrowElbowUpLeft = phosphorThinIcon(
            name = "ArrowElbowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 80.000 L 196.000 224.000 C 196.000 226.209 194.209 228.000 192.000 228.000 C 189.791 228.000 188.000 226.209 188.000 224.000 L 188.000 84.000 L 57.660 84.000 L 98.830 125.170 C 100.393 126.733 100.393 129.267 98.830 130.830 C 97.267 132.393 94.733 132.393 93.170 130.830 L 45.170 82.830 C 44.419 82.080 43.997 81.062 43.997 80.000 C 43.997 78.938 44.419 77.920 45.170 77.170 L 93.170 29.170 C 94.733 27.607 97.267 27.607 98.830 29.170 C 100.393 30.733 100.393 33.267 98.830 34.830 L 57.660 76.000 L 192.000 76.000 C 194.209 76.000 196.000 77.791 196.000 80.000 Z"),
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
        return _arrowElbowUpLeft!!
    }

private var _arrowElbowUpLeft: ImageVector? = null
