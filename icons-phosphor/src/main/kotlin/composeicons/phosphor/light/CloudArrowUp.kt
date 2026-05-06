package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) return _cloudArrowUp!!
        _cloudArrowUp = phosphorLightIcon(
            name = "CloudArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188.24 164.24c-2.343 2.34-6.137 2.34-8.48 0L158 142.49v65.51c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-65.51l-21.76 21.75c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l32-32c2.343-2.34 6.137-2.34 8.48 0l32 32c2.34 2.343 2.34 6.137 0 8.48ZM160 42C126.897 42.027 96.74 61.03 82.43 90.88 59.364 86.952 36.051 96.344 22.15 115.165 8.248 133.986 6.127 159.03 16.664 179.921 27.201 200.812 48.602 213.992 72 214h40c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-40C44.386 202 22 179.614 22 152c0-27.614 22.386-50 50-50 1.975 .005 3.949 .125 5.91 .36C75.311 110.658 73.993 119.304 74 128c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 .014-36.955 27.29-68.235 63.899-73.28 36.61-5.044 71.328 17.694 81.336 53.269 10.007 35.575-7.765 73.079-41.635 87.861-3.038 1.325-4.425 4.862-3.1 7.9 1.325 3.038 4.862 4.425 7.9 3.1 37.363-16.268 58.179-56.526 49.855-96.418C235.93 70.541 200.751 41.968 160 42Z"),
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
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
