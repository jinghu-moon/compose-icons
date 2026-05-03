package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) return _arrowsInCardinal!!
        _arrowsInCardinal = phosphorLightIcon(
            name = "ArrowsInCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 91.760 68.240 C 89.557 65.876 89.622 62.192 91.907 59.907 C 94.192 57.622 97.876 57.557 100.240 59.760 L 122.000 81.510 L 122.000 24.000 C 122.000 20.686 124.686 18.000 128.000 18.000 C 131.314 18.000 134.000 20.686 134.000 24.000 L 134.000 81.510 L 155.760 59.760 C 158.124 57.557 161.808 57.622 164.093 59.907 C 166.378 62.192 166.443 65.876 164.240 68.240 L 132.240 100.240 C 129.897 102.580 126.103 102.580 123.760 100.240 ZM 132.240 155.760 C 129.897 153.420 126.103 153.420 123.760 155.760 L 91.760 187.760 C 89.557 190.124 89.622 193.808 91.907 196.093 C 94.192 198.378 97.876 198.443 100.240 196.240 L 122.000 174.490 L 122.000 232.000 C 122.000 235.314 124.686 238.000 128.000 238.000 C 131.314 238.000 134.000 235.314 134.000 232.000 L 134.000 174.490 L 155.760 196.240 C 158.124 198.443 161.808 198.378 164.093 196.093 C 166.378 193.808 166.443 190.124 164.240 187.760 ZM 232.000 122.000 L 174.490 122.000 L 196.240 100.240 C 198.443 97.876 198.378 94.192 196.093 91.907 C 193.808 89.622 190.124 89.557 187.760 91.760 L 155.760 123.760 C 153.420 126.103 153.420 129.897 155.760 132.240 L 187.760 164.240 C 190.124 166.443 193.808 166.378 196.093 164.093 C 198.378 161.808 198.443 158.124 196.240 155.760 L 174.490 134.000 L 232.000 134.000 C 235.314 134.000 238.000 131.314 238.000 128.000 C 238.000 124.686 235.314 122.000 232.000 122.000 ZM 100.240 123.760 L 68.240 91.760 C 65.876 89.557 62.192 89.622 59.907 91.907 C 57.622 94.192 57.557 97.876 59.760 100.240 L 81.510 122.000 L 24.000 122.000 C 20.686 122.000 18.000 124.686 18.000 128.000 C 18.000 131.314 20.686 134.000 24.000 134.000 L 81.510 134.000 L 59.760 155.760 C 58.155 157.256 57.494 159.508 58.037 161.634 C 58.580 163.760 60.240 165.420 62.366 165.963 C 64.492 166.506 66.744 165.845 68.240 164.240 L 100.240 132.240 C 102.580 129.897 102.580 126.103 100.240 123.760 Z"),
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
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
