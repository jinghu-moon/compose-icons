package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorFillIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 56.000 L 240.000 104.000 C 240.000 108.418 236.418 112.000 232.000 112.000 L 184.000 112.000 C 180.762 112.003 177.842 110.053 176.603 107.062 C 175.364 104.071 176.049 100.628 178.340 98.340 L 195.340 81.340 L 184.790 71.690 L 184.540 71.450 C 153.509 40.431 103.284 40.194 71.961 70.918 C 40.639 101.643 39.908 151.863 70.324 183.486 C 100.739 215.109 150.950 216.333 182.870 186.230 C 186.082 183.192 191.147 183.333 194.185 186.545 C 197.223 189.757 197.082 194.822 193.870 197.860 C 176.082 214.704 152.498 224.063 128.000 224.000 L 126.680 224.000 C 83.419 223.407 45.900 193.950 35.058 152.066 C 24.216 110.181 42.731 66.220 80.271 44.712 C 117.811 23.204 165.100 29.464 195.750 60.000 L 206.680 70.000 L 226.340 50.300 C 228.633 48.004 232.086 47.321 235.081 48.571 C 238.076 49.820 240.019 52.755 240.000 56.000 Z"),
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
