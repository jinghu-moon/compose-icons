package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsInLineVertical: ImageVector
    get() {
        if (_arrowsInLineVertical != null) return _arrowsInLineVertical!!
        _arrowsInLineVertical = phosphorLightIcon(
            name = "ArrowsInLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 128.000 C 222.000 131.314 219.314 134.000 216.000 134.000 L 40.000 134.000 C 36.686 134.000 34.000 131.314 34.000 128.000 C 34.000 124.686 36.686 122.000 40.000 122.000 L 216.000 122.000 C 219.314 122.000 222.000 124.686 222.000 128.000 ZM 123.760 100.240 C 126.103 102.580 129.897 102.580 132.240 100.240 L 164.240 68.240 C 166.443 65.876 166.378 62.192 164.093 59.907 C 161.808 57.622 158.124 57.557 155.760 59.760 L 134.000 81.510 L 134.000 16.000 C 134.000 12.686 131.314 10.000 128.000 10.000 C 124.686 10.000 122.000 12.686 122.000 16.000 L 122.000 81.510 L 100.240 59.760 C 97.876 57.557 94.192 57.622 91.907 59.907 C 89.622 62.192 89.557 65.876 91.760 68.240 ZM 132.240 155.760 C 129.897 153.420 126.103 153.420 123.760 155.760 L 91.760 187.760 C 89.557 190.124 89.622 193.808 91.907 196.093 C 94.192 198.378 97.876 198.443 100.240 196.240 L 122.000 174.490 L 122.000 240.000 C 122.000 243.314 124.686 246.000 128.000 246.000 C 131.314 246.000 134.000 243.314 134.000 240.000 L 134.000 174.490 L 155.760 196.240 C 158.124 198.443 161.808 198.378 164.093 196.093 C 166.378 193.808 166.443 190.124 164.240 187.760 Z"),
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
        return _arrowsInLineVertical!!
    }

private var _arrowsInLineVertical: ImageVector? = null
