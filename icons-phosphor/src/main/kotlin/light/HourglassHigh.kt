package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HourglassHigh: ImageVector
    get() {
        if (_hourglassHigh != null) return _hourglassHigh!!
        _hourglassHigh = phosphorLightIcon(
            name = "HourglassHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 26.000 L 72.000 26.000 C 64.268 26.000 58.000 32.268 58.000 40.000 L 58.000 76.000 C 58.009 80.404 60.082 84.550 63.600 87.200 L 118.000 128.000 L 63.600 168.800 C 60.082 171.450 58.009 175.596 58.000 180.000 L 58.000 216.000 C 58.000 223.732 64.268 230.000 72.000 230.000 L 184.000 230.000 C 191.732 230.000 198.000 223.732 198.000 216.000 L 198.000 180.360 C 197.988 175.974 195.932 171.844 192.440 169.190 L 138.000 128.000 L 192.490 86.810 C 195.963 84.146 198.000 80.017 198.000 75.640 L 198.000 40.000 C 198.000 32.268 191.732 26.000 184.000 26.000 ZM 72.000 38.000 L 184.000 38.000 C 185.105 38.000 186.000 38.895 186.000 40.000 L 186.000 58.000 L 70.000 58.000 L 70.000 40.000 C 70.000 38.895 70.895 38.000 72.000 38.000 ZM 186.000 180.360 L 186.000 216.000 C 186.000 217.105 185.105 218.000 184.000 218.000 L 72.000 218.000 C 70.895 218.000 70.000 217.105 70.000 216.000 L 70.000 180.000 C 70.000 179.370 70.296 178.778 70.800 178.400 L 128.000 135.510 L 185.220 178.760 C 185.716 179.142 186.005 179.734 186.000 180.360 ZM 185.210 77.240 L 128.000 120.490 L 70.800 77.600 C 70.296 77.222 70.000 76.630 70.000 76.000 L 70.000 70.000 L 186.000 70.000 L 186.000 75.640 C 186.002 76.268 185.710 76.860 185.210 77.240 Z"),
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
        return _hourglassHigh!!
    }

private var _hourglassHigh: ImageVector? = null
