package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) return _fireSimple!!
        _fireSimple = phosphorLightIcon(
            name = "FireSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M142.1 19.38c-1.501-1.247-3.515-1.685-5.399-1.176-1.884 .509-3.402 1.903-4.071 3.736L109.54 85.25 83.2 59.69C81.967 58.478 80.272 57.857 78.548 57.985c-1.724 .128-3.309 .994-4.348 2.375C52.85 88.39 42 116.53 42 144c0 47.496 38.504 86 86 86 47.496 0 86-38.504 86-86C214 85.4 163.72 37.33 142.1 19.38ZM128 218C87.151 217.95 54.05 184.849 54 144 54 121 62.67 97.13 79.77 73.09l28.05 27.22c1.459 1.418 3.538 2.001 5.522 1.546 1.984-.455 3.602-1.884 4.298-3.796L140.93 34.2C163.35 54.16 202 95.6 202 144c-.05 40.849-33.151 73.95-74 74Z"),
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
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
