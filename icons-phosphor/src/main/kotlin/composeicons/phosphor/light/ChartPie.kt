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
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM202.74 77.92 134 117.61v-79.41c27.83 1.872 53.22 16.543 68.74 39.72ZM122 38.2v86.34L47.24 167.7C33.999 140.762 35.059 108.997 50.066 83.002 65.073 57.007 92.051 40.204 122 38.2ZM128 218C97.989 217.987 69.959 203.016 53.26 178.08L208.76 88.3c13.71 27.894 12.058 60.887-4.371 87.272C187.96 201.956 159.081 217.996 128 218Z"),
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
