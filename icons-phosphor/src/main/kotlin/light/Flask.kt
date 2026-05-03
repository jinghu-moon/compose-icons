package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = phosphorLightIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 200.800 L 158.000 97.480 L 158.000 38.000 L 168.000 38.000 C 171.314 38.000 174.000 35.314 174.000 32.000 C 174.000 28.686 171.314 26.000 168.000 26.000 L 88.000 26.000 C 84.686 26.000 82.000 28.686 82.000 32.000 C 82.000 35.314 84.686 38.000 88.000 38.000 L 98.000 38.000 L 98.000 97.480 L 36.000 200.800 C 33.407 205.124 33.339 210.509 35.823 214.896 C 38.307 219.284 42.958 221.998 48.000 222.000 L 208.000 222.000 C 213.042 221.998 217.693 219.284 220.177 214.896 C 222.661 210.509 222.593 205.124 220.000 200.800 ZM 109.150 102.230 C 109.708 101.296 110.002 100.228 110.000 99.140 L 110.000 38.000 L 146.000 38.000 L 146.000 99.140 C 145.998 100.228 146.292 101.296 146.850 102.230 L 186.500 168.310 C 174.090 171.470 155.640 171.310 130.710 158.650 C 113.770 150.070 97.710 145.850 82.880 146.010 ZM 209.720 209.000 C 209.361 209.621 208.697 210.003 207.980 210.000 L 48.000 210.000 C 47.289 209.992 46.636 209.608 46.284 208.991 C 45.933 208.373 45.935 207.615 46.290 207.000 L 75.290 158.590 C 90.180 156.510 106.970 160.140 125.230 169.380 C 144.000 178.800 159.670 182.000 172.420 182.000 C 179.357 182.052 186.260 181.040 192.890 179.000 L 209.690 207.000 C 210.057 207.613 210.068 208.376 209.720 209.000 Z"),
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
        return _flask!!
    }

private var _flask: ImageVector? = null
