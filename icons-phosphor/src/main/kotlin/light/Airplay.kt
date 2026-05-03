package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorLightIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 132.560 156.100 C 131.420 154.771 129.756 154.005 128.005 154.005 C 126.254 154.005 124.590 154.771 123.450 156.100 L 75.450 212.100 C 73.929 213.878 73.580 216.379 74.558 218.506 C 75.535 220.632 77.660 221.996 80.000 222.000 L 176.000 222.000 C 178.342 222.000 180.470 220.637 181.450 218.510 C 182.430 216.383 182.082 213.880 180.560 212.100 ZM 93.050 210.000 L 128.050 169.220 L 163.000 210.000 ZM 230.000 64.000 L 230.000 176.000 C 230.000 188.150 220.150 198.000 208.000 198.000 L 200.000 198.000 C 196.686 198.000 194.000 195.314 194.000 192.000 C 194.000 188.686 196.686 186.000 200.000 186.000 L 208.000 186.000 C 213.523 186.000 218.000 181.523 218.000 176.000 L 218.000 64.000 C 218.000 58.477 213.523 54.000 208.000 54.000 L 48.000 54.000 C 42.477 54.000 38.000 58.477 38.000 64.000 L 38.000 176.000 C 38.000 181.523 42.477 186.000 48.000 186.000 L 56.000 186.000 C 59.314 186.000 62.000 188.686 62.000 192.000 C 62.000 195.314 59.314 198.000 56.000 198.000 L 48.000 198.000 C 35.850 198.000 26.000 188.150 26.000 176.000 L 26.000 64.000 C 26.000 51.850 35.850 42.000 48.000 42.000 L 208.000 42.000 C 220.150 42.000 230.000 51.850 230.000 64.000 Z"),
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
        return _airplay!!
    }

private var _airplay: ImageVector? = null
