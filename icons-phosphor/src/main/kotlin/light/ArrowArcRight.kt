package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorLightIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.000 88.000 L 238.000 152.000 C 238.000 155.314 235.314 158.000 232.000 158.000 L 168.000 158.000 C 164.686 158.000 162.000 155.314 162.000 152.000 C 162.000 148.686 164.686 146.000 168.000 146.000 L 217.450 146.000 L 191.650 120.370 C 165.912 94.624 127.199 86.919 93.565 100.847 C 59.931 114.776 38.000 147.596 38.000 184.000 C 38.000 187.314 35.314 190.000 32.000 190.000 C 28.686 190.000 26.000 187.314 26.000 184.000 C 26.004 142.748 50.855 105.559 88.968 89.774 C 127.080 73.988 170.948 82.712 200.120 111.880 L 226.000 137.580 L 226.000 88.000 C 226.000 84.686 228.686 82.000 232.000 82.000 C 235.314 82.000 238.000 84.686 238.000 88.000 Z"),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
