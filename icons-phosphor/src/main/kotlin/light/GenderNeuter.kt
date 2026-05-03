package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) return _genderNeuter!!
        _genderNeuter = phosphorLightIcon(
            name = "GenderNeuter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 206.000 104.000 C 206.010 61.699 172.301 27.100 130.014 26.007 C 87.728 24.915 52.277 57.728 50.103 99.973 C 47.929 142.218 79.824 178.496 122.000 181.750 L 122.000 232.000 C 122.000 235.314 124.686 238.000 128.000 238.000 C 131.314 238.000 134.000 235.314 134.000 232.000 L 134.000 181.750 C 174.603 178.574 205.947 144.727 206.000 104.000 ZM 128.000 170.000 C 91.549 170.000 62.000 140.451 62.000 104.000 C 62.000 67.549 91.549 38.000 128.000 38.000 C 164.451 38.000 194.000 67.549 194.000 104.000 C 193.956 140.433 164.433 169.956 128.000 170.000 Z"),
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
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
