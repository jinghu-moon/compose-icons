package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorLightIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.24 84.24c-2.343 2.34-6.137 2.34-8.48 0L158 46.49v81.51c-.066 56.306-45.694 101.934-102 102-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 49.683-.055 89.945-40.317 90-90v-81.51L108.24 84.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L147.76 27.76c2.343-2.34 6.137-2.34 8.48 0l48 48c2.34 2.343 2.34 6.137 0 8.48Z"),
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
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
