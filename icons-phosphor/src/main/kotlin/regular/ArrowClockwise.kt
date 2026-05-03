package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorRegularIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 56.000 L 240.000 104.000 C 240.000 108.418 236.418 112.000 232.000 112.000 L 184.000 112.000 C 179.582 112.000 176.000 108.418 176.000 104.000 C 176.000 99.582 179.582 96.000 184.000 96.000 L 211.400 96.000 L 184.810 71.640 L 184.560 71.400 C 153.529 40.381 103.304 40.144 71.981 70.868 C 40.659 101.593 39.928 151.813 70.344 183.436 C 100.759 215.059 150.970 216.283 182.890 186.180 C 186.102 183.142 191.167 183.283 194.205 186.495 C 197.243 189.707 197.102 194.772 193.890 197.810 C 176.105 214.677 152.512 224.055 128.000 224.000 L 126.680 224.000 C 83.419 223.407 45.900 193.950 35.058 152.066 C 24.216 110.181 42.731 66.220 80.271 44.712 C 117.811 23.204 165.100 29.464 195.750 60.000 L 224.000 85.800 L 224.000 56.000 C 224.000 51.582 227.582 48.000 232.000 48.000 C 236.418 48.000 240.000 51.582 240.000 56.000 Z"),
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
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
