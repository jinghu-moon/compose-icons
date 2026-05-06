package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorThinIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.43 130.06c-.546 .91-1.431 1.566-2.461 1.822-1.03 .257-2.119 .094-3.029-.452-.38-.23-37.87-22.29-89.94-23.38v42.43l63 70.86c1.469 1.657 1.317 4.191-.34 5.66-1.657 1.469-4.191 1.317-5.66-.34L128 158 67 226.66c-1.469 1.657-4.003 1.809-5.66 .34-1.657-1.469-1.809-4.003-.34-5.66l63-70.86v-42.43c-52.07 1.09-89.56 23.15-89.94 23.38-1.894 1.138-4.352 .524-5.49-1.37-1.138-1.894-.524-4.352 1.37-5.49C31.61 123.57 71.54 100 128 100c56.46 0 96.39 23.57 98.06 24.57 .91 .546 1.566 1.431 1.822 2.461 .257 1.03 .094 2.119-.452 3.029ZM100 48c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28C112.536 76 100 63.464 100 48ZM108 48c0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20C148 36.954 139.046 28 128 28c-11.046 0-20 8.954-20 20Z"),
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
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
