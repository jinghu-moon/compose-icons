package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) return _pintGlass!!
        _pintGlass = phosphorThinIcon(
            name = "PintGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 203.000 29.350 C 202.240 28.491 201.147 27.999 200.000 28.000 L 56.000 28.000 C 54.850 27.992 53.753 28.478 52.987 29.336 C 52.222 30.193 51.862 31.339 52.000 32.480 L 75.150 225.480 C 75.899 231.505 81.029 236.021 87.100 236.000 L 168.900 236.000 C 174.976 236.003 180.096 231.463 180.820 225.430 L 204.000 32.480 C 204.130 31.342 203.766 30.202 203.000 29.350 ZM 195.490 36.000 L 191.650 68.000 L 64.350 68.000 L 60.510 36.000 ZM 172.870 224.480 C 172.626 226.500 170.904 228.015 168.870 228.000 L 87.100 228.000 C 85.065 228.015 83.344 226.500 83.100 224.480 L 65.310 76.000 L 190.690 76.000 Z"),
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
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null
