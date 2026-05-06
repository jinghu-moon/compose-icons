package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorLightIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.75 48.4C241.172 44.412 236.749 42.003 232 42h-143.19C83.286 41.982 78.269 45.214 76 50.25l-64.8 144c-1.954 4.338-1.571 9.372 1.016 13.364 2.588 3.993 7.026 6.398 11.784 6.386h143.19c5.524 .018 10.541-3.214 12.81-8.25l64.8-144c1.939-4.34 1.544-9.367-1.05-13.35ZM233.82 56.82 169.02 200.82c-.324 .72-1.041 1.182-1.83 1.18h-143.19c-.68 .002-1.314-.341-1.684-.911-.37-.57-.425-1.289-.146-1.909L87 55.18c.321-.713 1.028-1.174 1.81-1.18h143.19c.68-.002 1.314 .341 1.684 .911 .37 .57 .425 1.289 .146 1.909Z"),
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
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
