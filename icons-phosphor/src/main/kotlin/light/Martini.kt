package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Martini: ImageVector
    get() {
        if (_martini != null) return _martini!!
        _martini = phosphorLightIcon(
            name = "Martini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.240 44.240 C 237.954 42.524 238.466 39.945 237.538 37.705 C 236.611 35.464 234.425 34.002 232.000 34.000 L 24.000 34.000 C 21.575 34.002 19.389 35.464 18.462 37.705 C 17.534 39.945 18.046 42.524 19.760 44.240 L 122.000 146.490 L 122.000 210.000 L 88.000 210.000 C 84.686 210.000 82.000 212.686 82.000 216.000 C 82.000 219.314 84.686 222.000 88.000 222.000 L 168.000 222.000 C 171.314 222.000 174.000 219.314 174.000 216.000 C 174.000 212.686 171.314 210.000 168.000 210.000 L 134.000 210.000 L 134.000 146.490 ZM 70.490 78.000 L 185.490 78.000 L 128.000 135.510 ZM 217.490 46.000 L 197.490 66.000 L 58.490 66.000 L 38.490 46.000 Z"),
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
        return _martini!!
    }

private var _martini: ImageVector? = null
