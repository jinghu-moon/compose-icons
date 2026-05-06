package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileySad: ImageVector
    get() {
        if (_smileySad != null) return _smileySad!!
        _smileySad = phosphorLightIcon(
            name = "SmileySad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM82 108c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM174 108c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM173.19 173c1.49 2.849 .47 6.367-2.314 7.976-2.784 1.609-6.341 .738-8.066-1.976C154.97 165.46 142.61 158 128 158c-14.61 0-27 7.46-34.81 21-1.072 1.858-3.055 3.001-5.2 3-1.054 .003-2.09-.277-3-.81C82.13 179.528 81.155 175.864 82.81 173 92.73 155.84 109.2 146 128 146c18.8 0 35.27 9.84 45.19 27Z"),
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
        return _smileySad!!
    }

private var _smileySad: ImageVector? = null
