package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorLightIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.000 80.000 L 246.000 104.000 C 246.000 107.314 243.314 110.000 240.000 110.000 C 236.686 110.000 234.000 107.314 234.000 104.000 L 234.000 86.000 L 132.160 86.000 L 85.620 210.110 C 84.743 212.455 82.503 214.009 80.000 214.009 C 77.497 214.009 75.257 212.455 74.380 210.110 L 26.380 82.110 C 25.215 79.006 26.786 75.545 29.890 74.380 C 32.994 73.215 36.455 74.786 37.620 77.890 L 80.000 190.910 L 122.380 77.910 C 123.253 75.561 125.494 74.002 128.000 74.000 L 240.000 74.000 C 243.314 74.000 246.000 76.686 246.000 80.000 Z"),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
