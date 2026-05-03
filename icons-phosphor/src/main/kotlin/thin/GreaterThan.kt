package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) return _greaterThan!!
        _greaterThan = phosphorThinIcon(
            name = "GreaterThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 128.000 C 220.002 129.548 219.110 130.958 217.710 131.620 L 65.710 203.620 C 65.177 203.876 64.592 204.006 64.000 204.000 C 62.125 204.004 60.499 202.705 60.089 200.876 C 59.678 199.047 60.593 197.178 62.290 196.380 L 206.660 128.000 L 62.290 59.620 C 60.345 58.647 59.533 56.298 60.463 54.332 C 61.393 52.366 63.724 51.503 65.710 52.390 L 217.710 124.390 C 219.106 125.050 219.998 126.455 220.000 128.000 Z"),
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
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
