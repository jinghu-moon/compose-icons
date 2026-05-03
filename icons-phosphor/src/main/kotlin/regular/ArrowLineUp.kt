package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineUp: ImageVector
    get() {
        if (_arrowLineUp != null) return _arrowLineUp!!
        _arrowLineUp = phosphorRegularIcon(
            name = "ArrowLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 205.660 138.340 C 208.786 141.466 208.786 146.534 205.660 149.660 C 202.534 152.786 197.466 152.786 194.340 149.660 L 136.000 91.310 L 136.000 224.000 C 136.000 228.418 132.418 232.000 128.000 232.000 C 123.582 232.000 120.000 228.418 120.000 224.000 L 120.000 91.310 L 61.660 149.660 C 58.534 152.786 53.466 152.786 50.340 149.660 C 47.214 146.534 47.214 141.466 50.340 138.340 L 122.340 66.340 C 123.841 64.838 125.877 63.994 128.000 63.994 C 130.123 63.994 132.159 64.838 133.660 66.340 ZM 216.000 32.000 L 40.000 32.000 C 35.582 32.000 32.000 35.582 32.000 40.000 C 32.000 44.418 35.582 48.000 40.000 48.000 L 216.000 48.000 C 220.418 48.000 224.000 44.418 224.000 40.000 C 224.000 35.582 220.418 32.000 216.000 32.000 Z"),
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
        return _arrowLineUp!!
    }

private var _arrowLineUp: ImageVector? = null
