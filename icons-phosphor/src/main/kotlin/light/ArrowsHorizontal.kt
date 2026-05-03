package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsHorizontal: ImageVector
    get() {
        if (_arrowsHorizontal != null) return _arrowsHorizontal!!
        _arrowsHorizontal = phosphorLightIcon(
            name = "ArrowsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.240 132.240 L 204.240 164.240 C 201.876 166.443 198.192 166.378 195.907 164.093 C 193.622 161.808 193.557 158.124 195.760 155.760 L 217.510 134.000 L 38.510 134.000 L 60.260 155.760 C 61.865 157.256 62.526 159.508 61.983 161.634 C 61.440 163.760 59.780 165.420 57.654 165.963 C 55.528 166.506 53.276 165.845 51.780 164.240 L 19.780 132.240 C 17.440 129.897 17.440 126.103 19.780 123.760 L 51.780 91.760 C 54.144 89.557 57.828 89.622 60.113 91.907 C 62.398 94.192 62.463 97.876 60.260 100.240 L 38.490 122.000 L 217.490 122.000 L 195.740 100.240 C 193.537 97.876 193.602 94.192 195.887 91.907 C 198.172 89.622 201.856 89.557 204.220 91.760 L 236.220 123.760 C 238.565 126.097 238.574 129.892 236.240 132.240 Z"),
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
        return _arrowsHorizontal!!
    }

private var _arrowsHorizontal: ImageVector? = null
