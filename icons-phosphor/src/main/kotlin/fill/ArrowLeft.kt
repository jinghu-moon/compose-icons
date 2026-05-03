package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) return _arrowLeft!!
        _arrowLeft = phosphorFillIcon(
            name = "ArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 128.000 C 224.000 132.418 220.418 136.000 216.000 136.000 L 120.000 136.000 L 120.000 200.000 C 120.003 203.238 118.053 206.158 115.062 207.397 C 112.071 208.636 108.628 207.951 106.340 205.660 L 34.340 133.660 C 32.838 132.159 31.994 130.123 31.994 128.000 C 31.994 125.877 32.838 123.841 34.340 122.340 L 106.340 50.340 C 108.628 48.049 112.071 47.364 115.062 48.603 C 118.053 49.842 120.003 52.762 120.000 56.000 L 120.000 120.000 L 216.000 120.000 C 220.418 120.000 224.000 123.582 224.000 128.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
