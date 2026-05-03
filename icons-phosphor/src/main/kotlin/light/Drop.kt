package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Drop: ImageVector
    get() {
        if (_drop != null) return _drop!!
        _drop = phosphorLightIcon(
            name = "Drop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.530 49.060 C 160.282 34.912 146.501 22.167 131.440 11.060 C 129.374 9.615 126.626 9.615 124.560 11.060 C 109.499 22.167 95.718 34.912 83.470 49.060 C 56.340 80.260 42.000 113.090 42.000 144.000 C 42.000 191.496 80.504 230.000 128.000 230.000 C 175.496 230.000 214.000 191.496 214.000 144.000 C 214.000 113.090 199.660 80.260 172.530 49.060 ZM 128.000 218.000 C 87.151 217.950 54.050 184.849 54.000 144.000 C 54.000 84.380 113.000 35.070 128.000 23.490 C 143.000 35.070 202.000 84.380 202.000 144.000 C 201.950 184.849 168.849 217.950 128.000 218.000 ZM 181.920 153.000 C 177.822 175.898 159.898 193.822 137.000 197.920 C 136.669 197.971 136.335 197.997 136.000 198.000 C 132.872 198.012 130.259 195.619 129.997 192.502 C 129.736 189.384 131.913 186.589 135.000 186.080 C 152.380 183.160 167.130 168.400 170.080 151.000 C 170.632 147.730 173.730 145.528 177.000 146.080 C 180.270 146.632 182.472 149.730 181.920 153.000 Z"),
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
        return _drop!!
    }

private var _drop: ImageVector? = null
