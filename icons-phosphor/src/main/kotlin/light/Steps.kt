package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Steps: ImageVector
    get() {
        if (_steps != null) return _steps!!
        _steps = phosphorLightIcon(
            name = "Steps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.000 56.000 C 246.000 59.314 243.314 62.000 240.000 62.000 L 190.000 62.000 L 190.000 104.000 C 190.000 107.314 187.314 110.000 184.000 110.000 L 134.000 110.000 L 134.000 152.000 C 134.000 155.314 131.314 158.000 128.000 158.000 L 78.000 158.000 L 78.000 200.000 C 78.000 203.314 75.314 206.000 72.000 206.000 L 16.000 206.000 C 12.686 206.000 10.000 203.314 10.000 200.000 C 10.000 196.686 12.686 194.000 16.000 194.000 L 66.000 194.000 L 66.000 152.000 C 66.000 148.686 68.686 146.000 72.000 146.000 L 122.000 146.000 L 122.000 104.000 C 122.000 100.686 124.686 98.000 128.000 98.000 L 178.000 98.000 L 178.000 56.000 C 178.000 52.686 180.686 50.000 184.000 50.000 L 240.000 50.000 C 243.314 50.000 246.000 52.686 246.000 56.000 Z"),
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
        return _steps!!
    }

private var _steps: ImageVector? = null
