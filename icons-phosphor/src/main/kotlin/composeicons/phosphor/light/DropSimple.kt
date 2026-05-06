package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropSimple: ImageVector
    get() {
        if (_dropSimple != null) return _dropSimple!!
        _dropSimple = phosphorLightIcon(
            name = "DropSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172.53 49.06C160.29 34.904 146.508 22.158 131.44 11.06c-2.066-1.445-4.814-1.445-6.88 0C109.492 22.158 95.71 34.904 83.47 49.06 56.34 80.26 42 113.09 42 144c0 47.496 38.504 86 86 86 47.496 0 86-38.504 86-86C214 113.09 199.66 80.26 172.53 49.06ZM128 218C87.151 217.95 54.05 184.849 54 144 54 84.38 113 35.07 128 23.49 143 35.07 202 84.38 202 144c-.05 40.849-33.151 73.95-74 74Z"),
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
        return _dropSimple!!
    }

private var _dropSimple: ImageVector? = null
