package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Drop: ImageVector
    get() {
        if (_drop != null) return _drop!!
        _drop = phosphorLightIcon(
            name = "Drop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172.53 49.06C160.282 34.912 146.501 22.167 131.44 11.06c-2.066-1.445-4.814-1.445-6.88 0C109.499 22.167 95.718 34.912 83.47 49.06 56.34 80.26 42 113.09 42 144c0 47.496 38.504 86 86 86 47.496 0 86-38.504 86-86C214 113.09 199.66 80.26 172.53 49.06ZM128 218C87.151 217.95 54.05 184.849 54 144 54 84.38 113 35.07 128 23.49 143 35.07 202 84.38 202 144c-.05 40.849-33.151 73.95-74 74ZM181.92 153c-4.098 22.898-22.022 40.822-44.92 44.92-.331 .051-.665 .077-1 .08-3.128 .012-5.741-2.381-6.003-5.498-.262-3.117 1.916-5.913 5.003-6.422 17.38-2.92 32.13-17.68 35.08-35.08 .552-3.27 3.65-5.472 6.92-4.92 3.27 .552 5.472 3.65 4.92 6.92Z"),
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
        return _drop!!
    }

private var _drop: ImageVector? = null
