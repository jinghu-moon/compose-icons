package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = phosphorLightIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 202.000 L 214.000 202.000 L 214.000 40.000 C 214.000 36.686 211.314 34.000 208.000 34.000 L 152.000 34.000 C 148.686 34.000 146.000 36.686 146.000 40.000 L 146.000 82.000 L 96.000 82.000 C 92.686 82.000 90.000 84.686 90.000 88.000 L 90.000 130.000 L 48.000 130.000 C 44.686 130.000 42.000 132.686 42.000 136.000 L 42.000 202.000 L 32.000 202.000 C 28.686 202.000 26.000 204.686 26.000 208.000 C 26.000 211.314 28.686 214.000 32.000 214.000 L 224.000 214.000 C 227.314 214.000 230.000 211.314 230.000 208.000 C 230.000 204.686 227.314 202.000 224.000 202.000 ZM 158.000 46.000 L 202.000 46.000 L 202.000 202.000 L 158.000 202.000 ZM 102.000 94.000 L 146.000 94.000 L 146.000 202.000 L 102.000 202.000 ZM 54.000 142.000 L 90.000 142.000 L 90.000 202.000 L 54.000 202.000 Z"),
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
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
