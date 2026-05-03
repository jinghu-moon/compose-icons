package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = phosphorLightIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 202.740 77.920 L 134.000 117.610 L 134.000 38.200 C 161.830 40.072 187.220 54.743 202.740 77.920 ZM 122.000 38.200 L 122.000 124.540 L 47.240 167.700 C 33.999 140.762 35.059 108.997 50.066 83.002 C 65.073 57.007 92.051 40.204 122.000 38.200 ZM 128.000 218.000 C 97.989 217.987 69.959 203.016 53.260 178.080 L 208.760 88.300 C 222.470 116.194 220.818 149.187 204.389 175.572 C 187.960 201.956 159.081 217.996 128.000 218.000 Z"),
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
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
