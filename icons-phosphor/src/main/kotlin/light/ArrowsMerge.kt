package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsMerge: ImageVector
    get() {
        if (_arrowsMerge != null) return _arrowsMerge!!
        _arrowsMerge = phosphorLightIcon(
            name = "ArrowsMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 190.000 40.000 L 190.000 104.000 C 189.999 105.591 189.366 107.116 188.240 108.240 L 134.000 162.490 L 134.000 217.490 L 155.760 195.740 C 158.124 193.537 161.808 193.602 164.093 195.887 C 166.378 198.172 166.443 201.856 164.240 204.220 L 132.240 236.220 C 129.897 238.560 126.103 238.560 123.760 236.220 L 91.760 204.220 C 89.557 201.856 89.622 198.172 91.907 195.887 C 94.192 193.602 97.876 193.537 100.240 195.740 L 122.000 217.510 L 122.000 162.510 L 67.760 108.240 C 66.634 107.116 66.001 105.591 66.000 104.000 L 66.000 40.000 C 66.000 36.686 68.686 34.000 72.000 34.000 C 75.314 34.000 78.000 36.686 78.000 40.000 L 78.000 101.510 L 128.000 151.510 L 178.000 101.510 L 178.000 40.000 C 178.000 36.686 180.686 34.000 184.000 34.000 C 187.314 34.000 190.000 36.686 190.000 40.000 Z"),
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
        return _arrowsMerge!!
    }

private var _arrowsMerge: ImageVector? = null
