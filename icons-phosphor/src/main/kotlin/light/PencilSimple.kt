package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) return _pencilSimple!!
        _pencilSimple = phosphorLightIcon(
            name = "PencilSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 225.900 74.780 L 181.210 30.090 C 178.584 27.464 175.023 25.989 171.310 25.989 C 167.597 25.989 164.036 27.464 161.410 30.090 L 38.100 153.410 C 35.469 156.032 33.993 159.596 34.000 163.310 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 92.690 222.000 C 96.404 222.007 99.968 220.531 102.590 217.900 L 225.900 94.580 C 228.526 91.954 230.001 88.393 230.001 84.680 C 230.001 80.967 228.526 77.406 225.900 74.780 ZM 94.100 209.410 C 93.727 209.786 93.220 209.998 92.690 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 163.310 C 46.002 162.780 46.214 162.273 46.590 161.900 L 136.000 72.480 L 183.510 120.000 ZM 217.410 86.100 L 192.000 111.510 L 144.490 64.000 L 169.900 38.580 C 170.275 38.204 170.784 37.993 171.315 37.993 C 171.846 37.993 172.355 38.204 172.730 38.580 L 217.410 83.270 C 217.786 83.645 217.997 84.154 217.997 84.685 C 217.997 85.216 217.786 85.725 217.410 86.100 Z"),
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
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null
