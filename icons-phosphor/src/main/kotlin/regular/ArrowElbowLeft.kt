package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = phosphorRegularIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.660 101.660 L 141.660 197.660 C 140.159 199.162 138.123 200.006 136.000 200.006 C 133.877 200.006 131.841 199.162 130.340 197.660 L 32.000 99.310 L 32.000 152.000 C 32.000 156.418 28.418 160.000 24.000 160.000 C 19.582 160.000 16.000 156.418 16.000 152.000 L 16.000 80.000 C 16.000 75.582 19.582 72.000 24.000 72.000 L 96.000 72.000 C 100.418 72.000 104.000 75.582 104.000 80.000 C 104.000 84.418 100.418 88.000 96.000 88.000 L 43.310 88.000 L 136.000 180.690 L 226.340 90.340 C 229.466 87.214 234.534 87.214 237.660 90.340 C 240.786 93.466 240.786 98.534 237.660 101.660 Z"),
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
