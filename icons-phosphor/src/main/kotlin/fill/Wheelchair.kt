package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorFillIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 250.530 199.590 L 226.530 207.590 C 222.755 208.853 218.625 207.149 216.840 203.590 L 187.050 144.000 L 104.000 144.000 C 99.582 144.000 96.000 140.418 96.000 136.000 L 96.000 106.340 C 69.364 114.292 52.592 140.579 56.606 168.085 C 60.619 195.592 84.202 215.991 112.000 216.000 C 137.910 216.000 162.090 197.950 168.250 174.000 C 169.355 169.720 173.720 167.145 178.000 168.250 C 182.280 169.355 184.855 173.720 183.750 178.000 C 175.690 209.300 145.520 232.000 112.000 232.000 C 75.367 231.978 44.590 204.454 40.494 168.051 C 36.398 131.648 60.288 97.972 96.000 89.810 L 96.000 70.810 C 82.677 66.838 74.286 53.692 76.293 39.935 C 78.300 26.178 90.097 15.977 104.000 15.977 C 117.903 15.977 129.700 26.178 131.707 39.935 C 133.714 53.692 125.323 66.838 112.000 70.810 L 112.000 88.000 L 168.000 88.000 C 172.418 88.000 176.000 91.582 176.000 96.000 C 176.000 100.418 172.418 104.000 168.000 104.000 L 112.000 104.000 L 112.000 128.000 L 192.000 128.000 C 195.028 128.002 197.795 129.712 199.150 132.420 L 228.050 190.220 L 245.470 184.410 C 249.662 183.013 254.193 185.278 255.590 189.470 C 256.987 193.662 254.722 198.193 250.530 199.590 Z"),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
