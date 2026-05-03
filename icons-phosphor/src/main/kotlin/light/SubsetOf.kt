package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SubsetOf: ImageVector
    get() {
        if (_subsetOf != null) return _subsetOf!!
        _subsetOf = phosphorLightIcon(
            name = "SubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 206.000 208.000 C 206.000 211.314 203.314 214.000 200.000 214.000 L 48.000 214.000 C 44.686 214.000 42.000 211.314 42.000 208.000 C 42.000 204.686 44.686 202.000 48.000 202.000 L 200.000 202.000 C 203.314 202.000 206.000 204.686 206.000 208.000 ZM 200.000 162.000 L 104.000 162.000 C 76.386 162.000 54.000 139.614 54.000 112.000 C 54.000 84.386 76.386 62.000 104.000 62.000 L 200.000 62.000 C 203.314 62.000 206.000 59.314 206.000 56.000 C 206.000 52.686 203.314 50.000 200.000 50.000 L 104.000 50.000 C 69.758 50.000 42.000 77.758 42.000 112.000 C 42.000 146.242 69.758 174.000 104.000 174.000 L 200.000 174.000 C 203.314 174.000 206.000 171.314 206.000 168.000 C 206.000 164.686 203.314 162.000 200.000 162.000 Z"),
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
        return _subsetOf!!
    }

private var _subsetOf: ImageVector? = null
