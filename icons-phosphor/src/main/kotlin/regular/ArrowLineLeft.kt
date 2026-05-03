package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowLineLeft: ImageVector
    get() {
        if (_arrowLineLeft != null) return _arrowLineLeft!!
        _arrowLineLeft = phosphorRegularIcon(
            name = "ArrowLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 128.000 C 232.000 132.418 228.418 136.000 224.000 136.000 L 91.310 136.000 L 149.660 194.340 C 152.786 197.466 152.786 202.534 149.660 205.660 C 146.534 208.786 141.466 208.786 138.340 205.660 L 66.340 133.660 C 64.838 132.159 63.994 130.123 63.994 128.000 C 63.994 125.877 64.838 123.841 66.340 122.340 L 138.340 50.340 C 141.466 47.214 146.534 47.214 149.660 50.340 C 152.786 53.466 152.786 58.534 149.660 61.660 L 91.310 120.000 L 224.000 120.000 C 228.418 120.000 232.000 123.582 232.000 128.000 ZM 40.000 32.000 C 35.582 32.000 32.000 35.582 32.000 40.000 L 32.000 216.000 C 32.000 220.418 35.582 224.000 40.000 224.000 C 44.418 224.000 48.000 220.418 48.000 216.000 L 48.000 40.000 C 48.000 35.582 44.418 32.000 40.000 32.000 Z"),
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
        return _arrowLineLeft!!
    }

private var _arrowLineLeft: ImageVector? = null
