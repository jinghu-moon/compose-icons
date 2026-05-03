package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowRight: ImageVector
    get() {
        if (_arrowElbowRight != null) return _arrowElbowRight!!
        _arrowElbowRight = phosphorRegularIcon(
            name = "ArrowElbowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 80.000 L 240.000 152.000 C 240.000 156.418 236.418 160.000 232.000 160.000 C 227.582 160.000 224.000 156.418 224.000 152.000 L 224.000 99.310 L 125.660 197.660 C 124.159 199.162 122.123 200.006 120.000 200.006 C 117.877 200.006 115.841 199.162 114.340 197.660 L 18.340 101.660 C 15.214 98.534 15.214 93.466 18.340 90.340 C 21.466 87.214 26.534 87.214 29.660 90.340 L 120.000 180.690 L 212.690 88.000 L 160.000 88.000 C 155.582 88.000 152.000 84.418 152.000 80.000 C 152.000 75.582 155.582 72.000 160.000 72.000 L 232.000 72.000 C 236.418 72.000 240.000 75.582 240.000 80.000 Z"),
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
