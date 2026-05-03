package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VectorThree: ImageVector
    get() {
        if (_vectorThree != null) return _vectorThree!!
        _vectorThree = phosphorLightIcon(
            name = "VectorThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.240 140.240 L 204.240 172.240 C 201.876 174.443 198.192 174.378 195.907 172.093 C 193.622 169.808 193.557 166.124 195.760 163.760 L 217.510 142.000 L 122.510 142.000 L 62.510 202.000 L 96.000 202.000 C 99.314 202.000 102.000 204.686 102.000 208.000 C 102.000 211.314 99.314 214.000 96.000 214.000 L 48.000 214.000 C 44.686 214.000 42.000 211.314 42.000 208.000 L 42.000 160.000 C 42.000 156.686 44.686 154.000 48.000 154.000 C 51.314 154.000 54.000 156.686 54.000 160.000 L 54.000 193.510 L 114.000 133.510 L 114.000 38.510 L 92.240 60.240 C 89.876 62.443 86.192 62.378 83.907 60.093 C 81.622 57.808 81.557 54.124 83.760 51.760 L 115.760 19.760 C 118.103 17.420 121.897 17.420 124.240 19.760 L 156.240 51.760 C 157.845 53.256 158.506 55.508 157.963 57.634 C 157.420 59.760 155.760 61.420 153.634 61.963 C 151.508 62.506 149.256 61.845 147.760 60.240 L 126.000 38.490 L 126.000 130.000 L 217.510 130.000 L 195.760 108.240 C 193.557 105.876 193.622 102.192 195.907 99.907 C 198.192 97.622 201.876 97.557 204.240 99.760 L 236.240 131.760 C 238.580 134.103 238.580 137.897 236.240 140.240 Z"),
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
        return _vectorThree!!
    }

private var _vectorThree: ImageVector? = null
