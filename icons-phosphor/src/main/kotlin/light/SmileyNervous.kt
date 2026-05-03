package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) return _smileyNervous!!
        _smileyNervous = phosphorLightIcon(
            name = "SmileyNervous",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 82.000 108.000 C 82.000 102.477 86.477 98.000 92.000 98.000 C 97.523 98.000 102.000 102.477 102.000 108.000 C 102.000 113.523 97.523 118.000 92.000 118.000 C 86.477 118.000 82.000 113.523 82.000 108.000 ZM 154.000 108.000 C 154.000 102.477 158.477 98.000 164.000 98.000 C 169.523 98.000 174.000 102.477 174.000 108.000 C 174.000 113.523 169.523 118.000 164.000 118.000 C 158.477 118.000 154.000 113.523 154.000 108.000 ZM 182.000 168.000 C 182.000 171.314 179.314 174.000 176.000 174.000 C 167.000 174.000 162.490 168.000 159.200 163.600 C 156.200 159.540 154.740 158.000 152.000 158.000 C 149.260 158.000 147.850 159.540 144.800 163.600 C 141.510 168.000 137.000 174.000 128.000 174.000 C 119.000 174.000 114.490 168.000 111.200 163.600 C 108.200 159.540 106.740 158.000 104.000 158.000 C 101.260 158.000 99.850 159.540 96.800 163.600 C 93.510 168.000 89.000 174.000 80.000 174.000 C 76.686 174.000 74.000 171.314 74.000 168.000 C 74.000 164.686 76.686 162.000 80.000 162.000 C 82.740 162.000 84.150 160.460 87.200 156.400 C 90.490 152.000 95.000 146.000 104.000 146.000 C 113.000 146.000 117.510 152.000 120.800 156.400 C 123.800 160.460 125.260 162.000 128.000 162.000 C 130.740 162.000 132.150 160.460 135.200 156.400 C 138.490 152.000 143.000 146.000 152.000 146.000 C 161.000 146.000 165.510 152.000 168.800 156.400 C 171.800 160.460 173.260 162.000 176.000 162.000 C 179.314 162.000 182.000 164.686 182.000 168.000 Z"),
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
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
