package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) return _greaterThan!!
        _greaterThan = phosphorLightIcon(
            name = "GreaterThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 128c-.001 2.317-1.336 4.427-3.43 5.42l-152 72c-1.945 .977-4.266 .824-6.066-.399-1.8-1.223-2.797-3.325-2.604-5.493 .192-2.168 1.543-4.061 3.53-4.949L202 128 61.43 61.42c-1.987-.887-3.338-2.781-3.53-4.949-.192-2.168 .804-4.27 2.604-5.493 1.8-1.223 4.121-1.376 6.066-.399l152 72c2.094 .993 3.429 3.103 3.43 5.42Z"),
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
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
