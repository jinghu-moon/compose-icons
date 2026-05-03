package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MemberOf: ImageVector
    get() {
        if (_memberOf != null) return _memberOf!!
        _memberOf = phosphorLightIcon(
            name = "MemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 134.000 L 54.260 134.000 C 57.426 172.389 89.481 201.948 128.000 202.000 L 200.000 202.000 C 203.314 202.000 206.000 204.686 206.000 208.000 C 206.000 211.314 203.314 214.000 200.000 214.000 L 128.000 214.000 C 80.504 214.000 42.000 175.496 42.000 128.000 C 42.000 80.504 80.504 42.000 128.000 42.000 L 200.000 42.000 C 203.314 42.000 206.000 44.686 206.000 48.000 C 206.000 51.314 203.314 54.000 200.000 54.000 L 128.000 54.000 C 89.481 54.052 57.426 83.611 54.260 122.000 L 200.000 122.000 C 203.314 122.000 206.000 124.686 206.000 128.000 C 206.000 131.314 203.314 134.000 200.000 134.000 Z"),
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
        return _memberOf!!
    }

private var _memberOf: ImageVector? = null
