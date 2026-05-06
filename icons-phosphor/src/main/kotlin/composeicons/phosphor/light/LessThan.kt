package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LessThan: ImageVector
    get() {
        if (_lessThan != null) return _lessThan!!
        _lessThan = phosphorLightIcon(
            name = "LessThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.42 202.57c-.682 1.44-1.908 2.549-3.409 3.084-1.501 .535-3.152 .45-4.591-.234l-152-72c-2.093-.994-3.426-3.103-3.426-5.42 0-2.317 1.334-4.426 3.426-5.42l152-72c2.977-1.329 6.471-.038 7.868 2.908 1.397 2.946 .186 6.468-2.728 7.932L62 128l140.55 66.58c1.441 .678 2.553 1.901 3.091 3.4 .538 1.499 .459 3.15-.221 4.59Z"),
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
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
