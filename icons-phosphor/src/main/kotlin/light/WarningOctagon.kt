package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorLightIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 122.000 136.000 L 122.000 80.000 C 122.000 76.686 124.686 74.000 128.000 74.000 C 131.314 74.000 134.000 76.686 134.000 80.000 L 134.000 136.000 C 134.000 139.314 131.314 142.000 128.000 142.000 C 124.686 142.000 122.000 139.314 122.000 136.000 ZM 230.000 91.550 L 230.000 164.450 C 230.009 168.165 228.533 171.729 225.900 174.350 L 174.350 225.900 C 171.729 228.533 168.165 230.009 164.450 230.000 L 91.550 230.000 C 87.835 230.009 84.271 228.533 81.650 225.900 L 30.100 174.350 C 27.467 171.729 25.991 168.165 26.000 164.450 L 26.000 91.550 C 25.991 87.835 27.467 84.271 30.100 81.650 L 81.650 30.100 C 84.271 27.467 87.835 25.991 91.550 26.000 L 164.450 26.000 C 168.165 25.991 171.729 27.467 174.350 30.100 L 225.900 81.650 C 228.533 84.271 230.009 87.835 230.000 91.550 ZM 218.000 91.550 C 218.000 91.017 217.788 90.506 217.410 90.130 L 165.870 38.590 C 165.494 38.212 164.983 38.000 164.450 38.000 L 91.550 38.000 C 91.020 38.002 90.513 38.214 90.140 38.590 L 38.580 90.130 C 38.206 90.507 37.997 91.018 38.000 91.550 L 38.000 164.450 C 38.000 164.983 38.212 165.494 38.590 165.870 L 90.130 217.410 C 90.506 217.788 91.017 218.000 91.550 218.000 L 164.450 218.000 C 164.980 217.998 165.487 217.786 165.860 217.410 L 217.420 165.870 C 217.794 165.493 218.003 164.982 218.000 164.450 ZM 128.000 162.000 C 122.477 162.000 118.000 166.477 118.000 172.000 C 118.000 177.523 122.477 182.000 128.000 182.000 C 133.523 182.000 138.000 177.523 138.000 172.000 C 138.000 166.477 133.523 162.000 128.000 162.000 Z"),
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
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
