package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorLightIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.250 123.760 C 209.377 124.885 210.010 126.413 210.010 128.005 C 210.010 129.597 209.377 131.125 208.250 132.250 L 126.190 214.250 C 105.095 235.336 70.901 235.330 49.815 214.235 C 28.729 193.140 28.735 158.946 49.830 137.860 L 149.100 37.140 C 163.934 22.292 187.997 22.281 202.845 37.115 C 217.693 51.949 217.704 76.012 202.870 90.860 L 103.590 191.540 C 95.005 200.142 81.072 200.155 72.470 191.570 C 63.868 182.985 63.855 169.052 72.440 160.450 L 155.720 75.780 C 158.045 73.416 161.846 73.385 164.210 75.710 C 166.574 78.035 166.605 81.836 164.280 84.200 L 81.000 168.910 C 77.084 172.806 77.069 179.139 80.965 183.055 C 84.861 186.971 91.194 186.986 95.110 183.090 L 194.350 82.400 C 204.512 72.255 204.525 55.792 194.380 45.630 C 184.235 35.468 167.772 35.455 157.610 45.600 L 58.330 146.280 C 41.916 162.675 41.900 189.271 58.295 205.685 C 74.690 222.099 101.286 222.115 117.700 205.720 L 199.760 123.720 C 200.891 122.599 202.421 121.973 204.013 121.980 C 205.606 121.988 207.130 122.628 208.250 123.760 Z"),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
