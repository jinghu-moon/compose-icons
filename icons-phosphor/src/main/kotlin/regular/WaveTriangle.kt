package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorRegularIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.480 132.680 L 186.480 204.680 C 184.977 206.774 182.558 208.016 179.980 208.016 C 177.402 208.016 174.983 206.774 173.480 204.680 L 76.000 69.660 L 30.490 132.660 C 27.905 136.250 22.900 137.065 19.310 134.480 C 15.720 131.895 14.905 126.890 17.490 123.300 L 69.490 51.300 C 70.993 49.206 73.412 47.964 75.990 47.964 C 78.568 47.964 80.987 49.206 82.490 51.300 L 180.000 186.300 L 225.510 123.300 C 228.095 119.710 233.100 118.895 236.690 121.480 C 240.280 124.065 241.095 129.070 238.510 132.660 Z"),
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
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
