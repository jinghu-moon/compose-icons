package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorLightIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.000 40.000 C 206.000 43.314 203.314 46.000 200.000 46.000 L 170.710 46.000 C 158.144 46.000 147.377 54.987 145.130 67.350 L 135.190 122.000 L 184.000 122.000 C 187.314 122.000 190.000 124.686 190.000 128.000 C 190.000 131.314 187.314 134.000 184.000 134.000 L 133.000 134.000 L 122.670 190.800 C 119.384 208.865 103.651 221.997 85.290 222.000 L 56.000 222.000 C 52.686 222.000 50.000 219.314 50.000 216.000 C 50.000 212.686 52.686 210.000 56.000 210.000 L 85.290 210.000 C 97.856 210.000 108.623 201.013 110.870 188.650 L 120.810 134.000 L 72.000 134.000 C 68.686 134.000 66.000 131.314 66.000 128.000 C 66.000 124.686 68.686 122.000 72.000 122.000 L 123.000 122.000 L 133.330 65.200 C 136.616 47.135 152.349 34.003 170.710 34.000 L 200.000 34.000 C 203.314 34.000 206.000 36.686 206.000 40.000 Z"),
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
        return _function!!
    }

private var _function: ImageVector? = null
