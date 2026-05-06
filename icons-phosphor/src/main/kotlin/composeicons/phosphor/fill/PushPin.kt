package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorFillIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.33 104l-53.47 53.65c4.56 12.67 6.45 33.89-13.19 60-2.78 3.715-7.041 6.034-11.67 6.35-.38 0-.75 0-1.13 0-4.246 .001-8.318-1.687-11.32-4.69L96.29 171 53.66 213.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L85 159.71 36.7 111.41c-3.211-3.215-4.903-7.643-4.655-12.18C32.293 94.693 34.458 90.476 38 87.63 63.42 67.12 87.75 71.15 98.4 74.49L152 20.7c3.001-3.001 7.071-4.688 11.315-4.688 4.244 0 8.314 1.686 11.315 4.688l60.69 60.68c6.246 6.245 6.251 16.37 .01 22.62Z"),
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
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
