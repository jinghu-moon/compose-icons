package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = phosphorRegularIcon(
            name = "ArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 128.000 C 224.000 132.418 220.418 136.000 216.000 136.000 L 59.310 136.000 L 117.660 194.340 C 120.786 197.466 120.786 202.534 117.660 205.660 C 114.534 208.786 109.466 208.786 106.340 205.660 L 34.340 133.660 C 32.838 132.159 31.994 130.123 31.994 128.000 C 31.994 125.877 32.838 123.841 34.340 122.340 L 106.340 50.340 C 109.466 47.214 114.534 47.214 117.660 50.340 C 120.786 53.466 120.786 58.534 117.660 61.660 L 59.310 120.000 L 216.000 120.000 C 220.418 120.000 224.000 123.582 224.000 128.000 Z"),
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
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
