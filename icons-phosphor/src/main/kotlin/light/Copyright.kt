package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorLightIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 94.000 128.000 C 94.000 142.635 103.365 155.627 117.248 160.255 C 131.132 164.883 146.419 160.108 155.200 148.400 C 157.191 145.749 160.954 145.214 163.605 147.205 C 166.256 149.196 166.791 152.959 164.800 155.610 C 152.917 171.445 132.236 177.901 113.455 171.637 C 94.674 165.374 82.007 147.798 82.007 128.000 C 82.007 108.202 94.674 90.626 113.455 84.363 C 132.236 78.099 152.917 84.555 164.800 100.390 C 166.791 103.041 166.256 106.804 163.605 108.795 C 160.954 110.786 157.191 110.251 155.200 107.600 C 146.419 95.892 131.132 91.117 117.248 95.745 C 103.365 100.373 94.000 113.365 94.000 128.000 Z"),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
