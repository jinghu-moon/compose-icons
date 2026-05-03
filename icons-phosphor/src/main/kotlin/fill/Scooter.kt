package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorFillIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 172.000 C 244.009 187.329 233.147 200.511 218.099 203.432 C 203.052 206.354 188.046 198.195 182.318 183.976 C 176.590 169.758 181.749 153.475 194.620 145.150 L 185.620 118.260 L 134.160 181.070 C 132.647 182.917 130.388 183.992 128.000 184.000 L 73.660 184.000 C 67.626 198.928 51.441 207.047 35.867 202.959 C 20.294 198.872 10.183 183.849 12.259 167.883 C 14.335 151.916 27.950 139.978 44.051 140.008 C 60.152 140.038 73.723 152.026 75.740 168.000 L 124.210 168.000 L 179.670 100.310 L 162.230 48.000 L 136.000 48.000 C 131.582 48.000 128.000 44.418 128.000 40.000 C 128.000 35.582 131.582 32.000 136.000 32.000 L 168.000 32.000 C 171.444 32.000 174.501 34.203 175.590 37.470 L 209.800 140.080 C 210.520 140.030 211.260 140.000 212.000 140.000 C 229.673 140.000 244.000 154.327 244.000 172.000 Z"),
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
        return _scooter!!
    }

private var _scooter: ImageVector? = null
