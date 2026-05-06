package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudWarning: ImageVector
    get() {
        if (_cloudWarning != null) return _cloudWarning!!
        _cloudWarning = phosphorLightIcon(
            name = "CloudWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 42C126.897 42.029 96.742 61.031 82.43 90.88 59.364 86.952 36.051 96.344 22.15 115.165 8.248 133.986 6.127 159.03 16.664 179.921 27.201 200.812 48.602 213.992 72 214h88c47.496 0 86-38.504 86-86C246 80.504 207.496 42 160 42ZM160 202h-88C44.386 202 22 179.614 22 152c0-27.614 22.386-50 50-50 1.975 .001 3.949 .118 5.91 .35C75.311 110.652 73.993 119.301 74 128c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C86 87.131 119.131 54 160 54c40.869 0 74 33.131 74 74 0 40.869-33.131 74-74 74ZM154 128v-40c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v40c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM170 164c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _cloudWarning!!
    }

private var _cloudWarning: ImageVector? = null
