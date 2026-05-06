package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) return _cloudCheck!!
        _cloudCheck = phosphorLightIcon(
            name = "CloudCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 42C126.897 42.029 96.742 61.031 82.43 90.88 59.364 86.952 36.051 96.344 22.15 115.165 8.248 133.986 6.127 159.03 16.664 179.921 27.201 200.812 48.602 213.992 72 214h88c47.496 0 86-38.504 86-86C246 80.504 207.496 42 160 42ZM160 202h-88C44.386 202 22 179.614 22 152c0-27.614 22.386-50 50-50 1.975 .001 3.949 .118 5.91 .35C75.311 110.652 73.993 119.301 74 128c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C86 87.131 119.131 54 160 54c40.869 0 74 33.131 74 74 0 40.869-33.131 74-74 74ZM196.24 107.76c2.34 2.343 2.34 6.137 0 8.48l-48 48c-2.343 2.34-6.137 2.34-8.48 0l-24-24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L144 151.51l43.76-43.75c2.343-2.34 6.137-2.34 8.48 0Z"),
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
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
