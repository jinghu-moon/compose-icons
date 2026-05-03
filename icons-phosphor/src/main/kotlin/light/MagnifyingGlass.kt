package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = phosphorLightIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.240 219.760 L 176.860 168.380 C 207.314 133.357 204.550 80.504 170.610 48.849 C 136.669 17.194 83.751 18.115 50.933 50.933 C 18.115 83.751 17.194 136.669 48.849 170.610 C 80.504 204.550 133.357 207.314 168.380 176.860 L 219.760 228.240 C 222.124 230.443 225.808 230.378 228.093 228.093 C 230.378 225.808 230.443 222.124 228.240 219.760 ZM 38.000 112.000 C 38.000 71.131 71.131 38.000 112.000 38.000 C 152.869 38.000 186.000 71.131 186.000 112.000 C 186.000 152.869 152.869 186.000 112.000 186.000 C 71.151 185.950 38.050 152.849 38.000 112.000 Z"),
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
        return _magnifyingGlass!!
    }

private var _magnifyingGlass: ImageVector? = null
