package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorLightIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 184.000 C 230.000 187.314 227.314 190.000 224.000 190.000 C 220.686 190.000 218.000 187.314 218.000 184.000 C 218.000 147.598 196.073 114.781 162.442 100.850 C 128.811 86.920 90.100 94.620 64.360 120.360 L 38.550 146.000 L 88.000 146.000 C 91.314 146.000 94.000 148.686 94.000 152.000 C 94.000 155.314 91.314 158.000 88.000 158.000 L 24.000 158.000 C 20.686 158.000 18.000 155.314 18.000 152.000 L 18.000 88.000 C 18.000 84.686 20.686 82.000 24.000 82.000 C 27.314 82.000 30.000 84.686 30.000 88.000 L 30.000 137.580 L 55.890 111.860 C 85.065 82.697 128.934 73.978 167.044 89.768 C 205.153 105.558 230.000 142.749 230.000 184.000 Z"),
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
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
