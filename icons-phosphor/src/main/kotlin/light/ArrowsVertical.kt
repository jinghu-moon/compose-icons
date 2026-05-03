package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsVertical: ImageVector
    get() {
        if (_arrowsVertical != null) return _arrowsVertical!!
        _arrowsVertical = phosphorLightIcon(
            name = "ArrowsVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.240 195.760 C 166.580 198.103 166.580 201.897 164.240 204.240 L 132.240 236.240 C 129.897 238.580 126.103 238.580 123.760 236.240 L 91.760 204.240 C 89.557 201.876 89.622 198.192 91.907 195.907 C 94.192 193.622 97.876 193.557 100.240 195.760 L 122.000 217.510 L 122.000 38.510 L 100.240 60.240 C 97.876 62.443 94.192 62.378 91.907 60.093 C 89.622 57.808 89.557 54.124 91.760 51.760 L 123.760 19.760 C 126.103 17.420 129.897 17.420 132.240 19.760 L 164.240 51.760 C 165.845 53.256 166.506 55.508 165.963 57.634 C 165.420 59.760 163.760 61.420 161.634 61.963 C 159.508 62.506 157.256 61.845 155.760 60.240 L 134.000 38.490 L 134.000 217.490 L 155.760 195.740 C 158.108 193.406 161.903 193.415 164.240 195.760 Z"),
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
        return _arrowsVertical!!
    }

private var _arrowsVertical: ImageVector? = null
