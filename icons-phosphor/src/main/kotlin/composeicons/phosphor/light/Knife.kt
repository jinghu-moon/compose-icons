package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorLightIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.46 33.55c-10.078-10.072-26.412-10.072-36.49 0L19.76 207.82c-1.543 1.542-2.127 3.799-1.527 5.896 .601 2.097 2.292 3.703 4.417 4.194 11.72 2.712 23.71 4.084 35.74 4.09 32.57 0 65.17-10.1 95.87-29.91 31.49-20.32 49.72-43.39 50.48-44.36 1.867-2.39 1.657-5.798-.49-7.94L182.49 118l48-48c10.01-10.093 9.996-26.373-.03-36.45ZM191.86 144.37C178.873 158.796 164.042 171.448 147.75 182 111.5 205.4 74 214.23 36.23 208.32L146 98.5ZM222 61.56l-48 48L154.49 90l48-48c5.401-5.388 14.147-5.376 19.535 .025 5.388 5.401 5.376 14.147-.025 19.535Z"),
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
        return _knife!!
    }

private var _knife: ImageVector? = null
