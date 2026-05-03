package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) return _linkSimple!!
        _linkSimple = phosphorBoldIcon(
            name = "LinkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 87.500 151.520 L 151.500 87.520 C 156.194 82.826 163.806 82.826 168.500 87.520 C 173.194 92.214 173.194 99.826 168.500 104.520 L 104.500 168.520 C 99.806 173.214 92.194 173.214 87.500 168.520 C 82.806 163.826 82.806 156.214 87.500 151.520 ZM 218.500 37.520 C 195.048 14.121 157.082 14.121 133.630 37.520 L 103.510 67.610 C 98.816 72.304 98.816 79.916 103.510 84.610 C 108.204 89.304 115.816 89.304 120.510 84.610 L 150.580 54.550 C 164.641 40.486 187.441 40.484 201.505 54.545 C 215.569 68.606 215.571 91.406 201.510 105.470 L 171.400 135.520 C 166.706 140.214 166.706 147.826 171.400 152.520 C 176.094 157.214 183.706 157.214 188.400 152.520 L 218.480 122.460 C 241.892 98.993 241.878 61.000 218.450 37.550 ZM 135.520 171.400 L 105.450 201.480 C 91.386 215.541 68.586 215.539 54.525 201.475 C 40.464 187.411 40.466 164.611 54.530 150.550 L 84.590 120.480 C 89.284 115.786 89.284 108.174 84.590 103.480 C 79.896 98.786 72.284 98.786 67.590 103.480 L 37.550 133.580 C 14.114 157.019 14.116 195.019 37.555 218.455 C 60.994 241.891 98.994 241.889 122.430 218.450 L 152.490 188.380 C 157.184 183.686 157.184 176.074 152.490 171.380 C 147.796 166.686 140.184 166.686 135.490 171.380 Z"),
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
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
