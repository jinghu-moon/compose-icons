package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MagnifyingGlassMinus: ImageVector
    get() {
        if (_magnifyingGlassMinus != null) return _magnifyingGlassMinus!!
        _magnifyingGlassMinus = phosphorLightIcon(
            name = "MagnifyingGlassMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 150.000 112.000 C 150.000 115.314 147.314 118.000 144.000 118.000 L 80.000 118.000 C 76.686 118.000 74.000 115.314 74.000 112.000 C 74.000 108.686 76.686 106.000 80.000 106.000 L 144.000 106.000 C 147.314 106.000 150.000 108.686 150.000 112.000 ZM 228.240 228.240 C 225.897 230.580 222.103 230.580 219.760 228.240 L 168.380 176.860 C 133.357 207.314 80.504 204.550 48.849 170.610 C 17.194 136.669 18.115 83.751 50.933 50.933 C 83.751 18.115 136.669 17.194 170.610 48.849 C 204.550 80.504 207.314 133.357 176.860 168.380 L 228.240 219.760 C 230.580 222.103 230.580 225.897 228.240 228.240 ZM 112.000 186.000 C 152.869 186.000 186.000 152.869 186.000 112.000 C 186.000 71.131 152.869 38.000 112.000 38.000 C 71.131 38.000 38.000 71.131 38.000 112.000 C 38.050 152.849 71.151 185.950 112.000 186.000 Z"),
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
        return _magnifyingGlassMinus!!
    }

private var _magnifyingGlassMinus: ImageVector? = null
