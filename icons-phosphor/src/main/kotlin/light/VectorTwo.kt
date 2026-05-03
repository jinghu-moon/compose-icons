package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) return _vectorTwo!!
        _vectorTwo = phosphorLightIcon(
            name = "VectorTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.240 196.240 L 196.240 228.240 C 193.876 230.443 190.192 230.378 187.907 228.093 C 185.622 225.808 185.557 222.124 187.760 219.760 L 209.510 198.000 L 80.000 198.000 C 76.686 198.000 74.000 195.314 74.000 192.000 L 74.000 54.490 L 52.240 76.240 C 49.876 78.443 46.192 78.378 43.907 76.093 C 41.622 73.808 41.557 70.124 43.760 67.760 L 75.760 35.760 C 78.103 33.420 81.897 33.420 84.240 35.760 L 116.240 67.760 C 117.845 69.256 118.506 71.508 117.963 73.634 C 117.420 75.760 115.760 77.420 113.634 77.963 C 111.508 78.506 109.256 77.845 107.760 76.240 L 86.000 54.490 L 86.000 186.000 L 209.510 186.000 L 187.760 164.240 C 185.557 161.876 185.622 158.192 187.907 155.907 C 190.192 153.622 193.876 153.557 196.240 155.760 L 228.240 187.760 C 230.580 190.103 230.580 193.897 228.240 196.240 Z"),
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
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
