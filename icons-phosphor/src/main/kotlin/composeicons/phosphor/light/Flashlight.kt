package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Flashlight: ImageVector
    get() {
        if (_flashlight != null) return _flashlight!!
        _flashlight = phosphorLightIcon(
            name = "Flashlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 18h-112C64.268 18 58 24.268 58 32v45.33c0 3.029 .982 5.977 2.8 8.4l20.8 27.73c.262 .349 .402 .774 .4 1.21v109.33c0 7.732 6.268 14 14 14h64c7.732 0 14-6.268 14-14v-109.33c0-.433 .14-.854 .4-1.2L195.2 85.73C197.018 83.307 198 80.359 198 77.33v-45.33c0-7.732-6.268-14-14-14ZM72 30h112c1.105 0 2 .895 2 2v26h-116v-26c0-1.105 .895-2 2-2ZM185.6 78.53l-20.8 27.74c-1.818 2.423-2.8 5.371-2.8 8.4v109.33c0 1.105-.895 2-2 2h-64c-1.105 0-2-.895-2-2v-109.33c0-3.029-.982-5.977-2.8-8.4L70.4 78.54c-.262-.349-.402-.774-.4-1.21v-7.33h116v7.33c0 .433-.14 .854-.4 1.2ZM134 120v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-32c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
