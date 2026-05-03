package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Trolley: ImageVector
    get() {
        if (_trolley != null) return _trolley!!
        _trolley = phosphorLightIcon(
            name = "Trolley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 86.000 224.000 C 86.000 231.732 79.732 238.000 72.000 238.000 C 64.268 238.000 58.000 231.732 58.000 224.000 C 58.000 216.268 64.268 210.000 72.000 210.000 C 79.732 210.000 86.000 216.268 86.000 224.000 ZM 216.000 210.000 C 208.268 210.000 202.000 216.268 202.000 224.000 C 202.000 231.732 208.268 238.000 216.000 238.000 C 223.732 238.000 230.000 231.732 230.000 224.000 C 230.000 216.268 223.732 210.000 216.000 210.000 ZM 240.000 178.000 L 54.000 178.000 L 54.000 75.310 C 54.007 71.596 52.531 68.032 49.900 65.410 L 28.240 43.760 C 26.744 42.155 24.492 41.494 22.366 42.037 C 20.240 42.580 18.580 44.240 18.037 46.366 C 17.494 48.492 18.155 50.744 19.760 52.240 L 41.410 73.900 C 41.786 74.273 41.998 74.780 42.000 75.310 L 42.000 178.000 L 32.000 178.000 C 28.686 178.000 26.000 180.686 26.000 184.000 C 26.000 187.314 28.686 190.000 32.000 190.000 L 240.000 190.000 C 243.314 190.000 246.000 187.314 246.000 184.000 C 246.000 180.686 243.314 178.000 240.000 178.000 Z"),
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
        return _trolley!!
    }

private var _trolley: ImageVector? = null
