package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SupersetOf: ImageVector
    get() {
        if (_supersetOf != null) return _supersetOf!!
        _supersetOf = phosphorLightIcon(
            name = "SupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 214.000 200.000 C 214.000 203.314 211.314 206.000 208.000 206.000 L 56.000 206.000 C 52.686 206.000 50.000 203.314 50.000 200.000 C 50.000 196.686 52.686 194.000 56.000 194.000 L 208.000 194.000 C 211.314 194.000 214.000 196.686 214.000 200.000 ZM 152.000 154.000 L 56.000 154.000 C 52.686 154.000 50.000 156.686 50.000 160.000 C 50.000 163.314 52.686 166.000 56.000 166.000 L 152.000 166.000 C 186.242 166.000 214.000 138.242 214.000 104.000 C 214.000 69.758 186.242 42.000 152.000 42.000 L 56.000 42.000 C 52.686 42.000 50.000 44.686 50.000 48.000 C 50.000 51.314 52.686 54.000 56.000 54.000 L 152.000 54.000 C 179.614 54.000 202.000 76.386 202.000 104.000 C 202.000 131.614 179.614 154.000 152.000 154.000 Z"),
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
        return _supersetOf!!
    }

private var _supersetOf: ImageVector? = null
