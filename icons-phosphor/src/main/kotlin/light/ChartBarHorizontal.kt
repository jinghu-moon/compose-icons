package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) return _chartBarHorizontal!!
        _chartBarHorizontal = phosphorLightIcon(
            name = "ChartBarHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 98.000 L 182.000 98.000 L 182.000 56.000 C 182.000 52.686 179.314 50.000 176.000 50.000 L 54.000 50.000 L 54.000 40.000 C 54.000 36.686 51.314 34.000 48.000 34.000 C 44.686 34.000 42.000 36.686 42.000 40.000 L 42.000 216.000 C 42.000 219.314 44.686 222.000 48.000 222.000 C 51.314 222.000 54.000 219.314 54.000 216.000 L 54.000 206.000 L 144.000 206.000 C 147.314 206.000 150.000 203.314 150.000 200.000 L 150.000 158.000 L 224.000 158.000 C 227.314 158.000 230.000 155.314 230.000 152.000 L 230.000 104.000 C 230.000 100.686 227.314 98.000 224.000 98.000 ZM 170.000 62.000 L 170.000 98.000 L 54.000 98.000 L 54.000 62.000 ZM 138.000 194.000 L 54.000 194.000 L 54.000 158.000 L 138.000 158.000 ZM 218.000 146.000 L 54.000 146.000 L 54.000 110.000 L 218.000 110.000 Z"),
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
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
