package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineUp: ImageVector
    get() {
        if (_arrowLineUp != null) return _arrowLineUp!!
        _arrowLineUp = phosphorFillIcon(
            name = "ArrowLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 205.660 138.340 C 207.951 140.628 208.636 144.071 207.397 147.062 C 206.158 150.053 203.238 152.003 200.000 152.000 L 136.000 152.000 L 136.000 224.000 C 136.000 228.418 132.418 232.000 128.000 232.000 C 123.582 232.000 120.000 228.418 120.000 224.000 L 120.000 152.000 L 56.000 152.000 C 52.762 152.003 49.842 150.053 48.603 147.062 C 47.364 144.071 48.049 140.628 50.340 138.340 L 122.340 66.340 C 123.841 64.838 125.877 63.994 128.000 63.994 C 130.123 63.994 132.159 64.838 133.660 66.340 ZM 216.000 32.000 L 40.000 32.000 C 35.582 32.000 32.000 35.582 32.000 40.000 C 32.000 44.418 35.582 48.000 40.000 48.000 L 216.000 48.000 C 220.418 48.000 224.000 44.418 224.000 40.000 C 224.000 35.582 220.418 32.000 216.000 32.000 Z"),
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
