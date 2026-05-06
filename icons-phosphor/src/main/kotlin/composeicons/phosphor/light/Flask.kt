package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = phosphorLightIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 200.8 158 97.48v-59.48h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-80c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v59.48L36 200.8c-2.593 4.324-2.661 9.709-.177 14.096 2.484 4.388 7.135 7.101 12.177 7.104h160c5.042-.002 9.693-2.716 12.177-7.104 2.484-4.388 2.416-9.772-.177-14.096ZM109.15 102.23c.558-.934 .852-2.002 .85-3.09v-61.14h36v61.14c-.002 1.088 .292 2.156 .85 3.09l39.65 66.08c-12.41 3.16-30.86 3-55.79-9.66C113.77 150.07 97.71 145.85 82.88 146.01ZM209.72 209c-.359 .621-1.023 1.003-1.74 1h-159.98c-.711-.008-1.364-.392-1.716-1.009-.352-.617-.35-1.375 .006-1.991l29-48.41c14.89-2.08 31.68 1.55 49.94 10.79C144 178.8 159.67 182 172.42 182c6.937 .052 13.84-.96 20.47-3l16.8 28c.367 .613 .378 1.376 .03 2Z"),
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
        return _flask!!
    }

private var _flask: ImageVector? = null
