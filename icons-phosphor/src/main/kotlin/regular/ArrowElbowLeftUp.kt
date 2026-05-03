package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowLeftUp: ImageVector
    get() {
        if (_arrowElbowLeftUp != null) return _arrowElbowLeftUp!!
        _arrowElbowLeftUp = phosphorRegularIcon(
            name = "ArrowElbowLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 192.000 C 240.000 196.418 236.418 200.000 232.000 200.000 L 88.000 200.000 C 83.582 200.000 80.000 196.418 80.000 192.000 L 80.000 67.310 L 45.660 101.660 C 42.534 104.786 37.466 104.786 34.340 101.660 C 31.214 98.534 31.214 93.466 34.340 90.340 L 82.340 42.340 C 83.841 40.838 85.877 39.994 88.000 39.994 C 90.123 39.994 92.159 40.838 93.660 42.340 L 141.660 90.340 C 144.786 93.466 144.786 98.534 141.660 101.660 C 138.534 104.786 133.466 104.786 130.340 101.660 L 96.000 67.310 L 96.000 184.000 L 232.000 184.000 C 236.418 184.000 240.000 187.582 240.000 192.000 Z"),
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
        return _arrowElbowLeftUp!!
    }

private var _arrowElbowLeftUp: ImageVector? = null
