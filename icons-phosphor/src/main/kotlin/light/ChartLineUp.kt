package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartLineUp: ImageVector
    get() {
        if (_chartLineUp != null) return _chartLineUp!!
        _chartLineUp = phosphorLightIcon(
            name = "ChartLineUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 208.000 C 230.000 211.314 227.314 214.000 224.000 214.000 L 32.000 214.000 C 28.686 214.000 26.000 211.314 26.000 208.000 L 26.000 48.000 C 26.000 44.686 28.686 42.000 32.000 42.000 C 35.314 42.000 38.000 44.686 38.000 48.000 L 38.000 161.520 L 91.760 107.760 C 94.103 105.420 97.897 105.420 100.240 107.760 L 128.000 135.510 L 185.520 78.000 L 160.000 78.000 C 156.686 78.000 154.000 75.314 154.000 72.000 C 154.000 68.686 156.686 66.000 160.000 66.000 L 200.000 66.000 C 203.314 66.000 206.000 68.686 206.000 72.000 L 206.000 112.000 C 206.000 115.314 203.314 118.000 200.000 118.000 C 196.686 118.000 194.000 115.314 194.000 112.000 L 194.000 86.480 L 132.240 148.240 C 129.897 150.580 126.103 150.580 123.760 148.240 L 96.000 120.490 L 38.000 178.490 L 38.000 202.000 L 224.000 202.000 C 227.314 202.000 230.000 204.686 230.000 208.000 Z"),
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
        return _chartLineUp!!
    }

private var _chartLineUp: ImageVector? = null
