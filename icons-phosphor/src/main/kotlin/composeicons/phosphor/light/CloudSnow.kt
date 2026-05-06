package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) return _cloudSnow!!
        _cloudSnow = phosphorLightIcon(
            name = "CloudSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M86 196c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM116 202c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM164 186c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM68 226c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM156 226c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM230 92c-.05 40.849-33.151 73.95-74 74h-80C56.969 165.904 39.644 155.012 31.307 137.905 22.969 120.797 25.067 100.44 36.717 85.392 48.367 70.344 67.55 63.214 86.2 67 98.369 33.116 133.138 12.887 168.609 19.054 204.079 25.221 229.981 55.997 230 92ZM218 92C217.891 58.515 191.237 31.154 157.766 30.169 124.296 29.184 96.078 54.929 94 88.35c-.193 3.314-3.036 5.843-6.35 5.65C84.336 93.807 81.807 90.964 82 87.65c.177-3.019 .534-6.024 1.07-9C68.907 75.996 54.462 81.582 45.768 93.072c-8.694 11.491-10.141 26.91-3.736 39.818C48.437 145.798 61.591 153.973 76 154h80c34.226-.039 61.961-27.774 62-62Z"),
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
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
