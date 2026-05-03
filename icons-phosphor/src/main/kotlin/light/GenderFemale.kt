package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = phosphorLightIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 206.000 96.000 C 206.010 53.699 172.301 19.100 130.014 18.007 C 87.728 16.915 52.277 49.728 50.103 91.973 C 47.929 134.218 79.824 170.496 122.000 173.750 L 122.000 202.000 L 88.000 202.000 C 84.686 202.000 82.000 204.686 82.000 208.000 C 82.000 211.314 84.686 214.000 88.000 214.000 L 122.000 214.000 L 122.000 240.000 C 122.000 243.314 124.686 246.000 128.000 246.000 C 131.314 246.000 134.000 243.314 134.000 240.000 L 134.000 214.000 L 168.000 214.000 C 171.314 214.000 174.000 211.314 174.000 208.000 C 174.000 204.686 171.314 202.000 168.000 202.000 L 134.000 202.000 L 134.000 173.750 C 174.603 170.574 205.947 136.727 206.000 96.000 ZM 62.000 96.000 C 62.000 59.549 91.549 30.000 128.000 30.000 C 164.451 30.000 194.000 59.549 194.000 96.000 C 194.000 132.451 164.451 162.000 128.000 162.000 C 91.567 161.956 62.044 132.433 62.000 96.000 Z"),
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
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
