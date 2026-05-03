package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorLightIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.470 72.000 C 224.856 68.246 220.574 66.006 216.000 66.000 L 134.000 66.000 L 134.000 30.000 L 152.000 30.000 C 155.314 30.000 158.000 27.314 158.000 24.000 C 158.000 20.686 155.314 18.000 152.000 18.000 L 104.000 18.000 C 100.686 18.000 98.000 20.686 98.000 24.000 C 98.000 27.314 100.686 30.000 104.000 30.000 L 122.000 30.000 L 122.000 66.000 L 40.000 66.000 C 35.434 66.000 31.154 68.226 28.533 71.966 C 25.913 75.705 25.281 80.488 26.840 84.780 L 53.030 156.780 C 55.040 162.312 60.294 165.996 66.180 166.000 L 98.000 166.000 L 98.000 232.000 C 98.000 235.314 100.686 238.000 104.000 238.000 C 107.314 238.000 110.000 235.314 110.000 232.000 L 110.000 166.000 L 146.000 166.000 L 146.000 232.000 C 146.000 235.314 148.686 238.000 152.000 238.000 C 155.314 238.000 158.000 235.314 158.000 232.000 L 158.000 166.000 L 189.820 166.000 C 195.717 166.009 200.987 162.322 203.000 156.780 L 229.190 84.780 C 230.729 80.494 230.088 75.727 227.470 72.000 ZM 109.000 154.000 L 95.190 78.000 L 160.810 78.000 L 147.000 154.000 ZM 64.300 152.680 L 38.120 80.680 C 37.897 80.067 37.986 79.384 38.360 78.850 C 38.728 78.308 39.345 77.988 40.000 78.000 L 83.000 78.000 L 96.820 154.000 L 66.180 154.000 C 65.338 154.000 64.586 153.472 64.300 152.680 ZM 217.880 80.680 L 191.700 152.680 C 191.414 153.472 190.662 154.000 189.820 154.000 L 159.190 154.000 L 173.000 78.000 L 216.000 78.000 C 216.655 77.988 217.272 78.308 217.640 78.850 C 218.014 79.384 218.103 80.067 217.880 80.680 Z"),
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
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
