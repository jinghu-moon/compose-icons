package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tote: ImageVector
    get() {
        if (_tote != null) return _tote!!
        _tote = phosphorLightIcon(
            name = "Tote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.470 70.730 C 231.792 67.717 227.951 65.995 223.920 66.000 L 174.000 66.000 L 174.000 64.000 C 174.000 38.595 153.405 18.000 128.000 18.000 C 102.595 18.000 82.000 38.595 82.000 64.000 L 82.000 66.000 L 32.080 66.000 C 28.065 65.972 24.231 67.670 21.552 70.662 C 18.874 73.654 17.610 77.652 18.080 81.640 L 32.330 201.640 C 33.191 208.712 39.206 214.022 46.330 214.000 L 209.670 214.000 C 216.794 214.022 222.809 208.712 223.670 201.640 L 237.920 81.640 C 238.376 77.678 237.122 73.709 234.470 70.730 ZM 94.000 64.000 C 94.000 45.222 109.222 30.000 128.000 30.000 C 146.778 30.000 162.000 45.222 162.000 64.000 L 162.000 66.000 L 94.000 66.000 ZM 211.730 200.230 C 211.611 201.267 210.713 202.038 209.670 202.000 L 46.330 202.000 C 45.287 202.038 44.389 201.267 44.270 200.230 L 30.000 80.230 C 29.932 79.673 30.111 79.114 30.490 78.700 C 30.889 78.247 31.466 77.992 32.070 78.000 L 82.000 78.000 L 82.000 104.000 C 82.000 107.314 84.686 110.000 88.000 110.000 C 91.314 110.000 94.000 107.314 94.000 104.000 L 94.000 78.000 L 162.000 78.000 L 162.000 104.000 C 162.000 107.314 164.686 110.000 168.000 110.000 C 171.314 110.000 174.000 107.314 174.000 104.000 L 174.000 78.000 L 223.920 78.000 C 224.524 77.992 225.101 78.247 225.500 78.700 C 225.879 79.114 226.058 79.673 225.990 80.230 Z"),
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
        return _tote!!
    }

private var _tote: ImageVector? = null
