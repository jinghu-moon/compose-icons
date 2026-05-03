package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsOutCardinal: ImageVector
    get() {
        if (_arrowsOutCardinal != null) return _arrowsOutCardinal!!
        _arrowsOutCardinal = phosphorLightIcon(
            name = "ArrowsOutCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 91.760 60.240 C 89.420 57.897 89.420 54.103 91.760 51.760 L 123.760 19.760 C 126.103 17.420 129.897 17.420 132.240 19.760 L 164.240 51.760 C 165.845 53.256 166.506 55.508 165.963 57.634 C 165.420 59.760 163.760 61.420 161.634 61.963 C 159.508 62.506 157.256 61.845 155.760 60.240 L 134.000 38.490 L 134.000 96.000 C 134.000 99.314 131.314 102.000 128.000 102.000 C 124.686 102.000 122.000 99.314 122.000 96.000 L 122.000 38.490 L 100.240 60.240 C 97.897 62.580 94.103 62.580 91.760 60.240 ZM 155.760 195.760 L 134.000 217.510 L 134.000 160.000 C 134.000 156.686 131.314 154.000 128.000 154.000 C 124.686 154.000 122.000 156.686 122.000 160.000 L 122.000 217.510 L 100.240 195.760 C 97.876 193.557 94.192 193.622 91.907 195.907 C 89.622 198.192 89.557 201.876 91.760 204.240 L 123.760 236.240 C 126.103 238.580 129.897 238.580 132.240 236.240 L 164.240 204.240 C 166.443 201.876 166.378 198.192 164.093 195.907 C 161.808 193.622 158.124 193.557 155.760 195.760 ZM 236.240 123.760 L 204.240 91.760 C 201.876 89.557 198.192 89.622 195.907 91.907 C 193.622 94.192 193.557 97.876 195.760 100.240 L 217.510 122.000 L 160.000 122.000 C 156.686 122.000 154.000 124.686 154.000 128.000 C 154.000 131.314 156.686 134.000 160.000 134.000 L 217.510 134.000 L 195.760 155.760 C 194.155 157.256 193.494 159.508 194.037 161.634 C 194.580 163.760 196.240 165.420 198.366 165.963 C 200.492 166.506 202.744 165.845 204.240 164.240 L 236.240 132.240 C 238.580 129.897 238.580 126.103 236.240 123.760 ZM 38.490 134.000 L 96.000 134.000 C 99.314 134.000 102.000 131.314 102.000 128.000 C 102.000 124.686 99.314 122.000 96.000 122.000 L 38.490 122.000 L 60.240 100.240 C 62.443 97.876 62.378 94.192 60.093 91.907 C 57.808 89.622 54.124 89.557 51.760 91.760 L 19.760 123.760 C 17.420 126.103 17.420 129.897 19.760 132.240 L 51.760 164.240 C 54.124 166.443 57.808 166.378 60.093 164.093 C 62.378 161.808 62.443 158.124 60.240 155.760 Z"),
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
        return _arrowsOutCardinal!!
    }

private var _arrowsOutCardinal: ImageVector? = null
