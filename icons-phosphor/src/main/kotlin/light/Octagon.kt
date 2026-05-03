package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorLightIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 225.900 81.650 L 174.350 30.100 C 171.729 27.467 168.165 25.991 164.450 26.000 L 91.550 26.000 C 87.835 25.991 84.271 27.467 81.650 30.100 L 30.100 81.650 C 27.467 84.271 25.991 87.835 26.000 91.550 L 26.000 164.450 C 25.991 168.165 27.467 171.729 30.100 174.350 L 81.650 225.900 C 84.271 228.533 87.835 230.009 91.550 230.000 L 164.450 230.000 C 168.165 230.009 171.729 228.533 174.350 225.900 L 225.900 174.350 C 228.533 171.729 230.009 168.165 230.000 164.450 L 230.000 91.550 C 230.009 87.835 228.533 84.271 225.900 81.650 ZM 218.000 164.450 C 218.000 164.983 217.788 165.494 217.410 165.870 L 165.860 217.410 C 165.487 217.786 164.980 217.998 164.450 218.000 L 91.550 218.000 C 91.017 218.000 90.506 217.788 90.130 217.410 L 38.590 165.870 C 38.212 165.494 38.000 164.983 38.000 164.450 L 38.000 91.550 C 38.000 91.017 38.212 90.506 38.590 90.130 L 90.140 38.590 C 90.513 38.214 91.020 38.002 91.550 38.000 L 164.450 38.000 C 164.983 38.000 165.494 38.212 165.870 38.590 L 217.410 90.140 C 217.786 90.513 217.998 91.020 218.000 91.550 Z"),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null
